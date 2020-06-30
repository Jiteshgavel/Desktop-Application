Imports System.Data.OleDb

Public Class Stock


    Public Sub Clear()
        txtName.Text = ""
        TxtPrice.Text = ""
        TxtQuantity.Text = ""
        txtstockid.Text = ""

    End Sub
    Private Sub refreshdatagridview()
        Try

       
            Dim connString As String = "Provider=Microsoft.Jet.OLEDB.4.0;Data Source=" & Application.StartupPath & "\CafeInfoDb.mdb"
        Dim myConnection As OleDbConnection = New OleDbConnection()
        myConnection.ConnectionString = connString
        myConnection.Open()
        Dim adp As OleDbDataAdapter = New OleDbDataAdapter("select * from STOCK", myConnection)
        Dim dt As DataTable = New DataTable()
        adp.Fill(dt)
        DataGridView1.DataSource = dt
        myConnection.Close()
            adp.Dispose()
        Catch ex As Exception
            MessageBox.Show(ex.Message)
        End Try
    End Sub



    Private Sub BtnAdd_Click(sender As Object, e As EventArgs) Handles BtnAdd.Click
        Try
            Dim sqlconn As New OleDb.OleDbConnection
            Dim sqlquery As New OleDb.OleDbCommand
            Dim connString As String
            connString = "Provider=Microsoft.Jet.OLEDB.4.0;Data Source=" & Application.StartupPath & "\CafeInfoDb.mdb"
            sqlconn.ConnectionString = connString
            sqlquery.Connection = sqlconn
            sqlconn.Open()
            sqlquery.CommandText = "INSERT INTO STOCK([ID],[NAME],[PRICE],[QUANTITY]) VALUES(@ID,@NAME,@PRICE,@QUANTITY)"
            sqlquery.Parameters.AddWithValue("@ID", txtstockid.Text)
            sqlquery.Parameters.AddWithValue("@NAME", txtName.Text)
            sqlquery.Parameters.AddWithValue("@PRICE", TxtPrice.Text)
            sqlquery.Parameters.AddWithValue("@QUANTITY", TxtQuantity.Text)
            sqlquery.ExecuteNonQuery()
            sqlconn.Close()
            refreshdatagridview()
            MsgBox("Information Inserted Successfully.")
            Clear()
        Catch ex As Exception
            MessageBox.Show(ex.Message)
        End Try

    End Sub

    Private Sub BtnUpdate_Click(sender As Object, e As EventArgs) Handles BtnUpdate.Click
        Try
            Dim sqlconn As New OleDb.OleDbConnection
            Dim sqlquery As New OleDb.OleDbCommand
            Dim connString As String
            connString = "Provider=Microsoft.Jet.OLEDB.4.0;Data Source=" & Application.StartupPath & "\CafeInfoDb.mdb"
            sqlconn.ConnectionString = connString
            sqlquery.Connection = sqlconn
            sqlconn.Open()
            sqlquery.CommandText = "UPDATE STOCK SET NAME=@NAME,PRICE=@PRICE,QUANTITY=@QUANTITY WHERE ID=@ID;"
            sqlquery.Parameters.AddWithValue("@NAME", txtName.Text)
            sqlquery.Parameters.AddWithValue("@PRICE", TxtPrice.Text)
            sqlquery.Parameters.AddWithValue("@QUANTITY", TxtQuantity.Text)
            sqlquery.Parameters.AddWithValue("@ID", txtstockid.Text)
            sqlquery.ExecuteNonQuery()
            sqlconn.Close()
            refreshdatagridview()
            MsgBox("Information UpDate Successfully.")
            Clear()
        Catch ex As Exception
            MessageBox.Show(ex.Message)
        End Try
    End Sub

    Private Sub Stock_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        refreshdatagridview()
        txtstockid.Select()

    End Sub

    Private Sub DataGridView1_CellContentClick(sender As Object, e As DataGridViewCellEventArgs) Handles DataGridView1.CellContentClick

    End Sub

    Private Sub DataGridView1_RowHeaderMouseClick(sender As Object, e As DataGridViewCellMouseEventArgs) Handles DataGridView1.RowHeaderMouseClick
        Try
        Dim row As Object = DataGridView1.CurrentRow.Index
        txtstockid.Text = DataGridView1(0, row).Value
        txtName.Text = DataGridView1(1, row).Value
        TxtPrice.Text = DataGridView1(2, row).Value
            TxtQuantity.Text = DataGridView1(3, row).Value
        Catch ex As Exception
            MessageBox.Show(ex.Message)
        End Try

    End Sub

    Private Sub BtnDelete_Click(sender As Object, e As EventArgs) Handles BtnDelete.Click
        Try
            Dim sqlconn As New OleDb.OleDbConnection
            Dim sqlquery As New OleDb.OleDbCommand
            Dim connString As String
            connString = "Provider=Microsoft.Jet.OLEDB.4.0;Data Source=" & Application.StartupPath & "\CafeInfoDb.mdb"
            sqlconn.ConnectionString = connString
            sqlquery.Connection = sqlconn
            sqlconn.Open()
            sqlquery.CommandText = "delete from STOCK WHERE ID=@ID;"
            sqlquery.Parameters.AddWithValue("@ID", txtstockid.Text)
            sqlquery.ExecuteNonQuery()
            sqlconn.Close()
            refreshdatagridview()
            MessageBox.Show("Information Delete Successfully..")
            Clear()
        Catch ex As Exception
            MessageBox.Show(ex.Message)
        End Try
    End Sub

    Private Sub BtnSEARCH_Click(sender As Object, e As EventArgs) Handles BtnSEARCH.Click
        Try
        refreshdatagridview()
        Dim rows = DataGridView1.Rows
        For Each row In rows
            If txtstockid.Text = DataGridView1(0, rows.IndexOf(row)).Value Then
                Dim dbConn As New OleDbConnection
                Dim connString As String
                    connString = "Provider=Microsoft.Jet.OLEDB.4.0;Data Source=" & Application.StartupPath & "\CafeInfoDb.mdb"
                dbConn.ConnectionString = connString
                dbConn.Open()
                Dim adp As OleDbDataAdapter = New OleDbDataAdapter("Select * from STOCK where ID='" & DataGridView1(0, rows.IndexOf(row)).Value & "';", dbConn)
                Dim dt As DataTable = New DataTable()
                adp.Fill(dt)
                DataGridView1.DataSource = dt
                dbConn.Close()
                adp.Dispose()
            End If
            Next
        Catch ex As Exception
            MessageBox.Show(ex.Message)
        End Try
    End Sub

    Private Sub ToolStripMenuItem2_Click(sender As Object, e As EventArgs)

    End Sub

    Private Sub ExitToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles ExitToolStripMenuItem.Click
        Me.Hide()
        Home.Show()

    End Sub

    Private Sub HomeToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles HomeToolStripMenuItem.Click
        Me.Hide()
        Order.Show()

    End Sub

    Private Sub LOGOUTToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles LOGOUTToolStripMenuItem.Click
        Me.Hide()
        Login.Show()

    End Sub

    Private Sub BtnExit_Click(sender As Object, e As EventArgs) Handles BtnExit.Click
        Clear()
    End Sub

    Private Sub txtstockid_TextChanged(sender As Object, e As EventArgs) Handles txtstockid.TextChanged

    End Sub
End Class