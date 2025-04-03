package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwgj extends dtsr implements bwfp {
    @Deprecated
    public bwgj(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bwgp bwgpVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bwgw.a, dtyoVar, dtvsVar, bwgpVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bwdv();
    }

    @Override // defpackage.bwfp
    public final bdhg c() {
        return bdhg.a(getString(cM(0, bwgw.a)));
    }

    @Override // defpackage.bwfp
    public final engw e() {
        engr engrVar = new engr();
        while (moveToNext()) {
            if (o() != null) {
                engrVar.h(o());
            }
        }
        return engrVar.g();
    }

    public final int f() {
        return getInt(cM(9, bwgw.a));
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x04b1  */
    @Override // defpackage.dtsr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.engw fI(defpackage.dtvn r31) {
        /*
            Method dump skipped, instructions count: 1421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwgj.fI(dtvn):engw");
    }

    public final long g() {
        return getLong(cM(7, bwgw.a));
    }

    public final long h() {
        return getLong(cM(6, bwgw.a));
    }

    public final long i() {
        return getLong(cM(10, bwgw.a));
    }

    public final byze j() {
        byze[] values = byze.values();
        int i = getInt(cM(11, bwgw.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final fayv k() {
        byte[] blob = getBlob(cM(12, bwgw.a));
        if (blob == null) {
            return null;
        }
        try {
            return (fayv) eyfy.parseFrom(fayv.a, blob, eyfc.a());
        } catch (Throwable unused) {
            return fayv.a;
        }
    }

    public final String l() {
        return getString(cM(15, bwgw.a));
    }

    public final String m() {
        return getString(cM(4, bwgw.a));
    }

    public final String n() {
        return getString(cM(14, bwgw.a));
    }

    public final String o() {
        return getString(cM(3, bwgw.a));
    }

    public final String p() {
        return getString(cM(5, bwgw.a));
    }

    public final String q() {
        return getString(cM(1, bwgw.a));
    }

    public final String r() {
        return getString(cM(2, bwgw.a));
    }

    public final String s() {
        return getString(cM(8, bwgw.a));
    }

    public final boolean t() {
        return getInt(cM(16, bwgw.a)) == 1;
    }

    public final boolean u() {
        return getInt(cM(17, bwgw.a)) == 1;
    }

    public final boolean v() {
        return getInt(cM(13, bwgw.a)) == 1;
    }

    public final boolean w() {
        return getInt(cM(18, bwgw.a)) == 1;
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
