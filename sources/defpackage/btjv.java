package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btjv extends dtsr implements btjj {
    @Deprecated
    public btjv(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, btkb btkbVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, btki.a, dtyoVar, dtvsVar, btkbVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new btii();
    }

    @Override // defpackage.btjj
    public final int c() {
        return getInt(cM(1, btki.a));
    }

    public final int e() {
        return getInt(cM(4, btki.a));
    }

    public final int f() {
        return getInt(cM(7, btki.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        int i;
        int[] iArr;
        long[] jArr;
        long[] jArr2;
        String[] strArr;
        int i2;
        long[] jArr3;
        int i3;
        int[] iArr2;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length == 0 || (length == 1 && dB[0] == -1)) {
            int i4 = engw.d;
            return enou.a;
        }
        HashSet hashSet = new HashSet();
        dtvs dtvsVar = this.d;
        boolean di = di(0);
        boolean z = dtvsVar.b;
        String[] strArr2 = di ? z ? (String[]) dtub.C(null, dt(getString(cM(0, btki.a))), new String[0]) : new String[]{k()} : null;
        dtsr.dz(length, strArr2, new emyl() { // from class: btjk
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(btjv.this.getString(0)));
            }
        });
        int[] z2 = di(1) ? z ? dtub.z(null, dr(getString(cM(1, btki.a)))) : new int[]{c()} : null;
        dtsr.dx(length, z2, new emyl() { // from class: btjn
            @Override // defpackage.emyl
            public final Object get() {
                return "worker_type:".concat(String.valueOf(btjv.this.getString(1)));
            }
        });
        int[] z3 = di(2) ? z ? dtub.z(null, dr(getString(cM(2, btki.a)))) : new int[]{g()} : null;
        dtsr.dx(length, z3, new emyl() { // from class: btjo
            @Override // defpackage.emyl
            public final Object get() {
                return "item_table_type:".concat(String.valueOf(btjv.this.getString(2)));
            }
        });
        String[] strArr3 = di(3) ? z ? (String[]) dtub.C(null, dt(getString(cM(3, btki.a))), new String[0]) : new String[]{l()} : null;
        dtsr.dz(length, strArr3, new emyl() { // from class: btjp
            @Override // defpackage.emyl
            public final Object get() {
                return "item_id:".concat(String.valueOf(btjv.this.getString(3)));
            }
        });
        int[] z4 = di(4) ? z ? dtub.z(null, dr(getString(cM(4, btki.a)))) : new int[]{e()} : null;
        dtsr.dx(length, z4, new emyl() { // from class: btjq
            @Override // defpackage.emyl
            public final Object get() {
                return "account_id:".concat(String.valueOf(btjv.this.getString(4)));
            }
        });
        boolean[] D = di(5) ? z ? dtub.D(null, du(getString(cM(5, btki.a)))) : new boolean[]{n()} : null;
        dtsr.dA(length, D, new emyl() { // from class: btjr
            @Override // defpackage.emyl
            public final Object get() {
                return "in_flight:".concat(String.valueOf(btjv.this.getString(5)));
            }
        });
        int[] z5 = di(6) ? z ? dtub.z(null, dr(getString(cM(6, btki.a)))) : new int[]{h()} : null;
        dtsr.dx(length, z5, new emyl() { // from class: btjs
            @Override // defpackage.emyl
            public final Object get() {
                return "retry_count:".concat(String.valueOf(btjv.this.getString(6)));
            }
        });
        if (!di(7)) {
            i = 0;
            iArr = null;
        } else if (z) {
            i = 0;
            iArr = dtub.z(null, dr(getString(cM(7, btki.a))));
        } else {
            i = 0;
            iArr = new int[]{f()};
        }
        dtsr.dx(length, iArr, new emyl() { // from class: btjt
            @Override // defpackage.emyl
            public final Object get() {
                return "flags:".concat(String.valueOf(btjv.this.getString(7)));
            }
        });
        if (!di(8)) {
            jArr = null;
        } else if (z) {
            jArr = dtub.B(null, ds(getString(cM(8, btki.a))));
        } else {
            long[] jArr4 = new long[1];
            jArr4[i] = j();
            jArr = jArr4;
        }
        dtsr.dy(length, jArr, new emyl() { // from class: btju
            @Override // defpackage.emyl
            public final Object get() {
                return "next_execute_timestamp:".concat(String.valueOf(btjv.this.getString(8)));
            }
        });
        if (!di(9)) {
            jArr2 = dB;
            strArr = null;
        } else if (z) {
            jArr2 = dB;
            strArr = (String[]) dtub.C(null, dt(getString(cM(9, btki.a))), new String[i]);
        } else {
            jArr2 = dB;
            strArr = new String[1];
            strArr[i] = m();
        }
        dtsr.dz(length, strArr, new emyl() { // from class: btjl
            @Override // defpackage.emyl
            public final Object get() {
                return "trigger_name:".concat(String.valueOf(btjv.this.getString(9)));
            }
        });
        long[] B = di(10) ? z ? dtub.B(null, ds(getString(cM(10, btki.a)))) : new long[]{i()} : null;
        dtsr.dy(length, B, new emyl() { // from class: btjm
            @Override // defpackage.emyl
            public final Object get() {
                return "enqueued_timestamp:".concat(String.valueOf(btjv.this.getString(10)));
            }
        });
        engr engrVar = new engr();
        int i5 = 0;
        while (i5 < length) {
            long j = jArr2[i5];
            if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                i2 = i5;
                jArr3 = jArr;
                i3 = length;
                iArr2 = iArr;
            } else {
                hashSet.add(Long.valueOf(jArr2[i5]));
                String[] strArr4 = btki.a;
                btik btikVar = new btik();
                btikVar.aF();
                btikVar.aD();
                long j2 = jArr2[i5];
                i2 = i5;
                if (strArr2 != null) {
                    String str = strArr2[i2];
                    jArr3 = jArr;
                    btikVar.aE(0);
                    btikVar.a = str;
                } else {
                    jArr3 = jArr;
                }
                if (z2 != null) {
                    btikVar.d(z2[i2]);
                }
                if (z3 != null) {
                    btikVar.c(z3[i2]);
                }
                if (strArr3 != null) {
                    btikVar.b(strArr3[i2]);
                }
                if (z4 != null) {
                    int i6 = z4[i2];
                    int i7 = btikVar.aB;
                    i3 = length;
                    if (i7 < 39020) {
                        dtub.w("account_id", i7);
                    }
                    btikVar.aE(4);
                    btikVar.e = i6;
                } else {
                    i3 = length;
                }
                if (D != null) {
                    boolean z6 = D[i2];
                    btikVar.aE(5);
                    btikVar.f = z6;
                }
                if (z5 != null) {
                    int i8 = z5[i2];
                    btikVar.aE(6);
                    btikVar.g = i8;
                }
                if (iArr != null) {
                    int i9 = iArr[i2];
                    int i10 = btikVar.aB;
                    if (i10 < 32000) {
                        dtub.w("flags", i10);
                    }
                    btikVar.aE(7);
                    btikVar.h = i9;
                }
                if (jArr3 != null) {
                    long j3 = jArr3[i2];
                    int i11 = btikVar.aB;
                    iArr2 = iArr;
                    if (i11 < 34000) {
                        dtub.w("next_execute_timestamp", i11);
                    }
                    btikVar.aE(8);
                    btikVar.i = j3;
                } else {
                    iArr2 = iArr;
                }
                if (strArr != null) {
                    String str2 = strArr[i2];
                    int i12 = btikVar.aB;
                    if (i12 < 59700) {
                        dtub.w("trigger_name", i12);
                    }
                    btikVar.aE(9);
                    btikVar.j = str2;
                }
                if (B != null) {
                    long j4 = B[i2];
                    int i13 = btikVar.aB;
                    if (i13 < 59970) {
                        dtub.w("enqueued_timestamp", i13);
                    }
                    btikVar.aE(10);
                    btikVar.k = j4;
                }
                engrVar.h(btikVar.a());
            }
            i5 = i2 + 1;
            jArr = jArr3;
            length = i3;
            iArr = iArr2;
        }
        return engrVar.g();
    }

    public final int g() {
        return getInt(cM(2, btki.a));
    }

    public final int h() {
        return getInt(cM(6, btki.a));
    }

    public final long i() {
        return getLong(cM(10, btki.a));
    }

    public final long j() {
        return getLong(cM(8, btki.a));
    }

    public final String k() {
        return getString(cM(0, btki.a));
    }

    public final String l() {
        return getString(cM(3, btki.a));
    }

    public final String m() {
        return getString(cM(9, btki.a));
    }

    public final boolean n() {
        return getInt(cM(5, btki.a)) == 1;
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
