Public Class Home

    Private Sub AddStudentToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles AddStudentToolStripMenuItem.Click
        Me.Hide()
        AddStudent.Show()
    End Sub

    Private Sub ManageStudentToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles ManageStudentToolStripMenuItem.Click
        Search.refreshdatagridview()
        Me.Hide()
        Search.Show()
    End Sub

    Private Sub FeesViewToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles FeesViewToolStripMenuItem.Click
        Me.Hide()
        FeesView.Show()
    End Sub

    Private Sub ExitToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles ExitToolStripMenuItem.Click
        Me.Hide()
        Login.Show()
    End Sub

    Private Sub AddUserToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles AddUserToolStripMenuItem.Click
        Me.Hide()
        AddUser.Show()

    End Sub

    Private Sub Home_Load(sender As Object, e As EventArgs) Handles MyBase.Load

    End Sub
End Class