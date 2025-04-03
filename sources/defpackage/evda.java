package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evda extends evdc {
    private final evdd c;
    private final boolean a = true;
    private final int b = 1000;
    private final int d = 20;

    public evda(boolean z, int i, evdd evddVar, int i2) {
        this.c = evddVar;
    }

    @Override // defpackage.evdc
    public final int a() {
        return 1000;
    }

    @Override // defpackage.evdc
    public final int b() {
        return 20;
    }

    @Override // defpackage.evdc
    public final evdd c() {
        return this.c;
    }

    @Override // defpackage.evdc
    public final boolean d() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof evdc) {
            evdc evdcVar = (evdc) obj;
            evdcVar.f();
            evdcVar.m();
            evdcVar.d();
            evdcVar.g();
            evdcVar.h();
            evdcVar.i();
            evdcVar.j();
            evdcVar.a();
            evdcVar.e();
            evdcVar.l();
            evdcVar.k();
            evdd evddVar = this.c;
            if (evddVar != null ? evddVar.equals(evdcVar.c()) : evdcVar.c() == null) {
                evdcVar.b();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        evdd evddVar = this.c;
        return (((evddVar == null ? 0 : evddVar.hashCode()) ^ (-992385936)) * 1000003) ^ 20;
    }

    public final String toString() {
        return "CronetConfig{context=null, storagePath=null, enableQuic=true, enableBrotli=false, enableCertificateCache=false, enableHttpCache=false, enableNetworkQualityEstimator=false, diskCacheSizeBytes=1000, inMemoryFallbackCacheSizeBytes=0, libraryLoader=null, experimentalOptions=null, cronetEngineBuilderFactory=" + String.valueOf(this.c) + ", threadPriority=20}";
    }

    @Override // defpackage.evdc
    public final void e() {
    }

    @Override // defpackage.evdc
    public final void f() {
    }

    @Override // defpackage.evdc
    public final void g() {
    }

    @Override // defpackage.evdc
    public final void h() {
    }

    @Override // defpackage.evdc
    public final void i() {
    }

    @Override // defpackage.evdc
    public final void j() {
    }

    @Override // defpackage.evdc
    public final void k() {
    }

    @Override // defpackage.evdc
    public final void l() {
    }

    @Override // defpackage.evdc
    public final void m() {
    }
}
