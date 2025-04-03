package defpackage;

import android.database.Cursor;
import java.util.HashSet;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bunt extends dtsr implements bunm {
    @Deprecated
    public bunt(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, buny bunyVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, buoc.a, dtyoVar, dtvsVar, bunyVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bumt();
    }

    @Override // defpackage.bunm
    public final int c() {
        return getInt(cM(3, buoc.a));
    }

    @Override // defpackage.bunm
    public final long e() {
        return getLong(cM(2, buoc.a));
    }

    @Override // defpackage.bunm
    public final aliu f() {
        aliu[] values = aliu.values();
        int i = getInt(cM(4, buoc.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        aliu[] aliuVarArr;
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
        long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, buoc.a)))) : new long[]{i()} : null;
        dtsr.dy(length, B, new emyl() { // from class: bunn
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(bunt.this.getString(0)));
            }
        });
        String[] strArr = di(1) ? z ? (String[]) dtub.C(null, dt(getString(cM(1, buoc.a))), new String[0]) : new String[]{h()} : null;
        dtsr.dz(length, strArr, new emyl() { // from class: buno
            @Override // defpackage.emyl
            public final Object get() {
                return "message_id:".concat(String.valueOf(bunt.this.getString(1)));
            }
        });
        long[] B2 = di(2) ? z ? dtub.B(null, ds(getString(cM(2, buoc.a)))) : new long[]{e()} : null;
        dtsr.dy(length, B2, new emyl() { // from class: bunp
            @Override // defpackage.emyl
            public final Object get() {
                return "timestamp:".concat(String.valueOf(bunt.this.getString(2)));
            }
        });
        int[] z2 = di(3) ? z ? dtub.z(null, dr(getString(cM(3, buoc.a)))) : new int[]{c()} : null;
        dtsr.dx(length, z2, new emyl() { // from class: bunq
            @Override // defpackage.emyl
            public final Object get() {
                return "status:".concat(String.valueOf(bunt.this.getString(3)));
            }
        });
        if (!di(4)) {
            aliuVarArr = null;
        } else if (z) {
            int[] dr = dr(getString(cM(4, buoc.a)));
            aliu[] values = aliu.values();
            int length2 = values.length;
            aliu[] aliuVarArr2 = new aliu[dr.length];
            for (int i2 = 0; i2 < dr.length; i2++) {
                int i3 = dr[i2];
                if (i3 >= length2) {
                    throw new IllegalStateException();
                }
                aliuVarArr2[i2] = values[i3];
            }
            aliuVarArr = (aliu[]) dtub.C(null, aliuVarArr2, new aliu[0]);
        } else {
            aliuVarArr = new aliu[]{f()};
        }
        dtsr.dz(length, aliuVarArr, new emyl() { // from class: bunr
            @Override // defpackage.emyl
            public final Object get() {
                return "custom_status:".concat(String.valueOf(bunt.this.getString(4)));
            }
        });
        String[] strArr2 = di(5) ? z ? (String[]) dtub.C(null, dt(getString(cM(5, buoc.a))), new String[0]) : new String[]{g()} : null;
        dtsr.dz(length, strArr2, new emyl() { // from class: buns
            @Override // defpackage.emyl
            public final Object get() {
                return "data:".concat(String.valueOf(bunt.this.getString(5)));
            }
        });
        engr engrVar = new engr();
        for (int i4 = 0; i4 < length; i4++) {
            long j = dB[i4];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(dB[i4]));
                String[] strArr3 = buoc.a;
                bumx bumxVar = new bumx();
                bumxVar.aF();
                bumxVar.aD();
                long j2 = dB[i4];
                if (B != null) {
                    long j3 = B[i4];
                    bumxVar.aE(0);
                    bumxVar.a = j3;
                }
                if (strArr != null) {
                    bumxVar.e(strArr[i4]);
                }
                if (B2 != null) {
                    bumxVar.g(B2[i4]);
                }
                if (z2 != null) {
                    bumxVar.f(z2[i4]);
                }
                if (aliuVarArr != null) {
                    bumxVar.c(aliuVarArr[i4]);
                }
                if (strArr2 != null) {
                    bumxVar.d(strArr2[i4]);
                }
                engrVar.h(bumxVar.a(new Supplier() { // from class: bumu
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new bumt();
                    }
                }));
            }
        }
        return engrVar.g();
    }

    @Override // defpackage.bunm
    public final String g() {
        return getString(cM(5, buoc.a));
    }

    @Override // defpackage.bunm
    public final String h() {
        return getString(cM(1, buoc.a));
    }

    public final long i() {
        return getLong(cM(0, buoc.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
