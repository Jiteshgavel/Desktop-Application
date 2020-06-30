<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Donner
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
        Dim DataGridViewCellStyle2 As System.Windows.Forms.DataGridViewCellStyle = New System.Windows.Forms.DataGridViewCellStyle()
        Me.button3 = New System.Windows.Forms.Button()
        Me.button4 = New System.Windows.Forms.Button()
        Me.button2 = New System.Windows.Forms.Button()
        Me.button1 = New System.Windows.Forms.Button()
        Me.txtgroup = New System.Windows.Forms.ComboBox()
        Me.txtaddress = New System.Windows.Forms.TextBox()
        Me.txtcontact = New System.Windows.Forms.TextBox()
        Me.txtname = New System.Windows.Forms.TextBox()
        Me.label6 = New System.Windows.Forms.Label()
        Me.label5 = New System.Windows.Forms.Label()
        Me.label4 = New System.Windows.Forms.Label()
        Me.label2 = New System.Windows.Forms.Label()
        Me.label3 = New System.Windows.Forms.Label()
        Me.txtid = New System.Windows.Forms.TextBox()
        Me.label1 = New System.Windows.Forms.Label()
        Me.DataGridView1 = New System.Windows.Forms.DataGridView()
        Me.menuStrip1 = New System.Windows.Forms.MenuStrip()
        Me.donorInfromationToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.exitToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.Button5 = New System.Windows.Forms.Button()
        CType(Me.DataGridView1, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.menuStrip1.SuspendLayout()
        Me.SuspendLayout()
        '
        'button3
        '
        Me.button3.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.button3.Location = New System.Drawing.Point(375, 406)
        Me.button3.Name = "button3"
        Me.button3.Size = New System.Drawing.Size(73, 27)
        Me.button3.TabIndex = 41
        Me.button3.Text = "Delete"
        Me.button3.UseVisualStyleBackColor = True
        '
        'button4
        '
        Me.button4.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.button4.Location = New System.Drawing.Point(266, 406)
        Me.button4.Name = "button4"
        Me.button4.Size = New System.Drawing.Size(73, 27)
        Me.button4.TabIndex = 40
        Me.button4.Text = "Update"
        Me.button4.UseVisualStyleBackColor = True
        '
        'button2
        '
        Me.button2.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.button2.Location = New System.Drawing.Point(157, 406)
        Me.button2.Name = "button2"
        Me.button2.Size = New System.Drawing.Size(73, 27)
        Me.button2.TabIndex = 39
        Me.button2.Text = "Search"
        Me.button2.UseVisualStyleBackColor = True
        '
        'button1
        '
        Me.button1.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.button1.Location = New System.Drawing.Point(52, 406)
        Me.button1.Name = "button1"
        Me.button1.Size = New System.Drawing.Size(73, 27)
        Me.button1.TabIndex = 38
        Me.button1.Text = "Add"
        Me.button1.UseVisualStyleBackColor = True
        '
        'txtgroup
        '
        Me.txtgroup.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtgroup.FormattingEnabled = True
        Me.txtgroup.Items.AddRange(New Object() {"A-", "A+", "B-", "B+", "A+B+", "A1B+"})
        Me.txtgroup.Location = New System.Drawing.Point(176, 348)
        Me.txtgroup.Name = "txtgroup"
        Me.txtgroup.Size = New System.Drawing.Size(121, 24)
        Me.txtgroup.TabIndex = 37
        Me.txtgroup.Text = "--Select--"
        '
        'txtaddress
        '
        Me.txtaddress.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtaddress.Location = New System.Drawing.Point(176, 277)
        Me.txtaddress.Multiline = True
        Me.txtaddress.Name = "txtaddress"
        Me.txtaddress.Size = New System.Drawing.Size(184, 55)
        Me.txtaddress.TabIndex = 36
        '
        'txtcontact
        '
        Me.txtcontact.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtcontact.Location = New System.Drawing.Point(176, 221)
        Me.txtcontact.Name = "txtcontact"
        Me.txtcontact.Size = New System.Drawing.Size(134, 22)
        Me.txtcontact.TabIndex = 35
        '
        'txtname
        '
        Me.txtname.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtname.Location = New System.Drawing.Point(176, 162)
        Me.txtname.Name = "txtname"
        Me.txtname.Size = New System.Drawing.Size(134, 22)
        Me.txtname.TabIndex = 34
        '
        'label6
        '
        Me.label6.AutoSize = True
        Me.label6.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.label6.Location = New System.Drawing.Point(52, 349)
        Me.label6.Name = "label6"
        Me.label6.Size = New System.Drawing.Size(95, 16)
        Me.label6.TabIndex = 33
        Me.label6.Text = "Blood Group"
        '
        'label5
        '
        Me.label5.AutoSize = True
        Me.label5.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.label5.Location = New System.Drawing.Point(81, 280)
        Me.label5.Name = "label5"
        Me.label5.Size = New System.Drawing.Size(66, 16)
        Me.label5.TabIndex = 32
        Me.label5.Text = "Address"
        '
        'label4
        '
        Me.label4.AutoSize = True
        Me.label4.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.label4.Location = New System.Drawing.Point(87, 224)
        Me.label4.Name = "label4"
        Me.label4.Size = New System.Drawing.Size(60, 16)
        Me.label4.TabIndex = 31
        Me.label4.Text = "Contact"
        '
        'label2
        '
        Me.label2.AutoSize = True
        Me.label2.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.label2.Location = New System.Drawing.Point(98, 165)
        Me.label2.Name = "label2"
        Me.label2.Size = New System.Drawing.Size(49, 16)
        Me.label2.TabIndex = 30
        Me.label2.Text = "Name"
        '
        'label3
        '
        Me.label3.AutoSize = True
        Me.label3.Font = New System.Drawing.Font("Microsoft Sans Serif", 14.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.label3.ForeColor = System.Drawing.Color.IndianRed
        Me.label3.Location = New System.Drawing.Point(134, 36)
        Me.label3.Name = "label3"
        Me.label3.Size = New System.Drawing.Size(176, 24)
        Me.label3.TabIndex = 29
        Me.label3.Text = "Donor Information"
        '
        'txtid
        '
        Me.txtid.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtid.Location = New System.Drawing.Point(176, 103)
        Me.txtid.Name = "txtid"
        Me.txtid.Size = New System.Drawing.Size(134, 22)
        Me.txtid.TabIndex = 28
        '
        'label1
        '
        Me.label1.AutoSize = True
        Me.label1.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.label1.Location = New System.Drawing.Point(80, 106)
        Me.label1.Name = "label1"
        Me.label1.Size = New System.Drawing.Size(67, 16)
        Me.label1.TabIndex = 27
        Me.label1.Text = "Donor Id"
        '
        'DataGridView1
        '
        Me.DataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize
        DataGridViewCellStyle2.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleLeft
        DataGridViewCellStyle2.BackColor = System.Drawing.SystemColors.Window
        DataGridViewCellStyle2.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        DataGridViewCellStyle2.ForeColor = System.Drawing.SystemColors.ControlText
        DataGridViewCellStyle2.SelectionBackColor = System.Drawing.SystemColors.Highlight
        DataGridViewCellStyle2.SelectionForeColor = System.Drawing.SystemColors.HighlightText
        DataGridViewCellStyle2.WrapMode = System.Windows.Forms.DataGridViewTriState.[False]
        Me.DataGridView1.DefaultCellStyle = DataGridViewCellStyle2
        Me.DataGridView1.Location = New System.Drawing.Point(385, 90)
        Me.DataGridView1.Name = "DataGridView1"
        Me.DataGridView1.Size = New System.Drawing.Size(525, 275)
        Me.DataGridView1.TabIndex = 42
        '
        'menuStrip1
        '
        Me.menuStrip1.BackColor = System.Drawing.SystemColors.ButtonHighlight
        Me.menuStrip1.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.menuStrip1.Items.AddRange(New System.Windows.Forms.ToolStripItem() {Me.donorInfromationToolStripMenuItem, Me.exitToolStripMenuItem})
        Me.menuStrip1.Location = New System.Drawing.Point(0, 0)
        Me.menuStrip1.Name = "menuStrip1"
        Me.menuStrip1.Size = New System.Drawing.Size(922, 24)
        Me.menuStrip1.TabIndex = 43
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
        'Button5
        '
        Me.Button5.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Button5.Location = New System.Drawing.Point(477, 406)
        Me.Button5.Name = "Button5"
        Me.Button5.Size = New System.Drawing.Size(73, 27)
        Me.Button5.TabIndex = 57
        Me.Button5.Text = "Clear"
        Me.Button5.UseVisualStyleBackColor = True
        '
        'Donner
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.SystemColors.ButtonHighlight
        Me.ClientSize = New System.Drawing.Size(922, 490)
        Me.Controls.Add(Me.Button5)
        Me.Controls.Add(Me.menuStrip1)
        Me.Controls.Add(Me.DataGridView1)
        Me.Controls.Add(Me.button3)
        Me.Controls.Add(Me.button4)
        Me.Controls.Add(Me.button2)
        Me.Controls.Add(Me.button1)
        Me.Controls.Add(Me.txtgroup)
        Me.Controls.Add(Me.txtaddress)
        Me.Controls.Add(Me.txtcontact)
        Me.Controls.Add(Me.txtname)
        Me.Controls.Add(Me.label6)
        Me.Controls.Add(Me.label5)
        Me.Controls.Add(Me.label4)
        Me.Controls.Add(Me.label2)
        Me.Controls.Add(Me.label3)
        Me.Controls.Add(Me.txtid)
        Me.Controls.Add(Me.label1)
        Me.Name = "Donner"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Donner"
        CType(Me.DataGridView1, System.ComponentModel.ISupportInitialize).EndInit()
        Me.menuStrip1.ResumeLayout(False)
        Me.menuStrip1.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Private WithEvents button3 As System.Windows.Forms.Button
    Private WithEvents button4 As System.Windows.Forms.Button
    Private WithEvents button2 As System.Windows.Forms.Button
    Private WithEvents button1 As System.Windows.Forms.Button
    Private WithEvents txtgroup As System.Windows.Forms.ComboBox
    Private WithEvents txtaddress As System.Windows.Forms.TextBox
    Private WithEvents txtcontact As System.Windows.Forms.TextBox
    Private WithEvents txtname As System.Windows.Forms.TextBox
    Private WithEvents label6 As System.Windows.Forms.Label
    Private WithEvents label5 As System.Windows.Forms.Label
    Private WithEvents label4 As System.Windows.Forms.Label
    Private WithEvents label2 As System.Windows.Forms.Label
    Private WithEvents label3 As System.Windows.Forms.Label
    Private WithEvents txtid As System.Windows.Forms.TextBox
    Private WithEvents label1 As System.Windows.Forms.Label
    Friend WithEvents DataGridView1 As System.Windows.Forms.DataGridView
    Private WithEvents menuStrip1 As System.Windows.Forms.MenuStrip
    Private WithEvents donorInfromationToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Private WithEvents exitToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Private WithEvents Button5 As System.Windows.Forms.Button
End Class
