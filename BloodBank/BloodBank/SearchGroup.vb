Imports System.Data.OleDb

Public Class SearchGroup

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




    Private Sub SearchGroup_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        refreshdatagridview()
    End Sub

    Private Sub donorInfromationToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles donorInfromationToolStripMenuItem.Click
        Me.Hide()
        Home.Show()
    End Sub

    Private Sub exitToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles exitToolStripMenuItem.Click
        Me.Hide()
        Login.Show()
    End Sub
End Class