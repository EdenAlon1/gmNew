package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtqv extends dttl {
    public final Supplier a;
    public final Supplier b;
    public final Supplier c;
    public final Supplier d;
    public final Supplier e;
    public final Supplier f;
    public final Supplier g;
    public final Supplier h;
    public final Supplier i;
    public final Supplier j;
    public final boolean k;
    private final Supplier l;
    private final Supplier m;
    private final Supplier n;
    private final Supplier o;
    private final Supplier p;

    public dtqv(Supplier supplier, Supplier supplier2, Supplier supplier3, Supplier supplier4, Supplier supplier5, Supplier supplier6, Supplier supplier7, Supplier supplier8, Supplier supplier9, Supplier supplier10, Supplier supplier11, Supplier supplier12, Supplier supplier13, Supplier supplier14, boolean z, Supplier supplier15) {
        this.a = supplier;
        this.b = supplier2;
        this.c = supplier3;
        this.l = supplier4;
        this.d = supplier5;
        this.e = supplier6;
        this.m = supplier7;
        this.f = supplier8;
        this.n = supplier9;
        this.o = supplier10;
        this.g = supplier11;
        this.h = supplier12;
        this.i = supplier13;
        this.j = supplier14;
        this.k = z;
        this.p = supplier15;
    }

    @Override // defpackage.dttl
    public final Supplier a() {
        return this.o;
    }

    @Override // defpackage.dttl
    public final Supplier b() {
        return this.p;
    }

    @Override // defpackage.dttl
    public final Supplier c() {
        return this.j;
    }

    @Override // defpackage.dttl
    public final Supplier d() {
        return this.f;
    }

    @Override // defpackage.dttl
    public final Supplier e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        boolean equals3;
        boolean equals4;
        boolean equals5;
        boolean equals6;
        boolean equals7;
        boolean equals8;
        boolean equals9;
        boolean equals10;
        boolean equals11;
        boolean equals12;
        boolean equals13;
        boolean equals14;
        boolean equals15;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dttl) {
            dttl dttlVar = (dttl) obj;
            equals = this.a.equals(dttlVar.f());
            if (equals) {
                equals2 = this.b.equals(dttlVar.h());
                if (equals2) {
                    equals3 = this.c.equals(dttlVar.n());
                    if (equals3) {
                        equals4 = this.l.equals(dttlVar.j());
                        if (equals4) {
                            equals5 = this.d.equals(dttlVar.m());
                            if (equals5) {
                                equals6 = this.e.equals(dttlVar.g());
                                if (equals6) {
                                    equals7 = this.m.equals(dttlVar.l());
                                    if (equals7) {
                                        equals8 = this.f.equals(dttlVar.d());
                                        if (equals8) {
                                            equals9 = this.n.equals(dttlVar.i());
                                            if (equals9) {
                                                equals10 = this.o.equals(dttlVar.a());
                                                if (equals10) {
                                                    equals11 = this.g.equals(dttlVar.e());
                                                    if (equals11) {
                                                        equals12 = this.h.equals(dttlVar.k());
                                                        if (equals12) {
                                                            equals13 = this.i.equals(dttlVar.o());
                                                            if (equals13) {
                                                                equals14 = this.j.equals(dttlVar.c());
                                                                if (equals14 && this.k == dttlVar.p()) {
                                                                    equals15 = this.p.equals(dttlVar.b());
                                                                    if (equals15) {
                                                                        return true;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.dttl
    public final Supplier f() {
        return this.a;
    }

    @Override // defpackage.dttl
    public final Supplier g() {
        return this.e;
    }

    @Override // defpackage.dttl
    public final Supplier h() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        hashCode = this.a.hashCode();
        hashCode2 = this.b.hashCode();
        int i = ((hashCode ^ 1000003) * 1000003) ^ hashCode2;
        hashCode3 = this.c.hashCode();
        int i2 = (i * 1000003) ^ hashCode3;
        hashCode4 = this.l.hashCode();
        int i3 = (i2 * 1000003) ^ hashCode4;
        hashCode5 = this.d.hashCode();
        int i4 = (i3 * 1000003) ^ hashCode5;
        hashCode6 = this.e.hashCode();
        int i5 = (i4 * 1000003) ^ hashCode6;
        hashCode7 = this.m.hashCode();
        int i6 = (i5 * 1000003) ^ hashCode7;
        hashCode8 = this.f.hashCode();
        int i7 = (i6 * 1000003) ^ hashCode8;
        hashCode9 = this.n.hashCode();
        int i8 = (i7 * 1000003) ^ hashCode9;
        hashCode10 = this.o.hashCode();
        int i9 = (i8 * 1000003) ^ hashCode10;
        hashCode11 = this.g.hashCode();
        int i10 = (i9 * 1000003) ^ hashCode11;
        hashCode12 = this.h.hashCode();
        int i11 = (i10 * 1000003) ^ hashCode12;
        hashCode13 = this.i.hashCode();
        int i12 = (i11 * 1000003) ^ hashCode13;
        hashCode14 = this.j.hashCode();
        int i13 = (i12 * 1000003) ^ hashCode14;
        int i14 = true != this.k ? 1237 : 1231;
        hashCode15 = this.p.hashCode();
        return (((i13 * 1000003) ^ i14) * 1000003) ^ hashCode15;
    }

    @Override // defpackage.dttl
    public final Supplier i() {
        return this.n;
    }

    @Override // defpackage.dttl
    public final Supplier j() {
        return this.l;
    }

    @Override // defpackage.dttl
    public final Supplier k() {
        return this.h;
    }

    @Override // defpackage.dttl
    public final Supplier l() {
        return this.m;
    }

    @Override // defpackage.dttl
    public final Supplier m() {
        return this.d;
    }

    @Override // defpackage.dttl
    public final Supplier n() {
        return this.c;
    }

    @Override // defpackage.dttl
    public final Supplier o() {
        return this.i;
    }

    @Override // defpackage.dttl
    public final boolean p() {
        return this.k;
    }

    public final String toString() {
        Supplier supplier = this.p;
        Supplier supplier2 = this.j;
        Supplier supplier3 = this.i;
        Supplier supplier4 = this.h;
        Supplier supplier5 = this.g;
        Supplier supplier6 = this.o;
        Supplier supplier7 = this.n;
        Supplier supplier8 = this.f;
        Supplier supplier9 = this.m;
        Supplier supplier10 = this.e;
        Supplier supplier11 = this.d;
        Supplier supplier12 = this.l;
        Supplier supplier13 = this.c;
        Supplier supplier14 = this.b;
        return "D26rConfiguration{enforceCheckInitializedSupplier=" + this.a.toString() + ", enforceThreadChecksOnCursorsSupplier=" + supplier14.toString() + ", useIteratingStreamSupplier=" + supplier13.toString() + ", omitUnchangedRowsFromUpdatesByDefaultSupplier=" + supplier12.toString() + ", throwOnExtractBindDatasArrayLengthCheckSupplier=" + supplier11.toString() + ", enforceConcurrentCursorModificationDurinBindSupplier=" + supplier10.toString() + ", suppressPhantomRowsByDefaultSupplier=" + supplier9.toString() + ", catchBulkInsertThrowablesSupplier=" + supplier8.toString() + ", observableQueryOnReadyKillSwitch=" + supplier7.toString() + ", addIdsToBindDataInBulkInsertSupplier=" + supplier6.toString() + ", enableDbOverridesSupplier=" + supplier5.toString() + ", readExecutor=" + supplier4.toString() + ", writeExecutor=" + supplier3.toString() + ", blockingExecutor=" + supplier2.toString() + ", isPrimaryProcess=" + this.k + ", allowQueryOnSingletonCaching=" + supplier.toString() + "}";
    }
}
