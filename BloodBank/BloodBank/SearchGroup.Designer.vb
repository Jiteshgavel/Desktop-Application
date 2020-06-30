<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class SearchGroup
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
        Dim DataGridViewCellStyle1 As System.Windows.Forms.DataGridViewCellStyle = New System.Windows.Forms.DataGridViewCellStyle()
        Me.label6 = New System.Windows.Forms.Label()
        Me.txtid = New System.Windows.Forms.ComboBox()
        Me.button2 = New System.Windows.Forms.Button()
        Me.DataGridView1 = New System.Windows.Forms.DataGridView()
        Me.label3 = New System.Windows.Forms.Label()
        Me.menuStrip1 = New System.Windows.Forms.MenuStrip()
        Me.donorInfromationToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.exitToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        CType(Me.DataGridView1, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.menuStrip1.SuspendLayout()
        Me.SuspendLayout()
        '
        'label6
        '
        Me.label6.AutoSize = True
        Me.label6.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.label6.Location = New System.Drawing.Point(143, 113)
        Me.label6.Name = "label6"
        Me.label6.Size = New System.Drawing.Size(95, 16)
        Me.label6.TabIndex = 34
        Me.label6.Text = "Blood Group"
        '
        'txtid
        '
        Me.txtid.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtid.FormattingEnabled = True
        Me.txtid.Items.AddRange(New Object() {"A-", "A+", "B-", "B+", "A+B+", "A1B+"})
        Me.txtid.Location = New System.Drawing.Point(253, 110)
        Me.txtid.Name = "txtid"
        Me.txtid.Size = New System.Drawing.Size(121, 24)
        Me.txtid.TabIndex = 38
        Me.txtid.Text = "--Select--"
        '
        'button2
        '
        Me.button2.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.button2.Location = New System.Drawing.Point(390, 108)
        Me.button2.Name = "button2"
        Me.button2.Size = New System.Drawing.Size(73, 27)
        Me.button2.TabIndex = 55
        Me.button2.Text = "Search"
        Me.button2.UseVisualStyleBackColor = True
        '
        'DataGridView1
        '
        Me.DataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize
        DataGridViewCellStyle1.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleLeft
        DataGridViewCellStyle1.BackColor = System.Drawing.SystemColors.Window
        DataGridViewCellStyle1.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        DataGridViewCellStyle1.ForeColor = System.Drawing.SystemColors.ControlText
        DataGridViewCellStyle1.SelectionBackColor = System.Drawing.SystemColors.Highlight
        DataGridViewCellStyle1.SelectionForeColor = System.Drawing.SystemColors.HighlightText
        DataGridViewCellStyle1.WrapMode = System.Windows.Forms.DataGridViewTriState.[False]
        Me.DataGridView1.DefaultCellStyle = DataGridViewCellStyle1
        Me.DataGridView1.Location = New System.Drawing.Point(69, 174)
        Me.DataGridView1.Name = "DataGridView1"
        Me.DataGridView1.Size = New System.Drawing.Size(515, 222)
        Me.DataGridView1.TabIndex = 56
        '
        'label3
        '
        Me.label3.AutoSize = True
        Me.label3.Font = New System.Drawing.Font("Microsoft Sans Serif", 14.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.label3.ForeColor = System.Drawing.Color.IndianRed
        Me.label3.Location = New System.Drawing.Point(199, 39)
        Me.label3.Name = "label3"
        Me.label3.Size = New System.Drawing.Size(237, 24)
        Me.label3.TabIndex = 57
        Me.label3.Text = "Blood Group Information"
        '
        'menuStrip1
        '
        Me.menuStrip1.BackColor = System.Drawing.SystemColors.ButtonHighlight
        Me.menuStrip1.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.menuStrip1.Items.AddRange(New System.Windows.Forms.ToolStripItem() {Me.donorInfromationToolStripMenuItem, Me.exitToolStripMenuItem})
        Me.menuStrip1.Location = New System.Drawing.Point(0, 0)
        Me.menuStrip1.Name = "menuStrip1"
        Me.menuStrip1.Size = New System.Drawing.Size(651, 24)
        Me.menuStrip1.TabIndex = 58
        Me.menuStrip1.Text = "menuStrip1"
        '
        'donorInfromationToolStripMenuItem
        '
        Me.donorInfromationToolStripMenuItem.Name = "donorInfromationToolStripMenuItem"
        Me.donorInfromationToolStripMenuItem.Size = New System.Drawing.Size(61, 20)
        Me.donorInfromationToolStripMenuItem.Text = "Home"
        '
        'exitToolStripMenuItem
        '
        Me.exitToolStripMenuItem.Name = "exitToolStripMenuItem"
        Me.exitToolStripMenuItem.Size = New System.Drawing.Size(45, 20)
        Me.exitToolStripMenuItem.Text = "Exit"
        '
        'SearchGroup
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.SystemColors.ButtonHighlight
        Me.ClientSize = New System.Drawing.Size(651, 399)
        Me.Controls.Add(Me.menuStrip1)
        Me.Controls.Add(Me.label3)
        Me.Controls.Add(Me.DataGridView1)
        Me.Controls.Add(Me.button2)
        Me.Controls.Add(Me.txtid)
        Me.Controls.Add(Me.label6)
        Me.Name = "SearchGroup"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "SearchGroup"
        CType(Me.DataGridView1, System.ComponentModel.ISupportInitialize).EndInit()
        Me.menuStrip1.ResumeLayout(False)
        Me.menuStrip1.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Private WithEvents label6 As System.Windows.Forms.Label
    Private WithEvents txtid As System.Windows.Forms.ComboBox
    Private WithEvents button2 As System.Windows.Forms.Button
    Friend WithEvents DataGridView1 As System.Windows.Forms.DataGridView
    Private WithEvents label3 As System.Windows.Forms.Label
    Private WithEvents menuStrip1 As System.Windows.Forms.MenuStrip
    Private WithEvents donorInfromationToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Private WithEvents exitToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
End Class
