Imports System.Data.OleDb
Public Class ManageStudent
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
            sqlquery.CommandText = "UPDATE STUDENT SET NAME=@NAME, MOBILE=@MOBILE, GENDER=@GENDER, ADDRESS=@ADDRESS, APPLYDATE=@APPLYDATE, COURSE =@COURSE, DURATION=@DURATION, BATCH=@BATCH, TOTAL=@TOTAL,PAID=@PAID, UNPAID=@UNPAID WHERE ID=@ID;"
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
            sqlquery.Parameters.AddWithValue("@ID", txtid.Text)
            sqlquery.ExecuteNonQuery()
            sqlconn.Close()
            MsgBox("Information UpDate Successfully.")
            Clear()

        Catch ex As Exception
            MessageBox.Show(ex.Message)
        End Try
    End Sub

    Private Sub ManageStudent_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        txtid.Text = Module1.id
        txtname.Text = Module1.name
        txtmobile.Text = Module1.mobile
        txtgender.Text = Module1.gender
        txtaddress.Text = Module1.address
        txtdate.Text = Module1.adate
        txtcourse.Text = Module1.course
        txtduration.Text = Module1.duration
        txtbatch.Text = Module1.batch
        txttotalfees.Text = Module1.total
        txtpaid.Text = Module1.paid
        txtunpaid.Text = Module1.unpaid

    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        Try
            Dim sqlconn As New OleDb.OleDbConnection
            Dim sqlquery As New OleDb.OleDbCommand
            Dim connString As String
            connString = "Provider=Microsoft.Jet.OLEDB.4.0;Data Source=" & Application.StartupPath & "\StudentFees.mdb"
            sqlconn.ConnectionString = connString
            sqlquery.Connection = sqlconn
            sqlconn.Open()
            sqlquery.CommandText = "delete from STUDENT WHERE ID=@ID;"
            sqlquery.Parameters.AddWithValue("@ID", txtid.Text)
            sqlquery.ExecuteNonQuery()
            sqlconn.Close()
            MessageBox.Show("Information Delete Successfully..")
        Catch ex As Exception
            MessageBox.Show(ex.Message)
        End Try
    End Sub

    Private Sub Button3_Click(sender As Object, e As EventArgs) Handles Button3.Click
        Clear()

    End Sub

   

    

    Private Sub HomeToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles HomeToolStripMenuItem.Click
        Me.Hide()
        Home.Show()

    End Sub

    Private Sub ExitToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles ExitToolStripMenuItem.Click
        Me.Hide()
        Login.Show()

    End Sub

    Private Sub txtid_TextChanged(sender As Object, e As EventArgs) Handles txtid.TextChanged



    End Sub

    Private Sub Button4_Click(sender As Object, e As EventArgs)

    End Sub

    Private Sub Button4_Click_1(sender As Object, e As EventArgs)



    End Sub

    Private Sub txtpaid_TextChanged(sender As Object, e As EventArgs) Handles txtpaid.TextChanged
        A = Val(txttotalfees.Text)
        B = Val(txtpaid.Text)
        C = (A - B)
        txtunpaid.Text = C
    End Sub
End Class