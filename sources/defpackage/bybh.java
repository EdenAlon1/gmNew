package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bybh extends dtsr implements byaw {
    @Deprecated
    public bybh(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bybj bybjVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bybl.a, dtyoVar, dtvsVar, bybjVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bxzx();
    }

    public final int c() {
        return getInt(cM(8, bybl.a));
    }

    public final int e() {
        return getInt(cM(3, bybl.a));
    }

    public final int f() {
        return getInt(cM(2, bybl.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        int i;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        int i2;
        long[] jArr3;
        HashSet hashSet;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length == 0 || (length == 1 && dB[0] == -1)) {
            int i3 = engw.d;
            return enou.a;
        }
        HashSet hashSet2 = new HashSet();
        dtvs dtvsVar = this.d;
        boolean di = di(0);
        boolean z = dtvsVar.b;
        String[] strArr = null;
        long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, bybl.a)))) : new long[]{g()} : null;
        dtsr.dy(length, B, new emyl() { // from class: byax
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(bybh.this.getString(0)));
            }
        });
        String[] strArr2 = di(1) ? z ? (String[]) dtub.C(null, dt(getString(cM(1, bybl.a))), new String[0]) : new String[]{m()} : null;
        dtsr.dz(length, strArr2, new emyl() { // from class: byay
            @Override // defpackage.emyl
            public final Object get() {
                return "sticker_set_id:".concat(String.valueOf(bybh.this.getString(1)));
            }
        });
        int[] z2 = di(2) ? z ? dtub.z(null, dr(getString(cM(2, bybl.a)))) : new int[]{f()} : null;
        dtsr.dx(length, z2, new emyl() { // from class: byaz
            @Override // defpackage.emyl
            public final Object get() {
                return "local_version:".concat(String.valueOf(bybh.this.getString(2)));
            }
        });
        int[] z3 = di(3) ? z ? dtub.z(null, dr(getString(cM(3, bybl.a)))) : new int[]{e()} : null;
        dtsr.dx(length, z3, new emyl() { // from class: byba
            @Override // defpackage.emyl
            public final Object get() {
                return "download_state:".concat(String.valueOf(bybh.this.getString(3)));
            }
        });
        String[] strArr3 = di(4) ? z ? (String[]) dtub.C(null, dt(getString(cM(4, bybl.a))), new String[0]) : new String[]{k()} : null;
        dtsr.dz(length, strArr3, new emyl() { // from class: bybb
            @Override // defpackage.emyl
            public final Object get() {
                return "icon_uri:".concat(String.valueOf(bybh.this.getString(4)));
            }
        });
        String[] strArr4 = di(5) ? z ? (String[]) dtub.C(null, dt(getString(cM(5, bybl.a))), new String[0]) : new String[]{j()} : null;
        dtsr.dz(length, strArr4, new emyl() { // from class: bybc
            @Override // defpackage.emyl
            public final Object get() {
                return "display_name:".concat(String.valueOf(bybh.this.getString(5)));
            }
        });
        String[] strArr5 = di(6) ? z ? (String[]) dtub.C(null, dt(getString(cM(6, bybl.a))), new String[0]) : new String[]{l()} : null;
        dtsr.dz(length, strArr5, new emyl() { // from class: bybd
            @Override // defpackage.emyl
            public final Object get() {
                return "preview_image_uri:".concat(String.valueOf(bybh.this.getString(6)));
            }
        });
        if (!di(7)) {
            i = 0;
            jArr = null;
        } else if (z) {
            i = 0;
            jArr = dtub.B(null, ds(getString(cM(7, bybl.a))));
        } else {
            i = 0;
            jArr = new long[]{h()};
        }
        dtsr.dy(length, jArr, new emyl() { // from class: bybe
            @Override // defpackage.emyl
            public final Object get() {
                return "requested_timestamp:".concat(String.valueOf(bybh.this.getString(7)));
            }
        });
        if (!di(8)) {
            iArr = null;
        } else if (z) {
            iArr = dtub.z(null, dr(getString(cM(8, bybl.a))));
        } else {
            int[] iArr3 = new int[1];
            iArr3[i] = c();
            iArr = iArr3;
        }
        dtsr.dx(length, iArr, new emyl() { // from class: bybf
            @Override // defpackage.emyl
            public final Object get() {
                return "display_order:".concat(String.valueOf(bybh.this.getString(8)));
            }
        });
        if (!di(9)) {
            jArr2 = dB;
        } else if (z) {
            jArr2 = dB;
            strArr = (String[]) dtub.C(null, dt(getString(cM(9, bybl.a))), new String[i]);
        } else {
            jArr2 = dB;
            strArr = new String[1];
            strArr[i] = i();
        }
        dtsr.dz(length, strArr, new emyl() { // from class: bybg
            @Override // defpackage.emyl
            public final Object get() {
                return "author:".concat(String.valueOf(bybh.this.getString(9)));
            }
        });
        engr engrVar = new engr();
        int i4 = 0;
        while (i4 < length) {
            long j = jArr2[i4];
            if (j <= 0 || hashSet2.contains(Long.valueOf(j))) {
                iArr2 = iArr;
                i2 = length;
                jArr3 = jArr;
                hashSet = hashSet2;
            } else {
                hashSet2.add(Long.valueOf(jArr2[i4]));
                String[] strArr6 = bybl.a;
                bxzz bxzzVar = new bxzz();
                bxzzVar.aF();
                bxzzVar.aD();
                long j2 = jArr2[i4];
                iArr2 = iArr;
                i2 = length;
                if (B != null) {
                    long j3 = B[i4];
                    bxzzVar.aE(0);
                    bxzzVar.a = j3;
                }
                if (strArr2 != null) {
                    String str = strArr2[i4];
                    bxzzVar.aE(1);
                    bxzzVar.b = str;
                }
                if (z2 != null) {
                    int i5 = z2[i4];
                    bxzzVar.aE(2);
                    bxzzVar.c = i5;
                }
                if (z3 != null) {
                    int i6 = z3[i4];
                    bxzzVar.aE(3);
                    bxzzVar.d = i6;
                }
                if (strArr3 != null) {
                    String str2 = strArr3[i4];
                    bxzzVar.aE(4);
                    bxzzVar.e = str2;
                }
                if (strArr4 != null) {
                    String str3 = strArr4[i4];
                    bxzzVar.aE(5);
                    bxzzVar.f = str3;
                }
                if (strArr5 != null) {
                    String str4 = strArr5[i4];
                    bxzzVar.aE(6);
                    bxzzVar.g = str4;
                }
                jArr3 = jArr;
                if (jArr != null) {
                    long j4 = jArr3[i4];
                    bxzzVar.aE(7);
                    bxzzVar.h = j4;
                }
                if (iArr2 != null) {
                    int i7 = iArr2[i4];
                    bxzzVar.aE(8);
                    bxzzVar.i = i7;
                }
                if (strArr != null) {
                    String str5 = strArr[i4];
                    bxzzVar.aE(9);
                    bxzzVar.j = str5;
                }
                bxzx bxzxVar = new bxzx();
                bxzxVar.aC(bxzzVar.aB());
                hashSet = hashSet2;
                bxzxVar.a = bxzzVar.a;
                bxzxVar.b = bxzzVar.b;
                bxzxVar.c = bxzzVar.c;
                bxzxVar.d = bxzzVar.d;
                bxzxVar.e = bxzzVar.e;
                bxzxVar.f = bxzzVar.f;
                bxzxVar.g = bxzzVar.g;
                bxzxVar.h = bxzzVar.h;
                bxzxVar.i = bxzzVar.i;
                bxzxVar.j = bxzzVar.j;
                bxzxVar.cK = bxzzVar.aC();
                engrVar.h(bxzxVar);
            }
            i4++;
            hashSet2 = hashSet;
            jArr = jArr3;
            length = i2;
            iArr = iArr2;
        }
        return engrVar.g();
    }

    public final long g() {
        return getLong(cM(0, bybl.a));
    }

    public final long h() {
        return getLong(cM(7, bybl.a));
    }

    public final String i() {
        return getString(cM(9, bybl.a));
    }

    public final String j() {
        return getString(cM(5, bybl.a));
    }

    public final String k() {
        return getString(cM(4, bybl.a));
    }

    public final String l() {
        return getString(cM(6, bybl.a));
    }

    public final String m() {
        return getString(cM(1, bybl.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
