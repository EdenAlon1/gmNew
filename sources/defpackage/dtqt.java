package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtqt extends dtsd {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final Supplier g;
    public final int h;
    public final Supplier i;
    public final int j;
    private final boolean k;
    private final dtsc l;

    public dtqt(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, Supplier supplier, dtsc dtscVar, int i2, Supplier supplier2) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.k = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.j = i;
        this.g = supplier;
        this.l = dtscVar;
        this.h = i2;
        this.i = supplier2;
    }

    @Override // defpackage.dtsd
    public final int a() {
        return this.h;
    }

    @Override // defpackage.dtsd
    public final dtsc b() {
        return this.l;
    }

    @Override // defpackage.dtsd
    public final String c() {
        return this.a;
    }

    @Override // defpackage.dtsd
    public final Supplier d() {
        return this.i;
    }

    @Override // defpackage.dtsd
    public final Supplier e() {
        return this.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        if (r5.e() == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        if (r4.l.equals(r5.b()) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        if (r4.h != r5.a()) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        r5 = r4.i.equals(r5.d());
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r5 == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0062, code lost:
    
        if (r1 == false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.dtsd
            r2 = 0
            if (r1 == 0) goto L86
            dtsd r5 = (defpackage.dtsd) r5
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L86
            boolean r1 = r4.b
            boolean r3 = r5.g()
            if (r1 != r3) goto L86
            boolean r1 = r4.c
            boolean r3 = r5.k()
            if (r1 != r3) goto L86
            boolean r1 = r4.k
            boolean r3 = r5.j()
            if (r1 != r3) goto L86
            boolean r1 = r4.d
            boolean r3 = r5.h()
            if (r1 != r3) goto L86
            boolean r1 = r4.e
            boolean r3 = r5.i()
            if (r1 != r3) goto L86
            boolean r1 = r4.f
            boolean r3 = r5.f()
            if (r1 != r3) goto L86
            int r1 = r4.j
            int r3 = r5.l()
            if (r1 != r3) goto L86
            java.util.function.Supplier r1 = r4.g
            if (r1 != 0) goto L5a
            java.util.function.Supplier r1 = r5.e()
            if (r1 != 0) goto L86
            goto L65
        L5a:
            java.util.function.Supplier r3 = r5.e()
            boolean r1 = defpackage.afg$$ExternalSyntheticApiModelOutline0.m(r1, r3)
            if (r1 != 0) goto L65
            goto L86
        L65:
            dtsc r1 = r4.l
            dtsc r3 = r5.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L86
            int r1 = r4.h
            int r3 = r5.a()
            if (r1 != r3) goto L86
            java.util.function.Supplier r1 = r4.i
            java.util.function.Supplier r5 = r5.d()
            boolean r5 = defpackage.afg$$ExternalSyntheticApiModelOutline0.m(r1, r5)
            if (r5 == 0) goto L86
            return r0
        L86:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtqt.equals(java.lang.Object):boolean");
    }

    @Override // defpackage.dtsd
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.dtsd
    public final boolean g() {
        return this.b;
    }

    @Override // defpackage.dtsd
    public final boolean h() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() ^ 1000003;
        Supplier supplier = this.g;
        int hashCode3 = ((((((((((((((((((((hashCode2 * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true == this.f ? 1231 : 1237)) * 1000003) ^ this.j) * 1000003) ^ (supplier == null ? 0 : supplier.hashCode())) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.h) * 1000003;
        hashCode = this.i.hashCode();
        return hashCode3 ^ hashCode;
    }

    @Override // defpackage.dtsd
    public final boolean i() {
        return this.e;
    }

    @Override // defpackage.dtsd
    public final boolean j() {
        return this.k;
    }

    @Override // defpackage.dtsd
    public final boolean k() {
        return this.c;
    }

    @Override // defpackage.dtsd
    public final int l() {
        return this.j;
    }

    public final String toString() {
        String str;
        switch (this.j) {
            case 1:
                str = "INT";
                break;
            case 2:
                str = "INTEGER";
                break;
            case 3:
                str = "REAL";
                break;
            case 4:
                str = "TEXT";
                break;
            case 5:
                str = "BLOB";
                break;
            case 6:
                str = "NUMERIC";
                break;
            case 7:
                str = "DEPRECATED_STRING";
                break;
            default:
                str = "NOT_SPECIFIED";
                break;
        }
        Supplier supplier = this.g;
        dtsc dtscVar = this.l;
        Supplier supplier2 = this.i;
        return "ColumnReferenceData{columnName=" + this.a + ", isForeignKey=" + this.b + ", unique=" + this.c + ", sqlNotNull=" + this.k + ", isPartOfUniqueMultiColumnIndex=" + this.d + ", isPrimaryKey=" + this.e + ", hasIndex=" + this.f + ", sqlType=" + str + ", parent=" + String.valueOf(supplier) + ", setterForTesting=" + dtscVar.toString() + ", schemaVersion=" + this.h + ", databaseInterfaceSupplier=" + supplier2.toString() + "}";
    }
}
