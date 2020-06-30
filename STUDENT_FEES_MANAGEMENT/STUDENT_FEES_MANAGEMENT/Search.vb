Imports System.Data.OleDb
Public Class Search
    Public Sub refreshdatagridview()
        Dim connString As String = "Provider=Microsoft.Jet.OLEDB.4.0;Data Source=|DataDirectory|\StudentFees.mdb"
        Dim myConnection As OleDbConnection = New OleDbConnection()
        myConnection.ConnectionString = connString
        myConnection.Open()
        Dim adp As OleDbDataAdapter = New OleDbDataAdapter("select * from STUDENT", myConnection)
        Dim dt As DataTable = New DataTable()
        adp.Fill(dt)
        DataGridView1.DataSource = dt
        myConnection.Close()
        adp.Dispose()
    End Sub



    Private Sub Button1_Click(sender As Object, e As EventArgs)
        Dim rows = DataGridView1.Rows
        For Each row In rows
            If TextBox1.Text = DataGridView1(0, rows.IndexOf(row)).Value Then
                Dim dbConn As New OleDbConnection
                Dim connString As String
                connString = "Provider=Microsoft.Jet.OLEDB.4.0;Data Source=|DataDirectory|\StudentFees.mdb"
                dbConn.ConnectionString = connString
                dbConn.Open()
                Dim adp As OleDbDataAdapter = New OleDbDataAdapter("Select * from STUDENT where ID='" & DataGridView1(0, rows.IndexOf(row)).Value & "';", dbConn)
                Dim dt As DataTable = New DataTable()
                adp.Fill(dt)
                DataGridView1.DataSource = dt
                dbConn.Close()
                adp.Dispose()
            End If
        Next
    End Sub

    Private Sub Search_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        refreshdatagridview()
    End Sub

    Private Sub DataGridView1_CellContentClick(sender As Object, e As DataGridViewCellEventArgs) Handles DataGridView1.CellContentClick


      
    End Sub

    Private Sub DataGridView1_RowHeaderMouseClick(sender As Object, e As DataGridViewCellMouseEventArgs) Handles DataGridView1.RowHeaderMouseClick

        Dim row As Object = DataGridView1.CurrentRow.Index
        Module1.id = DataGridView1(0, row).Value
        Module1.name = DataGridView1(1, row).Value
        Module1.mobile = DataGridView1(2, row).Value
        Module1.gender = DataGridView1(3, row).Value
        Module1.address = DataGridView1(4, row).Value
        Module1.adate = DataGridView1(5, row).Value
        Module1.course = DataGridView1(6, row).Value
        Module1.duration = DataGridView1(7, row).Value
        Module1.batch = DataGridView1(8, row).Value
        Module1.total = DataGridView1(9, row).Value
        Module1.paid = DataGridView1(10, row).Value
        Module1.unpaid = DataGridView1(11, row).Value
        Me.Hide()
        ManageStudent.Show()


    End Sub

    Private Sub HomeToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles HomeToolStripMenuItem.Click
        Me.Hide()
        Home.Show()

    End Sub

    Private Sub ExitToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles ExitToolStripMenuItem.Click
        Me.Hide()
        Login.Show()

    End Sub

    Private Sub Button3_Click(sender As Object, e As EventArgs) Handles Button3.Click
        Dim rows = DataGridView1.Rows
        For Each row In rows
            If TextBox1.Text = DataGridView1(0, rows.IndexOf(row)).Value Then
                Dim dbConn As New OleDbConnection
                Dim connString As String
                connString = "Provider=Microsoft.Jet.OLEDB.4.0;Data Source=|DataDirectory|\StudentFees.mdb"
                dbConn.ConnectionString = connString
                dbConn.Open()
                Dim adp As OleDbDataAdapter = New OleDbDataAdapter("Select * from STUDENT where ID='" & DataGridView1(0, rows.IndexOf(row)).Value & "';", dbConn)
                Dim dt As DataTable = New DataTable()
                adp.Fill(dt)
                DataGridView1.DataSource = dt
                dbConn.Close()
                adp.Dispose()
            End If
        Next
    End Sub
End Class