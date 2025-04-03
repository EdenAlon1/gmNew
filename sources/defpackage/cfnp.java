package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfnp extends dtsr implements cfnj {
    @Deprecated
    public cfnp(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, cfnt cfntVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, cfnv.a, dtyoVar, dtvsVar, cfntVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new cfmu();
    }

    public final long c() {
        return getLong(cM(2, cfnv.a));
    }

    public final Instant e() {
        return bdgw.b(getLong(cM(4, cfnv.a)));
    }

    public final String f() {
        return getString(cM(1, cfnv.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        int i;
        HashSet hashSet;
        dtyq dtyqVar = dtvnVar.a;
        int i2 = 1;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            int i3 = 0;
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet2 = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                Instant[] instantArr = null;
                String[] strArr = di ? z ? (String[]) dtub.C(null, dt(getString(cM(0, cfnv.a))), new String[0]) : new String[]{g()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: cfnk
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "identity_id:".concat(String.valueOf(cfnp.this.getString(0)));
                    }
                });
                String[] strArr2 = di(1) ? z ? (String[]) dtub.C(null, dt(getString(cM(1, cfnv.a))), new String[0]) : new String[]{f()} : null;
                dtsr.dz(length, strArr2, new emyl() { // from class: cfnl
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "group_id:".concat(String.valueOf(cfnp.this.getString(1)));
                    }
                });
                long[] B = di(2) ? z ? dtub.B(null, ds(getString(cM(2, cfnv.a)))) : new long[]{c()} : null;
                dtsr.dy(length, B, new emyl() { // from class: cfnm
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "epoch_id:".concat(String.valueOf(cfnp.this.getString(2)));
                    }
                });
                byte[][] E = di(3) ? z ? dtub.E(null, dC(getString(cM(3, cfnv.a)))) : new byte[][]{h()} : null;
                dtsr.dz(length, E, new emyl() { // from class: cfnn
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "epoch_data:".concat(String.valueOf(cfnp.this.getString(3)));
                    }
                });
                if (di(4)) {
                    if (z) {
                        long[] ds = ds(getString(cM(4, cfnv.a)));
                        int length2 = ds.length;
                        Instant[] instantArr2 = new Instant[length2];
                        for (int i4 = 0; i4 < length2; i4++) {
                            instantArr2[i4] = bdgw.b(ds[i4]);
                        }
                        instantArr = (Instant[]) dtub.C(null, instantArr2, new Instant[0]);
                    } else {
                        instantArr = new Instant[]{e()};
                    }
                }
                dtsr.dz(length, instantArr, new emyl() { // from class: cfno
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "creation_timestamp:".concat(String.valueOf(cfnp.this.getString(4)));
                    }
                });
                engr engrVar = new engr();
                int i5 = 0;
                while (i5 < length) {
                    long j = dB[i5];
                    if (j <= 0 || hashSet2.contains(Long.valueOf(j))) {
                        i = length;
                        hashSet = hashSet2;
                    } else {
                        hashSet2.add(Long.valueOf(dB[i5]));
                        String[] strArr3 = cfnv.a;
                        cfmw cfmwVar = new cfmw();
                        cfmwVar.aF();
                        cfmwVar.aD();
                        long j2 = dB[i5];
                        if (strArr != null) {
                            String str = strArr[i5];
                            cfmwVar.aE(i3);
                            cfmwVar.a = str;
                        }
                        if (strArr2 != null) {
                            String str2 = strArr2[i5];
                            cfmwVar.aE(i2);
                            cfmwVar.b = str2;
                        }
                        i = length;
                        if (B != null) {
                            long j3 = B[i5];
                            cfmwVar.aE(2);
                            cfmwVar.c = j3;
                        }
                        if (E != null) {
                            byte[] bArr = E[i5];
                            cfmwVar.aE(3);
                            cfmwVar.d = bArr;
                        }
                        if (instantArr != null) {
                            Instant instant = instantArr[i5];
                            cfmwVar.aE(4);
                            cfmwVar.e = instant;
                        }
                        cfmu cfmuVar = new cfmu();
                        cfmuVar.aC(cfmwVar.aB());
                        cfmuVar.a = cfmwVar.a;
                        cfmuVar.b = cfmwVar.b;
                        hashSet = hashSet2;
                        cfmuVar.c = cfmwVar.c;
                        cfmuVar.d = cfmwVar.d;
                        cfmuVar.e = cfmwVar.e;
                        cfmuVar.cK = cfmwVar.aC();
                        engrVar.h(cfmuVar);
                    }
                    i5++;
                    length = i;
                    hashSet2 = hashSet;
                    i2 = 1;
                    i3 = 0;
                }
                return engrVar.g();
            }
        }
        int i6 = engw.d;
        return enou.a;
    }

    public final String g() {
        return getString(cM(0, cfnv.a));
    }

    public final byte[] h() {
        return getBlob(cM(3, cfnv.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
