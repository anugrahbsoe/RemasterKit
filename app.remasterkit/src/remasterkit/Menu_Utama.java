package remasterkit;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JCheckBox;
import com.jtattoo.plaf.graphite.GraphiteLookAndFeel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

public class Menu_Utama extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtURL;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(new GraphiteLookAndFeel());
					Menu_Utama frame = new Menu_Utama();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu_Utama() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("/home/newbieilmu/workspace/app.remasterkit/src/icon/logo.png"));
		setTitle("RemasterKit(Custom Linuxmu Sesuka Hati)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 589, 357);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelRKit = new JPanel();
		panelRKit.setBorder(new TitledBorder(null, "RemasterKit", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelRKit.setBounds(146, 12, 421, 163);
		contentPane.add(panelRKit);
		panelRKit.setLayout(null);
		
		JLabel lblPilihDe = new JLabel("1. Pilih DE ");
		lblPilihDe.setBounds(12, 27, 105, 18);
		panelRKit.add(lblPilihDe);
		
		JComboBox cmbDE = new JComboBox();
		cmbDE.setModel(new DefaultComboBoxModel(new String[] {"LXDE", "MATE", "GNOME", "KDE", "Manokwari"}));
		cmbDE.setBounds(110, 24, 89, 24);
		panelRKit.add(cmbDE);
		
		JLabel lblUbahSourcelist = new JLabel("2. Source.List");
		lblUbahSourcelist.setBounds(12, 57, 105, 18);
		panelRKit.add(lblUbahSourcelist);
		
		JLabel lblPilihConsole = new JLabel("3. Console ");
		lblPilihConsole.setBounds(12, 87, 105, 18);
		panelRKit.add(lblPilihConsole);
		
		JLabel lblInstallDeb = new JLabel("4. Install DEB");
		lblInstallDeb.setBounds(12, 117, 105, 18);
		panelRKit.add(lblInstallDeb);
		
		JLabel lblPaketList = new JLabel("5. Paket List ");
		lblPaketList.setBounds(217, 27, 105, 18);
		panelRKit.add(lblPaketList);
		
		JLabel lblSynaptic = new JLabel("6. Synaptic ");
		lblSynaptic.setBounds(217, 58, 105, 18);
		panelRKit.add(lblSynaptic);
		
		JLabel lblDesktop = new JLabel("7. Desktop");
		lblDesktop.setBounds(217, 88, 105, 18);
		panelRKit.add(lblDesktop);
		
		JLabel lblUbiquity = new JLabel("8. Ubiquity");
		lblUbiquity.setBounds(217, 120, 105, 18);
		panelRKit.add(lblUbiquity);
		
		JButton btnSource = new JButton("Source.list");
		btnSource.setEnabled(false);
		btnSource.setBounds(110, 54, 86, 24);
		panelRKit.add(btnSource);
		
		JButton btnConsole = new JButton("Console");
		btnConsole.setEnabled(false);
		btnConsole.setBounds(110, 84, 86, 24);
		panelRKit.add(btnConsole);
		
		JButton btnDeb = new JButton("DEB");
		btnDeb.setEnabled(false);
		btnDeb.setBounds(110, 114, 86, 24);
		panelRKit.add(btnDeb);
		
		JButton btnPaketList = new JButton("Paket list");
		btnPaketList.setEnabled(false);
		btnPaketList.setBounds(309, 24, 86, 24);
		panelRKit.add(btnPaketList);
		
		JButton btnSynaptic = new JButton("Synaptic");
		btnSynaptic.setEnabled(false);
		btnSynaptic.setBounds(309, 55, 86, 24);
		panelRKit.add(btnSynaptic);
		
		JButton btnDekstop = new JButton("Dekstop");
		btnDekstop.setEnabled(false);
		btnDekstop.setBounds(309, 87, 86, 24);
		panelRKit.add(btnDekstop);
		
		JButton btnUbiquity = new JButton("Ubiquity");
		btnUbiquity.setEnabled(false);
		btnUbiquity.setBounds(309, 117, 86, 24);
		panelRKit.add(btnUbiquity);
		
		JButton btnAbout = new JButton("Tentang");
		btnAbout.setBounds(299, 280, 86, 31);
		contentPane.add(btnAbout);
		
		JButton btnCredits = new JButton("Kredits");
		btnCredits.setBounds(389, 280, 86, 31);
		contentPane.add(btnCredits);
		
		JButton btnLisensi = new JButton("Lisensi");
		btnLisensi.setBounds(481, 280, 86, 31);
		contentPane.add(btnLisensi);
		
		JLabel lblIcon1 = new JLabel("");
		lblIcon1.setIcon(new ImageIcon("/home/newbieilmu/workspace/app.remasterkit/src/icon/1374533657__settings.png"));
		lblIcon1.setBounds(12, 12, 55, 67);
		contentPane.add(lblIcon1);
		
		JLabel lblicon2 = new JLabel("");
		lblicon2.setIcon(new ImageIcon("/home/newbieilmu/workspace/app.remasterkit/src/icon/1374533644_Import.png"));
		lblicon2.setBounds(12, 72, 55, 67);
		contentPane.add(lblicon2);
		
		JLabel lblicon3 = new JLabel("");
		lblicon3.setIcon(new ImageIcon("/home/newbieilmu/workspace/app.remasterkit/src/icon/1374533631_Export.png"));
		lblicon3.setBounds(12, 137, 55, 67);
		contentPane.add(lblicon3);
		
		JLabel lblicon4 = new JLabel("");
		lblicon4.setIcon(new ImageIcon("/home/newbieilmu/workspace/app.remasterkit/src/icon/1374534090_118.png"));
		lblicon4.setBounds(12, 202, 55, 67);
		contentPane.add(lblicon4);
		
		JLabel lblKonfigurasi = new JLabel("Konfigurasi");
		lblKonfigurasi.setFont(new Font("Dialog", Font.BOLD, 13));
		lblKonfigurasi.setBounds(67, 35, 86, 18);
		contentPane.add(lblKonfigurasi);
		
		JLabel lblImport = new JLabel("Import");
		lblImport.setFont(new Font("Dialog", Font.BOLD, 13));
		lblImport.setBounds(67, 91, 86, 18);
		contentPane.add(lblImport);
		
		JLabel lblEksport = new JLabel("Eksport");
		lblEksport.setFont(new Font("Dialog", Font.BOLD, 13));
		lblEksport.setBounds(67, 151, 86, 18);
		contentPane.add(lblEksport);
		
		JLabel lblBuild = new JLabel("Build");
		lblBuild.setFont(new Font("Dialog", Font.BOLD, 13));
		lblBuild.setBounds(67, 216, 86, 18);
		contentPane.add(lblBuild);
		
		JPanel panelSetting = new JPanel();
		panelSetting.setBorder(new TitledBorder(null, "Setting ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelSetting.setBounds(146, 181, 421, 88);
		contentPane.add(panelSetting);
		panelSetting.setLayout(null);
		
		JLabel lblNamaLinuxmu = new JLabel("Nama Linuxmu :");
		lblNamaLinuxmu.setBounds(12, 24, 92, 18);
		panelSetting.add(lblNamaLinuxmu);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(122, 22, 179, 22);
		panelSetting.add(txtName);
		
		JLabel lblUrl = new JLabel("URL :");
		lblUrl.setBounds(12, 54, 92, 18);
		panelSetting.add(lblUrl);
		
		txtURL = new JTextField();
		txtURL.setColumns(10);
		txtURL.setBounds(122, 52, 179, 22);
		panelSetting.add(txtURL);
		
		JButton btnDonasi = new JButton("Donasi");
		btnDonasi.setBounds(207, 280, 86, 31);
		contentPane.add(btnDonasi);
	}
}
