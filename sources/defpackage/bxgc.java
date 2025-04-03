package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxgc extends dtsr implements bxfs {
    @Deprecated
    public bxgc(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bxgf bxgfVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bxgl.a, dtyoVar, dtvsVar, bxgfVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bxev();
    }

    public final long c() {
        return getLong(cM(6, bxgl.a));
    }

    public final bdhd e() {
        return new bdhd(getLong(cM(3, bxgl.a)));
    }

    public final Instant f() {
        return bdgw.b(getLong(cM(7, bxgl.a)));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        int i;
        bdhd[] bdhdVarArr;
        Instant[] instantArr;
        Instant[] instantArr2;
        int i2;
        boolean[] zArr;
        long[] jArr;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                String[] strArr = di ? z ? (String[]) dtub.C(null, dt(getString(cM(0, bxgl.a))), new String[0]) : new String[]{h()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: bxft
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "tachyon_registration_id:".concat(String.valueOf(bxgc.this.getString(0)));
                    }
                });
                boolean[] D = di(1) ? z ? dtub.D(null, du(getString(cM(1, bxgl.a)))) : new boolean[]{i()} : null;
                dtsr.dA(length, D, new emyl() { // from class: bxfu
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "etouffee:".concat(String.valueOf(bxgc.this.getString(1)));
                    }
                });
                boolean[] D2 = di(2) ? z ? dtub.D(null, du(getString(cM(2, bxgl.a)))) : new boolean[]{j()} : null;
                dtsr.dA(length, D2, new emyl() { // from class: bxfv
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "better_etouffee:".concat(String.valueOf(bxgc.this.getString(2)));
                    }
                });
                if (!di(3)) {
                    i = length;
                    bdhdVarArr = null;
                } else if (z) {
                    long[] ds = ds(getString(cM(3, bxgl.a)));
                    int length2 = ds.length;
                    bdhd[] bdhdVarArr2 = new bdhd[length2];
                    int i3 = 0;
                    while (i3 < length2) {
                        bdhdVarArr2[i3] = new bdhd(ds[i3]);
                        i3++;
                        length = length;
                    }
                    i = length;
                    bdhdVarArr = (bdhd[]) dtub.C(null, bdhdVarArr2, new bdhd[0]);
                } else {
                    i = length;
                    bdhdVarArr = new bdhd[]{e()};
                }
                dtsr.dz(i, bdhdVarArr, new emyl() { // from class: bxfw
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "messages_feature_hash:".concat(String.valueOf(bxgc.this.getString(3)));
                    }
                });
                if (!di(4)) {
                    instantArr = null;
                } else if (z) {
                    long[] ds2 = ds(getString(cM(4, bxgl.a)));
                    int length3 = ds2.length;
                    Instant[] instantArr3 = new Instant[length3];
                    for (int i4 = 0; i4 < length3; i4++) {
                        instantArr3[i4] = bdgw.b(ds2[i4]);
                    }
                    instantArr = (Instant[]) dtub.C(null, instantArr3, new Instant[0]);
                } else {
                    instantArr = new Instant[]{g()};
                }
                dtsr.dz(i, instantArr, new emyl() { // from class: bxfx
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "last_modified_timestamp:".concat(String.valueOf(bxgc.this.getString(4)));
                    }
                });
                byte[][] E = di(5) ? z ? dtub.E(null, dC(getString(cM(5, bxgl.a)))) : new byte[][]{l()} : null;
                dtsr.dz(i, E, new emyl() { // from class: bxfy
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "identity_key:".concat(String.valueOf(bxgc.this.getString(5)));
                    }
                });
                long[] B = di(6) ? z ? dtub.B(null, ds(getString(cM(6, bxgl.a)))) : new long[]{c()} : null;
                dtsr.dy(i, B, new emyl() { // from class: bxfz
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "updated_at_hash:".concat(String.valueOf(bxgc.this.getString(6)));
                    }
                });
                if (!di(7)) {
                    instantArr2 = null;
                } else if (z) {
                    long[] ds3 = ds(getString(cM(7, bxgl.a)));
                    int length4 = ds3.length;
                    Instant[] instantArr4 = new Instant[length4];
                    for (int i5 = 0; i5 < length4; i5++) {
                        instantArr4[i5] = bdgw.b(ds3[i5]);
                    }
                    instantArr2 = (Instant[]) dtub.C(null, instantArr4, new Instant[0]);
                } else {
                    instantArr2 = new Instant[]{f()};
                }
                dtsr.dz(i, instantArr2, new emyl() { // from class: bxga
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "guaranteed_fresh_as_of_timestamp:".concat(String.valueOf(bxgc.this.getString(7)));
                    }
                });
                if (!di(8)) {
                    i2 = 0;
                    zArr = null;
                } else if (z) {
                    zArr = dtub.D(null, du(getString(cM(8, bxgl.a))));
                    i2 = 0;
                } else {
                    i2 = 0;
                    zArr = new boolean[]{k()};
                }
                dtsr.dA(i, zArr, new emyl() { // from class: bxgb
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "is_updated_at_hash_valid:".concat(String.valueOf(bxgc.this.getString(8)));
                    }
                });
                engr engrVar = new engr();
                int i6 = i2;
                while (i6 < i) {
                    long j = dB[i6];
                    if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                        jArr = dB;
                    } else {
                        hashSet.add(Long.valueOf(dB[i6]));
                        String[] strArr2 = bxgl.a;
                        bxex bxexVar = new bxex();
                        bxexVar.aF();
                        bxexVar.aD();
                        long j2 = dB[i6];
                        if (strArr != null) {
                            bxexVar.i(strArr[i6]);
                        }
                        if (D != null) {
                            bxexVar.c(D[i6]);
                        }
                        if (D2 != null) {
                            bxexVar.d(D2[i6]);
                        }
                        if (bdhdVarArr != null) {
                            bxexVar.h(bdhdVarArr[i6]);
                        }
                        if (instantArr != null) {
                            bxexVar.g(instantArr[i6]);
                        }
                        if (E != null) {
                            bxexVar.e(E[i6]);
                        }
                        jArr = dB;
                        if (B != null) {
                            bxexVar.j(B[i6]);
                        }
                        if (instantArr2 != null) {
                            bxexVar.b(instantArr2[i6]);
                        }
                        if (zArr != null) {
                            bxexVar.f(zArr[i6]);
                        }
                        engrVar.h(bxexVar.a());
                    }
                    i6++;
                    dB = jArr;
                }
                return engrVar.g();
            }
        }
        int i7 = engw.d;
        return enou.a;
    }

    public final Instant g() {
        return bdgw.b(getLong(cM(4, bxgl.a)));
    }

    public final String h() {
        return getString(cM(0, bxgl.a));
    }

    public final boolean i() {
        return getInt(cM(1, bxgl.a)) == 1;
    }

    public final boolean j() {
        return getInt(cM(2, bxgl.a)) == 1;
    }

    public final boolean k() {
        return getInt(cM(8, bxgl.a)) == 1;
    }

    public final byte[] l() {
        return getBlob(cM(5, bxgl.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
