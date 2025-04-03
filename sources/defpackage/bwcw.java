package defpackage;

import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwcw extends dtsr implements bwav {
    @Deprecated
    public bwcw(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bwdd bwddVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, PartsTable.a, dtyoVar, dtvsVar, bwddVar);
    }

    public final long A() {
        return getLong(cM(17, PartsTable.a));
    }

    public final long B() {
        return getLong(cM(11, PartsTable.a));
    }

    public final long C() {
        return getLong(cM(9, PartsTable.a));
    }

    public final Uri D() {
        String string = getString(cM(5, PartsTable.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri E() {
        String string = getString(cM(6, PartsTable.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final ConversationIdType F() {
        return new ConversationIdType(getLong(cM(14, PartsTable.a)));
    }

    public final byyp G() {
        return byyo.a(getString(cM(16, PartsTable.a)));
    }

    public final byyp H() {
        return byyo.a(getString(cM(15, PartsTable.a)));
    }

    public final byyu I() {
        byyu[] values = byyu.values();
        int i = getInt(cM(13, PartsTable.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final byyz J() {
        byyz[] values = byyz.values();
        int i = getInt(cM(50, PartsTable.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final byza K() {
        byza[] values = byza.values();
        int i = getInt(cM(45, PartsTable.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final byzc L() {
        byzc[] values = byzc.values();
        int i = getInt(cM(12, PartsTable.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final byzh M() {
        byzh[] values = byzh.values();
        int i = getInt(cM(49, PartsTable.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final byzo N() {
        byzo[] values = byzo.values();
        int i = getInt(cM(47, PartsTable.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final dteh O() {
        byte[] blob = getBlob(cM(46, PartsTable.a));
        if (blob == null) {
            return null;
        }
        try {
            return (dteh) eyfy.parseFrom(dteh.a, blob, eyfc.a());
        } catch (Throwable unused) {
            return dteh.a;
        }
    }

    public final String P() {
        return getString(cM(26, PartsTable.a));
    }

    public final String Q() {
        return getString(cM(4, PartsTable.a));
    }

    public final String R() {
        return getString(cM(32, PartsTable.a));
    }

    public final String S() {
        return getString(cM(33, PartsTable.a));
    }

    public final String T() {
        return getString(cM(21, PartsTable.a));
    }

    public final String U() {
        return cuxs.a(getString(cM(2, PartsTable.a)));
    }

    public final boolean V() {
        return getInt(cM(42, PartsTable.a)) == 1;
    }

    public final boolean W() {
        return getInt(cM(30, PartsTable.a)) == 1;
    }

    public final boolean X() {
        return getInt(cM(37, PartsTable.a)) == 1;
    }

    public final boolean Y() {
        return getInt(cM(41, PartsTable.a)) == 1;
    }

    public final boolean Z() {
        return getInt(cM(51, PartsTable.a)) == 1;
    }

    public final boolean[] aA() {
        return dtub.D(null, du(getString(cM(37, PartsTable.a))));
    }

    public final byte[][] aB() {
        return dtub.E(null, dC(getString(cM(29, PartsTable.a))));
    }

    public final byte[][] aC() {
        return dtub.E(null, dC(getString(cM(28, PartsTable.a))));
    }

    public final byte[][] aD() {
        return dtub.E(null, dC(getString(cM(40, PartsTable.a))));
    }

    public final byte[] aa() {
        return getBlob(cM(29, PartsTable.a));
    }

    public final byte[] ab() {
        return getBlob(cM(28, PartsTable.a));
    }

    public final byte[] ac() {
        return getBlob(cM(40, PartsTable.a));
    }

    public final byte[] ad() {
        return getBlob(cM(39, PartsTable.a));
    }

    public final double[] ae() {
        return dtub.G(dp(getString(cM(19, PartsTable.a))));
    }

    public final int[] af() {
        return dtub.z(null, dr(getString(cM(24, PartsTable.a))));
    }

    public final int[] ag() {
        return dtub.z(null, dr(getString(cM(8, PartsTable.a))));
    }

    public final long[] ah() {
        return dtub.B(null, ds(getString(cM(31, PartsTable.a))));
    }

    public final long[] ai() {
        return dtub.B(null, ds(getString(cM(38, PartsTable.a))));
    }

    public final long[] aj() {
        return dtub.B(null, ds(getString(cM(34, PartsTable.a))));
    }

    public final long[] ak() {
        return dtub.B(null, ds(getString(cM(43, PartsTable.a))));
    }

    public final Uri[] al() {
        String[] dt = dt(getString(cM(22, PartsTable.a)));
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

    public final ConversationIdType[] am() {
        long[] ds = ds(getString(cM(14, PartsTable.a)));
        int length = ds.length;
        ConversationIdType[] conversationIdTypeArr = new ConversationIdType[length];
        for (int i = 0; i < length; i++) {
            conversationIdTypeArr[i] = new ConversationIdType(ds[i]);
        }
        return (ConversationIdType[]) dtub.C(null, conversationIdTypeArr, new ConversationIdType[0]);
    }

    public final byyu[] an() {
        int[] dr = dr(getString(cM(13, PartsTable.a)));
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
        return (byyu[]) dtub.C(null, byyuVarArr, new byyu[0]);
    }

    public final byyz[] ao() {
        int[] dr = dr(getString(cM(50, PartsTable.a)));
        byyz[] values = byyz.values();
        int length = values.length;
        byyz[] byyzVarArr = new byyz[dr.length];
        for (int i = 0; i < dr.length; i++) {
            int i2 = dr[i];
            if (i2 >= length) {
                throw new IllegalStateException();
            }
            byyzVarArr[i] = values[i2];
        }
        return (byyz[]) dtub.C(null, byyzVarArr, new byyz[0]);
    }

    public final String[] ap() {
        return (String[]) dtub.C(null, dt(getString(cM(26, PartsTable.a))), new String[0]);
    }

    public final String[] aq() {
        return (String[]) dtub.C(null, dt(getString(cM(25, PartsTable.a))), new String[0]);
    }

    public final String[] ar() {
        return (String[]) dtub.C(null, dt(getString(cM(36, PartsTable.a))), new String[0]);
    }

    public final String[] as() {
        return (String[]) dtub.C(null, dt(getString(cM(27, PartsTable.a))), new String[0]);
    }

    public final String[] at() {
        return (String[]) dtub.C(null, dt(getString(cM(35, PartsTable.a))), new String[0]);
    }

    public final String[] au() {
        return (String[]) dtub.C(null, dt(getString(cM(4, PartsTable.a))), new String[0]);
    }

    public final String[] av() {
        return (String[]) dtub.C(null, dt(getString(cM(32, PartsTable.a))), new String[0]);
    }

    public final String[] aw() {
        return (String[]) dtub.C(null, dt(getString(cM(33, PartsTable.a))), new String[0]);
    }

    public final String[] ax() {
        return (String[]) dtub.C(null, dt(getString(cM(0, PartsTable.a))), new String[0]);
    }

    public final boolean[] ay() {
        return dtub.D(null, du(getString(cM(42, PartsTable.a))));
    }

    public final boolean[] az() {
        return dtub.D(null, du(getString(cM(30, PartsTable.a))));
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bvwl();
    }

    @Override // defpackage.bwav
    public final int c() {
        return getInt(cM(23, PartsTable.a));
    }

    @Override // defpackage.bwav
    public final long e() {
        return getLong(cM(43, PartsTable.a));
    }

    @Override // defpackage.bwav
    public final Uri f() {
        String string = getString(cM(22, PartsTable.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    /* JADX WARN: Removed duplicated region for block: B:363:0x0c20  */
    @Override // defpackage.dtsr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.engw fI(defpackage.dtvn r65) {
        /*
            Method dump skipped, instructions count: 3536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwcw.fI(dtvn):engw");
    }

    @Override // defpackage.bwav
    public final Uri g() {
        String string = getString(cM(20, PartsTable.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    @Override // defpackage.bwav
    public final Uri h() {
        String string = getString(cM(10, PartsTable.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    @Override // defpackage.bwav
    public final Uri i() {
        String string = getString(cM(3, PartsTable.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    @Override // defpackage.bwav
    public final awap j() {
        return awao.a(getString(cM(48, PartsTable.a)));
    }

    @Override // defpackage.bwav
    public final MessageIdType k() {
        return new MessageIdType(getLong(cM(1, PartsTable.a)));
    }

    @Override // defpackage.bwav
    public final engw l() {
        engr engrVar = new engr();
        while (moveToNext()) {
            if (U() != null) {
                engrVar.h(U());
            }
        }
        return engrVar.g();
    }

    @Override // defpackage.bwav
    public final String m() {
        return getString(cM(25, PartsTable.a));
    }

    @Override // defpackage.bwav
    public final String n() {
        return getString(cM(36, PartsTable.a));
    }

    @Override // defpackage.bwav
    public final String o() {
        return getString(cM(27, PartsTable.a));
    }

    @Override // defpackage.bwav
    public final String p() {
        return getString(cM(35, PartsTable.a));
    }

    @Override // defpackage.bwav
    public final String q() {
        return getString(cM(0, PartsTable.a));
    }

    @Override // defpackage.bwav
    public final String r() {
        return getString(cM(44, PartsTable.a));
    }

    public final double s() {
        return getDouble(cM(19, PartsTable.a));
    }

    public final double t() {
        return getDouble(cM(18, PartsTable.a));
    }

    public final int u() {
        return getInt(cM(24, PartsTable.a));
    }

    public final int v() {
        return getInt(cM(8, PartsTable.a));
    }

    public final int w() {
        return getInt(cM(7, PartsTable.a));
    }

    public final long x() {
        return getLong(cM(31, PartsTable.a));
    }

    public final long y() {
        return getLong(cM(38, PartsTable.a));
    }

    public final long z() {
        return getLong(cM(34, PartsTable.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
