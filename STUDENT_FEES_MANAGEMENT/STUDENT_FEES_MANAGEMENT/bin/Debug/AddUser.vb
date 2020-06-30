Public Class AddUser

    Public Sub Clear()
        txtuser.Text = ""
        TextBox1.Text = ""

    End Sub




    Private Sub button1_Click(sender As Object, e As EventArgs) Handles button1.Click
        Try
            Dim sqlconn As New OleDb.OleDbConnection
            Dim sqlquery As New OleDb.OleDbCommand
            Dim connString As String
            connString = "Provider=Microsoft.Jet.OLEDB.4.0;Data Source=" & Application.StartupPath & "\StudentFees.mdb"
            sqlconn.ConnectionString = connString
            sqlquery.Connection = sqlconn
            sqlconn.Open()
            sqlquery.CommandText = "INSERT INTO LOGIN([USERID], [PASSWORD])VALUES(@USERID, @PASSWORD)"
            sqlquery.Parameters.AddWithValue("@USERID", txtuser.Text)
            sqlquery.Parameters.AddWithValue("@PASSWORD", TextBox1.Text)
            sqlquery.ExecuteNonQuery()
            sqlconn.Close()
            MsgBox("Inserted Successfully....")
            Clear()
        Catch ex As Exception
            MessageBox.Show(ex.Message)
        End Try
    End Sub

  

    Private Sub HomeToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles HomeToolStripMenuItem.Click
        Me.Hide()
        Home.Show()

    End Sub

    Private Sub ExitToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles ExitToolStripMenuItem.Click
        Me.Hide()
        Login.Show()
    End Sub

    

    Private Sub button2_Click(sender As Object, e As EventArgs) Handles button2.Click
        Clear()
    End Sub
End Class