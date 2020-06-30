Imports System.Data.OleDb
Public Class FeesView

    Public Sub Display()
        Dim connString As String = "Provider=Microsoft.Jet.OLEDB.4.0;Data Source=" & Application.StartupPath & "\StudentFees.mdb;"
        Dim myConnection As OleDbConnection = New OleDbConnection()
        myConnection.ConnectionString = connString
        myConnection.Open()
        Dim adp As OleDbDataAdapter = New OleDbDataAdapter("SELECT * FROM STUDENT", myConnection)
        Dim dt As DataTable = New DataTable()
        adp.Fill(dt)
        DataGridView1.DataSource = dt
        myConnection.Close()
        adp.Dispose()
    End Sub




    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Dim connString As String = "Provider=Microsoft.Jet.OLEDB.4.0;Data Source=" & Application.StartupPath & "\StudentFees.mdb;"
        Dim myConnection As OleDbConnection = New OleDbConnection()
        myConnection.ConnectionString = connString
        myConnection.Open()
        Dim adp As OleDbDataAdapter = New OleDbDataAdapter("SELECT * FROM STUDENT WHERE UNPAID = 0", myConnection)
        Dim dt As DataTable = New DataTable()
        adp.Fill(dt)
        DataGridView1.DataSource = dt
        myConnection.Close()
        adp.Dispose()
    End Sub

    Private Sub Button3_Click(sender As Object, e As EventArgs) Handles Button3.Click
        Dim connString As String = "Provider=Microsoft.Jet.OLEDB.4.0;Data Source=" & Application.StartupPath & "\StudentFees.mdb;"
        Dim myConnection As OleDbConnection = New OleDbConnection()
        myConnection.ConnectionString = connString
        myConnection.Open()
        Dim adp As OleDbDataAdapter = New OleDbDataAdapter("SELECT * FROM STUDENT", myConnection)
        Dim dt As DataTable = New DataTable()
        adp.Fill(dt)
        DataGridView1.DataSource = dt
        myConnection.Close()
        adp.Dispose()
    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        Dim connString As String = "Provider=Microsoft.Jet.OLEDB.4.0;Data Source=" & Application.StartupPath & "\StudentFees.mdb;"
        Dim myConnection As OleDbConnection = New OleDbConnection()
        myConnection.ConnectionString = connString
        myConnection.Open()
        Dim adp As OleDbDataAdapter = New OleDbDataAdapter("SELECT * FROM STUDENT WHERE UNPAID > 0", myConnection)
        Dim dt As DataTable = New DataTable()
        adp.Fill(dt)
        DataGridView1.DataSource = dt
        myConnection.Close()
        adp.Dispose()
    End Sub

    Private Sub FeesView_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Display()

    End Sub

   
   
    

   

    Private Sub HomeToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles HomeToolStripMenuItem.Click
        Me.Hide()
        Home.Show()

    End Sub

    Private Sub ExitToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles ExitToolStripMenuItem.Click
        Me.Hide()
        Login.Show()

    End Sub
End Class