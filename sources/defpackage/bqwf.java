package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqwf extends dtsr implements bqvz {
    @Deprecated
    public bqwf(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bqwl bqwlVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bqws.a, dtyoVar, dtvsVar, bqwlVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bqvk();
    }

    @Override // defpackage.bqvz
    public final String c() {
        return getString(cM(3, bqws.a));
    }

    @Override // defpackage.bqvz
    public final byte[] e() {
        return getBlob(cM(1, bqws.a));
    }

    public final int f() {
        return getInt(cM(0, bqws.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                int[] z2 = di ? z ? dtub.z(null, dr(getString(cM(0, bqws.a)))) : new int[]{f()} : null;
                dtsr.dx(length, z2, new emyl() { // from class: bqwa
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "key_index:".concat(String.valueOf(bqwf.this.getString(0)));
                    }
                });
                byte[][] E = di(1) ? z ? dtub.E(null, dC(getString(cM(1, bqws.a)))) : new byte[][]{e()} : null;
                dtsr.dz(length, E, new emyl() { // from class: bqwb
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "encryption_key:".concat(String.valueOf(bqwf.this.getString(1)));
                    }
                });
                int[] z3 = di(2) ? z ? dtub.z(null, dr(getString(cM(2, bqws.a)))) : new int[]{g()} : null;
                dtsr.dx(length, z3, new emyl() { // from class: bqwc
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "key_type:".concat(String.valueOf(bqwf.this.getString(2)));
                    }
                });
                String[] strArr = di(3) ? z ? (String[]) dtub.C(null, dt(getString(cM(3, bqws.a))), new String[0]) : new String[]{c()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: bqwd
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "cms_correlation_id:".concat(String.valueOf(bqwf.this.getString(3)));
                    }
                });
                String[] strArr2 = di(4) ? z ? (String[]) dtub.C(null, dt(getString(cM(4, bqws.a))), new String[0]) : new String[]{h()} : null;
                dtsr.dz(length, strArr2, new emyl() { // from class: bqwe
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "cms_id:".concat(String.valueOf(bqwf.this.getString(4)));
                    }
                });
                engr engrVar = new engr();
                for (int i = 0; i < length; i++) {
                    long j = dB[i];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(dB[i]));
                        String[] strArr3 = bqws.a;
                        bqvm bqvmVar = new bqvm();
                        bqvmVar.aF();
                        bqvmVar.aD();
                        long j2 = dB[i];
                        if (z2 != null) {
                            bqvmVar.e(z2[i]);
                        }
                        if (E != null) {
                            bqvmVar.d(E[i]);
                        }
                        if (z3 != null) {
                            bqvmVar.f(z3[i]);
                        }
                        if (strArr != null) {
                            bqvmVar.b(strArr[i]);
                        }
                        if (strArr2 != null) {
                            bqvmVar.c(strArr2[i]);
                        }
                        engrVar.h(bqvmVar.a());
                    }
                }
                return engrVar.g();
            }
        }
        int i2 = engw.d;
        return enou.a;
    }

    public final int g() {
        return getInt(cM(2, bqws.a));
    }

    public final String h() {
        return getString(cM(4, bqws.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
