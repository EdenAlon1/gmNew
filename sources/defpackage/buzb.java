package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buzb extends dtsr implements buyu {
    @Deprecated
    public buzb(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, buzf buzfVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, buzh.a, dtyoVar, dtvsVar, buzfVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new buyd();
    }

    public final long c() {
        return getLong(cM(1, buzh.a));
    }

    public final long e() {
        return getLong(cM(0, buzh.a));
    }

    public final long f() {
        return getLong(cM(2, buzh.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        HashSet hashSet;
        long[] jArr;
        char c;
        dtyq dtyqVar = dtvnVar.a;
        int i = 1;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            int i2 = 0;
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet2 = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, buzh.a)))) : new long[]{e()} : null;
                dtsr.dy(length, B, new emyl() { // from class: buyv
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "_id:".concat(String.valueOf(buzb.this.getString(0)));
                    }
                });
                long[] B2 = di(1) ? z ? dtub.B(null, ds(getString(cM(1, buzh.a)))) : new long[]{c()} : null;
                dtsr.dy(length, B2, new emyl() { // from class: buyw
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "am_version_code:".concat(String.valueOf(buzb.this.getString(1)));
                    }
                });
                long[] B3 = di(2) ? z ? dtub.B(null, ds(getString(cM(2, buzh.a)))) : new long[]{f()} : null;
                dtsr.dy(length, B3, new emyl() { // from class: buyx
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "stack_trace_hash:".concat(String.valueOf(buzb.this.getString(2)));
                    }
                });
                char c2 = 3;
                String[] strArr = di(3) ? z ? (String[]) dtub.C(null, dt(getString(cM(3, buzh.a))), new String[0]) : new String[]{g()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: buyy
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "source:".concat(String.valueOf(buzb.this.getString(3)));
                    }
                });
                String[] strArr2 = di(4) ? z ? (String[]) dtub.C(null, dt(getString(cM(4, buzh.a))), new String[0]) : new String[]{i()} : null;
                dtsr.dz(length, strArr2, new emyl() { // from class: buyz
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "tiktok_trace:".concat(String.valueOf(buzb.this.getString(4)));
                    }
                });
                String[] strArr3 = di(5) ? z ? (String[]) dtub.C(null, dt(getString(cM(5, buzh.a))), new String[0]) : new String[]{h()} : null;
                dtsr.dz(length, strArr3, new emyl() { // from class: buza
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "stack_trace:".concat(String.valueOf(buzb.this.getString(5)));
                    }
                });
                engr engrVar = new engr();
                int i3 = 0;
                while (i3 < length) {
                    long j = dB[i3];
                    if (j <= 0) {
                        hashSet = hashSet2;
                        jArr = B3;
                        c = c2;
                    } else if (hashSet2.contains(Long.valueOf(j))) {
                        hashSet = hashSet2;
                        jArr = B3;
                        c = 3;
                    } else {
                        hashSet2.add(Long.valueOf(dB[i3]));
                        String[] strArr4 = buzh.a;
                        buyf buyfVar = new buyf();
                        buyfVar.aF();
                        buyfVar.aD();
                        long j2 = dB[i3];
                        jArr = B3;
                        if (B != null) {
                            long j3 = B[i3];
                            buyfVar.aE(i2);
                            buyfVar.a = j3;
                        }
                        if (B2 != null) {
                            long j4 = B2[i3];
                            buyfVar.aE(i);
                            buyfVar.b = j4;
                        }
                        if (jArr != null) {
                            long j5 = jArr[i3];
                            buyfVar.aE(2);
                            buyfVar.c = j5;
                        }
                        if (strArr != null) {
                            String str = strArr[i3];
                            c = 3;
                            buyfVar.aE(3);
                            buyfVar.d = str;
                        } else {
                            c = 3;
                        }
                        if (strArr2 != null) {
                            String str2 = strArr2[i3];
                            buyfVar.aE(4);
                            buyfVar.e = str2;
                        }
                        if (strArr3 != null) {
                            String str3 = strArr3[i3];
                            buyfVar.aE(5);
                            buyfVar.f = str3;
                        }
                        buyd buydVar = new buyd();
                        buydVar.aC(buyfVar.aB());
                        hashSet = hashSet2;
                        buydVar.a = buyfVar.a;
                        buydVar.b = buyfVar.b;
                        buydVar.c = buyfVar.c;
                        buydVar.d = buyfVar.d;
                        buydVar.e = buyfVar.e;
                        buydVar.f = buyfVar.f;
                        buydVar.cK = buyfVar.aC();
                        engrVar.h(buydVar);
                    }
                    i3++;
                    c2 = c;
                    B3 = jArr;
                    hashSet2 = hashSet;
                    i = 1;
                    i2 = 0;
                }
                return engrVar.g();
            }
        }
        int i4 = engw.d;
        return enou.a;
    }

    public final String g() {
        return getString(cM(3, buzh.a));
    }

    public final String h() {
        return getString(cM(5, buzh.a));
    }

    public final String i() {
        return getString(cM(4, buzh.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
