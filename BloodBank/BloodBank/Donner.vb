Imports System.Data.OleDb
Public Class Donner

    Private Sub Clear()
        txtid.Text = ""
        txtname.Text = ""
        txtcontact.Text = ""
        txtgroup.Text = "--Select--"
        txtaddress.Text = ""

    End Sub


    Private Sub button1_Click(sender As Object, e As EventArgs) Handles button1.Click
        Try
            Dim sqlconn As New OleDb.OleDbConnection
            Dim sqlquery As New OleDb.OleDbCommand
            Dim connString As String
            connString = "Provider=Microsoft.ACE.OLEDB.12.0;Data Source=" & Application.StartupPath & "\BloodBankDb.mdb"
            sqlconn.ConnectionString = connString
            sqlquery.Connection = sqlconn
            sqlconn.Open()
            sqlquery.CommandText = "INSERT INTO Donar(ID,NAME,CONTACT,ADDRESS,BGROUP)VALUES(@ID,@NAME,@CONTACT,@ADDRESS,@BGROUP)"
            sqlquery.Parameters.AddWithValue("@ID", txtid.Text)
            sqlquery.Parameters.AddWithValue("@NAME", txtname.Text)
            sqlquery.Parameters.AddWithValue("@CONTACT", txtcontact.Text)
            sqlquery.Parameters.AddWithValue("@ADDRESS", txtaddress.Text)
            sqlquery.Parameters.AddWithValue("@BGROUP", txtgroup.Text)
            sqlquery.ExecuteNonQuery()
            sqlconn.Close()
            refreshdatagridview()
            MessageBox.Show("Information Saved Successfully..")
            Clear()
        Catch ex As Exception
            MessageBox.Show(ex.Message)
        End Try
    End Sub

   
    Private Sub button4_Click(sender As Object, e As EventArgs) Handles button4.Click
        Try
            Dim sqlconn As New OleDb.OleDbConnection
            Dim sqlquery As New OleDb.OleDbCommand
            Dim connString As String
            connString = "Provider=Microsoft.ACE.OLEDB.12.0;Data Source=" & Application.StartupPath & "\BloodBankDb.mdb"
            sqlconn.ConnectionString = connString
            sqlquery.Connection = sqlconn
            sqlconn.Open()
            sqlquery.CommandText = "UPDATE Donar SET NAME=@NAME, CONTACT=@CONTACT, ADDRESS=@ADDRESS, BGROUP=@BGROUP WHERE ID=@ID;"

            sqlquery.Parameters.AddWithValue("@NAME", txtname.Text)
            sqlquery.Parameters.AddWithValue("@CONTACT", txtcontact.Text)
            sqlquery.Parameters.AddWithValue("@ADDRESS", txtaddress.Text)
            sqlquery.Parameters.AddWithValue("@BGROUP", txtgroup.Text)
            sqlquery.Parameters.AddWithValue("@ID", txtid.Text)
            sqlquery.ExecuteNonQuery()
            sqlconn.Close()
            refreshdatagridview()
            MessageBox.Show("Information UpDate Successfully..")
            Clear()
        Catch ex As Exception
            MessageBox.Show(ex.Message)
        End Try
    End Sub

    Private Sub Donner_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        refreshdatagridview()
    End Sub


    Private Sub refreshdatagridview()
        Dim connString As String = "Provider=Microsoft.ACE.OLEDB.12.0;Data Source=" & Application.StartupPath & "\BloodBankDb.mdb"
        Dim myConnection As OleDbConnection = New OleDbConnection()
        myConnection.ConnectionString = connString
        myConnection.Open()
        Dim adp As OleDbDataAdapter = New OleDbDataAdapter("select * from Donar", myConnection)
        Dim dt As DataTable = New DataTable()
        adp.Fill(dt)
        DataGridView1.DataSource = dt
        myConnection.Close()
        adp.Dispose()
    End Sub


    Private Sub DataGridView1_RowHeaderMouseClick(sender As Object, e As DataGridViewCellMouseEventArgs) Handles DataGridView1.RowHeaderMouseClick
        Dim row As Object = DataGridView1.CurrentRow.Index
        txtid.Text = DataGridView1(0, row).Value
        txtname.Text = DataGridView1(1, row).Value
        txtcontact.Text = DataGridView1(2, row).Value
        txtaddress.Text = DataGridView1(3, row).Value
        txtgroup.Text = DataGridView1(4, row).Value
    End Sub



    Private Sub button3_Click(sender As Object, e As EventArgs) Handles button3.Click
        Try
            Dim sqlconn As New OleDb.OleDbConnection
            Dim sqlquery As New OleDb.OleDbCommand
            Dim connString As String
            connString = "Provider=Microsoft.ACE.OLEDB.12.0;Data Source=" & Application.StartupPath & "\BloodBankDb.mdb"
            sqlconn.ConnectionString = connString
            sqlquery.Connection = sqlconn
            sqlconn.Open()
            sqlquery.CommandText = "delete from Donar WHERE ID=@ID;"
            sqlquery.Parameters.AddWithValue("@ID", txtid.Text)
            sqlquery.ExecuteNonQuery()
            sqlconn.Close()
            refreshdatagridview()
            MessageBox.Show("Information Delete Successfully..")
            Clear()
        Catch ex As Exception
            MessageBox.Show(ex.Message)
        End Try
    End Sub

    Private Sub donorInfromationToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles donorInfromationToolStripMenuItem.Click
        Me.Hide()
        Home.Show()
    End Sub

    Private Sub exitToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles exitToolStripMenuItem.Click
        Me.Hide()
        Login.Show()
    End Sub

    Private Sub button2_Click(sender As Object, e As EventArgs) Handles button2.Click
        Dim rows = DataGridView1.Rows
        For Each row In rows
            If txtid.Text = DataGridView1(0, rows.IndexOf(row)).Value Then
                Dim dbConn As New OleDbConnection
                Dim connString As String
                connString = "Provider=Microsoft.ACE.OLEDB.12.0;Data Source=" & Application.StartupPath & "\BloodBankDb.mdb"
                dbConn.ConnectionString = connString
                dbConn.Open()
                Dim adp As OleDbDataAdapter = New OleDbDataAdapter("Select * from Donar where ID='" & DataGridView1(0, rows.IndexOf(row)).Value & "';", dbConn)
                Dim dt As DataTable = New DataTable()
                adp.Fill(dt)
                DataGridView1.DataSource = dt
                dbConn.Close()
                adp.Dispose()
            End If
        Next
    End Sub

    Private Sub Button5_Click(sender As Object, e As EventArgs) Handles Button5.Click
        Clear()
        refreshdatagridview()
    End Sub

    Private Sub DataGridView1_CellContentClick(sender As Object, e As DataGridViewCellEventArgs) Handles DataGridView1.CellContentClick

    End Sub

    Private Sub txtid_TextChanged(sender As Object, e As EventArgs) Handles txtid.TextChanged

    End Sub
End Class