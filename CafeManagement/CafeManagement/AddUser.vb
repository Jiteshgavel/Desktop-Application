Public Class AddUser

    Private Sub Clear()
        TextBox1.Text = ""
        TextBox2.Text = ""
    End Sub


    Private Sub HomeToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles HomeToolStripMenuItem.Click
        Me.Hide()
        Home.Show()

    End Sub

    Private Sub ADDADMINToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles ADDADMINToolStripMenuItem.Click
        Me.Hide()
        Login.Show()

    End Sub

    Private Sub Button5_Click(sender As Object, e As EventArgs) Handles Button5.Click
        Try
            Dim sqlconn As New OleDb.OleDbConnection
            Dim sqlquery As New OleDb.OleDbCommand
            Dim connString As String
            connString = "Provider=Microsoft.Jet.OLEDB.4.0;Data Source=" & Application.StartupPath & "\CafeInfoDb.mdb"
            sqlconn.ConnectionString = connString
            sqlquery.Connection = sqlconn
            sqlconn.Open()
            sqlquery.CommandText = "INSERT INTO LOGIN([USERID], [PASSWORD])VALUES(@USERID, @PASSWORD)"
            sqlquery.Parameters.AddWithValue("@USERID", TextBox1.Text)
            sqlquery.Parameters.AddWithValue("@PASSWORD", TextBox2.Text)
            sqlquery.ExecuteNonQuery()
            sqlconn.Close()
            MsgBox("Inserted Successfully....")
            Clear()
        Catch ex As Exception
            MessageBox.Show(ex.Message)
        End Try
    End Sub

    Private Sub AddUser_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        TextBox1.Select()

    End Sub
End Class