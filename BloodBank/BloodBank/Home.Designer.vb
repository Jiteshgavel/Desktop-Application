<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Home
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.Panel1 = New System.Windows.Forms.Panel()
        Me.menuStrip1 = New System.Windows.Forms.MenuStrip()
        Me.donorInfromationToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.searchDonorInfromationToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.exitToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.SearchBloodGroupToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.menuStrip1.SuspendLayout()
        Me.SuspendLayout()
        '
        'Panel1
        '
        Me.Panel1.BackgroundImage = Global.BloodBank.My.Resources.Resources.b3
        Me.Panel1.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch
        Me.Panel1.Location = New System.Drawing.Point(2, 27)
        Me.Panel1.Name = "Panel1"
        Me.Panel1.Size = New System.Drawing.Size(660, 399)
        Me.Panel1.TabIndex = 0
        '
        'menuStrip1
        '
        Me.menuStrip1.BackColor = System.Drawing.SystemColors.ControlLightLight
        Me.menuStrip1.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.menuStrip1.Items.AddRange(New System.Windows.Forms.ToolStripItem() {Me.donorInfromationToolStripMenuItem, Me.searchDonorInfromationToolStripMenuItem, Me.SearchBloodGroupToolStripMenuItem, Me.exitToolStripMenuItem})
        Me.menuStrip1.Location = New System.Drawing.Point(0, 0)
        Me.menuStrip1.Name = "menuStrip1"
        Me.menuStrip1.Size = New System.Drawing.Size(662, 24)
        Me.menuStrip1.TabIndex = 1
        Me.menuStrip1.Text = "menuStrip1"
        '
        'donorInfromationToolStripMenuItem
        '
        Me.donorInfromationToolStripMenuItem.Name = "donorInfromationToolStripMenuItem"
        Me.donorInfromationToolStripMenuItem.Size = New System.Drawing.Size(174, 20)
        Me.donorInfromationToolStripMenuItem.Text = "Add Donor Infromation"
        '
        'searchDonorInfromationToolStripMenuItem
        '
        Me.searchDonorInfromationToolStripMenuItem.Name = "searchDonorInfromationToolStripMenuItem"
        Me.searchDonorInfromationToolStripMenuItem.Size = New System.Drawing.Size(195, 20)
        Me.searchDonorInfromationToolStripMenuItem.Text = "Add Receiver Infromation"
        '
        'exitToolStripMenuItem
        '
        Me.exitToolStripMenuItem.Name = "exitToolStripMenuItem"
        Me.exitToolStripMenuItem.Size = New System.Drawing.Size(45, 20)
        Me.exitToolStripMenuItem.Text = "Exit"
        '
        'SearchBloodGroupToolStripMenuItem
        '
        Me.SearchBloodGroupToolStripMenuItem.Name = "SearchBloodGroupToolStripMenuItem"
        Me.SearchBloodGroupToolStripMenuItem.Size = New System.Drawing.Size(160, 20)
        Me.SearchBloodGroupToolStripMenuItem.Text = "Search Blood Group"
        '
        'Home
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(662, 427)
        Me.Controls.Add(Me.menuStrip1)
        Me.Controls.Add(Me.Panel1)
        Me.Name = "Home"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Home"
        Me.menuStrip1.ResumeLayout(False)
        Me.menuStrip1.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents Panel1 As System.Windows.Forms.Panel
    Private WithEvents menuStrip1 As System.Windows.Forms.MenuStrip
    Private WithEvents donorInfromationToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Private WithEvents searchDonorInfromationToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Private WithEvents exitToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents SearchBloodGroupToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
End Class
