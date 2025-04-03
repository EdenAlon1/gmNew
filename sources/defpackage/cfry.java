package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfry extends dtsr implements cfrt {
    @Deprecated
    public cfry(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, cfsb cfsbVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, cfsd.a, dtyoVar, dtvsVar, cfsbVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new cfrg();
    }

    public final long c() {
        return getLong(cM(2, cfsd.a));
    }

    public final String e() {
        return getString(cM(1, cfsd.a));
    }

    public final String f() {
        return getString(cM(0, cfsd.a));
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
                String[] strArr = di ? z ? (String[]) dtub.C(null, dt(getString(cM(0, cfsd.a))), new String[0]) : new String[]{f()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: cfru
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "identity_id:".concat(String.valueOf(cfry.this.getString(0)));
                    }
                });
                String[] strArr2 = di(1) ? z ? (String[]) dtub.C(null, dt(getString(cM(1, cfsd.a))), new String[0]) : new String[]{e()} : null;
                dtsr.dz(length, strArr2, new emyl() { // from class: cfrv
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "group_id:".concat(String.valueOf(cfry.this.getString(1)));
                    }
                });
                long[] B = di(2) ? z ? dtub.B(null, ds(getString(cM(2, cfsd.a)))) : new long[]{c()} : null;
                dtsr.dy(length, B, new emyl() { // from class: cfrw
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "era:".concat(String.valueOf(cfry.this.getString(2)));
                    }
                });
                byte[][] E = di(3) ? z ? dtub.E(null, dC(getString(cM(3, cfsd.a)))) : new byte[][]{g()} : null;
                dtsr.dz(length, E, new emyl() { // from class: cfrx
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "zinnia_state:".concat(String.valueOf(cfry.this.getString(3)));
                    }
                });
                engr engrVar = new engr();
                int i4 = 0;
                while (i4 < length) {
                    long j = dB[i4];
                    if (j <= 0 || hashSet2.contains(Long.valueOf(j))) {
                        i = length;
                        hashSet = hashSet2;
                    } else {
                        hashSet2.add(Long.valueOf(dB[i4]));
                        String[] strArr3 = cfsd.a;
                        cfri cfriVar = new cfri();
                        cfriVar.aF();
                        cfriVar.aD();
                        long j2 = dB[i4];
                        if (strArr != null) {
                            String str = strArr[i4];
                            cfriVar.aE(i3);
                            cfriVar.a = str;
                        }
                        if (strArr2 != null) {
                            String str2 = strArr2[i4];
                            cfriVar.aE(i2);
                            cfriVar.b = str2;
                        }
                        i = length;
                        if (B != null) {
                            long j3 = B[i4];
                            cfriVar.aE(2);
                            cfriVar.c = j3;
                        }
                        if (E != null) {
                            byte[] bArr = E[i4];
                            cfriVar.aE(3);
                            cfriVar.d = bArr;
                        }
                        cfrg cfrgVar = new cfrg();
                        cfrgVar.aC(cfriVar.aB());
                        cfrgVar.a = cfriVar.a;
                        cfrgVar.b = cfriVar.b;
                        hashSet = hashSet2;
                        cfrgVar.c = cfriVar.c;
                        cfrgVar.d = cfriVar.d;
                        cfrgVar.cK = cfriVar.aC();
                        engrVar.h(cfrgVar);
                    }
                    i4++;
                    length = i;
                    hashSet2 = hashSet;
                    i2 = 1;
                    i3 = 0;
                }
                return engrVar.g();
            }
        }
        int i5 = engw.d;
        return enou.a;
    }

    public final byte[] g() {
        return getBlob(cM(3, cfsd.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
