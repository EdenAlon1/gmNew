package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azje extends dtsr implements aziu {
    @Deprecated
    public azje(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, azji azjiVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, azjm.a, dtyoVar, dtvsVar, azjiVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new azhw();
    }

    public final azcr c() {
        return azcs.a(getString(cM(0, azjm.a)));
    }

    public final azfm e() {
        azfm[] values = azfm.values();
        int i = getInt(cM(5, azjm.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final azhr f() {
        azhr[] values = azhr.values();
        int i = getInt(cM(1, azjm.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        azcr[] azcrVarArr;
        azhr[] azhrVarArr;
        azfm[] azfmVarArr;
        long[] jArr;
        byte[][] bArr;
        cknh[] cknhVarArr;
        int i;
        Instant[] instantArr;
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
        if (!di) {
            azcrVarArr = null;
        } else if (z) {
            String[] dt = dt(getString(cM(0, azjm.a)));
            int length2 = dt.length;
            azcr[] azcrVarArr2 = new azcr[length2];
            for (int i3 = 0; i3 < length2; i3++) {
                azcrVarArr2[i3] = azcs.a(dt[i3]);
            }
            azcrVarArr = (azcr[]) dtub.C(null, azcrVarArr2, new azcr[0]);
        } else {
            azcrVarArr = new azcr[]{c()};
        }
        dtsr.dz(length, azcrVarArr, new emyl() { // from class: aziv
            @Override // defpackage.emyl
            public final Object get() {
                return "token:".concat(String.valueOf(azje.this.getString(0)));
            }
        });
        if (!di(1)) {
            azhrVarArr = null;
        } else if (z) {
            int[] dr = dr(getString(cM(1, azjm.a)));
            azhr[] values = azhr.values();
            int length3 = values.length;
            azhr[] azhrVarArr2 = new azhr[dr.length];
            for (int i4 = 0; i4 < dr.length; i4++) {
                int i5 = dr[i4];
                if (i5 >= length3) {
                    throw new IllegalStateException();
                }
                azhrVarArr2[i4] = values[i5];
            }
            azhrVarArr = (azhr[]) dtub.C(null, azhrVarArr2, new azhr[0]);
        } else {
            azhrVarArr = new azhr[]{f()};
        }
        dtsr.dz(length, azhrVarArr, new emyl() { // from class: aziw
            @Override // defpackage.emyl
            public final Object get() {
                return "group_type:".concat(String.valueOf(azje.this.getString(1)));
            }
        });
        String[] strArr = di(2) ? z ? (String[]) dtub.C(null, dt(getString(cM(2, azjm.a))), new String[0]) : new String[]{j()} : null;
        dtsr.dz(length, strArr, new emyl() { // from class: azix
            @Override // defpackage.emyl
            public final Object get() {
                return "rcs_conference_uri:".concat(String.valueOf(azje.this.getString(2)));
            }
        });
        String[] strArr2 = di(3) ? z ? (String[]) dtub.C(null, dt(getString(cM(3, azjm.a))), new String[0]) : new String[]{i()} : null;
        dtsr.dz(length, strArr2, new emyl() { // from class: aziy
            @Override // defpackage.emyl
            public final Object get() {
                return "name:".concat(String.valueOf(azje.this.getString(3)));
            }
        });
        String[] strArr3 = di(4) ? z ? (String[]) dtub.C(null, dt(getString(cM(4, azjm.a))), new String[0]) : new String[]{k()} : null;
        dtsr.dz(length, strArr3, new emyl() { // from class: aziz
            @Override // defpackage.emyl
            public final Object get() {
                return "rcs_icon_url:".concat(String.valueOf(azje.this.getString(4)));
            }
        });
        if (!di(5)) {
            azfmVarArr = null;
        } else if (z) {
            int[] dr2 = dr(getString(cM(5, azjm.a)));
            azfm[] values2 = azfm.values();
            int length4 = values2.length;
            azfm[] azfmVarArr2 = new azfm[dr2.length];
            for (int i6 = 0; i6 < dr2.length; i6++) {
                int i7 = dr2[i6];
                if (i7 >= length4) {
                    throw new IllegalStateException();
                }
                azfmVarArr2[i6] = values2[i7];
            }
            azfmVarArr = (azfm[]) dtub.C(null, azfmVarArr2, new azfm[0]);
        } else {
            azfmVarArr = new azfm[]{e()};
        }
        dtsr.dz(length, azfmVarArr, new emyl() { // from class: azja
            @Override // defpackage.emyl
            public final Object get() {
                return "rcs_group_state:".concat(String.valueOf(azje.this.getString(5)));
            }
        });
        byte[][] E = di(6) ? z ? dtub.E(null, dC(getString(cM(6, azjm.a)))) : new byte[][]{l()} : null;
        dtsr.dz(length, E, new emyl() { // from class: azjb
            @Override // defpackage.emyl
            public final Object get() {
                return "tachygram_group_routing_token:".concat(String.valueOf(azje.this.getString(6)));
            }
        });
        if (!di(7)) {
            jArr = dB;
            bArr = E;
            cknhVarArr = null;
        } else if (z) {
            long[] ds = ds(getString(cM(7, azjm.a)));
            int length5 = ds.length;
            cknh[] cknhVarArr2 = new cknh[length5];
            int i8 = 0;
            while (i8 < length5) {
                cknhVarArr2[i8] = new cknh(ds[i8]);
                i8++;
                dB = dB;
                E = E;
                ds = ds;
            }
            jArr = dB;
            bArr = E;
            cknhVarArr = (cknh[]) dtub.C(null, cknhVarArr2, new cknh[0]);
        } else {
            jArr = dB;
            bArr = E;
            cknhVarArr = new cknh[]{g()};
        }
        dtsr.dz(length, cknhVarArr, new emyl() { // from class: azjc
            @Override // defpackage.emyl
            public final Object get() {
                return "rcs_group_capabilities:".concat(String.valueOf(azje.this.getString(7)));
            }
        });
        if (!di(8)) {
            i = 0;
            instantArr = null;
        } else if (z) {
            long[] ds2 = ds(getString(cM(8, azjm.a)));
            int length6 = ds2.length;
            Instant[] instantArr2 = new Instant[length6];
            for (int i9 = 0; i9 < length6; i9++) {
                instantArr2[i9] = bdgw.b(ds2[i9]);
            }
            i = 0;
            instantArr = (Instant[]) dtub.C(null, instantArr2, new Instant[0]);
        } else {
            i = 0;
            instantArr = new Instant[]{h()};
        }
        dtsr.dz(length, instantArr, new emyl() { // from class: azjd
            @Override // defpackage.emyl
            public final Object get() {
                return "rcs_group_last_sync_timestamp:".concat(String.valueOf(azje.this.getString(8)));
            }
        });
        engr engrVar = new engr();
        while (i < length) {
            long j = jArr[i];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArr[i]));
                String[] strArr4 = azjm.a;
                azhy azhyVar = new azhy();
                azhyVar.aF();
                azhyVar.aD();
                long j2 = jArr[i];
                if (azcrVarArr != null) {
                    azhyVar.j(azcrVarArr[i]);
                }
                if (azhrVarArr != null) {
                    azhyVar.b(azhrVarArr[i]);
                }
                if (strArr != null) {
                    azhyVar.d(strArr[i]);
                }
                if (strArr2 != null) {
                    azhyVar.c(strArr2[i]);
                }
                if (strArr3 != null) {
                    azhyVar.h(strArr3[i]);
                }
                if (azfmVarArr != null) {
                    azhyVar.g(azfmVarArr[i]);
                }
                if (bArr != null) {
                    azhyVar.i(bArr[i]);
                }
                if (cknhVarArr != null) {
                    azhyVar.e(cknhVarArr[i]);
                }
                if (instantArr != null) {
                    azhyVar.f(instantArr[i]);
                }
                engrVar.h(azhyVar.a());
            }
            i++;
        }
        return engrVar.g();
    }

    public final cknh g() {
        return new cknh(getLong(cM(7, azjm.a)));
    }

    public final Instant h() {
        return bdgw.b(getLong(cM(8, azjm.a)));
    }

    public final String i() {
        return getString(cM(3, azjm.a));
    }

    public final String j() {
        return getString(cM(2, azjm.a));
    }

    public final String k() {
        return getString(cM(4, azjm.a));
    }

    public final byte[] l() {
        return getBlob(cM(6, azjm.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
