package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bydw extends dtsr implements bydo {
    @Deprecated
    public bydw(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bydy bydyVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, byea.a, dtyoVar, dtvsVar, bydyVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bycu();
    }

    public final int c() {
        return getInt(cM(6, byea.a));
    }

    public final long e() {
        return getLong(cM(0, byea.a));
    }

    public final String f() {
        return getString(cM(5, byea.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        int i;
        HashSet hashSet;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            int i2 = 0;
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet2 = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, byea.a)))) : new long[]{e()} : null;
                dtsr.dy(length, B, new emyl() { // from class: bydp
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "_id:".concat(String.valueOf(bydw.this.getString(0)));
                    }
                });
                String[] strArr = di(1) ? z ? (String[]) dtub.C(null, dt(getString(cM(1, byea.a))), new String[0]) : new String[]{j()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: bydq
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "sticker_set_id:".concat(String.valueOf(bydw.this.getString(1)));
                    }
                });
                String[] strArr2 = di(2) ? z ? (String[]) dtub.C(null, dt(getString(cM(2, byea.a))), new String[0]) : new String[]{i()} : null;
                dtsr.dz(length, strArr2, new emyl() { // from class: bydr
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "sticker_id:".concat(String.valueOf(bydw.this.getString(2)));
                    }
                });
                String[] strArr3 = di(3) ? z ? (String[]) dtub.C(null, dt(getString(cM(3, byea.a))), new String[0]) : new String[]{h()} : null;
                dtsr.dz(length, strArr3, new emyl() { // from class: byds
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "icon_uri_static:".concat(String.valueOf(bydw.this.getString(3)));
                    }
                });
                String[] strArr4 = di(4) ? z ? (String[]) dtub.C(null, dt(getString(cM(4, byea.a))), new String[0]) : new String[]{g()} : null;
                dtsr.dz(length, strArr4, new emyl() { // from class: bydt
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "icon_uri_animated:".concat(String.valueOf(bydw.this.getString(4)));
                    }
                });
                String[] strArr5 = di(5) ? z ? (String[]) dtub.C(null, dt(getString(cM(5, byea.a))), new String[0]) : new String[]{f()} : null;
                dtsr.dz(length, strArr5, new emyl() { // from class: bydu
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "display_name:".concat(String.valueOf(bydw.this.getString(5)));
                    }
                });
                int[] z2 = di(6) ? z ? dtub.z(null, dr(getString(cM(6, byea.a)))) : new int[]{c()} : null;
                dtsr.dx(length, z2, new emyl() { // from class: bydv
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "display_order:".concat(String.valueOf(bydw.this.getString(6)));
                    }
                });
                engr engrVar = new engr();
                int i3 = 0;
                while (i3 < length) {
                    long j = dB[i3];
                    if (j <= 0 || hashSet2.contains(Long.valueOf(j))) {
                        i = length;
                        hashSet = hashSet2;
                    } else {
                        hashSet2.add(Long.valueOf(dB[i3]));
                        String[] strArr6 = byea.a;
                        bycw bycwVar = new bycw();
                        bycwVar.aF();
                        bycwVar.aD();
                        long j2 = dB[i3];
                        i = length;
                        if (B != null) {
                            long j3 = B[i3];
                            bycwVar.aE(i2);
                            bycwVar.a = j3;
                        }
                        if (strArr != null) {
                            String str = strArr[i3];
                            bycwVar.aE(1);
                            bycwVar.b = str;
                        }
                        if (strArr2 != null) {
                            String str2 = strArr2[i3];
                            bycwVar.aE(2);
                            bycwVar.c = str2;
                        }
                        if (strArr3 != null) {
                            String str3 = strArr3[i3];
                            bycwVar.aE(3);
                            bycwVar.d = str3;
                        }
                        if (strArr4 != null) {
                            String str4 = strArr4[i3];
                            bycwVar.aE(4);
                            bycwVar.e = str4;
                        }
                        if (strArr5 != null) {
                            String str5 = strArr5[i3];
                            bycwVar.aE(5);
                            bycwVar.f = str5;
                        }
                        if (z2 != null) {
                            int i4 = z2[i3];
                            bycwVar.aE(6);
                            bycwVar.g = i4;
                        }
                        bycu bycuVar = new bycu();
                        bycuVar.aC(bycwVar.aB());
                        hashSet = hashSet2;
                        bycuVar.a = bycwVar.a;
                        bycuVar.b = bycwVar.b;
                        bycuVar.c = bycwVar.c;
                        bycuVar.d = bycwVar.d;
                        bycuVar.e = bycwVar.e;
                        bycuVar.f = bycwVar.f;
                        bycuVar.g = bycwVar.g;
                        bycuVar.cK = bycwVar.aC();
                        engrVar.h(bycuVar);
                    }
                    i3++;
                    length = i;
                    hashSet2 = hashSet;
                    i2 = 0;
                }
                return engrVar.g();
            }
        }
        int i5 = engw.d;
        return enou.a;
    }

    public final String g() {
        return getString(cM(4, byea.a));
    }

    public final String h() {
        return getString(cM(3, byea.a));
    }

    public final String i() {
        return getString(cM(2, byea.a));
    }

    public final String j() {
        return getString(cM(1, byea.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
