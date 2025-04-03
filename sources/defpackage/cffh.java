package defpackage;

import android.database.Cursor;
import j$.util.Optional;
import java.util.Date;
import java.util.HashSet;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cffh extends dtsr implements cfex {
    @Deprecated
    public cffh(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, cffn cffnVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, cfft.a, dtyoVar, dtvsVar, cffnVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new cfdy();
    }

    public final int c() {
        return getInt(cM(4, cfft.a));
    }

    public final Optional e() {
        return bdhj.a(getString(cM(1, cfft.a)));
    }

    public final String f() {
        return getString(cM(0, cfft.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        Optional[] optionalArr;
        Date[] dateArr;
        Date[] dateArr2;
        int i;
        boolean[] zArr;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length == 0 || (length == 1 && dB[0] == -1)) {
            int i2 = engw.d;
            return enou.a;
        }
        HashSet hashSet = new HashSet();
        dtvs dtvsVar = this.d;
        boolean di = di(0);
        boolean z = dtvsVar.b;
        boolean[] zArr2 = null;
        String[] strArr = di ? z ? (String[]) dtub.C(null, dt(getString(cM(0, cfft.a))), new String[0]) : new String[]{f()} : null;
        dtsr.dz(length, strArr, new emyl() { // from class: cfey
            @Override // defpackage.emyl
            public final Object get() {
                return "queue:".concat(String.valueOf(cffh.this.getString(0)));
            }
        });
        if (!di(1)) {
            optionalArr = null;
        } else if (z) {
            String[] dt = dt(getString(cM(1, cfft.a)));
            int length2 = dt.length;
            Optional[] optionalArr2 = new Optional[length2];
            for (int i3 = 0; i3 < length2; i3++) {
                optionalArr2[i3] = bdhj.a(dt[i3]);
            }
            optionalArr = (Optional[]) dtub.C(null, optionalArr2, new Optional[0]);
        } else {
            optionalArr = new Optional[]{e()};
        }
        dtsr.dz(length, optionalArr, new emyl() { // from class: cfez
            @Override // defpackage.emyl
            public final Object get() {
                return "workmanager_id:".concat(String.valueOf(cffh.this.getString(1)));
            }
        });
        if (!di(2)) {
            dateArr = null;
        } else if (z) {
            long[] ds = ds(getString(cM(2, cfft.a)));
            int length3 = ds.length;
            Date[] dateArr3 = new Date[length3];
            for (int i4 = 0; i4 < length3; i4++) {
                dateArr3[i4] = bdgs.b(ds[i4]);
            }
            dateArr = (Date[]) dtub.C(null, dateArr3, new Date[0]);
        } else {
            dateArr = new Date[]{h()};
        }
        dtsr.dz(length, dateArr, new emyl() { // from class: cffa
            @Override // defpackage.emyl
            public final Object get() {
                return "scheduled_at_time:".concat(String.valueOf(cffh.this.getString(2)));
            }
        });
        if (!di(3)) {
            dateArr2 = null;
        } else if (z) {
            long[] ds2 = ds(getString(cM(3, cfft.a)));
            int length4 = ds2.length;
            Date[] dateArr4 = new Date[length4];
            for (int i5 = 0; i5 < length4; i5++) {
                dateArr4[i5] = bdgs.b(ds2[i5]);
            }
            dateArr2 = (Date[]) dtub.C(null, dateArr4, new Date[0]);
        } else {
            dateArr2 = new Date[]{g()};
        }
        dtsr.dz(length, dateArr2, new emyl() { // from class: cffb
            @Override // defpackage.emyl
            public final Object get() {
                return "minimum_start_time:".concat(String.valueOf(cffh.this.getString(3)));
            }
        });
        int[] z2 = di(4) ? z ? dtub.z(null, dr(getString(cM(4, cfft.a)))) : new int[]{c()} : null;
        dtsr.dx(length, z2, new emyl() { // from class: cffc
            @Override // defpackage.emyl
            public final Object get() {
                return "requires_network_type:".concat(String.valueOf(cffh.this.getString(4)));
            }
        });
        boolean[] D = di(5) ? z ? dtub.D(null, du(getString(cM(5, cfft.a)))) : new boolean[]{j()} : null;
        dtsr.dA(length, D, new emyl() { // from class: cffd
            @Override // defpackage.emyl
            public final Object get() {
                return "requires_charging:".concat(String.valueOf(cffh.this.getString(5)));
            }
        });
        boolean[] D2 = di(6) ? z ? dtub.D(null, du(getString(cM(6, cfft.a)))) : new boolean[]{k()} : null;
        dtsr.dA(length, D2, new emyl() { // from class: cffe
            @Override // defpackage.emyl
            public final Object get() {
                return "requires_device_idle:".concat(String.valueOf(cffh.this.getString(6)));
            }
        });
        if (!di(7)) {
            i = 0;
            zArr = null;
        } else if (z) {
            i = 0;
            zArr = dtub.D(null, du(getString(cM(7, cfft.a))));
        } else {
            i = 0;
            zArr = new boolean[]{i()};
        }
        dtsr.dA(length, zArr, new emyl() { // from class: cfff
            @Override // defpackage.emyl
            public final Object get() {
                return "requires_battery_not_low:".concat(String.valueOf(cffh.this.getString(7)));
            }
        });
        if (di(8)) {
            if (z) {
                zArr2 = dtub.D(null, du(getString(cM(8, cfft.a))));
            } else {
                zArr2 = new boolean[1];
                zArr2[i] = l();
            }
        }
        dtsr.dA(length, zArr2, new emyl() { // from class: cffg
            @Override // defpackage.emyl
            public final Object get() {
                return "requires_storage_not_low:".concat(String.valueOf(cffh.this.getString(8)));
            }
        });
        engr engrVar = new engr();
        for (int i6 = i; i6 < length; i6++) {
            long j = dB[i6];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(dB[i6]));
                String[] strArr2 = cfft.a;
                cfec cfecVar = new cfec();
                cfecVar.aF();
                cfecVar.aD();
                long j2 = dB[i6];
                if (strArr != null) {
                    cfecVar.c(strArr[i6]);
                }
                if (optionalArr != null) {
                    cfecVar.j(optionalArr[i6]);
                }
                if (dateArr != null) {
                    cfecVar.i(dateArr[i6]);
                }
                if (dateArr2 != null) {
                    cfecVar.b(dateArr2[i6]);
                }
                if (z2 != null) {
                    cfecVar.g(z2[i6]);
                }
                if (D != null) {
                    cfecVar.e(D[i6]);
                }
                if (D2 != null) {
                    cfecVar.f(D2[i6]);
                }
                if (zArr != null) {
                    cfecVar.d(zArr[i6]);
                }
                if (zArr2 != null) {
                    cfecVar.h(zArr2[i6]);
                }
                engrVar.h(cfecVar.a(new Supplier() { // from class: cfdz
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new cfdy();
                    }
                }));
            }
        }
        return engrVar.g();
    }

    public final Date g() {
        return bdgs.b(getLong(cM(3, cfft.a)));
    }

    public final Date h() {
        return bdgs.b(getLong(cM(2, cfft.a)));
    }

    public final boolean i() {
        return getInt(cM(7, cfft.a)) == 1;
    }

    public final boolean j() {
        return getInt(cM(5, cfft.a)) == 1;
    }

    public final boolean k() {
        return getInt(cM(6, cfft.a)) == 1;
    }

    public final boolean l() {
        return getInt(cM(8, cfft.a)) == 1;
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
