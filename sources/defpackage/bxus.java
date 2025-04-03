package defpackage;

import android.database.Cursor;
import android.net.Uri;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxus extends dtsr implements bxuk {
    @Deprecated
    public bxus(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bxuy bxuyVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bxve.a, dtyoVar, dtvsVar, bxuyVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bxtq();
    }

    public final long c() {
        return getLong(cM(0, bxve.a));
    }

    public final long e() {
        return getLong(cM(6, bxve.a));
    }

    public final Uri f() {
        String string = getString(cM(3, bxve.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        azsu[] azsuVarArr;
        Uri[] uriArr;
        long[] jArr;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length == 0 || (length == 1 && dB[0] == -1)) {
            int i = engw.d;
            return enou.a;
        }
        HashSet hashSet = new HashSet();
        dtvs dtvsVar = this.d;
        boolean di = di(0);
        boolean z = dtvsVar.b;
        long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, bxve.a)))) : new long[]{c()} : null;
        dtsr.dy(length, B, new emyl() { // from class: bxul
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(bxus.this.getString(0)));
            }
        });
        if (!di(1)) {
            azsuVarArr = null;
        } else if (z) {
            String[] dt = dt(getString(cM(1, bxve.a)));
            int length2 = dt.length;
            azsu[] azsuVarArr2 = new azsu[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                azsuVarArr2[i2] = azsv.a(dt[i2]);
            }
            azsuVarArr = (azsu[]) dtub.C(null, azsuVarArr2, new azsu[0]);
        } else {
            azsuVarArr = new azsu[]{g()};
        }
        dtsr.dz(length, azsuVarArr, new emyl() { // from class: bxum
            @Override // defpackage.emyl
            public final Object get() {
                return "my_identity_token:".concat(String.valueOf(bxus.this.getString(1)));
            }
        });
        String[] strArr = di(2) ? z ? (String[]) dtub.C(null, dt(getString(cM(2, bxve.a))), new String[0]) : new String[]{h()} : null;
        dtsr.dz(length, strArr, new emyl() { // from class: bxun
            @Override // defpackage.emyl
            public final Object get() {
                return "limited_profile_display_name:".concat(String.valueOf(bxus.this.getString(2)));
            }
        });
        if (!di(3)) {
            uriArr = null;
        } else if (z) {
            String[] dt2 = dt(getString(cM(3, bxve.a)));
            int length3 = dt2.length;
            Uri[] uriArr2 = new Uri[length3];
            int i3 = 0;
            int i4 = 0;
            while (i3 < length3) {
                String str = dt2[i3];
                int i5 = i4 + 1;
                uriArr2[i4] = (str == null || str.length() == 0) ? null : Uri.parse(str);
                i3++;
                i4 = i5;
            }
            uriArr = (Uri[]) dtub.C(null, uriArr2, new Uri[0]);
        } else {
            uriArr = new Uri[]{f()};
        }
        dtsr.dz(length, uriArr, new emyl() { // from class: bxuo
            @Override // defpackage.emyl
            public final Object get() {
                return "photo_uri:".concat(String.valueOf(bxus.this.getString(3)));
            }
        });
        boolean[] D = di(4) ? z ? dtub.D(null, du(getString(cM(4, bxve.a)))) : new boolean[]{j()} : null;
        dtsr.dA(length, D, new emyl() { // from class: bxup
            @Override // defpackage.emyl
            public final Object get() {
                return "is_self_profile_shareable:".concat(String.valueOf(bxus.this.getString(4)));
            }
        });
        boolean[] D2 = di(5) ? z ? dtub.D(null, du(getString(cM(5, bxve.a)))) : new boolean[]{i()} : null;
        dtsr.dA(length, D2, new emyl() { // from class: bxuq
            @Override // defpackage.emyl
            public final Object get() {
                return "belongs_to_self_gaia:".concat(String.valueOf(bxus.this.getString(5)));
            }
        });
        long[] B2 = di(6) ? z ? dtub.B(null, ds(getString(cM(6, bxve.a)))) : new long[]{e()} : null;
        dtsr.dy(length, B2, new emyl() { // from class: bxur
            @Override // defpackage.emyl
            public final Object get() {
                return "update_timestamp:".concat(String.valueOf(bxus.this.getString(6)));
            }
        });
        engr engrVar = new engr();
        int i6 = 0;
        while (i6 < length) {
            long j = dB[i6];
            if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                jArr = dB;
            } else {
                hashSet.add(Long.valueOf(dB[i6]));
                String[] strArr2 = bxve.a;
                bxts bxtsVar = new bxts();
                bxtsVar.aF();
                bxtsVar.aD();
                long j2 = dB[i6];
                jArr = dB;
                if (B != null) {
                    long j3 = B[i6];
                    bxtsVar.aE(0);
                    bxtsVar.a = j3;
                }
                if (azsuVarArr != null) {
                    bxtsVar.e(azsuVarArr[i6]);
                }
                if (strArr != null) {
                    bxtsVar.d(strArr[i6]);
                }
                if (uriArr != null) {
                    bxtsVar.f(uriArr[i6]);
                }
                if (D != null) {
                    bxtsVar.c(D[i6]);
                }
                if (D2 != null) {
                    bxtsVar.b(D2[i6]);
                }
                if (B2 != null) {
                    bxtsVar.g(B2[i6]);
                }
                engrVar.h(bxtsVar.a());
            }
            i6++;
            dB = jArr;
        }
        return engrVar.g();
    }

    public final azsu g() {
        return azsv.a(getString(cM(1, bxve.a)));
    }

    public final String h() {
        return getString(cM(2, bxve.a));
    }

    public final boolean i() {
        return getInt(cM(5, bxve.a)) == 1;
    }

    public final boolean j() {
        return getInt(cM(4, bxve.a)) == 1;
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
