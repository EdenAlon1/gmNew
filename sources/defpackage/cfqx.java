package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfqx extends dtsr implements cfqq {
    @Deprecated
    public cfqx(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, cfra cfraVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, cfrc.a, dtyoVar, dtvsVar, cfraVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new cfpz();
    }

    public final bdhg c() {
        return bdhg.a(getString(cM(1, cfrc.a)));
    }

    public final cfsg e() {
        cfsg[] values = cfsg.values();
        int i = getInt(cM(4, cfrc.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final Instant f() {
        return bdgw.b(getLong(cM(5, cfrc.a)));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        bdhg[] bdhgVarArr;
        cfsg[] cfsgVarArr;
        Instant[] instantArr;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            int i = 0;
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                String[] strArr = di ? z ? (String[]) dtub.C(null, dt(getString(cM(0, cfrc.a))), new String[0]) : new String[]{h()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: cfqr
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "self_identity:".concat(String.valueOf(cfqx.this.getString(0)));
                    }
                });
                if (!di(1)) {
                    bdhgVarArr = null;
                } else if (z) {
                    String[] dt = dt(getString(cM(1, cfrc.a)));
                    int length2 = dt.length;
                    bdhg[] bdhgVarArr2 = new bdhg[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        bdhgVarArr2[i2] = bdhg.a(dt[i2]);
                    }
                    bdhgVarArr = (bdhg[]) dtub.C(null, bdhgVarArr2, new bdhg[0]);
                } else {
                    bdhgVarArr = new bdhg[]{c()};
                }
                dtsr.dz(length, bdhgVarArr, new emyl() { // from class: cfqs
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "rcs_message_id:".concat(String.valueOf(cfqx.this.getString(1)));
                    }
                });
                String[] strArr2 = di(2) ? z ? (String[]) dtub.C(null, dt(getString(cM(2, cfrc.a))), new String[0]) : new String[]{g()} : null;
                dtsr.dz(length, strArr2, new emyl() { // from class: cfqt
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "remote_user_id:".concat(String.valueOf(cfqx.this.getString(2)));
                    }
                });
                byte[][] E = di(3) ? z ? dtub.E(null, dC(getString(cM(3, cfrc.a)))) : new byte[][]{i()} : null;
                dtsr.dz(length, E, new emyl() { // from class: cfqu
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "raw_content:".concat(String.valueOf(cfqx.this.getString(3)));
                    }
                });
                if (!di(4)) {
                    cfsgVarArr = null;
                } else if (z) {
                    int[] dr = dr(getString(cM(4, cfrc.a)));
                    cfsg[] values = cfsg.values();
                    int length3 = values.length;
                    cfsg[] cfsgVarArr2 = new cfsg[dr.length];
                    for (int i3 = 0; i3 < dr.length; i3++) {
                        int i4 = dr[i3];
                        if (i4 >= length3) {
                            throw new IllegalStateException();
                        }
                        cfsgVarArr2[i3] = values[i4];
                    }
                    cfsgVarArr = (cfsg[]) dtub.C(null, cfsgVarArr2, new cfsg[0]);
                } else {
                    cfsgVarArr = new cfsg[]{e()};
                }
                dtsr.dz(length, cfsgVarArr, new emyl() { // from class: cfqv
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "stage:".concat(String.valueOf(cfqx.this.getString(4)));
                    }
                });
                int i5 = 5;
                if (!di(5)) {
                    instantArr = null;
                } else if (z) {
                    long[] ds = ds(getString(cM(5, cfrc.a)));
                    int length4 = ds.length;
                    Instant[] instantArr2 = new Instant[length4];
                    for (int i6 = 0; i6 < length4; i6++) {
                        instantArr2[i6] = bdgw.b(ds[i6]);
                    }
                    instantArr = (Instant[]) dtub.C(null, instantArr2, new Instant[0]);
                } else {
                    instantArr = new Instant[]{f()};
                }
                dtsr.dz(length, instantArr, new emyl() { // from class: cfqw
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "sort_timestamp:".concat(String.valueOf(cfqx.this.getString(5)));
                    }
                });
                engr engrVar = new engr();
                int i7 = 0;
                while (i7 < length) {
                    long j = dB[i7];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(dB[i7]));
                        String[] strArr3 = cfrc.a;
                        cfqb cfqbVar = new cfqb();
                        cfqbVar.aF();
                        cfqbVar.aD();
                        long j2 = dB[i7];
                        if (strArr != null) {
                            String str = strArr[i7];
                            cfqbVar.aE(i);
                            cfqbVar.a = str;
                        }
                        if (bdhgVarArr != null) {
                            bdhg bdhgVar = bdhgVarArr[i7];
                            cfqbVar.aE(1);
                            cfqbVar.b = bdhgVar;
                        }
                        if (strArr2 != null) {
                            String str2 = strArr2[i7];
                            cfqbVar.aE(2);
                            cfqbVar.c = str2;
                        }
                        if (E != null) {
                            byte[] bArr = E[i7];
                            cfqbVar.aE(3);
                            cfqbVar.d = bArr;
                        }
                        if (cfsgVarArr != null) {
                            cfsg cfsgVar = cfsgVarArr[i7];
                            cfqbVar.aE(4);
                            cfqbVar.e = cfsgVar;
                        }
                        if (instantArr != null) {
                            Instant instant = instantArr[i7];
                            cfqbVar.aE(i5);
                            cfqbVar.f = instant;
                        }
                        cfpz cfpzVar = new cfpz();
                        cfpzVar.aC(cfqbVar.aB());
                        cfpzVar.a = cfqbVar.a;
                        cfpzVar.b = cfqbVar.b;
                        cfpzVar.c = cfqbVar.c;
                        cfpzVar.d = cfqbVar.d;
                        cfpzVar.e = cfqbVar.e;
                        cfpzVar.f = cfqbVar.f;
                        cfpzVar.cK = cfqbVar.aC();
                        engrVar.h(cfpzVar);
                    }
                    i7++;
                    i5 = 5;
                    i = 0;
                }
                return engrVar.g();
            }
        }
        int i8 = engw.d;
        return enou.a;
    }

    public final String g() {
        return getString(cM(2, cfrc.a));
    }

    public final String h() {
        return getString(cM(0, cfrc.a));
    }

    public final byte[] i() {
        return getBlob(cM(3, cfrc.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
