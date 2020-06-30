Imports System.Data.OleDb
Public Class AddStudent
    Dim A As Integer
    Dim B As Integer
    Dim C As Integer
    Public Sub Clear()
        txtid.Text = ""
        txtname.Text = ""
        txtmobile.Text = ""
        txtgender.Text = "--Select--"
        txtaddress.Text = ""
        txtbatch.Text = "--Select--"
        txtpaid.Text = ""
        txttotalfees.Text = ""
        txtunpaid.Text = ""
        txtdate.Text = ""
        txtcourse.Text = "--Select--"
        txtduration.Text = "--Select--"

    End Sub





    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Try
            Dim sqlconn As New OleDb.OleDbConnection
            Dim sqlquery As New OleDb.OleDbCommand
            Dim connString As String
            connString = "Provider=Microsoft.Jet.OLEDB.4.0;Data Source=" & Application.StartupPath & "\StudentFees.mdb"
            sqlconn.ConnectionString = connString
            sqlquery.Connection = sqlconn
            sqlconn.Open()
            sqlquery.CommandText = "INSERT INTO STUDENT(ID,NAME,MOBILE,GENDER,ADDRESS,APPLYDATE,COURSE,DURATION,BATCH,TOTAL,PAID,UNPAID) VALUES(@ID,@NAME,@MOBILE,@GENDER,@ADDRESS,@APPLYDATE,@COURSE,@DURATION,@BATCH,@TOTAL,@PAID,@UNPAID);"
            sqlquery.Parameters.AddWithValue("@ID", txtid.Text)
            sqlquery.Parameters.AddWithValue("@NAME", txtname.Text)
            sqlquery.Parameters.AddWithValue("@MOBILE", txtmobile.Text)
            sqlquery.Parameters.AddWithValue("@GENDER", txtgender.Text)
            sqlquery.Parameters.AddWithValue("@ADDRESS", txtaddress.Text)
            sqlquery.Parameters.AddWithValue("@APPLYDATE", txtdate.Value)
            sqlquery.Parameters.AddWithValue("@COURSE", txtcourse.Text)
            sqlquery.Parameters.AddWithValue("@DURATION", txtduration.Text)
            sqlquery.Parameters.AddWithValue("@BATCH", txtbatch.Text)
            sqlquery.Parameters.AddWithValue("@TOTAL", txttotalfees.Text)
            sqlquery.Parameters.AddWithValue("@PAID", txtpaid.Text)
            sqlquery.Parameters.AddWithValue("@UNPAID", txtunpaid.Text)
            sqlquery.ExecuteNonQuery()
            sqlconn.Close()
            MsgBox("Information Inserted Successfully.")
            Clear()
        Catch ex As Exception
            MessageBox.Show(ex.Message)
        End Try
    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        Clear()
    End Sub

    Private Sub AddStudentToolStripMenuItem_Click(sender As Object, e As EventArgs)
        Me.Hide()
        Home.Show()

    End Sub

    Private Sub HomeToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles HomeToolStripMenuItem.Click
        Me.Hide()
        Home.Show()
    End Sub

    Private Sub ExitToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles ExitToolStripMenuItem.Click
        Me.Hide()
        Login.Show()

    End Sub

    Private Sub txtpaid_TextChanged(sender As Object, e As EventArgs) Handles txtpaid.TextChanged
        A = Val(txttotalfees.Text)
        B = Val(txtpaid.Text)
        C = (A - B)
        txtunpaid.Text = C
    End Sub
End Class
