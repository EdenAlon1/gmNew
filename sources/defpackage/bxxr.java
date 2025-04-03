package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxxr extends dtsr implements bxxl {
    @Deprecated
    public bxxr(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bxxs bxxsVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bxxw.a, dtyoVar, dtvsVar, bxxsVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bxww();
    }

    public final long c() {
        return getLong(cM(3, bxxw.a));
    }

    public final String e() {
        return getString(cM(1, bxxw.a));
    }

    public final String f() {
        return getString(cM(4, bxxw.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        int i;
        HashSet hashSet;
        dtyq dtyqVar = dtvnVar.a;
        int i2 = 1;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            int i3 = 0;
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet2 = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                String[] strArr = di ? z ? (String[]) dtub.C(null, dt(getString(cM(0, bxxw.a))), new String[0]) : new String[]{h()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: bxxm
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "type:".concat(String.valueOf(bxxr.this.getString(0)));
                    }
                });
                String[] strArr2 = di(1) ? z ? (String[]) dtub.C(null, dt(getString(cM(1, bxxw.a))), new String[0]) : new String[]{e()} : null;
                dtsr.dz(length, strArr2, new emyl() { // from class: bxxn
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "name:".concat(String.valueOf(bxxr.this.getString(1)));
                    }
                });
                String[] strArr3 = di(2) ? z ? (String[]) dtub.C(null, dt(getString(cM(2, bxxw.a))), new String[0]) : new String[]{g()} : null;
                dtsr.dz(length, strArr3, new emyl() { // from class: bxxo
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "tbl_name:".concat(String.valueOf(bxxr.this.getString(2)));
                    }
                });
                long[] B = di(3) ? z ? dtub.B(null, ds(getString(cM(3, bxxw.a)))) : new long[]{c()} : null;
                dtsr.dy(length, B, new emyl() { // from class: bxxp
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "rootpage:".concat(String.valueOf(bxxr.this.getString(3)));
                    }
                });
                String[] strArr4 = di(4) ? z ? (String[]) dtub.C(null, dt(getString(cM(4, bxxw.a))), new String[0]) : new String[]{f()} : null;
                dtsr.dz(length, strArr4, new emyl() { // from class: bxxq
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "sql:".concat(String.valueOf(bxxr.this.getString(4)));
                    }
                });
                engr engrVar = new engr();
                int i4 = 0;
                while (i4 < length) {
                    long j = dB[i4];
                    if (j <= 0 || hashSet2.contains(Long.valueOf(j))) {
                        i = length;
                        hashSet = hashSet2;
                    } else {
                        hashSet2.add(Long.valueOf(dB[i4]));
                        String[] strArr5 = bxxw.a;
                        bxwy bxwyVar = new bxwy();
                        bxwyVar.aF();
                        bxwyVar.aD();
                        long j2 = dB[i4];
                        if (strArr != null) {
                            String str = strArr[i4];
                            bxwyVar.aE(i3);
                            bxwyVar.a = str;
                        }
                        if (strArr2 != null) {
                            String str2 = strArr2[i4];
                            bxwyVar.aE(i2);
                            bxwyVar.b = str2;
                        }
                        if (strArr3 != null) {
                            String str3 = strArr3[i4];
                            bxwyVar.aE(2);
                            bxwyVar.c = str3;
                        }
                        i = length;
                        if (B != null) {
                            long j3 = B[i4];
                            bxwyVar.aE(3);
                            bxwyVar.d = j3;
                        }
                        if (strArr4 != null) {
                            String str4 = strArr4[i4];
                            bxwyVar.aE(4);
                            bxwyVar.e = str4;
                        }
                        bxww bxwwVar = new bxww();
                        bxwwVar.aC(bxwyVar.aB());
                        bxwwVar.a = bxwyVar.a;
                        bxwwVar.b = bxwyVar.b;
                        bxwwVar.c = bxwyVar.c;
                        hashSet = hashSet2;
                        bxwwVar.d = bxwyVar.d;
                        bxwwVar.e = bxwyVar.e;
                        bxwwVar.cK = bxwyVar.aC();
                        engrVar.h(bxwwVar);
                    }
                    i4++;
                    hashSet2 = hashSet;
                    length = i;
                    i2 = 1;
                    i3 = 0;
                }
                return engrVar.g();
            }
        }
        int i5 = engw.d;
        return enou.a;
    }

    public final String g() {
        return getString(cM(2, bxxw.a));
    }

    public final String h() {
        return getString(cM(0, bxxw.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
