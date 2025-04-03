package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bycm extends dtsr implements bycg {
    @Deprecated
    public bycm(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, byco bycoVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bycq.a, dtyoVar, dtvsVar, bycoVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bybp();
    }

    public final long c() {
        return getLong(cM(4, bycq.a));
    }

    public final String e() {
        return getString(cM(3, bycq.a));
    }

    public final String f() {
        return getString(cM(2, bycq.a));
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
                String[] strArr = di ? z ? (String[]) dtub.C(null, dt(getString(cM(0, bycq.a))), new String[0]) : new String[]{h()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: bych
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "sticker_set_id:".concat(String.valueOf(bycm.this.getString(0)));
                    }
                });
                String[] strArr2 = di(1) ? z ? (String[]) dtub.C(null, dt(getString(cM(1, bycq.a))), new String[0]) : new String[]{g()} : null;
                dtsr.dz(length, strArr2, new emyl() { // from class: byci
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "sticker_id:".concat(String.valueOf(bycm.this.getString(1)));
                    }
                });
                String[] strArr3 = di(2) ? z ? (String[]) dtub.C(null, dt(getString(cM(2, bycq.a))), new String[0]) : new String[]{f()} : null;
                dtsr.dz(length, strArr3, new emyl() { // from class: bycj
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "locale:".concat(String.valueOf(bycm.this.getString(2)));
                    }
                });
                String[] strArr4 = di(3) ? z ? (String[]) dtub.C(null, dt(getString(cM(3, bycq.a))), new String[0]) : new String[]{e()} : null;
                dtsr.dz(length, strArr4, new emyl() { // from class: byck
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "display_name:".concat(String.valueOf(bycm.this.getString(3)));
                    }
                });
                long[] B = di(4) ? z ? dtub.B(null, ds(getString(cM(4, bycq.a)))) : new long[]{c()} : null;
                dtsr.dy(length, B, new emyl() { // from class: bycl
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "sticker_local_id:".concat(String.valueOf(bycm.this.getString(4)));
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
                        String[] strArr5 = bycq.a;
                        bybr bybrVar = new bybr();
                        bybrVar.aF();
                        bybrVar.aD();
                        long j2 = dB[i4];
                        if (strArr != null) {
                            String str = strArr[i4];
                            bybrVar.aE(i3);
                            bybrVar.a = str;
                        }
                        if (strArr2 != null) {
                            String str2 = strArr2[i4];
                            bybrVar.aE(i2);
                            bybrVar.b = str2;
                        }
                        if (strArr3 != null) {
                            String str3 = strArr3[i4];
                            bybrVar.aE(2);
                            bybrVar.c = str3;
                        }
                        if (strArr4 != null) {
                            String str4 = strArr4[i4];
                            bybrVar.aE(3);
                            bybrVar.d = str4;
                        }
                        i = length;
                        if (B != null) {
                            long j3 = B[i4];
                            bybrVar.aE(4);
                            bybrVar.e = j3;
                        }
                        bybp bybpVar = new bybp();
                        bybpVar.aC(bybrVar.aB());
                        bybpVar.a = bybrVar.a;
                        bybpVar.b = bybrVar.b;
                        bybpVar.c = bybrVar.c;
                        bybpVar.d = bybrVar.d;
                        hashSet = hashSet2;
                        bybpVar.e = bybrVar.e;
                        bybpVar.cK = bybrVar.aC();
                        engrVar.h(bybpVar);
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
        return getString(cM(1, bycq.a));
    }

    public final String h() {
        return getString(cM(0, bycq.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
