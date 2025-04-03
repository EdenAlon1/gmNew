package defpackage;

import android.database.Cursor;
import android.net.Uri;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwxy extends dtsr implements bwxr {
    @Deprecated
    public bwxy(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bwye bwyeVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bwyj.a, dtyoVar, dtvsVar, bwyeVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bwxa();
    }

    public final int c() {
        return getInt(cM(4, bwyj.a));
    }

    public final int e() {
        return getInt(cM(3, bwyj.a));
    }

    public final long f() {
        return getLong(cM(5, bwyj.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        Uri[] uriArr;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                String[] strArr = di ? z ? (String[]) dtub.C(null, dt(getString(cM(0, bwyj.a))), new String[0]) : new String[]{i()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: bwxs
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "name:".concat(String.valueOf(bwxy.this.getString(0)));
                    }
                });
                if (!di(1)) {
                    uriArr = null;
                } else if (z) {
                    String[] dt = dt(getString(cM(1, bwyj.a)));
                    int length2 = dt.length;
                    Uri[] uriArr2 = new Uri[length2];
                    int i = 0;
                    int i2 = 0;
                    while (i < length2) {
                        String str = dt[i];
                        int i3 = i2 + 1;
                        uriArr2[i2] = (str == null || str.length() == 0) ? null : Uri.parse(str);
                        i++;
                        i2 = i3;
                    }
                    uriArr = (Uri[]) dtub.C(null, uriArr2, new Uri[0]);
                } else {
                    uriArr = new Uri[]{g()};
                }
                dtsr.dz(length, uriArr, new emyl() { // from class: bwxt
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "content_uri:".concat(String.valueOf(bwxy.this.getString(1)));
                    }
                });
                String[] strArr2 = di(2) ? z ? (String[]) dtub.C(null, dt(getString(cM(2, bwyj.a))), new String[0]) : new String[]{h()} : null;
                dtsr.dz(length, strArr2, new emyl() { // from class: bwxu
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "content_type:".concat(String.valueOf(bwxy.this.getString(2)));
                    }
                });
                int[] z2 = di(3) ? z ? dtub.z(null, dr(getString(cM(3, bwyj.a)))) : new int[]{e()} : null;
                dtsr.dx(length, z2, new emyl() { // from class: bwxv
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "width:".concat(String.valueOf(bwxy.this.getString(3)));
                    }
                });
                int[] z3 = di(4) ? z ? dtub.z(null, dr(getString(cM(4, bwyj.a)))) : new int[]{c()} : null;
                dtsr.dx(length, z3, new emyl() { // from class: bwxw
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "height:".concat(String.valueOf(bwxy.this.getString(4)));
                    }
                });
                long[] B = di(5) ? z ? dtub.B(null, ds(getString(cM(5, bwyj.a)))) : new long[]{f()} : null;
                dtsr.dy(length, B, new emyl() { // from class: bwxx
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "last_used_timestamp:".concat(String.valueOf(bwxy.this.getString(5)));
                    }
                });
                engr engrVar = new engr();
                for (int i4 = 0; i4 < length; i4++) {
                    long j = dB[i4];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(dB[i4]));
                        String[] strArr3 = bwyj.a;
                        bwxc bwxcVar = new bwxc();
                        bwxcVar.aF();
                        bwxcVar.aD();
                        long j2 = dB[i4];
                        if (strArr != null) {
                            bwxcVar.f(strArr[i4]);
                        }
                        if (uriArr != null) {
                            bwxcVar.c(uriArr[i4]);
                        }
                        if (strArr2 != null) {
                            bwxcVar.b(strArr2[i4]);
                        }
                        if (z2 != null) {
                            bwxcVar.g(z2[i4]);
                        }
                        if (z3 != null) {
                            bwxcVar.d(z3[i4]);
                        }
                        if (B != null) {
                            bwxcVar.e(B[i4]);
                        }
                        engrVar.h(bwxcVar.a());
                    }
                }
                return engrVar.g();
            }
        }
        int i5 = engw.d;
        return enou.a;
    }

    public final Uri g() {
        String string = getString(cM(1, bwyj.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final String h() {
        return getString(cM(2, bwyj.a));
    }

    public final String i() {
        return getString(cM(0, bwyj.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
