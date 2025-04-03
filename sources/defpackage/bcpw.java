package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcpw extends bcpu {
    private final bcpu a;

    public bcpw(bcpu bcpuVar) {
        while (bcpuVar instanceof bcpw) {
            bcpuVar = ((bcpw) bcpuVar).a;
        }
        csix.k(bcpuVar instanceof bcpt);
        this.a = bcpuVar;
    }

    @Override // defpackage.bcpu
    public final bcpr a() {
        return this.a.a();
    }

    @Override // defpackage.bcpu
    public final String b() {
        return this.a.b();
    }

    @Override // defpackage.bcpu
    public final void d() {
        this.a.d();
    }

    @Override // defpackage.bcpu
    public final void e(bcpr bcprVar) {
        this.a.e(bcprVar);
    }

    @Override // defpackage.bcpu
    public final boolean g() {
        return this.a.g();
    }
}
