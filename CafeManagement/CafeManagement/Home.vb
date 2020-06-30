Public Class Home

    Private Sub HomeToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles HomeToolStripMenuItem.Click
        Me.Hide()
        Order.Show()

    End Sub

    Private Sub ADDADMINToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles ADDADMINToolStripMenuItem.Click
        Me.Hide()
        AddUser.Show()

    End Sub

    

    Private Sub ExitToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles ExitToolStripMenuItem.Click
        Me.Hide()
        Stock.Show()

    End Sub

    Private Sub LOGOUTToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles LOGOUTToolStripMenuItem.Click
        Me.Hide()
        Login.Show()

    End Sub


End Class