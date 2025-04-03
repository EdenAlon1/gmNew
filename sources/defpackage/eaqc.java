package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaqc {
    private final eapp a;
    private final fazb b;

    public eaqc(eapp eappVar, fazb fazbVar) {
        fazbVar.getClass();
        this.a = eappVar;
        this.b = fazbVar;
    }

    public final eapp a(eagp eagpVar) {
        eagpVar.getClass();
        if (eagpVar.a()) {
            Object b = this.b.b();
            b.getClass();
            return (eapp) b;
        }
        if (eagpVar.b()) {
            return this.a;
        }
        throw new IllegalStateException("Unsupported targetType for GnpAccountStorageProviderImpl");
    }
}
