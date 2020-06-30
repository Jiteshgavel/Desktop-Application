Imports System.Data.OleDb

Public Class Login

    Private Sub Clear()
        TextBox1.Text = ""
        TextBox2.Text = ""
    End Sub

    Private Sub BtnLogin_Click(sender As Object, e As EventArgs) Handles BtnLogin.Click
        Try
            Dim connString As String = "Provider=Microsoft.Jet.OLEDB.4.0;Data Source=" & Application.StartupPath & "\CafeInfoDb.mdb"
            Dim myConnection As OleDbConnection = New OleDbConnection()
            myConnection.ConnectionString = connString
            Dim cmd As OleDbCommand = New OleDbCommand( _
                   "SELECT * FROM Login WHERE USERID = '" & _
       TextBox1.Text & "' AND [PASSWORD] = '" & TextBox2.Text & "' ", myConnection)
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

    Private Sub BtnCancel_Click(sender As Object, e As EventArgs) Handles BtnCancel.Click
        Clear()
    End Sub

    Private Sub Login_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        TextBox1.Select()

    End Sub
End Class
