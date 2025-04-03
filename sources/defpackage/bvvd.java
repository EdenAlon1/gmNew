package defpackage;

import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvvd extends dtsr implements bvti {
    @Deprecated
    public bvvd(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bvvl bvvlVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, ParticipantsTable.a, dtyoVar, dtvsVar, bvvlVar);
    }

    public final int A() {
        return getInt(cM(23, ParticipantsTable.a));
    }

    public final int B() {
        return getInt(cM(26, ParticipantsTable.a));
    }

    public final long C() {
        return getLong(cM(34, ParticipantsTable.a));
    }

    public final long D() {
        return getLong(cM(10, ParticipantsTable.a));
    }

    public final Uri E() {
        String string = getString(cM(15, ParticipantsTable.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final aorb F() {
        return aorb.b(getInt(cM(39, ParticipantsTable.a)));
    }

    public final aqkt G() {
        byte[] blob = getBlob(cM(44, ParticipantsTable.a));
        if (blob == null) {
            return null;
        }
        try {
            return (aqkt) eyfy.parseFrom(aqkt.a, blob, eyfc.a());
        } catch (Throwable unused) {
            return aqkt.a;
        }
    }

    public final azsu H() {
        return azsv.a(getString(cM(1, ParticipantsTable.a)));
    }

    public final azsu I() {
        return azsv.a(getString(cM(2, ParticipantsTable.a)));
    }

    public final bdpy J() {
        return bdqb.a(getString(cM(40, ParticipantsTable.a)));
    }

    public final cjwe K() {
        return cjwe.b(getInt(cM(43, ParticipantsTable.a)));
    }

    public final cjwi L() {
        return cjwi.b(getInt(cM(41, ParticipantsTable.a)));
    }

    public final String M() {
        return getString(cM(27, ParticipantsTable.a));
    }

    public final String N() {
        return getString(cM(30, ParticipantsTable.a));
    }

    public final String O() {
        return cuxs.a(getString(cM(8, ParticipantsTable.a)));
    }

    public final String P() {
        return getString(cM(24, ParticipantsTable.a));
    }

    public final String Q() {
        return cuxs.a(getString(cM(9, ParticipantsTable.a)));
    }

    public final String R() {
        return cuxd.a(getString(cM(7, ParticipantsTable.a)));
    }

    public final String S() {
        return getString(cM(37, ParticipantsTable.a));
    }

    public final String T() {
        return cuxs.a(getString(cM(13, ParticipantsTable.a)));
    }

    public final String U() {
        return cuxs.a(getString(cM(12, ParticipantsTable.a)));
    }

    public final String V() {
        return getString(cM(32, ParticipantsTable.a));
    }

    public final String W() {
        return getString(cM(11, ParticipantsTable.a));
    }

    public final String X() {
        return getString(cM(22, ParticipantsTable.a));
    }

    public final boolean Y() {
        return getInt(cM(35, ParticipantsTable.a)) == 1;
    }

    public final boolean Z() {
        return getInt(cM(45, ParticipantsTable.a)) == 1;
    }

    public final boolean aa() {
        return getInt(cM(36, ParticipantsTable.a)) == 1;
    }

    public final byte[] ab() {
        return getBlob(cM(33, ParticipantsTable.a));
    }

    public final csgg[] ac() {
        int[] dr = dr(getString(cM(38, ParticipantsTable.a)));
        csgg[] values = csgg.values();
        int length = values.length;
        csgg[] csggVarArr = new csgg[dr.length];
        for (int i = 0; i < dr.length; i++) {
            int i2 = dr[i];
            if (i2 >= length) {
                throw new IllegalStateException();
            }
            csggVarArr[i] = values[i2];
        }
        return (csgg[]) dtub.C(null, csggVarArr, new csgg[0]);
    }

    public final String[] ad() {
        return (String[]) dtub.C(null, dt(getString(cM(27, ParticipantsTable.a))), new String[0]);
    }

    public final String[] ae() {
        return (String[]) dtub.C(null, dt(getString(cM(30, ParticipantsTable.a))), new String[0]);
    }

    public final boolean[] af() {
        return dtub.D(null, du(getString(cM(21, ParticipantsTable.a))));
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bvpk();
    }

    @Override // defpackage.bvti
    public final int c() {
        return getInt(cM(29, ParticipantsTable.a));
    }

    @Override // defpackage.bvti
    public final int e() {
        return getInt(cM(25, ParticipantsTable.a));
    }

    @Override // defpackage.bvti
    public final long f() {
        return getLong(cM(16, ParticipantsTable.a));
    }

    /* JADX WARN: Removed duplicated region for block: B:339:0x0c49 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.dtsr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.engw fI(defpackage.dtvn r59) {
        /*
            Method dump skipped, instructions count: 3549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvvd.fI(dtvn):engw");
    }

    @Override // defpackage.bvti
    public final Uri g() {
        String string = getString(cM(14, ParticipantsTable.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    @Override // defpackage.bvti
    public final byzi h() {
        byzi[] values = byzi.values();
        int i = getInt(cM(31, ParticipantsTable.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.bvti
    public final cjwi i() {
        return cjwi.b(getInt(cM(42, ParticipantsTable.a)));
    }

    @Override // defpackage.bvti
    public final csgg j() {
        csgg[] values = csgg.values();
        int i = getInt(cM(38, ParticipantsTable.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.bvti
    public final engw k() {
        engr engrVar = new engr();
        while (moveToNext()) {
            if (N() != null) {
                engrVar.h(N());
            }
        }
        return engrVar.g();
    }

    @Override // defpackage.bvti
    public final engw l() {
        engr engrVar = new engr();
        while (moveToNext()) {
            if (p() != null) {
                engrVar.h(p());
            }
        }
        return engrVar.g();
    }

    @Override // defpackage.bvti
    public final engw m() {
        engr engrVar = new engr();
        while (moveToNext()) {
            if (r() != null) {
                engrVar.h(r());
            }
        }
        return engrVar.g();
    }

    @Override // defpackage.bvti
    public final engw n() {
        engr engrVar = new engr();
        while (moveToNext()) {
            if (s() != null) {
                engrVar.h(s());
            }
        }
        return engrVar.g();
    }

    @Override // defpackage.bvti
    public final engw o() {
        engr engrVar = new engr();
        while (moveToNext()) {
            z();
            engrVar.h(Integer.valueOf(z()));
        }
        return engrVar.g();
    }

    @Override // defpackage.bvti
    public final String p() {
        return getString(cM(0, ParticipantsTable.a));
    }

    @Override // defpackage.bvti
    public final String q() {
        return getString(cM(17, ParticipantsTable.a));
    }

    @Override // defpackage.bvti
    public final String r() {
        return cuxd.a(getString(cM(5, ParticipantsTable.a)));
    }

    @Override // defpackage.bvti
    public final String s() {
        return cuxd.a(getString(cM(6, ParticipantsTable.a)));
    }

    @Override // defpackage.bvti
    public final boolean t() {
        return getInt(cM(21, ParticipantsTable.a)) == 1;
    }

    @Override // defpackage.bvti
    public final boolean u() {
        return getInt(cM(28, ParticipantsTable.a)) == 1;
    }

    public final int v() {
        return getInt(cM(18, ParticipantsTable.a));
    }

    public final int w() {
        return getInt(cM(19, ParticipantsTable.a));
    }

    public final int x() {
        return getInt(cM(20, ParticipantsTable.a));
    }

    public final int y() {
        return getInt(cM(4, ParticipantsTable.a));
    }

    public final int z() {
        return getInt(cM(3, ParticipantsTable.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
