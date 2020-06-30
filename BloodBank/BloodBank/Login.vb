Imports System.Data.OleDb

Public Class Login

    Private Sub button1_Click(sender As Object, e As EventArgs) Handles button1.Click
        Try
            Dim connString As String = "Provider=Microsoft.ACE.OLEDB.12.0;Data Source=" & Application.StartupPath & "\BloodBankDb.mdb"
            Dim myConnection As OleDbConnection = New OleDbConnection()
            myConnection.ConnectionString = connString

            Dim cmd As OleDbCommand = New OleDbCommand( _
                   "SELECT * FROM Login WHERE ID = '" & _
       txtuser.Text & "' AND [Password] = '" & txtpassword.Text & "' ", myConnection)
            myConnection.Open()
            Dim sdr As OleDbDataReader = cmd.ExecuteReader()

            If (sdr.Read() = True) Then
                Home.Show()
                Me.Hide()
            Else
                MessageBox.Show("Invalidname or password!")
            End If


            myConnection.Close()



        Catch ex As Exception
            MessageBox.Show(ex.Message)
        End Try
    End Sub

    Private Sub button2_Click(sender As Object, e As EventArgs) Handles button2.Click
        txtpassword.Text = ""
        txtuser.Text = ""

    End Sub

    Private Sub Login_Load(sender As Object, e As EventArgs) Handles MyBase.Load

    End Sub
End Class
