package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azny extends dtsr implements aznq {
    @Deprecated
    public azny(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, azoc azocVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, azoi.a, dtyoVar, dtvsVar, azocVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new azmu();
    }

    @Override // defpackage.aznq
    public final engw c() {
        engr engrVar = new engr();
        while (moveToNext()) {
            if (g() != null) {
                engrVar.h(g());
            }
        }
        return engrVar.g();
    }

    public final azon e() {
        azon[] values = azon.values();
        int i = getInt(cM(4, azoi.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final azsu f() {
        return azsv.a(getString(cM(1, azoi.a)));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        azsu[] azsuVarArr;
        azsu[] azsuVarArr2;
        azon[] azonVarArr;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                if (!di) {
                    azsuVarArr = null;
                } else if (z) {
                    String[] dt = dt(getString(cM(0, azoi.a)));
                    int length2 = dt.length;
                    azsu[] azsuVarArr3 = new azsu[length2];
                    for (int i = 0; i < length2; i++) {
                        azsuVarArr3[i] = azsv.a(dt[i]);
                    }
                    azsuVarArr = (azsu[]) dtub.C(null, azsuVarArr3, new azsu[0]);
                } else {
                    azsuVarArr = new azsu[]{g()};
                }
                dtsr.dz(length, azsuVarArr, new emyl() { // from class: aznr
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "token:".concat(String.valueOf(azny.this.getString(0)));
                    }
                });
                if (!di(1)) {
                    azsuVarArr2 = null;
                } else if (z) {
                    String[] dt2 = dt(getString(cM(1, azoi.a)));
                    int length3 = dt2.length;
                    azsu[] azsuVarArr4 = new azsu[length3];
                    for (int i2 = 0; i2 < length3; i2++) {
                        azsuVarArr4[i2] = azsv.a(dt2[i2]);
                    }
                    azsuVarArr2 = (azsu[]) dtub.C(null, azsuVarArr4, new azsu[0]);
                } else {
                    azsuVarArr2 = new azsu[]{f()};
                }
                dtsr.dz(length, azsuVarArr2, new emyl() { // from class: azns
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "canonical_token:".concat(String.valueOf(azny.this.getString(1)));
                    }
                });
                String[] strArr = di(2) ? z ? (String[]) dtub.C(null, dt(getString(cM(2, azoi.a))), new String[0]) : new String[]{j()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: aznt
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "provisioning_id:".concat(String.valueOf(azny.this.getString(2)));
                    }
                });
                boolean[] D = di(3) ? z ? dtub.D(null, du(getString(cM(3, azoi.a)))) : new boolean[]{k()} : null;
                dtsr.dA(length, D, new emyl() { // from class: aznu
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "is_verified:".concat(String.valueOf(azny.this.getString(3)));
                    }
                });
                if (!di(4)) {
                    azonVarArr = null;
                } else if (z) {
                    int[] dr = dr(getString(cM(4, azoi.a)));
                    azon[] values = azon.values();
                    int length4 = values.length;
                    azon[] azonVarArr2 = new azon[dr.length];
                    for (int i3 = 0; i3 < dr.length; i3++) {
                        int i4 = dr[i3];
                        if (i4 >= length4) {
                            throw new IllegalStateException();
                        }
                        azonVarArr2[i3] = values[i4];
                    }
                    azonVarArr = (azon[]) dtub.C(null, azonVarArr2, new azon[0]);
                } else {
                    azonVarArr = new azon[]{e()};
                }
                dtsr.dz(length, azonVarArr, new emyl() { // from class: aznv
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "address_type:".concat(String.valueOf(azny.this.getString(4)));
                    }
                });
                String[] strArr2 = di(5) ? z ? (String[]) dtub.C(null, dt(getString(cM(5, azoi.a))), new String[0]) : new String[]{h()} : null;
                dtsr.dz(length, strArr2, new emyl() { // from class: aznw
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "phone_number:".concat(String.valueOf(azny.this.getString(5)));
                    }
                });
                String[] strArr3 = di(6) ? z ? (String[]) dtub.C(null, dt(getString(cM(6, azoi.a))), new String[0]) : new String[]{i()} : null;
                dtsr.dz(length, strArr3, new emyl() { // from class: aznx
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "display_name:".concat(String.valueOf(azny.this.getString(6)));
                    }
                });
                engr engrVar = new engr();
                for (int i5 = 0; i5 < length; i5++) {
                    long j = dB[i5];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(dB[i5]));
                        String[] strArr4 = azoi.a;
                        azmy azmyVar = new azmy();
                        azmyVar.aF();
                        azmyVar.aD();
                        long j2 = dB[i5];
                        if (azsuVarArr != null) {
                            azmyVar.g(azsuVarArr[i5]);
                        }
                        if (azsuVarArr2 != null) {
                            azsu azsuVar = azsuVarArr2[i5];
                            int i6 = azmyVar.aB;
                            if (i6 < 60530) {
                                dtub.w("canonical_token", i6);
                            }
                            azmyVar.aE(1);
                            azmyVar.b = azsuVar;
                        }
                        if (strArr != null) {
                            azmyVar.f(strArr[i5]);
                        }
                        if (D != null) {
                            boolean z2 = D[i5];
                            int i7 = azmyVar.aB;
                            if (i7 < 60320) {
                                dtub.w("is_verified", i7);
                            }
                            azmyVar.aE(3);
                            azmyVar.d = z2;
                        }
                        if (azonVarArr != null) {
                            azmyVar.d(azonVarArr[i5]);
                        }
                        if (strArr2 != null) {
                            azmyVar.c(strArr2[i5]);
                        }
                        if (strArr3 != null) {
                            azmyVar.e(strArr3[i5]);
                        }
                        engrVar.h(azmyVar.a());
                    }
                }
                return engrVar.g();
            }
        }
        int i8 = engw.d;
        return enou.a;
    }

    public final azsu g() {
        return azsv.a(getString(cM(0, azoi.a)));
    }

    public final String h() {
        return getString(cM(5, azoi.a));
    }

    public final String i() {
        return getString(cM(6, azoi.a));
    }

    public final String j() {
        return getString(cM(2, azoi.a));
    }

    public final boolean k() {
        return getInt(cM(3, azoi.a)) == 1;
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
