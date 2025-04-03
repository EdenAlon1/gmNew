package defpackage;

import android.database.Cursor;
import android.net.Uri;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpgp extends dtsr implements bpgo {
    @Deprecated
    public bpgp(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bpgq bpgqVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bpgu.a, dtyoVar, dtvsVar, bpgqVar);
    }

    public final int A() {
        return getInt(cM(151, bpgu.a));
    }

    public final int B() {
        return getInt(cM(10, bpgu.a));
    }

    public final int C() {
        return getInt(cM(71, bpgu.a));
    }

    public final int D() {
        return getInt(cM(91, bpgu.a));
    }

    public final int E() {
        return getInt(cM(190, bpgu.a));
    }

    public final int F() {
        return getInt(cM(94, bpgu.a));
    }

    public final long G() {
        return getLong(cM(39, bpgu.a));
    }

    public final long H() {
        return getLong(cM(169, bpgu.a));
    }

    public final long I() {
        return getLong(cM(84, bpgu.a));
    }

    public final long J() {
        return getLong(cM(164, bpgu.a));
    }

    public final long K() {
        return getLong(cM(102, bpgu.a));
    }

    public final long L() {
        return getLong(cM(158, bpgu.a));
    }

    public final long M() {
        return getLong(cM(163, bpgu.a));
    }

    public final long N() {
        return getLong(cM(132, bpgu.a));
    }

    public final long O() {
        return getLong(cM(20, bpgu.a));
    }

    public final long P() {
        return getLong(cM(135, bpgu.a));
    }

    public final long Q() {
        return getLong(cM(134, bpgu.a));
    }

    public final long R() {
        return getLong(cM(21, bpgu.a));
    }

    public final long S() {
        return getLong(cM(34, bpgu.a));
    }

    public final long T() {
        return getLong(cM(152, bpgu.a));
    }

    public final long U() {
        return getLong(cM(170, bpgu.a));
    }

    public final long V() {
        return getLong(cM(8, bpgu.a));
    }

    public final long W() {
        return getLong(cM(78, bpgu.a));
    }

    public final long X() {
        return getLong(cM(46, bpgu.a));
    }

    public final long Y() {
        return getLong(cM(26, bpgu.a));
    }

    public final long Z() {
        return getLong(cM(42, bpgu.a));
    }

    public final MessageIdType aA() {
        return new MessageIdType(getLong(cM(50, bpgu.a)));
    }

    public final bdhg aB() {
        return bdhg.a(getString(cM(43, bpgu.a)));
    }

    public final bdhg aC() {
        return bdhg.a(getString(cM(28, bpgu.a)));
    }

    public final bdpy aD() {
        return bdqb.a(getString(cM(108, bpgu.a)));
    }

    public final byyt aE() {
        return byyt.a(getInt(cM(130, bpgu.a)));
    }

    public final byyw aF() {
        byyw[] values = byyw.values();
        int i = getInt(cM(57, bpgu.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final byyy aG() {
        byyy[] values = byyy.values();
        int i = getInt(cM(117, bpgu.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final byzg aH() {
        byzg[] values = byzg.values();
        int i = getInt(cM(61, bpgu.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final byzg aI() {
        byzg[] values = byzg.values();
        int i = getInt(cM(62, bpgu.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final byzi aJ() {
        byzi[] values = byzi.values();
        int i = getInt(cM(99, bpgu.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final byzi aK() {
        byzi[] values = byzi.values();
        int i = getInt(cM(30, bpgu.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final byzl aL() {
        byzl[] values = byzl.values();
        int i = getInt(cM(63, bpgu.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final cfmf aM() {
        return cfmf.a(getString(cM(187, bpgu.a)));
    }

    public final cfmh aN() {
        return new cfmh(getLong(cM(186, bpgu.a)));
    }

    public final cfmh aO() {
        return new cfmh(getLong(cM(66, bpgu.a)));
    }

    public final cjco aP() {
        cjco[] values = cjco.values();
        int i = getInt(cM(56, bpgu.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final cjwe aQ() {
        return cjwe.b(getInt(cM(111, bpgu.a)));
    }

    public final cjwi aR() {
        return cjwi.b(getInt(cM(109, bpgu.a)));
    }

    public final cjwi aS() {
        return cjwi.b(getInt(cM(110, bpgu.a)));
    }

    public final ckkz aT() {
        byte[] blob = getBlob(cM(183, bpgu.a));
        if (blob == null) {
            return null;
        }
        try {
            return (ckkz) eyfy.parseFrom(ckkz.a, blob, eyfc.a());
        } catch (Throwable unused) {
            return ckkz.a;
        }
    }

    public final cknh aU() {
        return new cknh(getLong(cM(172, bpgu.a)));
    }

    public final ckte aV() {
        ckte[] values = ckte.values();
        int i = getInt(cM(184, bpgu.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final cpxu aW() {
        return cpxu.b(getLong(cM(115, bpgu.a)));
    }

    public final csgg aX() {
        csgg[] values = csgg.values();
        int i = getInt(cM(177, bpgu.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final csgg aY() {
        csgg[] values = csgg.values();
        int i = getInt(cM(55, bpgu.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final csgg aZ() {
        csgg[] values = csgg.values();
        int i = getInt(cM(106, bpgu.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final long aa() {
        return getLong(cM(6, bpgu.a));
    }

    public final long ab() {
        return getLong(cM(16, bpgu.a));
    }

    public final long ac() {
        return getLong(cM(131, bpgu.a));
    }

    public final long ad() {
        return getLong(cM(41, bpgu.a));
    }

    public final Uri ae() {
        String string = getString(cM(83, bpgu.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri af() {
        String string = getString(cM(127, bpgu.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri ag() {
        String string = getString(cM(52, bpgu.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri ah() {
        String string = getString(cM(122, bpgu.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri ai() {
        String string = getString(cM(82, bpgu.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri aj() {
        String string = getString(cM(189, bpgu.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri ak() {
        String string = getString(cM(14, bpgu.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final aorb al() {
        return aorb.b(getInt(cM(107, bpgu.a)));
    }

    public final aqkt am() {
        byte[] blob = getBlob(cM(112, bpgu.a));
        if (blob == null) {
            return null;
        }
        try {
            return (aqkt) eyfy.parseFrom(aqkt.a, blob, eyfc.a());
        } catch (Throwable unused) {
            return aqkt.a;
        }
    }

    public final ayhd an() {
        return ayhd.b(getInt(cM(176, bpgu.a)));
    }

    public final azcr ao() {
        return azcs.a(getString(cM(142, bpgu.a)));
    }

    public final azsu ap() {
        return azsv.a(getString(cM(141, bpgu.a)));
    }

    public final azsu aq() {
        return azsv.a(getString(cM(25, bpgu.a)));
    }

    public final azsu ar() {
        return azsv.a(getString(cM(69, bpgu.a)));
    }

    public final azsu as() {
        return azsv.a(getString(cM(70, bpgu.a)));
    }

    public final ConversationIdType at() {
        return new ConversationIdType(getLong(cM(1, bpgu.a)));
    }

    public final ConversationIdType au() {
        return new ConversationIdType(getLong(cM(174, bpgu.a)));
    }

    public final ConversationIdType av() {
        return new ConversationIdType(getLong(cM(175, bpgu.a)));
    }

    public final ConversationIdType aw() {
        return new ConversationIdType(getLong(cM(114, bpgu.a)));
    }

    public final bdgr ax() {
        return new bdgr(getString(cM(65, bpgu.a)));
    }

    public final MessageIdType ay() {
        return new MessageIdType(getLong(cM(0, bpgu.a)));
    }

    public final MessageIdType az() {
        return new MessageIdType(getLong(cM(119, bpgu.a)));
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new borj();
    }

    public final String bA() {
        return getString(cM(49, bpgu.a));
    }

    public final String bB() {
        return getString(cM(133, bpgu.a));
    }

    public final String bC() {
        return getString(cM(68, bpgu.a));
    }

    public final String bD() {
        return getString(cM(85, bpgu.a));
    }

    public final String bE() {
        return getString(cM(19, bpgu.a));
    }

    public final String bF() {
        return getString(cM(22, bpgu.a));
    }

    public final String bG() {
        return cuxs.a(getString(cM(17, bpgu.a)));
    }

    public final String bH() {
        return getString(cM(18, bpgu.a));
    }

    public final String bI() {
        return getString(cM(4, bpgu.a));
    }

    public final String bJ() {
        return getString(cM(116, bpgu.a));
    }

    public final String bK() {
        return cuxd.a(getString(cM(73, bpgu.a)));
    }

    public final String bL() {
        return cuxs.a(getString(cM(160, bpgu.a)));
    }

    public final String bM() {
        return getString(cM(150, bpgu.a));
    }

    public final String bN() {
        return getString(cM(137, bpgu.a));
    }

    public final String bO() {
        return getString(cM(145, bpgu.a));
    }

    public final String bP() {
        return getString(cM(139, bpgu.a));
    }

    public final String bQ() {
        return cuxs.a(getString(cM(159, bpgu.a)));
    }

    public final String bR() {
        return getString(cM(149, bpgu.a));
    }

    public final String bS() {
        return getString(cM(136, bpgu.a));
    }

    public final String bT() {
        return getString(cM(138, bpgu.a));
    }

    public final String bU() {
        return getString(cM(123, bpgu.a));
    }

    public final String bV() {
        return getString(cM(100, bpgu.a));
    }

    public final String bW() {
        return cuxb.a(getString(cM(167, bpgu.a)));
    }

    public final String bX() {
        return getString(cM(166, bpgu.a));
    }

    public final String bY() {
        return getString(cM(178, bpgu.a));
    }

    public final String bZ() {
        return getString(cM(33, bpgu.a));
    }

    public final fayv ba() {
        byte[] blob = getBlob(cM(47, bpgu.a));
        if (blob == null) {
            return null;
        }
        try {
            return (fayv) eyfy.parseFrom(fayv.a, blob, eyfc.a());
        } catch (Throwable unused) {
            return fayv.a;
        }
    }

    public final Instant bb() {
        return bdgw.b(getLong(cM(7, bpgu.a)));
    }

    public final Optional bc() {
        return bdhj.a(getString(cM(53, bpgu.a)));
    }

    public final Optional bd() {
        return bdhj.a(getString(cM(67, bpgu.a)));
    }

    public final Optional be() {
        return bdhe.b(getLong(cM(180, bpgu.a)));
    }

    public final Optional bf() {
        return bdhe.b(getLong(cM(179, bpgu.a)));
    }

    public final String bg() {
        return getString(cM(95, bpgu.a));
    }

    public final String bh() {
        return getString(cM(27, bpgu.a));
    }

    public final String bi() {
        return getString(cM(188, bpgu.a));
    }

    public final String bj() {
        return getString(cM(48, bpgu.a));
    }

    public final String bk() {
        return getString(cM(165, bpgu.a));
    }

    public final String bl() {
        return getString(cM(38, bpgu.a));
    }

    public final String bm() {
        return getString(cM(98, bpgu.a));
    }

    public final String bn() {
        return cuxs.a(getString(cM(76, bpgu.a)));
    }

    public final String bo() {
        return getString(cM(92, bpgu.a));
    }

    public final String bp() {
        return getString(cM(37, bpgu.a));
    }

    public final String bq() {
        return cuxs.a(getString(cM(77, bpgu.a)));
    }

    public final String br() {
        return getString(cM(140, bpgu.a));
    }

    public final String bs() {
        return getString(cM(44, bpgu.a));
    }

    public final String bt() {
        return cuxd.a(getString(cM(75, bpgu.a)));
    }

    public final String bu() {
        return getString(cM(128, bpgu.a));
    }

    public final String bv() {
        return cuxs.a(getString(cM(125, bpgu.a)));
    }

    public final String bw() {
        return cuxs.a(getString(cM(126, bpgu.a)));
    }

    public final String bx() {
        return getString(cM(105, bpgu.a));
    }

    public final String by() {
        return cuxs.a(getString(cM(81, bpgu.a)));
    }

    public final String bz() {
        return cuxs.a(getString(cM(80, bpgu.a)));
    }

    public final int c() {
        return getInt(cM(58, bpgu.a));
    }

    public final boolean cA() {
        return getInt(cM(104, bpgu.a)) == 1;
    }

    public final boolean cB() {
        return getInt(cM(182, bpgu.a)) == 1;
    }

    public final boolean cC() {
        return getInt(cM(144, bpgu.a)) == 1;
    }

    public final boolean cD() {
        return getInt(cM(146, bpgu.a)) == 1;
    }

    public final boolean cE() {
        return getInt(cM(12, bpgu.a)) == 1;
    }

    public final boolean cF() {
        return getInt(cM(171, bpgu.a)) == 1;
    }

    public final boolean cG() {
        return getInt(cM(13, bpgu.a)) == 1;
    }

    public final boolean cH() {
        return getInt(cM(124, bpgu.a)) == 1;
    }

    public final boolean cI() {
        return getInt(cM(161, bpgu.a)) == 1;
    }

    public final byte[] cJ() {
        return getBlob(cM(45, bpgu.a));
    }

    public final byte[] cK() {
        return getBlob(cM(EnergyProfile.EVCONNECTOR_TYPE_OTHER, bpgu.a));
    }

    public final byte[] cL() {
        return getBlob(cM(168, bpgu.a));
    }

    public final String ca() {
        return getString(cM(5, bpgu.a));
    }

    public final String cb() {
        return getString(cM(79, bpgu.a));
    }

    public final String cc() {
        return getString(cM(24, bpgu.a));
    }

    public final String cd() {
        return cuxd.a(getString(cM(74, bpgu.a)));
    }

    public final String ce() {
        return getString(cM(2, bpgu.a));
    }

    public final String cf() {
        return getString(cM(3, bpgu.a));
    }

    public final String cg() {
        return getString(cM(36, bpgu.a));
    }

    public final String ch() {
        return getString(cM(148, bpgu.a));
    }

    public final String ci() {
        return cuxs.a(getString(cM(120, bpgu.a)));
    }

    public final String cj() {
        return cuxs.a(getString(cM(121, bpgu.a)));
    }

    public final String ck() {
        return getString(cM(90, bpgu.a));
    }

    public final String cl() {
        return getString(cM(118, bpgu.a));
    }

    public final String cm() {
        return getString(cM(40, bpgu.a));
    }

    public final fjay cn() {
        byte[] blob = getBlob(cM(60, bpgu.a));
        if (blob == null) {
            return null;
        }
        try {
            return (fjay) eyfy.parseFrom(fjay.a, blob, eyfc.a());
        } catch (Throwable unused) {
            return fjay.a;
        }
    }

    public final boolean co() {
        return getInt(cM(173, bpgu.a)) == 1;
    }

    public final boolean cp() {
        return getInt(cM(51, bpgu.a)) == 1;
    }

    public final boolean cq() {
        return getInt(cM(89, bpgu.a)) == 1;
    }

    public final boolean cr() {
        return getInt(cM(59, bpgu.a)) == 1;
    }

    public final boolean cs() {
        return getInt(cM(181, bpgu.a)) == 1;
    }

    public final boolean ct() {
        return getInt(cM(157, bpgu.a)) == 1;
    }

    public final boolean cu() {
        return getInt(cM(147, bpgu.a)) == 1;
    }

    public final boolean cv() {
        return getInt(cM(103, bpgu.a)) == 1;
    }

    public final boolean cw() {
        return getInt(cM(156, bpgu.a)) == 1;
    }

    public final boolean cx() {
        return getInt(cM(113, bpgu.a)) == 1;
    }

    public final boolean cy() {
        return getInt(cM(32, bpgu.a)) == 1;
    }

    public final boolean cz() {
        return getInt(cM(96, bpgu.a)) == 1;
    }

    public final int e() {
        return getInt(cM(86, bpgu.a));
    }

    public final int f() {
        return getInt(cM(87, bpgu.a));
    }

    public final int g() {
        return getInt(cM(154, bpgu.a));
    }

    public final int h() {
        return getInt(cM(129, bpgu.a));
    }

    public final int i() {
        return getInt(cM(88, bpgu.a));
    }

    public final int j() {
        return getInt(cM(97, bpgu.a));
    }

    public final int k() {
        return getInt(cM(153, bpgu.a));
    }

    public final int l() {
        return getInt(cM(11, bpgu.a));
    }

    public final int m() {
        return getInt(cM(185, bpgu.a));
    }

    public final int n() {
        return getInt(cM(162, bpgu.a));
    }

    public final int o() {
        return getInt(cM(64, bpgu.a));
    }

    public final int p() {
        return getInt(cM(143, bpgu.a));
    }

    public final int q() {
        return getInt(cM(93, bpgu.a));
    }

    public final int r() {
        return getInt(cM(9, bpgu.a));
    }

    public final int s() {
        return getInt(cM(23, bpgu.a));
    }

    public final int t() {
        return getInt(cM(29, bpgu.a));
    }

    public final int u() {
        return getInt(cM(31, bpgu.a));
    }

    public final int v() {
        return getInt(cM(54, bpgu.a));
    }

    public final int w() {
        return getInt(cM(155, bpgu.a));
    }

    public final int x() {
        return getInt(cM(72, bpgu.a));
    }

    public final int y() {
        return getInt(cM(35, bpgu.a));
    }

    public final int z() {
        return getInt(cM(15, bpgu.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
