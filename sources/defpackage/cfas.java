package defpackage;

import android.database.Cursor;
import j$.util.Optional;
import java.util.Date;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfas extends dtsr implements cfag {
    @Deprecated
    public cfas(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, cfay cfayVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, cfbf.a, dtyoVar, dtvsVar, cfayVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new cezf();
    }

    @Override // defpackage.cfag
    public final long c() {
        return getLong(cM(4, cfbf.a));
    }

    @Override // defpackage.cfag
    public final String e() {
        if (isNull(cM(5, cfbf.a))) {
            throw new IllegalStateException("found null in cursor for column queue");
        }
        return getString(cM(5, cfbf.a));
    }

    @Override // defpackage.cfag
    public final String f() {
        return getString(cM(1, cfbf.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        String[] strArr;
        int i;
        boolean[] zArr;
        long[] jArr;
        Optional[] optionalArr;
        Date[] dateArr;
        Date[] dateArr2;
        int i2;
        boolean[] zArr2;
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
        long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, cfbf.a)))) : new long[]{i()} : null;
        dtsr.dy(length, B, new emyl() { // from class: cfah
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(cfas.this.getString(0)));
            }
        });
        String[] strArr2 = di(1) ? z ? (String[]) dtub.C(null, dt(getString(cM(1, cfbf.a))), new String[0]) : new String[]{f()} : null;
        dtsr.dz(length, strArr2, new emyl() { // from class: cfak
            @Override // defpackage.emyl
            public final Object get() {
                return "type:".concat(String.valueOf(cfas.this.getString(1)));
            }
        });
        byte[][] E = di(2) ? z ? dtub.E(null, dC(getString(cM(2, cfbf.a)))) : new byte[][]{n()} : null;
        dtsr.dz(length, E, new emyl() { // from class: cfal
            @Override // defpackage.emyl
            public final Object get() {
                return "rawdata:".concat(String.valueOf(cfas.this.getString(2)));
            }
        });
        int[] z2 = di(3) ? z ? dtub.z(null, dr(getString(cM(3, cfbf.a)))) : new int[]{h()} : null;
        dtsr.dx(length, z2, new emyl() { // from class: cfam
            @Override // defpackage.emyl
            public final Object get() {
                return "attempts:".concat(String.valueOf(cfas.this.getString(3)));
            }
        });
        long[] B2 = di(4) ? z ? dtub.B(null, ds(getString(cM(4, cfbf.a)))) : new long[]{c()} : null;
        dtsr.dy(length, B2, new emyl() { // from class: cfan
            @Override // defpackage.emyl
            public final Object get() {
                return "timestamp:".concat(String.valueOf(cfas.this.getString(4)));
            }
        });
        if (!di(5)) {
            strArr = null;
        } else if (!z) {
            strArr = new String[]{e()};
        } else {
            if (isNull(cM(5, cfbf.a))) {
                throw new IllegalStateException("found null in cursor for column queue");
            }
            strArr = (String[]) dtub.C(null, dt(getString(cM(5, cfbf.a))), new String[0]);
        }
        dtsr.dz(length, strArr, new emyl() { // from class: cfao
            @Override // defpackage.emyl
            public final Object get() {
                return "queue:".concat(String.valueOf(cfas.this.getString(5)));
            }
        });
        String[] strArr3 = di(6) ? z ? (String[]) dtub.C(null, dt(getString(cM(6, cfbf.a))), new String[0]) : new String[]{l()} : null;
        dtsr.dz(length, strArr3, new emyl() { // from class: cfap
            @Override // defpackage.emyl
            public final Object get() {
                return "deduplication_tag:".concat(String.valueOf(cfas.this.getString(6)));
            }
        });
        if (!di(7)) {
            i = 0;
            zArr = null;
        } else if (z) {
            i = 0;
            zArr = dtub.D(null, du(getString(cM(7, cfbf.a))));
        } else {
            i = 0;
            zArr = new boolean[]{m()};
        }
        dtsr.dA(length, zArr, new emyl() { // from class: cfaq
            @Override // defpackage.emyl
            public final Object get() {
                return "scheduled_in_workmanager:".concat(String.valueOf(cfas.this.getString(7)));
            }
        });
        if (!di(8)) {
            jArr = dB;
            optionalArr = null;
        } else if (z) {
            String[] dt = dt(getString(cM(8, cfbf.a)));
            int length2 = dt.length;
            Optional[] optionalArr2 = new Optional[length2];
            jArr = dB;
            for (int i4 = i; i4 < length2; i4++) {
                optionalArr2[i4] = bdhj.a(dt[i4]);
            }
            optionalArr = (Optional[]) dtub.C(null, optionalArr2, new Optional[i]);
        } else {
            jArr = dB;
            Optional[] optionalArr3 = new Optional[1];
            optionalArr3[i] = j();
            optionalArr = optionalArr3;
        }
        dtsr.dz(length, optionalArr, new emyl() { // from class: cfar
            @Override // defpackage.emyl
            public final Object get() {
                return "workmanager_id:".concat(String.valueOf(cfas.this.getString(8)));
            }
        });
        if (!di(9)) {
            dateArr = null;
        } else if (z) {
            long[] ds = ds(getString(cM(9, cfbf.a)));
            int length3 = ds.length;
            Date[] dateArr3 = new Date[length3];
            for (int i5 = 0; i5 < length3; i5++) {
                dateArr3[i5] = bdgs.b(ds[i5]);
            }
            dateArr = (Date[]) dtub.C(null, dateArr3, new Date[0]);
        } else {
            dateArr = new Date[]{g()};
        }
        dtsr.dz(length, dateArr, new emyl() { // from class: cfai
            @Override // defpackage.emyl
            public final Object get() {
                return "minimum_start_time:".concat(String.valueOf(cfas.this.getString(9)));
            }
        });
        String[] strArr4 = di(10) ? z ? (String[]) dtub.C(null, dt(getString(cM(10, cfbf.a))), new String[0]) : new String[]{k()} : null;
        dtsr.dz(length, strArr4, new emyl() { // from class: cfaj
            @Override // defpackage.emyl
            public final Object get() {
                return "cancellation_tag:".concat(String.valueOf(cfas.this.getString(10)));
            }
        });
        engr engrVar = new engr();
        int i6 = 0;
        while (i6 < length) {
            long j = jArr[i6];
            if (j <= 0 || hashSet2.contains(Long.valueOf(j))) {
                dateArr2 = dateArr;
                i2 = length;
                zArr2 = zArr;
                hashSet = hashSet2;
            } else {
                hashSet2.add(Long.valueOf(jArr[i6]));
                String[] strArr5 = cfbf.a;
                cezh cezhVar = new cezh();
                cezhVar.aF();
                cezhVar.aD();
                long j2 = jArr[i6];
                if (B != null) {
                    i2 = length;
                    zArr2 = zArr;
                    long j3 = B[i6];
                    dateArr2 = dateArr;
                    cezhVar.aE(0);
                    cezhVar.a = j3;
                } else {
                    dateArr2 = dateArr;
                    i2 = length;
                    zArr2 = zArr;
                }
                if (strArr2 != null) {
                    cezhVar.h(strArr2[i6]);
                }
                if (E != null) {
                    cezhVar.f(E[i6]);
                }
                if (z2 != null) {
                    int i7 = z2[i6];
                    cezhVar.aE(3);
                    cezhVar.d = i7;
                }
                hashSet = hashSet2;
                if (B2 != null) {
                    cezhVar.g(B2[i6]);
                }
                if (strArr != null) {
                    cezhVar.e(strArr[i6]);
                }
                if (strArr3 != null) {
                    cezhVar.c(strArr3[i6]);
                }
                if (zArr2 != null) {
                    boolean z3 = zArr2[i6];
                    int i8 = cezhVar.aB;
                    if (i8 < 45030) {
                        dtub.w("scheduled_in_workmanager", i8);
                    }
                    cezhVar.aE(7);
                    cezhVar.h = z3;
                }
                if (optionalArr != null) {
                    Optional optional = optionalArr[i6];
                    int i9 = cezhVar.aB;
                    if (i9 < 46060) {
                        dtub.w("workmanager_id", i9);
                    }
                    cezhVar.aE(8);
                    cezhVar.i = optional;
                }
                if (dateArr2 != null) {
                    cezhVar.d(dateArr2[i6]);
                }
                if (strArr4 != null) {
                    cezhVar.b(strArr4[i6]);
                }
                engrVar.h(cezhVar.a());
            }
            i6++;
            hashSet2 = hashSet;
            length = i2;
            zArr = zArr2;
            dateArr = dateArr2;
        }
        return engrVar.g();
    }

    @Override // defpackage.cfag
    public final Date g() {
        return bdgs.b(getLong(cM(9, cfbf.a)));
    }

    public final int h() {
        return getInt(cM(3, cfbf.a));
    }

    public final long i() {
        return getLong(cM(0, cfbf.a));
    }

    public final Optional j() {
        return bdhj.a(getString(cM(8, cfbf.a)));
    }

    public final String k() {
        return getString(cM(10, cfbf.a));
    }

    public final String l() {
        return getString(cM(6, cfbf.a));
    }

    public final boolean m() {
        return getInt(cM(7, cfbf.a)) == 1;
    }

    public final byte[] n() {
        return getBlob(cM(2, cfbf.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
