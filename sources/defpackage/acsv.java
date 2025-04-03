package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acsv extends acum {
    private final acyu a;
    private final acvo b;
    private final acvo c;
    private final acus d;
    private final emyl e;
    private final boolean f;
    private final ConcurrentHashMap g;

    public acsv(acyu acyuVar, acvo acvoVar, acvo acvoVar2, acus acusVar, emyl emylVar, boolean z, ConcurrentHashMap concurrentHashMap) {
        this.a = acyuVar;
        this.b = acvoVar;
        this.c = acvoVar2;
        this.d = acusVar;
        if (emylVar == null) {
            throw new NullPointerException("Null openFutureSupplier");
        }
        this.e = emylVar;
        this.f = z;
        this.g = concurrentHashMap;
    }

    @Override // defpackage.acum
    public final acus a() {
        return this.d;
    }

    @Override // defpackage.acum
    public final acvo b() {
        return this.b;
    }

    @Override // defpackage.acum
    public final acvo c() {
        return this.c;
    }

    @Override // defpackage.acum
    public final acyu d() {
        return this.a;
    }

    @Override // defpackage.acum
    public final emyl e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acum) {
            acum acumVar = (acum) obj;
            if (this.a.equals(acumVar.d()) && this.b.equals(acumVar.b()) && this.c.equals(acumVar.c()) && this.d.equals(acumVar.a()) && this.e.equals(acumVar.e()) && this.f == acumVar.g() && this.g.equals(acumVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.acum
    public final ConcurrentHashMap f() {
        return this.g;
    }

    @Override // defpackage.acum
    public final boolean g() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        ConcurrentHashMap concurrentHashMap = this.g;
        emyl emylVar = this.e;
        acus acusVar = this.d;
        acvo acvoVar = this.c;
        acvo acvoVar2 = this.b;
        return "JsBridgeChannel{wrappedWebView=" + this.a.toString() + ", incomingRequestTransport=" + acvoVar2.toString() + ", outgoingRequestTransport=" + acvoVar.toString() + ", requestHandler=" + acusVar.toString() + ", openFutureSupplier=" + emylVar.toString() + ", isPaused=" + this.f + ", closeableResources=" + concurrentHashMap.toString() + "}";
    }
}
