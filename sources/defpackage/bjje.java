package defpackage;

import android.database.Cursor;
import android.net.Uri;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bjje extends dtsr implements bjjd {
    @Deprecated
    public bjje(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bjjg bjjgVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bjjn.a, dtyoVar, dtvsVar, bjjgVar);
    }

    public final int A() {
        return getInt(cM(7, bjjn.a));
    }

    public final int B() {
        return getInt(cM(EnergyProfile.EVCONNECTOR_TYPE_OTHER, bjjn.a));
    }

    public final int C() {
        return getInt(cM(20, bjjn.a));
    }

    public final int D() {
        return getInt(cM(30, bjjn.a));
    }

    public final int E() {
        return getInt(cM(24, bjjn.a));
    }

    public final int F() {
        return getInt(cM(11, bjjn.a));
    }

    public final int G() {
        return getInt(cM(160, bjjn.a));
    }

    public final long H() {
        return getLong(cM(95, bjjn.a));
    }

    public final long I() {
        return getLong(cM(104, bjjn.a));
    }

    public final long J() {
        return getLong(cM(129, bjjn.a));
    }

    public final long K() {
        return getLong(cM(173, bjjn.a));
    }

    public final long L() {
        return getLong(cM(79, bjjn.a));
    }

    public final long M() {
        return getLong(cM(53, bjjn.a));
    }

    public final long N() {
        return getLong(cM(14, bjjn.a));
    }

    public final long O() {
        return getLong(cM(15, bjjn.a));
    }

    public final long P() {
        return getLong(cM(23, bjjn.a));
    }

    public final long Q() {
        return getLong(cM(158, bjjn.a));
    }

    public final long R() {
        return getLong(cM(3, bjjn.a));
    }

    public final long S() {
        return getLong(cM(12, bjjn.a));
    }

    public final Uri T() {
        String string = getString(cM(139, bjjn.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri U() {
        String string = getString(cM(46, bjjn.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri V() {
        String string = getString(cM(94, bjjn.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final awap W() {
        return awao.a(getString(cM(84, bjjn.a)));
    }

    public final ConversationIdType X() {
        return new ConversationIdType(getLong(cM(50, bjjn.a)));
    }

    public final MessageIdType Y() {
        return new MessageIdType(getLong(cM(157, bjjn.a)));
    }

    public final MessageIdType Z() {
        return new MessageIdType(getLong(cM(127, bjjn.a)));
    }

    public final String aA() {
        return cuxs.a(getString(cM(93, bjjn.a)));
    }

    public final String aB() {
        return cuxs.a(getString(cM(164, bjjn.a)));
    }

    public final String aC() {
        return cuxs.a(getString(cM(92, bjjn.a)));
    }

    public final String aD() {
        return cuxs.a(getString(cM(163, bjjn.a)));
    }

    public final String aE() {
        return getString(cM(159, bjjn.a));
    }

    public final String aF() {
        return getString(cM(107, bjjn.a));
    }

    public final String aG() {
        return getString(cM(134, bjjn.a));
    }

    public final String aH() {
        return cuxs.a(getString(cM(131, bjjn.a)));
    }

    public final String aI() {
        return getString(cM(133, bjjn.a));
    }

    public final String aJ() {
        return getString(cM(132, bjjn.a));
    }

    public final String aK() {
        return getString(cM(175, bjjn.a));
    }

    public final String aL() {
        return cuxs.a(getString(cM(130, bjjn.a)));
    }

    public final String aM() {
        return cuxs.a(getString(cM(174, bjjn.a)));
    }

    public final String aN() {
        return getString(cM(80, bjjn.a));
    }

    public final String aO() {
        return getString(cM(96, bjjn.a));
    }

    public final String aP() {
        return cuxs.a(getString(cM(13, bjjn.a)));
    }

    public final String aQ() {
        return getString(cM(137, bjjn.a));
    }

    public final String aR() {
        return cuxd.a(getString(cM(89, bjjn.a)));
    }

    public final String aS() {
        return cuxd.a(getString(cM(161, bjjn.a)));
    }

    public final String aT() {
        return getString(cM(140, bjjn.a));
    }

    public final String aU() {
        return getString(cM(35, bjjn.a));
    }

    public final String aV() {
        return getString(cM(57, bjjn.a));
    }

    public final String aW() {
        return cuxb.a(getString(cM(144, bjjn.a)));
    }

    public final String aX() {
        return cuxd.a(getString(cM(90, bjjn.a)));
    }

    public final String aY() {
        return getString(cM(25, bjjn.a));
    }

    public final String aZ() {
        return getString(cM(148, bjjn.a));
    }

    public final MessageIdType aa() {
        return new MessageIdType(getLong(cM(37, bjjn.a)));
    }

    public final MessageIdType ab() {
        return new MessageIdType(getLong(cM(108, bjjn.a)));
    }

    public final MessageIdType ac() {
        return new MessageIdType(getLong(cM(114, bjjn.a)));
    }

    public final bdhg ad() {
        return bdhg.a(getString(cM(29, bjjn.a)));
    }

    public final bdhg ae() {
        return bdhg.a(getString(cM(19, bjjn.a)));
    }

    public final byyp af() {
        return byyo.a(getString(cM(52, bjjn.a)));
    }

    public final byyp ag() {
        return byyo.a(getString(cM(51, bjjn.a)));
    }

    public final byyw ah() {
        byyw[] values = byyw.values();
        int i = getInt(cM(32, bjjn.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final byyz ai() {
        byyz[] values = byyz.values();
        int i = getInt(cM(86, bjjn.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final byzc aj() {
        byzc[] values = byzc.values();
        int i = getInt(cM(48, bjjn.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final byzh ak() {
        byzh[] values = byzh.values();
        int i = getInt(cM(85, bjjn.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final byzi al() {
        byzi[] values = byzi.values();
        int i = getInt(cM(103, bjjn.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final byzo am() {
        byzo[] values = byzo.values();
        int i = getInt(cM(83, bjjn.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final cjia an() {
        byte[] blob = getBlob(cM(150, bjjn.a));
        if (blob == null) {
            return null;
        }
        try {
            return (cjia) eyfy.parseFrom(cjia.a, blob, eyfc.a());
        } catch (Throwable unused) {
            return cjia.a;
        }
    }

    public final cjwi ao() {
        return cjwi.b(getInt(cM(105, bjjn.a)));
    }

    public final cjwi ap() {
        return cjwi.b(getInt(cM(106, bjjn.a)));
    }

    public final csgg aq() {
        csgg[] values = csgg.values();
        int i = getInt(cM(31, bjjn.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final Optional ar() {
        return bdhe.b(getLong(cM(146, bjjn.a)));
    }

    public final String as() {
        return getString(cM(178, bjjn.a));
    }

    public final String at() {
        return getString(cM(72, bjjn.a));
    }

    public final String au() {
        return getString(cM(63, bjjn.a));
    }

    public final String av() {
        return getString(cM(26, bjjn.a));
    }

    public final String aw() {
        return getString(cM(138, bjjn.a));
    }

    public final String ax() {
        return cuxd.a(getString(cM(91, bjjn.a)));
    }

    public final String ay() {
        return cuxd.a(getString(cM(162, bjjn.a)));
    }

    public final String az() {
        return getString(cM(177, bjjn.a));
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bign();
    }

    public final long[] bA() {
        return dtub.B(null, ds(getString(cM(115, bjjn.a))));
    }

    public final long[] bB() {
        return dtub.B(null, ds(getString(cM(126, bjjn.a))));
    }

    public final long[] bC() {
        return dtub.B(ds(getString(88)), ds(getString(cM(88, bjjn.a))));
    }

    public final long[] bD() {
        return dtub.B(null, ds(getString(cM(171, bjjn.a))));
    }

    public final long[] bE() {
        return dtub.B(null, ds(getString(cM(113, bjjn.a))));
    }

    public final long[] bF() {
        return dtub.B(null, ds(getString(cM(111, bjjn.a))));
    }

    public final long[] bG() {
        return dtub.B(null, ds(getString(cM(110, bjjn.a))));
    }

    public final long[] bH() {
        return dtub.B(ds(getString(88)), ds(getString(cM(47, bjjn.a))));
    }

    public final long[] bI() {
        return dtub.B(null, ds(getString(cM(116, bjjn.a))));
    }

    public final Uri[] bJ() {
        String string = getString(cM(58, bjjn.a));
        long[] ds = ds(getString(88));
        String[] dt = dt(string);
        int length = dt.length;
        Uri[] uriArr = new Uri[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str = dt[i];
            int i3 = i2 + 1;
            Uri uri = null;
            if (str != null && str.length() != 0) {
                uri = Uri.parse(str);
            }
            uriArr[i2] = uri;
            i++;
            i2 = i3;
        }
        return (Uri[]) dtub.C(ds, uriArr, new Uri[0]);
    }

    public final Uri[] bK() {
        String string = getString(cM(41, bjjn.a));
        long[] ds = ds(getString(88));
        String[] dt = dt(string);
        int length = dt.length;
        Uri[] uriArr = new Uri[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str = dt[i];
            int i3 = i2 + 1;
            Uri uri = null;
            if (str != null && str.length() != 0) {
                uri = Uri.parse(str);
            }
            uriArr[i2] = uri;
            i++;
            i2 = i3;
        }
        return (Uri[]) dtub.C(ds, uriArr, new Uri[0]);
    }

    public final Uri[] bL() {
        String string = getString(cM(56, bjjn.a));
        long[] ds = ds(getString(88));
        String[] dt = dt(string);
        int length = dt.length;
        Uri[] uriArr = new Uri[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str = dt[i];
            int i3 = i2 + 1;
            Uri uri = null;
            if (str != null && str.length() != 0) {
                uri = Uri.parse(str);
            }
            uriArr[i2] = uri;
            i++;
            i2 = i3;
        }
        return (Uri[]) dtub.C(ds, uriArr, new Uri[0]);
    }

    public final Uri[] bM() {
        String string = getString(cM(42, bjjn.a));
        long[] ds = ds(getString(88));
        String[] dt = dt(string);
        int length = dt.length;
        Uri[] uriArr = new Uri[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str = dt[i];
            int i3 = i2 + 1;
            Uri uri = null;
            if (str != null && str.length() != 0) {
                uri = Uri.parse(str);
            }
            uriArr[i2] = uri;
            i++;
            i2 = i3;
        }
        return (Uri[]) dtub.C(ds, uriArr, new Uri[0]);
    }

    public final Uri[] bN() {
        String string = getString(cM(39, bjjn.a));
        long[] ds = ds(getString(88));
        String[] dt = dt(string);
        int length = dt.length;
        Uri[] uriArr = new Uri[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str = dt[i];
            int i3 = i2 + 1;
            Uri uri = null;
            if (str != null && str.length() != 0) {
                uri = Uri.parse(str);
            }
            uriArr[i2] = uri;
            i++;
            i2 = i3;
        }
        return (Uri[]) dtub.C(ds, uriArr, new Uri[0]);
    }

    public final Uri[] bO() {
        String[] dt = dt(getString(cM(167, bjjn.a)));
        int length = dt.length;
        Uri[] uriArr = new Uri[length];
        int i = 0;
        int i2 = 0;
        while (true) {
            Uri uri = null;
            if (i >= length) {
                return (Uri[]) dtub.C(null, uriArr, new Uri[0]);
            }
            String str = dt[i];
            int i3 = i2 + 1;
            if (str != null && str.length() != 0) {
                uri = Uri.parse(str);
            }
            uriArr[i2] = uri;
            i++;
            i2 = i3;
        }
    }

    public final ardn[] bP() {
        String string = getString(cM(152, bjjn.a));
        long[] ds = ds(getString(155));
        int[] dr = dr(string);
        ardn[] ardnVarArr = new ardn[dr.length];
        for (int i = 0; i < dr.length; i++) {
            ardn b = ardn.b(dr[i]);
            if (b == null) {
                throw new IllegalStateException();
            }
            ardnVarArr[i] = b;
        }
        return (ardn[]) dtub.C(ds, ardnVarArr, new ardn[0]);
    }

    public final byyu[] bQ() {
        String string = getString(cM(49, bjjn.a));
        long[] ds = ds(getString(88));
        int[] dr = dr(string);
        byyu[] values = byyu.values();
        int length = values.length;
        byyu[] byyuVarArr = new byyu[dr.length];
        for (int i = 0; i < dr.length; i++) {
            int i2 = dr[i];
            if (i2 >= length) {
                throw new IllegalStateException();
            }
            byyuVarArr[i] = values[i2];
        }
        return (byyu[]) dtub.C(ds, byyuVarArr, new byyu[0]);
    }

    public final byza[] bR() {
        String string = getString(cM(81, bjjn.a));
        long[] ds = ds(getString(88));
        int[] dr = dr(string);
        byza[] values = byza.values();
        int length = values.length;
        byza[] byzaVarArr = new byza[dr.length];
        for (int i = 0; i < dr.length; i++) {
            int i2 = dr[i];
            if (i2 >= length) {
                throw new IllegalStateException();
            }
            byzaVarArr[i] = values[i2];
        }
        return (byza[]) dtub.C(ds, byzaVarArr, new byza[0]);
    }

    public final Optional[] bS() {
        long[] ds = ds(getString(cM(112, bjjn.a)));
        int length = ds.length;
        Optional[] optionalArr = new Optional[length];
        for (int i = 0; i < length; i++) {
            optionalArr[i] = bdhe.b(ds[i]);
        }
        return (Optional[]) dtub.C(null, optionalArr, new Optional[0]);
    }

    public final String[] bT() {
        return (String[]) dtub.C(ds(getString(88)), dt(getString(cM(62, bjjn.a))), new String[0]);
    }

    public final String[] bU() {
        return (String[]) dtub.C(ds(getString(88)), dt(getString(cM(61, bjjn.a))), new String[0]);
    }

    public final String[] bV() {
        return (String[]) dtub.C(ds(getString(88)), dt(getString(cM(71, bjjn.a))), new String[0]);
    }

    public final String[] bW() {
        return (String[]) dtub.C(ds(getString(88)), dt(getString(cM(40, bjjn.a))), new String[0]);
    }

    public final String[] bX() {
        return (String[]) dtub.C(null, dt(getString(cM(168, bjjn.a))), new String[0]);
    }

    public final String[] bY() {
        return (String[]) dtub.C(ds(getString(88)), dt(getString(cM(68, bjjn.a))), new String[0]);
    }

    public final String[] bZ() {
        return (String[]) dtub.C(ds(getString(88)), dt(getString(cM(69, bjjn.a))), new String[0]);
    }

    public final String ba() {
        return getString(cM(128, bjjn.a));
    }

    public final fjay bb() {
        byte[] blob = getBlob(cM(33, bjjn.a));
        if (blob == null) {
            return null;
        }
        try {
            return (fjay) eyfy.parseFrom(fjay.a, blob, eyfc.a());
        } catch (Throwable unused) {
            return fjay.a;
        }
    }

    public final boolean bc() {
        return getInt(cM(78, bjjn.a)) == 1;
    }

    public final boolean bd() {
        return getInt(cM(100, bjjn.a)) == 1;
    }

    public final boolean be() {
        return getInt(cM(22, bjjn.a)) == 1;
    }

    public final boolean bf() {
        return getInt(cM(102, bjjn.a)) == 1;
    }

    public final boolean bg() {
        return getInt(cM(136, bjjn.a)) == 1;
    }

    public final boolean bh() {
        return getInt(cM(176, bjjn.a)) == 1;
    }

    public final boolean bi() {
        return getInt(cM(135, bjjn.a)) == 1;
    }

    public final boolean bj() {
        return getInt(cM(8, bjjn.a)) == 1;
    }

    public final boolean bk() {
        return getInt(cM(87, bjjn.a)) == 1;
    }

    public final boolean bl() {
        return getInt(cM(145, bjjn.a)) == 1;
    }

    public final boolean bm() {
        return getInt(cM(9, bjjn.a)) == 1;
    }

    public final byte[] bn() {
        return getBlob(cM(65, bjjn.a));
    }

    public final byte[] bo() {
        return getBlob(cM(64, bjjn.a));
    }

    public final int[] bp() {
        return dtub.z(ds(getString(88)), dr(getString(cM(60, bjjn.a))));
    }

    public final int[] bq() {
        return dtub.z(null, dr(getString(cM(123, bjjn.a))));
    }

    public final int[] br() {
        return dtub.z(null, dr(getString(cM(124, bjjn.a))));
    }

    public final int[] bs() {
        return dtub.z(null, dr(getString(cM(125, bjjn.a))));
    }

    public final int[] bt() {
        return dtub.z(ds(getString(88)), dr(getString(cM(44, bjjn.a))));
    }

    public final int[] bu() {
        return dtub.z(ds(getString(88)), dr(getString(cM(59, bjjn.a))));
    }

    public final long[] bv() {
        return dtub.B(ds(getString(88)), ds(getString(cM(67, bjjn.a))));
    }

    public final long[] bw() {
        return dtub.B(ds(getString(88)), ds(getString(cM(74, bjjn.a))));
    }

    public final long[] bx() {
        return dtub.B(ds(getString(88)), ds(getString(cM(70, bjjn.a))));
    }

    public final long[] by() {
        return dtub.B(null, ds(getString(cM(170, bjjn.a))));
    }

    public final long[] bz() {
        return dtub.B(null, ds(getString(cM(109, bjjn.a))));
    }

    @Override // defpackage.bjjd
    public final int c() {
        return getInt(cM(5, bjjn.a));
    }

    public final String[] ca() {
        return (String[]) dtub.C(null, dt(getString(cM(169, bjjn.a))), new String[0]);
    }

    public final String[] cb() {
        return (String[]) dtub.C(null, dt(getString(cM(165, bjjn.a))), new String[0]);
    }

    public final String[] cc() {
        return (String[]) dtub.C(ds(getString(155)), dt(getString(cM(154, bjjn.a))), new String[0]);
    }

    public final String[] cd() {
        String[] dt = dt(getString(cM(122, bjjn.a)));
        for (int i = 0; i < dt.length; i++) {
            dt[i] = cuxd.a(dt[i]);
        }
        return (String[]) dtub.C(null, dt, new String[0]);
    }

    public final String[] ce() {
        return (String[]) dtub.C(ds(getString(155)), dt(getString(cM(151, bjjn.a))), new String[0]);
    }

    public final String[] cf() {
        String string = getString(cM(38, bjjn.a));
        long[] ds = ds(getString(88));
        String[] dt = dt(string);
        for (int i = 0; i < dt.length; i++) {
            dt[i] = cuxs.a(dt[i]);
        }
        return (String[]) dtub.C(ds, dt, new String[0]);
    }

    public final String[] cg() {
        String[] dt = dt(getString(cM(166, bjjn.a)));
        for (int i = 0; i < dt.length; i++) {
            dt[i] = cuxs.a(dt[i]);
        }
        return (String[]) dtub.C(null, dt, new String[0]);
    }

    public final String[] ch() {
        return (String[]) dtub.C(ds(getString(155)), dt(getString(cM(153, bjjn.a))), new String[0]);
    }

    public final String[] ci() {
        return (String[]) dtub.C(null, dt(getString(cM(118, bjjn.a))), new String[0]);
    }

    public final String[] cj() {
        return (String[]) dtub.C(null, dt(getString(cM(120, bjjn.a))), new String[0]);
    }

    public final String[] ck() {
        return (String[]) dtub.C(null, dt(getString(cM(121, bjjn.a))), new String[0]);
    }

    public final String[] cl() {
        return (String[]) dtub.C(null, dt(getString(cM(119, bjjn.a))), new String[0]);
    }

    public final boolean[] cm() {
        return dtub.D(ds(getString(88)), du(getString(cM(66, bjjn.a))));
    }

    public final boolean[] cn() {
        return dtub.D(ds(getString(88)), du(getString(cM(73, bjjn.a))));
    }

    public final boolean[] co() {
        return dtub.D(ds(getString(88)), du(getString(cM(77, bjjn.a))));
    }

    public final byte[][] cp() {
        return dtub.E(ds(getString(88)), dC(getString(cM(76, bjjn.a))));
    }

    public final byte[][] cq() {
        return dtub.E(ds(getString(88)), dC(getString(cM(75, bjjn.a))));
    }

    @Override // defpackage.bjjd
    public final int d() {
        return getInt(cM(17, bjjn.a));
    }

    @Override // defpackage.bjjd
    public final int e() {
        return getInt(cM(6, bjjn.a));
    }

    @Override // defpackage.bjjd
    public final long f() {
        return getLong(cM(4, bjjn.a));
    }

    @Override // defpackage.bjjd
    public final long g() {
        return getLong(cM(45, bjjn.a));
    }

    @Override // defpackage.bjjd
    public final Uri h() {
        String string = getString(cM(10, bjjn.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    @Override // defpackage.bjjd
    public final ConversationIdType i() {
        return new ConversationIdType(getLong(cM(1, bjjn.a)));
    }

    @Override // defpackage.bjjd
    public final MessageIdType j() {
        return new MessageIdType(getLong(cM(0, bjjn.a)));
    }

    @Override // defpackage.bjjd
    public final MessageIdType k() {
        return new MessageIdType(getLong(cM(156, bjjn.a)));
    }

    @Override // defpackage.bjjd
    public final MessageIdType l() {
        return new MessageIdType(getLong(cM(149, bjjn.a)));
    }

    @Override // defpackage.bjjd
    public final byzi m() {
        byzi[] values = byzi.values();
        int i = getInt(cM(21, bjjn.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.bjjd
    public final cmrf n() {
        byte[] blob = getBlob(cM(147, bjjn.a));
        if (blob == null) {
            return null;
        }
        try {
            return (cmrf) eyfy.parseFrom(cmrf.a, blob, eyfc.a());
        } catch (Throwable unused) {
            return cmrf.a;
        }
    }

    @Override // defpackage.bjjd
    public final String o() {
        return getString(cM(16, bjjn.a));
    }

    @Override // defpackage.bjjd
    public final String p() {
        return getString(cM(143, bjjn.a));
    }

    @Override // defpackage.bjjd
    public final String q() {
        return getString(cM(18, bjjn.a));
    }

    @Override // defpackage.bjjd
    public final String r() {
        return getString(cM(2, bjjn.a));
    }

    @Override // defpackage.bjjd
    public final boolean s() {
        return getInt(cM(142, bjjn.a)) == 1;
    }

    @Override // defpackage.bjjd
    public final String[] t() {
        return (String[]) dtub.C(ds(getString(88)), dt(getString(cM(36, bjjn.a))), new String[0]);
    }

    public final double u() {
        return getDouble(cM(55, bjjn.a));
    }

    public final double v() {
        return getDouble(cM(54, bjjn.a));
    }

    public final int w() {
        return getInt(cM(97, bjjn.a));
    }

    public final int x() {
        return getInt(cM(98, bjjn.a));
    }

    public final int y() {
        return getInt(cM(141, bjjn.a));
    }

    public final int z() {
        return getInt(cM(99, bjjn.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
