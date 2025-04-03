package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfpq extends dtsr implements cfpm {
    @Deprecated
    public cfpq(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, cfpt cfptVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, cfpv.a, dtyoVar, dtvsVar, cfptVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new cfpb();
    }

    public final Instant c() {
        return bdgw.b(getLong(cM(2, cfpv.a)));
    }

    public final byte[] e() {
        return getBlob(cM(0, cfpv.a));
    }

    public final byte[] f() {
        return getBlob(cM(1, cfpv.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
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
        Instant[] instantArr = null;
        byte[][] E = di ? z ? dtub.E(null, dC(getString(cM(0, cfpv.a)))) : new byte[][]{e()} : null;
        dtsr.dz(length, E, new emyl() { // from class: cfpn
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(cfpq.this.getString(0)));
            }
        });
        byte[][] E2 = di(1) ? z ? dtub.E(null, dC(getString(cM(1, cfpv.a)))) : new byte[][]{f()} : null;
        dtsr.dz(length, E2, new emyl() { // from class: cfpo
            @Override // defpackage.emyl
            public final Object get() {
                return "key_package:".concat(String.valueOf(cfpq.this.getString(1)));
            }
        });
        if (di(2)) {
            if (z) {
                long[] ds = ds(getString(cM(2, cfpv.a)));
                int length2 = ds.length;
                Instant[] instantArr2 = new Instant[length2];
                for (int i2 = 0; i2 < length2; i2++) {
                    instantArr2[i2] = bdgw.b(ds[i2]);
                }
                instantArr = (Instant[]) dtub.C(null, instantArr2, new Instant[0]);
            } else {
                instantArr = new Instant[]{c()};
            }
        }
        dtsr.dz(length, instantArr, new emyl() { // from class: cfpp
            @Override // defpackage.emyl
            public final Object get() {
                return "expiration_timestamp:".concat(String.valueOf(cfpq.this.getString(2)));
            }
        });
        engr engrVar = new engr();
        for (int i3 = 0; i3 < length; i3++) {
            long j = dB[i3];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(dB[i3]));
                String[] strArr = cfpv.a;
                cfpd cfpdVar = new cfpd();
                cfpdVar.aF();
                cfpdVar.aD();
                long j2 = dB[i3];
                if (E != null) {
                    byte[] bArr = E[i3];
                    cfpdVar.aE(0);
                    cfpdVar.a = bArr;
                }
                if (E2 != null) {
                    byte[] bArr2 = E2[i3];
                    cfpdVar.aE(1);
                    cfpdVar.b = bArr2;
                }
                if (instantArr != null) {
                    Instant instant = instantArr[i3];
                    cfpdVar.aE(2);
                    cfpdVar.c = instant;
                }
                cfpb cfpbVar = new cfpb();
                cfpbVar.aC(cfpdVar.aB());
                cfpbVar.a = cfpdVar.a;
                cfpbVar.b = cfpdVar.b;
                cfpbVar.c = cfpdVar.c;
                cfpbVar.cK = cfpdVar.aC();
                engrVar.h(cfpbVar);
            }
        }
        return engrVar.g();
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
