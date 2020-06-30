Imports System.Data.OleDb

Public Class Order
    Dim A As Integer
    Dim B As Integer
    Dim C As Integer

    Public Sub Clear()
        TextBox1.Text = ""
        TextBox2.Text = ""
        TextBox3.Text = ""
        TextBox4.Text = ""
        TextBox5.Text = ""
        ComboBox1.Text = ""
        ListBox1.Text = ""
    End Sub

    Private Sub refreshdatagridview()
        Try

       
            Dim connString As String = "Provider=Microsoft.Jet.OLEDB.4.0;Data Source=" & Application.StartupPath & "\CafeInfoDb.mdb"
        Dim myConnection As OleDbConnection = New OleDbConnection()
        myConnection.ConnectionString = connString
        myConnection.Open()
        Dim adp As OleDbDataAdapter = New OleDbDataAdapter("select * from ORDERT1", myConnection)
        Dim dt As DataTable = New DataTable()
        adp.Fill(dt)
        DataGridView1.DataSource = dt
        myConnection.Close()
            adp.Dispose()
        Catch ex As Exception
            MessageBox.Show(ex.Message)
        End Try
    End Sub





    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click

        ListBox1.Items.Clear()
        ListBox1.Items.Add("------------------------------------------------------------------------------------------")
        ListBox1.Items.Add("@ Order Details @")
        ListBox1.Items.Add("------------------------------------------------------------------------------------------")
        ListBox1.Items.Add(" ID        : " + TextBox1.Text)
        ListBox1.Items.Add("")
        ListBox1.Items.Add("NAME      : " + TextBox2.Text)
        ListBox1.Items.Add("")
        ListBox1.Items.Add("PRODUCT   : " + ComboBox1.Text)
        ListBox1.Items.Add("")
        ListBox1.Items.Add("QUANTITY  : " + TextBox3.Text)
        ListBox1.Items.Add("")
        ListBox1.Items.Add("PRICE     : " + TextBox4.Text)
        ListBox1.Items.Add("------------------------------------------------------------------------------------------")
        ListBox1.Items.Add("TOTAL     : " + TextBox5.Text)
        ListBox1.Items.Add("------------------------------------------------------------------------------------------")

        Try
            Dim sqlconn As New OleDb.OleDbConnection
            Dim sqlquery As New OleDb.OleDbCommand
            Dim connString As String
            connString = "Provider=Microsoft.Jet.OLEDB.4.0;Data Source=" & Application.StartupPath & "\CafeInfoDb.mdb"
            sqlconn.ConnectionString = connString
            sqlquery.Connection = sqlconn
            sqlconn.Open()
            sqlquery.CommandText = "INSERT INTO ORDERT1(C_ID,C_NAME,PRODUCT_N,P_QUNTITY,P_PRICE,P_TOTAL)VALUES(@C_ID,@C_NAME,@PRODUCT_N,@P_QUNTITY,@P_PRICE,@P_TOTAL)"
            'sqlquery.CommandText = "INSERT INTO ORDER(ID,NAME,PRODUCT,QUANTITY,PRICE,TOTAL)VALUES(" & (TextBox1.Text) & "," & (TextBox2.Text) & "," & (ComboBox1.Text) & "," & (TextBox3.Text) & "," & (TextBox4.Text) & "," & (TextBox5.Text) & ")"
            sqlquery.Parameters.AddWithValue("@C_ID", TextBox1.Text)
            sqlquery.Parameters.AddWithValue("@C_NAME", TextBox2.Text)
            sqlquery.Parameters.AddWithValue("@PRODUCT_N", ComboBox1.Text)
            sqlquery.Parameters.AddWithValue("@P_QUNTITY", TextBox3.Text)
            sqlquery.Parameters.AddWithValue("@P_PRICEL", TextBox4.Text)
            sqlquery.Parameters.AddWithValue("@P_TOTAL", TextBox5.Text)
            sqlquery.ExecuteNonQuery()
            sqlconn.Close()
            refreshdatagridview()
            MsgBox("Information Inserted Successfully.")
            Clear()
        Catch ex As Exception
            MsgBox(ex.ToString())
        End Try

    End Sub

    Private Sub TextBox4_TextChanged(sender As Object, e As EventArgs) Handles TextBox4.TextChanged
        A = Val(TextBox3.Text)
        B = Val(TextBox4.Text)
        C = (A * B)
        TextBox5.Text = C
    End Sub

    
    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click

        ListBox1.Items.Clear()
        ListBox1.Items.Add("------------------------------------------------------------------------------------------")
        ListBox1.Items.Add("@ Order Details @")
        ListBox1.Items.Add("------------------------------------------------------------------------------------------")
        ListBox1.Items.Add(" ID        : " + TextBox1.Text)
        ListBox1.Items.Add("")
        ListBox1.Items.Add("NAME      : " + TextBox2.Text)
        ListBox1.Items.Add("")
        ListBox1.Items.Add("PRODUCT   : " + ComboBox1.Text)
        ListBox1.Items.Add("")
        ListBox1.Items.Add("QUANTITY  : " + TextBox3.Text)
        ListBox1.Items.Add("")
        ListBox1.Items.Add("PRICE     : " + TextBox4.Text)
        ListBox1.Items.Add("------------------------------------------------------------------------------------------")
        ListBox1.Items.Add("TOTAL     : " + TextBox5.Text)
        ListBox1.Items.Add("------------------------------------------------------------------------------------------")

        Try
            Dim sqlconn As New OleDb.OleDbConnection
            Dim sqlquery As New OleDb.OleDbCommand
            Dim connString As String
            connString = "Provider=Microsoft.Jet.OLEDB.4.0;Data Source=" & Application.StartupPath & "\CafeInfoDb.mdb"
            sqlconn.ConnectionString = connString
            sqlquery.Connection = sqlconn
            sqlconn.Open()
            sqlquery.CommandText = "UPDATE ORDERT1 SET C_NAME =@C_NMAE,PRODUCT_N=@PRODUCT_N,P_QUNTITY=@P_QUNTITY,P_PRICE=@P_PRICE,P_TOTAL=@P_TOTAL WHERE C_ID=@CID"
            'sqlquery.CommandText = "INSERT INTO ORDER(ID,NAME,PRODUCT,QUANTITY,PRICE,TOTAL)VALUES(" & (TextBox1.Text) & "," & (TextBox2.Text) & "," & (ComboBox1.Text) & "," & (TextBox3.Text) & "," & (TextBox4.Text) & "," & (TextBox5.Text) & ")"

            sqlquery.Parameters.AddWithValue("@C_NAME", TextBox2.Text)
            sqlquery.Parameters.AddWithValue("@PRODUCT_N", ComboBox1.Text)
            sqlquery.Parameters.AddWithValue("@P_QUNTITY", TextBox3.Text)
            sqlquery.Parameters.AddWithValue("@P_PRICEL", TextBox4.Text)
            sqlquery.Parameters.AddWithValue("@P_TOTAL", TextBox5.Text)
            sqlquery.Parameters.AddWithValue("@C_ID", TextBox1.Text)
            sqlquery.ExecuteNonQuery()
            sqlconn.Close()
            refreshdatagridview()
            MsgBox("Information Update Successfully.")
            Clear()
        Catch ex As Exception
            MsgBox(ex.ToString())
        End Try

    End Sub

    Private Sub Order_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        refreshdatagridview()
        TextBox1.Select()
    End Sub

    

    Private Sub DataGridView1_RowHeaderMouseClick(sender As Object, e As DataGridViewCellMouseEventArgs) Handles DataGridView1.RowHeaderMouseClick
        Try
        Dim row As Object = DataGridView1.CurrentRow.Index
        TextBox1.Text = DataGridView1(0, row).Value
        TextBox2.Text = DataGridView1(1, row).Value
        ComboBox1.Text = DataGridView1(2, row).Value
        TextBox3.Text = DataGridView1(3, row).Value
        TextBox4.Text = DataGridView1(4, row).Value
            TextBox5.Text = DataGridView1(5, row).Value
        Catch ex As Exception
            MessageBox.Show(ex.Message)
        End Try
    End Sub

    Private Sub Button3_Click(sender As Object, e As EventArgs) Handles Button3.Click
        Try
            Dim sqlconn As New OleDb.OleDbConnection
            Dim sqlquery As New OleDb.OleDbCommand
            Dim connString As String
            connString = "Provider=Microsoft.Jet.OLEDB.4.0;Data Source=" & Application.StartupPath & "\CafeInfoDb.mdb"
            sqlconn.ConnectionString = connString
            sqlquery.Connection = sqlconn
            sqlconn.Open()
            sqlquery.CommandText = "delete from ORDERT1 WHERE C_ID=@ID;"
            sqlquery.Parameters.AddWithValue("@ID", TextBox1.Text)
            sqlquery.ExecuteNonQuery()
            sqlconn.Close()
            refreshdatagridview()
            MessageBox.Show("Information Delete Successfully..")
            Clear()
        Catch ex As Exception
            MessageBox.Show(ex.Message)
        End Try
    End Sub

    Private Sub Button4_Click(sender As Object, e As EventArgs) Handles Button4.Click
        Try
            refreshdatagridview()
            Dim rows = DataGridView1.Rows
            For Each row In rows
                If TextBox1.Text = DataGridView1(0, rows.IndexOf(row)).Value Then
                    Dim dbConn As New OleDbConnection
                    Dim connString As String
                    connString = "Provider=Microsoft.Jet.OLEDB.4.0;Data Source=" & Application.StartupPath & "\CafeInfoDb.mdb"
                    dbConn.ConnectionString = connString
                    dbConn.Open()
                    Dim adp As OleDbDataAdapter = New OleDbDataAdapter("Select * from ORDERT1 where C_ID='" & DataGridView1(0, rows.IndexOf(row)).Value & "';", dbConn)
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

    Private Sub Button5_Click(sender As Object, e As EventArgs) Handles Button5.Click
        Clear()
        ListBox1.Items.Clear()
    End Sub

    Private Sub HomeToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles HomeToolStripMenuItem.Click
        Me.Hide()
        Home.Show()

    End Sub

    Private Sub ExitToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles ExitToolStripMenuItem.Click
        Me.Hide()
        Stock.Show()

    End Sub

    Private Sub ADDADMINToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles ADDADMINToolStripMenuItem.Click
        Me.Hide()
        Login.Show()

    End Sub

   
    
End Class