package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxee extends dtsr implements bxdu {
    @Deprecated
    public bxee(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bxej bxejVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bxen.a, dtyoVar, dtvsVar, bxejVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bxcx();
    }

    @Override // defpackage.bxdu
    public final long c() {
        return getLong(cM(6, bxen.a));
    }

    @Override // defpackage.bxdu
    public final Instant e() {
        return bdgw.b(getLong(cM(7, bxen.a)));
    }

    @Override // defpackage.bxdu
    public final Instant f() {
        return bdgw.b(getLong(cM(4, bxen.a)));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        Instant[] instantArr;
        Instant[] instantArr2;
        long[] jArr;
        char c;
        int i;
        HashSet hashSet;
        engr engrVar;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet2 = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                String[] strArr = di ? z ? (String[]) dtub.C(null, dt(getString(cM(0, bxen.a))), new String[0]) : new String[]{l()} : null;
                dtsr.dz(length, strArr, new emyl() { // from class: bxdv
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "_id:".concat(String.valueOf(bxee.this.getString(0)));
                    }
                });
                String[] strArr2 = di(1) ? z ? (String[]) dtub.C(null, dt(getString(cM(1, bxen.a))), new String[0]) : new String[]{g()} : null;
                dtsr.dz(length, strArr2, new emyl() { // from class: bxdw
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "remote_instance_id:".concat(String.valueOf(bxee.this.getString(1)));
                    }
                });
                boolean[] D = di(2) ? z ? dtub.D(null, du(getString(cM(2, bxen.a)))) : new boolean[]{i()} : null;
                dtsr.dA(length, D, new emyl() { // from class: bxdx
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "etouffee:".concat(String.valueOf(bxee.this.getString(2)));
                    }
                });
                String[] strArr3 = di(3) ? z ? (String[]) dtub.C(null, dt(getString(cM(3, bxen.a))), new String[0]) : new String[]{h()} : null;
                dtsr.dz(length, strArr3, new emyl() { // from class: bxdy
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "tachyon_id:".concat(String.valueOf(bxee.this.getString(3)));
                    }
                });
                if (!di(4)) {
                    instantArr = null;
                } else if (z) {
                    long[] ds = ds(getString(cM(4, bxen.a)));
                    int length2 = ds.length;
                    Instant[] instantArr3 = new Instant[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        instantArr3[i2] = bdgw.b(ds[i2]);
                    }
                    instantArr = (Instant[]) dtub.C(null, instantArr3, new Instant[0]);
                } else {
                    instantArr = new Instant[]{f()};
                }
                dtsr.dz(length, instantArr, new emyl() { // from class: bxdz
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "last_modified_timestamp:".concat(String.valueOf(bxee.this.getString(4)));
                    }
                });
                byte[][] E = di(5) ? z ? dtub.E(null, dC(getString(cM(5, bxen.a)))) : new byte[][]{k()} : null;
                dtsr.dz(length, E, new emyl() { // from class: bxea
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "identity_key:".concat(String.valueOf(bxee.this.getString(5)));
                    }
                });
                long[] B = di(6) ? z ? dtub.B(null, ds(getString(cM(6, bxen.a)))) : new long[]{c()} : null;
                dtsr.dy(length, B, new emyl() { // from class: bxeb
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "updated_at_hash:".concat(String.valueOf(bxee.this.getString(6)));
                    }
                });
                if (!di(7)) {
                    instantArr2 = null;
                } else if (z) {
                    long[] ds2 = ds(getString(cM(7, bxen.a)));
                    int length3 = ds2.length;
                    Instant[] instantArr4 = new Instant[length3];
                    for (int i3 = 0; i3 < length3; i3++) {
                        instantArr4[i3] = bdgw.b(ds2[i3]);
                    }
                    instantArr2 = (Instant[]) dtub.C(null, instantArr4, new Instant[0]);
                } else {
                    instantArr2 = new Instant[]{e()};
                }
                dtsr.dz(length, instantArr2, new emyl() { // from class: bxec
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "guaranteed_fresh_as_of_timestamp:".concat(String.valueOf(bxee.this.getString(7)));
                    }
                });
                char c2 = '\b';
                boolean[] D2 = di(8) ? z ? dtub.D(null, du(getString(cM(8, bxen.a)))) : new boolean[]{j()} : null;
                dtsr.dA(length, D2, new emyl() { // from class: bxed
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "is_updated_at_hash_valid:".concat(String.valueOf(bxee.this.getString(8)));
                    }
                });
                engr engrVar2 = new engr();
                int i4 = 0;
                while (i4 < length) {
                    long j = dB[i4];
                    if (j <= 0) {
                        jArr = dB;
                        c = c2;
                        i = length;
                        hashSet = hashSet2;
                    } else if (hashSet2.contains(Long.valueOf(j))) {
                        jArr = dB;
                        i = length;
                        hashSet = hashSet2;
                        c = '\b';
                    } else {
                        hashSet2.add(Long.valueOf(dB[i4]));
                        String[] strArr4 = bxen.a;
                        bxcz bxczVar = new bxcz();
                        bxczVar.aF();
                        bxczVar.aD();
                        long j2 = dB[i4];
                        if (strArr != null) {
                            String str = strArr[i4];
                            jArr = dB;
                            bxczVar.aE(0);
                            bxczVar.a = str;
                        } else {
                            jArr = dB;
                        }
                        if (strArr2 != null) {
                            String str2 = strArr2[i4];
                            bxczVar.aE(1);
                            bxczVar.b = str2;
                        }
                        if (D != null) {
                            boolean z2 = D[i4];
                            bxczVar.aE(2);
                            bxczVar.c = z2;
                        }
                        if (strArr3 != null) {
                            String str3 = strArr3[i4];
                            bxczVar.aE(3);
                            bxczVar.d = str3;
                        }
                        if (instantArr != null) {
                            Instant instant = instantArr[i4];
                            int i5 = bxczVar.aB;
                            i = length;
                            if (i5 < 35040) {
                                dtub.w("last_modified_timestamp", i5);
                            }
                            bxczVar.aE(4);
                            bxczVar.e = instant;
                        } else {
                            i = length;
                        }
                        if (E != null) {
                            byte[] bArr = E[i4];
                            int i6 = bxczVar.aB;
                            if (i6 < 38010) {
                                dtub.w("identity_key", i6);
                            }
                            bxczVar.aE(5);
                            bxczVar.f = bArr;
                        }
                        if (B != null) {
                            long j3 = B[i4];
                            int i7 = bxczVar.aB;
                            hashSet = hashSet2;
                            if (i7 < 39040) {
                                dtub.w("updated_at_hash", i7);
                            }
                            bxczVar.aE(6);
                            bxczVar.g = j3;
                        } else {
                            hashSet = hashSet2;
                        }
                        if (instantArr2 != null) {
                            Instant instant2 = instantArr2[i4];
                            int i8 = bxczVar.aB;
                            if (i8 < 40010) {
                                dtub.w("guaranteed_fresh_as_of_timestamp", i8);
                            }
                            bxczVar.aE(7);
                            bxczVar.h = instant2;
                        }
                        if (D2 != null) {
                            boolean z3 = D2[i4];
                            int i9 = bxczVar.aB;
                            if (i9 < 40030) {
                                dtub.w("is_updated_at_hash_valid", i9);
                            }
                            c = '\b';
                            bxczVar.aE(8);
                            bxczVar.i = z3;
                        } else {
                            c = '\b';
                        }
                        bxcx bxcxVar = new bxcx();
                        bxcxVar.aC(bxczVar.aB());
                        bxcxVar.a = bxczVar.a;
                        bxcxVar.b = bxczVar.b;
                        bxcxVar.c = bxczVar.c;
                        bxcxVar.d = bxczVar.d;
                        bxcxVar.e = bxczVar.e;
                        bxcxVar.f = bxczVar.f;
                        engrVar = engrVar2;
                        bxcxVar.g = bxczVar.g;
                        bxcxVar.h = bxczVar.h;
                        bxcxVar.i = bxczVar.i;
                        bxcxVar.cK = bxczVar.aC();
                        engrVar.h(bxcxVar);
                        i4++;
                        c2 = c;
                        engrVar2 = engrVar;
                        dB = jArr;
                        length = i;
                        hashSet2 = hashSet;
                    }
                    engrVar = engrVar2;
                    i4++;
                    c2 = c;
                    engrVar2 = engrVar;
                    dB = jArr;
                    length = i;
                    hashSet2 = hashSet;
                }
                return engrVar2.g();
            }
        }
        int i10 = engw.d;
        return enou.a;
    }

    @Override // defpackage.bxdu
    public final String g() {
        return getString(cM(1, bxen.a));
    }

    @Override // defpackage.bxdu
    public final String h() {
        return getString(cM(3, bxen.a));
    }

    @Override // defpackage.bxdu
    public final boolean i() {
        return getInt(cM(2, bxen.a)) == 1;
    }

    @Override // defpackage.bxdu
    public final boolean j() {
        return getInt(cM(8, bxen.a)) == 1;
    }

    @Override // defpackage.bxdu
    public final byte[] k() {
        return getBlob(cM(5, bxen.a));
    }

    public final String l() {
        return getString(cM(0, bxen.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
