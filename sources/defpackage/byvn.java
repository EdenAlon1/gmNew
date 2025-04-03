package defpackage;

import android.database.Cursor;
import android.net.Uri;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byvn extends dtsr implements byvf {
    @Deprecated
    public byvn(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, byvs byvsVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, byvy.a, dtyoVar, dtvsVar, byvsVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new byum();
    }

    public final long c() {
        return getLong(cM(0, byvy.a));
    }

    public final Uri e() {
        String string = getString(cM(5, byvy.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final String f() {
        return getString(cM(1, byvy.a));
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
                long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, byvy.a)))) : new long[]{c()} : null;
                dtsr.dy(length, B, new emyl() { // from class: byvg
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "_id:".concat(String.valueOf(byvn.this.getString(0)));
                    }
                });
                String[] strArr = di(1) ? z ? (String[]) dtub.C(null, dt(getString(cM(1, byvy.a))), new String[0]) : new String[]{f()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: byvh
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "brand_id:".concat(String.valueOf(byvn.this.getString(1)));
                    }
                });
                String[] strArr2 = di(2) ? z ? (String[]) dtub.C(null, dt(getString(cM(2, byvy.a))), new String[0]) : new String[]{i()} : null;
                dtsr.dz(length, strArr2, new emyl() { // from class: byvi
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "name:".concat(String.valueOf(byvn.this.getString(2)));
                    }
                });
                String[] strArr3 = di(3) ? z ? (String[]) dtub.C(null, dt(getString(cM(3, byvy.a))), new String[0]) : new String[]{g()} : null;
                dtsr.dz(length, strArr3, new emyl() { // from class: byvj
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "description:".concat(String.valueOf(byvn.this.getString(3)));
                    }
                });
                String[] strArr4 = di(4) ? z ? (String[]) dtub.C(null, dt(getString(cM(4, byvy.a))), new String[0]) : new String[]{h()} : null;
                dtsr.dz(length, strArr4, new emyl() { // from class: byvk
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "logo_url:".concat(String.valueOf(byvn.this.getString(4)));
                    }
                });
                if (!di(5)) {
                    uriArr = null;
                } else if (z) {
                    String[] dt = dt(getString(cM(5, byvy.a)));
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
                    uriArr = new Uri[]{e()};
                }
                dtsr.dz(length, uriArr, new emyl() { // from class: byvl
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "logo_uri:".concat(String.valueOf(byvn.this.getString(5)));
                    }
                });
                String[] strArr5 = di(6) ? z ? (String[]) dtub.C(null, dt(getString(cM(6, byvy.a))), new String[0]) : new String[]{j()} : null;
                dtsr.dz(length, strArr5, new emyl() { // from class: byvm
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "version_token:".concat(String.valueOf(byvn.this.getString(6)));
                    }
                });
                engr engrVar = new engr();
                for (int i4 = 0; i4 < length; i4++) {
                    long j = dB[i4];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(dB[i4]));
                        byun a = byvy.a();
                        a.aD();
                        long j2 = dB[i4];
                        if (B != null) {
                            a.d(B[i4]);
                        }
                        if (strArr != null) {
                            a.b(strArr[i4]);
                        }
                        if (strArr2 != null) {
                            a.g(strArr2[i4]);
                        }
                        if (strArr3 != null) {
                            a.c(strArr3[i4]);
                        }
                        if (strArr4 != null) {
                            a.f(strArr4[i4]);
                        }
                        if (uriArr != null) {
                            a.e(uriArr[i4]);
                        }
                        if (strArr5 != null) {
                            a.h(strArr5[i4]);
                        }
                        engrVar.h(a.a());
                    }
                }
                return engrVar.g();
            }
        }
        int i5 = engw.d;
        return enou.a;
    }

    public final String g() {
        return getString(cM(3, byvy.a));
    }

    public final String h() {
        return getString(cM(4, byvy.a));
    }

    public final String i() {
        return getString(cM(2, byvy.a));
    }

    public final String j() {
        return getString(cM(6, byvy.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
