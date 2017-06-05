/*
Esta clase es la libreria de Waifus, en esta cada Waifue esta asociada a sus valores.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdef;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import pdef.Waifuframe;
/**
 *
 * @author Inori
 */
class waifuLib {
    
    public void setlib()
    {
        Icon iakiyama_mio = new ImageIcon(getClass().getResource("media\\akiyama_mio.jpg"));
        Waifuframe.waifu_Lib[0] = new Waifuframe(0,"akiyama_mio", "Akiyama Mio", "K-on!", iakiyama_mio);
        Icon ihatsune_miku = new ImageIcon(getClass().getResource("media\\hatsune_miku.jpg"));
        Waifuframe.waifu_Lib[1] = new Waifuframe(1, "hatsune_miku", "Hatsune Miku", "Vocaloid", ihatsune_miku);
        Icon ishana = new ImageIcon(getClass().getResource("media\\shana.jpg"));
        Waifuframe.waifu_Lib[2] = new Waifuframe(2,"shana", "Shana", "Shakugan no Shana", ishana);
        Icon iasahina_mikuru = new ImageIcon(getClass().getResource("media\\asahina_mikuru.jpg"));
        Waifuframe.waifu_Lib[3] = new Waifuframe(3,"asahina_mikuru", "Asahina Mikuru", "Suzumiya Haruhi no Yuutsu", iasahina_mikuru);
        Icon imegurine_luka = new ImageIcon(getClass().getResource("media\\megurine_luka.jpg"));
        Waifuframe.waifu_Lib[4] = new Waifuframe(4,"megurine_luka", "Megurine Luka", "Vocaloid", imegurine_luka);
        Icon ikazami_mizuho = new ImageIcon(getClass().getResource("media\\kazami_mizuho.jpg"));
        Waifuframe.waifu_Lib[5] = new Waifuframe(5,"kazami_mizuho", "Kazami Mizuho", "Please Teacher!", ikazami_mizuho);
        Icon iakame = new ImageIcon(getClass().getResource("media\\akame.png"));
        Waifuframe.waifu_Lib[6] = new Waifuframe(6,"akame", "Akame", "Akame ga Kill", iakame);
        Icon iaisaka_taiga = new ImageIcon(getClass().getResource("media\\aisaka_taiga.jpg"));
        Waifuframe.waifu_Lib[7] = new Waifuframe(7,"aisaka_taiga", "Aisaka Taiga", "Toradora!", iaisaka_taiga); 
        Icon iyuuki_asuna = new ImageIcon(getClass().getResource("media\\yuuki_asuna.jpg"));
        Waifuframe.waifu_Lib[8] = new Waifuframe(8,"yuuki_asuna", "Yuuki Asuna", "Sword Art Online", iyuuki_asuna); 
        Icon iakazawa_izumi = new ImageIcon(getClass().getResource("media\\akazawa_izumi.jpg"));
        Waifuframe.waifu_Lib[9] = new Waifuframe(9,"akazawa_izumi", "Azakawa Izumi", "Another", iakazawa_izumi);
        Icon iaragaki_ayase = new ImageIcon(getClass().getResource("media\\aragaki_ayase.jpg"));
        Waifuframe.waifu_Lib[10] = new Waifuframe(10,"aragaki_ayase", "Aragaki Ayase", "Oreimo", iaragaki_ayase);
        Icon iayanami_rei = new ImageIcon(getClass().getResource("media\\ayanami_rei.jpg"));
        Waifuframe.waifu_Lib[11] = new Waifuframe(11,"ayanami_rei", "Ayanami Rei", "Evangelion", iayanami_rei);
        Icon iayuzawa_mizaki = new ImageIcon(getClass().getResource("media\\ayuzawa_mizaki.jpg"));
        Waifuframe.waifu_Lib[12] = new Waifuframe(12,"ayuzawa_mizaki", "Ayuzawa Mizaki", "Kaichou wa Maidsama", iayuzawa_mizaki);
        Icon ibristol_lilith = new ImageIcon(getClass().getResource("media\\bristol_lilith.jpg"));
        Waifuframe.waifu_Lib[13] = new Waifuframe(13,"bristol_lilith", "Bristol Lilith", "Absolute Duo", ibristol_lilith);
        Icon idaidoji_tomoyo = new ImageIcon(getClass().getResource("media\\daidoji_tomoyo.png"));
        Waifuframe.waifu_Lib[14] = new Waifuframe(14,"daidoji_tomoyo", "Daidouji Tomoyo", "Sakura Card Captor", idaidoji_tomoyo);
        Icon idaw_margery = new ImageIcon(getClass().getResource("media\\daw_margery.jpg"));
        Waifuframe.waifu_Lib[15] = new Waifuframe(15,"daw_margery", "Daw Margery", "Shakugan no Shana", idaw_margery);
        Icon idekomori_sanae = new ImageIcon(getClass().getResource("media\\dekomori_sanae.jpg"));
        Waifuframe.waifu_Lib[16] = new Waifuframe(16,"dekomori_sanae", "Dekomori Sanae", "Chunibyou", idekomori_sanae);
        Icon ifrancoise_louise = new ImageIcon(getClass().getResource("media\\francoise_louise.jpg"));
        Waifuframe.waifu_Lib[17] = new Waifuframe(17,"francoise_louise", "Francoise Louise", "Zero no Tsukaima", ifrancoise_louise);
        Icon igasai_yuno = new ImageIcon(getClass().getResource("media\\gasai_yuno.jpg"));
        Waifuframe.waifu_Lib[18] = new Waifuframe(18,"gasai_yuno", "Gasai Yuno", "Mirai Nikki", igasai_yuno);
        Icon igokou_ruri = new ImageIcon(getClass().getResource("media\\gokou_ruri.jpg"));
        Waifuframe.waifu_Lib[19] = new Waifuframe(19,"gokou_ruri", "Gakou Ruri", "Oreimo", igokou_ruri);
        Icon ihakurei_reimu = new ImageIcon(getClass().getResource("media\\hakurei_reimu.jpg"));
        Waifuframe.waifu_Lib[20] = new Waifuframe(20,"hakurei_reimu", "Reimu Hakurei", "Touhou Project", ihakurei_reimu);
        Icon ihanayo_koizumi = new ImageIcon(getClass().getResource("media\\hanayo_koizumi.jpg"));
        Waifuframe.waifu_Lib[21] = new Waifuframe(21,"hayano_koizumi", "Hanayo Koizumi", "Love Live!", ihanayo_koizumi);
        Icon iharuhi_suzumiya = new ImageIcon(getClass().getResource("media\\haruhi_suzumiya.jpg"));
        Waifuframe.waifu_Lib[22] = new Waifuframe(22,"haruhi_suzumiya", "Haruhi Suzumiya", "Suzumiya Haruhi no Yuutsu", iharuhi_suzumiya);
        Icon iharuno_sakura = new ImageIcon(getClass().getResource("media\\haruno_sakura.jpg"));
        Waifuframe.waifu_Lib[23] = new Waifuframe(23,"haruno_sakura", "Haruno Sakura", "Naruto", iharuno_sakura);
        Icon ihiiragi_tsukasa = new ImageIcon(getClass().getResource("media\\hiiragi_tsukasa.png"));
        Waifuframe.waifu_Lib[24] = new Waifuframe(24,"hiiragi_tsukasa", "Hiiragi Tsukasa", "Lucky Star", ihiiragi_tsukasa);
        Icon ihino_rei = new ImageIcon(getClass().getResource("media\\hino_rei.jpg"));
        Waifuframe.waifu_Lib[25] = new Waifuframe(25,"hino_rei", "Hino Rei", "Sailor Moon", ihino_rei);
        Icon ihirasawa_yui = new ImageIcon(getClass().getResource("media\\ihirasawa_yui.jpg"));
        Waifuframe.waifu_Lib[26] = new Waifuframe(26,"hirasawa_yui", "Hirisawa Yui", "Love live!", ihirasawa_yui);
        Icon ihonoka_kousaka = new ImageIcon(getClass().getResource("media\\ihonoka_kousaka.jpg"));
        Waifuframe.waifu_Lib[27] = new Waifuframe(27,"honoka_kousaka", "Kousaka Honoka", "Love live!", ihonoka_kousaka);
        Icon ihyuga_hinata = new ImageIcon(getClass().getResource("media\\ihyuga_hinata.jpg"));
        Waifuframe.waifu_Lib[28] = new Waifuframe(28,"hyuga_hinata", "Hyuga Hinata", "Naruto", ihyuga_hinata);
        Icon iichihara_yuko = new ImageIcon(getClass().getResource("media\\iichihara_yuko.jpg"));
        Waifuframe.waifu_Lib[29] = new Waifuframe(29,"ichihara_yuko", "Ichihara Yuko", "XXXHolic", iichihara_yuko);
        Icon iichinose_kotomi = new ImageIcon(getClass().getResource("media\\iichinose_kotomi.jpg"));
        Waifuframe.waifu_Lib[30] = new Waifuframe(30,"ichinose_kotomi", "Ichinose Kotomi", "Clannad", iichinose_kotomi);
        Icon iikaros = new ImageIcon(getClass().getResource("media\\ikaros.jpg"));
        Waifuframe.waifu_Lib[31] = new Waifuframe(31,"ikaros", "Ikaros", "Sora no Otoshimono", iikaros);
        Icon iizumi_reina = new ImageIcon(getClass().getResource("media\\izumi_reina.jpg"));
        Waifuframe.waifu_Lib[32] = new Waifuframe(32,"izumi_reina", "Izumi Reina", "Phantom World", iizumi_reina);
        Icon ikaname_madoka = new ImageIcon(getClass().getResource("media\\kaname_madoka.jpg"));
        Waifuframe.waifu_Lib[33] = new Waifuframe(33,"kaname_madoka", "Kaname Madoka", "Magical Madoka", ikaname_madoka);
        Icon ikashiwazaki_sena = new ImageIcon(getClass().getResource("media\\kashiwazaki_sena.jpg"));
        Waifuframe.waifu_Lib[34] = new Waifuframe(34,"kashiwazaki_sena", "Kashiwazaki Sena", "Haganai", ikashiwazaki_sena);
        Icon ikatsura_kotonoha = new ImageIcon(getClass().getResource("media\\katsura_kotonoha.jpg"));
        Waifuframe.waifu_Lib[35] = new Waifuframe(35,"katsura_kotonoha", "Katsura Kotonoha", "School days", ikatsura_kotonoha);
        Icon ikido_saori = new ImageIcon(getClass().getResource("media\\kido_saori.jpg"));
        Waifuframe.waifu_Lib[36] = new Waifuframe(36,"kido_saori", "Kido Saori", "Saint Seiya", ikido_saori);
        Icon ikirigaya_suguha = new ImageIcon(getClass().getResource("media\\kirigaya_suguha.jpg"));
        Waifuframe.waifu_Lib[37] = new Waifuframe(37,"kirigaya_suguha", "Karigaya Suguha", "Sword Art Online", ikirigaya_suguha);   
        Icon ikirigiri_kyoko = new ImageIcon(getClass().getResource("media\\kirigiri_kyoko.jpg"));
        Waifuframe.waifu_Lib[38] = new Waifuframe(38,"kirigiri_kyoko", "Karigiri Kyoko", "Danganronpa", ikirigiri_kyoko);
        Icon ikirisaki_chitoge = new ImageIcon(getClass().getResource("media\\kirisaki_chitoge.jpg"));
        Waifuframe.waifu_Lib[39] = new Waifuframe(39,"kirisaki_chitoge", "Karisaki Chitoge", "Nisekoi", ikirisaki_chitoge);
        Icon ikirisame_marisa = new ImageIcon(getClass().getResource("media\\kirisame_marisa.jpg"));
        Waifuframe.waifu_Lib[40] = new Waifuframe(40,"kirisame_marisa", "Karisame Marisa", "Touhou Project", ikirisame_marisa);   
    }
}
