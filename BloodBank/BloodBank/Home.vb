Public Class Home

    Private Sub donorInfromationToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles donorInfromationToolStripMenuItem.Click
        Me.Hide()
        Donner.Show()
    End Sub

    Private Sub searchDonorInfromationToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles searchDonorInfromationToolStripMenuItem.Click
        Me.Hide()
        Receiver.Show()
    End Sub

    Private Sub exitToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles exitToolStripMenuItem.Click
        Me.Hide()
        Login.Show()
    End Sub

    Private Sub SearchBloodGroupToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles SearchBloodGroupToolStripMenuItem.Click
        Me.Hide()
        SearchGroup.Show()
    End Sub
End Class