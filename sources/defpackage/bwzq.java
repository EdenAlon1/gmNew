package defpackage;

import android.database.Cursor;
import android.net.Uri;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwzq extends dtsr implements bwzi {
    @Deprecated
    public bwzq(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bwzw bwzwVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bxad.a, dtyoVar, dtvsVar, bwzwVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bwyp();
    }

    public final int c() {
        return getInt(cM(5, bxad.a));
    }

    public final int e() {
        return getInt(cM(4, bxad.a));
    }

    public final long f() {
        return getLong(cM(6, bxad.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        Uri[] uriArr;
        Uri[] uriArr2;
        long[] jArr;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            int i = 0;
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                if (!di) {
                    uriArr = null;
                } else if (z) {
                    String[] dt = dt(getString(cM(0, bxad.a)));
                    int length2 = dt.length;
                    Uri[] uriArr3 = new Uri[length2];
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < length2) {
                        String str = dt[i2];
                        int i4 = i3 + 1;
                        uriArr3[i3] = (str == null || str.length() == 0) ? null : Uri.parse(str);
                        i2++;
                        i3 = i4;
                    }
                    uriArr = (Uri[]) dtub.C(null, uriArr3, new Uri[0]);
                } else {
                    uriArr = new Uri[]{h()};
                }
                dtsr.dz(length, uriArr, new emyl() { // from class: bwzj
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "original_image_url:".concat(String.valueOf(bwzq.this.getString(0)));
                    }
                });
                if (!di(1)) {
                    uriArr2 = null;
                } else if (z) {
                    String[] dt2 = dt(getString(cM(1, bxad.a)));
                    int length3 = dt2.length;
                    Uri[] uriArr4 = new Uri[length3];
                    int i5 = 0;
                    int i6 = 0;
                    while (i5 < length3) {
                        String str2 = dt2[i5];
                        int i7 = i6 + 1;
                        uriArr4[i6] = (str2 == null || str2.length() == 0) ? null : Uri.parse(str2);
                        i5++;
                        i6 = i7;
                    }
                    uriArr2 = (Uri[]) dtub.C(null, uriArr4, new Uri[0]);
                } else {
                    uriArr2 = new Uri[]{g()};
                }
                dtsr.dz(length, uriArr2, new emyl() { // from class: bwzk
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "content_uri:".concat(String.valueOf(bwzq.this.getString(1)));
                    }
                });
                String[] strArr = di(2) ? z ? (String[]) dtub.C(null, dt(getString(cM(2, bxad.a))), new String[0]) : new String[]{i()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: bwzl
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "domain:".concat(String.valueOf(bwzq.this.getString(2)));
                    }
                });
                String[] strArr2 = di(3) ? z ? (String[]) dtub.C(null, dt(getString(cM(3, bxad.a))), new String[0]) : new String[]{j()} : null;
                dtsr.dz(length, strArr2, new emyl() { // from class: bwzm
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "image_search_url:".concat(String.valueOf(bwzq.this.getString(3)));
                    }
                });
                int[] z2 = di(4) ? z ? dtub.z(null, dr(getString(cM(4, bxad.a)))) : new int[]{e()} : null;
                dtsr.dx(length, z2, new emyl() { // from class: bwzn
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "width:".concat(String.valueOf(bwzq.this.getString(4)));
                    }
                });
                int[] z3 = di(5) ? z ? dtub.z(null, dr(getString(cM(5, bxad.a)))) : new int[]{c()} : null;
                dtsr.dx(length, z3, new emyl() { // from class: bwzo
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "height:".concat(String.valueOf(bwzq.this.getString(5)));
                    }
                });
                long[] B = di(6) ? z ? dtub.B(null, ds(getString(cM(6, bxad.a)))) : new long[]{f()} : null;
                dtsr.dy(length, B, new emyl() { // from class: bwzp
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "last_used_timestamp:".concat(String.valueOf(bwzq.this.getString(6)));
                    }
                });
                engr engrVar = new engr();
                while (i < length) {
                    long j = dB[i];
                    if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                        jArr = dB;
                    } else {
                        hashSet.add(Long.valueOf(dB[i]));
                        String[] strArr3 = bxad.a;
                        bwyr bwyrVar = new bwyr();
                        bwyrVar.aF();
                        bwyrVar.aD();
                        long j2 = dB[i];
                        if (uriArr != null) {
                            bwyrVar.f(uriArr[i]);
                        }
                        if (uriArr2 != null) {
                            bwyrVar.b(uriArr2[i]);
                        }
                        if (strArr != null) {
                            bwyrVar.c(strArr[i]);
                        }
                        if (strArr2 != null) {
                            bwyrVar.e(strArr2[i]);
                        }
                        if (z2 != null) {
                            bwyrVar.g(z2[i]);
                        }
                        if (z3 != null) {
                            bwyrVar.d(z3[i]);
                        }
                        jArr = dB;
                        if (B != null) {
                            long j3 = B[i];
                            bwyrVar.aE(6);
                            bwyrVar.g = j3;
                        }
                        engrVar.h(bwyrVar.a());
                    }
                    i++;
                    dB = jArr;
                }
                return engrVar.g();
            }
        }
        int i8 = engw.d;
        return enou.a;
    }

    public final Uri g() {
        String string = getString(cM(1, bxad.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Uri h() {
        String string = getString(cM(0, bxad.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final String i() {
        return getString(cM(2, bxad.a));
    }

    public final String j() {
        return getString(cM(3, bxad.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
