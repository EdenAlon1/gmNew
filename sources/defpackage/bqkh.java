package defpackage;

import android.database.Cursor;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqkh extends dtsr implements bqjv {
    @Deprecated
    public bqkh(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bqkm bqkmVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bqkv.a, dtyoVar, dtvsVar, bqkmVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bqis();
    }

    public final int c() {
        return getInt(cM(9, bqkv.a));
    }

    public final int e() {
        return getInt(cM(8, bqkv.a));
    }

    public final int f() {
        return getInt(cM(5, bqkv.a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        bqkx[] bqkxVarArr;
        bqkw[] bqkwVarArr;
        epeg[] epegVarArr;
        ccce[] ccceVarArr;
        long[] jArr;
        String[] strArr;
        bqkw[] bqkwVarArr2;
        int i;
        ccce ccceVar;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            int i2 = 0;
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                ccce ccceVar2 = null;
                String[] strArr2 = di ? z ? (String[]) dtub.C(null, dt(getString(cM(0, bqkv.a))), new String[0]) : new String[]{n()} : null;
                dtsr.dz(length, strArr2, new emyl() { // from class: bqjw
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "_id:".concat(String.valueOf(bqkh.this.getString(0)));
                    }
                });
                String[] strArr3 = di(1) ? z ? (String[]) dtub.C(null, dt(getString(cM(1, bqkv.a))), new String[0]) : new String[]{m()} : null;
                dtsr.dz(length, strArr3, new emyl() { // from class: bqjz
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "cms_id:".concat(String.valueOf(bqkh.this.getString(1)));
                    }
                });
                if (!di(2)) {
                    bqkxVarArr = null;
                } else if (z) {
                    int[] dr = dr(getString(cM(2, bqkv.a)));
                    bqkx[] values = bqkx.values();
                    int length2 = values.length;
                    bqkx[] bqkxVarArr2 = new bqkx[dr.length];
                    for (int i3 = 0; i3 < dr.length; i3++) {
                        int i4 = dr[i3];
                        if (i4 >= length2) {
                            throw new IllegalStateException();
                        }
                        bqkxVarArr2[i3] = values[i4];
                    }
                    bqkxVarArr = (bqkx[]) dtub.C(null, bqkxVarArr2, new bqkx[0]);
                } else {
                    bqkxVarArr = new bqkx[]{h()};
                }
                dtsr.dz(length, bqkxVarArr, new emyl() { // from class: bqka
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "cms_data_type:".concat(String.valueOf(bqkh.this.getString(2)));
                    }
                });
                if (!di(3)) {
                    bqkwVarArr = null;
                } else if (z) {
                    int[] dr2 = dr(getString(cM(3, bqkv.a)));
                    bqkw[] values2 = bqkw.values();
                    int length3 = values2.length;
                    bqkw[] bqkwVarArr3 = new bqkw[dr2.length];
                    for (int i5 = 0; i5 < dr2.length; i5++) {
                        int i6 = dr2[i5];
                        if (i6 >= length3) {
                            throw new IllegalStateException();
                        }
                        bqkwVarArr3[i5] = values2[i6];
                    }
                    bqkwVarArr = (bqkw[]) dtub.C(null, bqkwVarArr3, new bqkw[0]);
                } else {
                    bqkwVarArr = new bqkw[]{g()};
                }
                dtsr.dz(length, bqkwVarArr, new emyl() { // from class: bqkb
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "abandoned_action:".concat(String.valueOf(bqkh.this.getString(3)));
                    }
                });
                if (!di(4)) {
                    epegVarArr = null;
                } else if (z) {
                    int[] dr3 = dr(getString(cM(4, bqkv.a)));
                    epeg[] epegVarArr2 = new epeg[dr3.length];
                    for (int i7 = 0; i7 < dr3.length; i7++) {
                        epeg b = epeg.b(dr3[i7]);
                        if (b == null) {
                            throw new IllegalStateException();
                        }
                        epegVarArr2[i7] = b;
                    }
                    epegVarArr = (epeg[]) dtub.C(null, epegVarArr2, new epeg[0]);
                } else {
                    epegVarArr = new epeg[]{j()};
                }
                dtsr.dz(length, epegVarArr, new emyl() { // from class: bqkc
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "failure_reason:".concat(String.valueOf(bqkh.this.getString(4)));
                    }
                });
                int[] z2 = di(5) ? z ? dtub.z(null, dr(getString(cM(5, bqkv.a)))) : new int[]{f()} : null;
                dtsr.dx(length, z2, new emyl() { // from class: bqkd
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "bugle_table_type:".concat(String.valueOf(bqkh.this.getString(5)));
                    }
                });
                String[] strArr4 = di(6) ? z ? (String[]) dtub.C(null, dt(getString(cM(6, bqkv.a))), new String[0]) : new String[]{l()} : null;
                dtsr.dz(length, strArr4, new emyl() { // from class: bqke
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "bugle_id:".concat(String.valueOf(bqkh.this.getString(6)));
                    }
                });
                if (!di(7)) {
                    ccceVarArr = null;
                } else if (z) {
                    List de = de(getString(cM(7, bqkv.a)));
                    ccce[] ccceVarArr2 = new ccce[de.size()];
                    Iterator it = de.iterator();
                    int i8 = 0;
                    while (it.hasNext()) {
                        ccce ccceVar3 = ccceVar2;
                        try {
                            byte[] y = dtub.y((String) it.next());
                            int i9 = i8 + 1;
                            if (y == null) {
                                ccceVar = ccceVar3;
                            } else {
                                try {
                                    ccceVar = (ccce) eyfy.parseFrom(ccce.a, y);
                                } catch (Throwable unused) {
                                    i8 = i9;
                                    ccceVarArr2[i8] = ccceVar3;
                                    i8++;
                                    ccceVar2 = ccceVar3;
                                    i2 = 0;
                                }
                            }
                            ccceVarArr2[i8] = ccceVar;
                            i8 = i9;
                        } catch (Throwable unused2) {
                        }
                        ccceVar2 = ccceVar3;
                        i2 = 0;
                    }
                    ccceVarArr = (ccce[]) dtub.C(ccceVar2, ccceVarArr2, new ccce[i2]);
                } else {
                    ccceVarArr = new ccce[]{i()};
                }
                dtsr.dz(length, ccceVarArr, new emyl() { // from class: bqkf
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "cms_backup_parameters:".concat(String.valueOf(bqkh.this.getString(7)));
                    }
                });
                int[] z3 = di(8) ? z ? dtub.z(null, dr(getString(cM(8, bqkv.a)))) : new int[]{e()} : null;
                dtsr.dx(length, z3, new emyl() { // from class: bqkg
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "backup_flags:".concat(String.valueOf(bqkh.this.getString(8)));
                    }
                });
                int[] z4 = di(9) ? z ? dtub.z(null, dr(getString(cM(9, bqkv.a)))) : new int[]{c()} : null;
                dtsr.dx(length, z4, new emyl() { // from class: bqjx
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "backup_dependency_table_type:".concat(String.valueOf(bqkh.this.getString(9)));
                    }
                });
                if (!di(10)) {
                    jArr = dB;
                    strArr = null;
                } else if (z) {
                    jArr = dB;
                    strArr = (String[]) dtub.C(null, dt(getString(cM(10, bqkv.a))), new String[0]);
                } else {
                    jArr = dB;
                    strArr = new String[]{k()};
                }
                dtsr.dz(length, strArr, new emyl() { // from class: bqjy
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "backup_dependency_bugle_id:".concat(String.valueOf(bqkh.this.getString(10)));
                    }
                });
                engr engrVar = new engr();
                int i10 = 0;
                while (i10 < length) {
                    long j = jArr[i10];
                    if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                        bqkwVarArr2 = bqkwVarArr;
                        i = length;
                    } else {
                        hashSet.add(Long.valueOf(jArr[i10]));
                        String[] strArr5 = bqkv.a;
                        bqiw bqiwVar = new bqiw();
                        bqiwVar.aF();
                        bqiwVar.aD();
                        long j2 = jArr[i10];
                        bqkwVarArr2 = bqkwVarArr;
                        if (strArr2 != null) {
                            String str = strArr2[i10];
                            i = length;
                            bqiwVar.aE(0);
                            bqiwVar.a = str;
                        } else {
                            i = length;
                        }
                        if (strArr3 != null) {
                            bqiwVar.k(strArr3[i10]);
                        }
                        if (bqkxVarArr != null) {
                            bqiwVar.j(bqkxVarArr[i10]);
                        }
                        if (bqkwVarArr2 != null) {
                            bqiwVar.c(bqkwVarArr2[i10]);
                        }
                        if (epegVarArr != null) {
                            bqiwVar.l(epegVarArr[i10]);
                        }
                        if (z2 != null) {
                            bqiwVar.h(z2[i10]);
                        }
                        if (strArr4 != null) {
                            bqiwVar.g(strArr4[i10]);
                        }
                        if (ccceVarArr != null) {
                            bqiwVar.i(ccceVarArr[i10]);
                        }
                        if (z3 != null) {
                            bqiwVar.f(z3[i10]);
                        }
                        if (z4 != null) {
                            bqiwVar.e(z4[i10]);
                        }
                        if (strArr != null) {
                            bqiwVar.d(strArr[i10]);
                        }
                        engrVar.h(bqiwVar.a());
                    }
                    i10++;
                    bqkwVarArr = bqkwVarArr2;
                    length = i;
                }
                return engrVar.g();
            }
        }
        int i11 = engw.d;
        return enou.a;
    }

    public final bqkw g() {
        bqkw[] values = bqkw.values();
        int i = getInt(cM(3, bqkv.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final bqkx h() {
        bqkx[] values = bqkx.values();
        int i = getInt(cM(2, bqkv.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final ccce i() {
        byte[] blob = getBlob(cM(7, bqkv.a));
        if (blob == null) {
            return null;
        }
        try {
            return (ccce) eyfy.parseFrom(ccce.a, blob, eyfc.a());
        } catch (Throwable unused) {
            return ccce.a;
        }
    }

    public final epeg j() {
        return epeg.b(getInt(cM(4, bqkv.a)));
    }

    public final String k() {
        return getString(cM(10, bqkv.a));
    }

    public final String l() {
        return getString(cM(6, bqkv.a));
    }

    public final String m() {
        return getString(cM(1, bqkv.a));
    }

    public final String n() {
        return getString(cM(0, bqkv.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
