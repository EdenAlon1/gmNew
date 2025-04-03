package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avrp implements avrk {
    public static final entd a = entd.c("BugleRcsCapabilities");
    public final avrk b;
    private final avrk c;
    private final errl d;

    public avrp(avrk avrkVar, avrk avrkVar2, errl errlVar) {
        this.c = avrkVar;
        this.b = avrkVar2;
        this.d = errlVar;
    }

    @Override // defpackage.avrk
    public final elfl a(final Iterable iterable) {
        ((ensz) a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesProviderExceptionHandler", "getBatchCapabilities", 63, "RcsCapabilitiesProviderExceptionHandler.java")).r("RcsCapabilitiesProviderExceptionHandler: start downstreamProvider.getBatchCapabilities for %d chatEndpoints", enjk.b(iterable));
        return this.c.a(iterable).f(avlo.class, new eroh() { // from class: avro
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ((ensz) ((ensz) ((ensz) avrp.a.j()).g((avlo) obj)).h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesProviderExceptionHandler", "getBatchCapabilities", 72, "RcsCapabilitiesProviderExceptionHandler.java")).q("Capabilities failed with an exception from the downstream provider.");
                return avrp.this.b.a(iterable);
            }
        }, this.d);
    }

    @Override // defpackage.avrk
    public final elfl b(final awui awuiVar) {
        ((ensz) a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesProviderExceptionHandler", "getCapabilities", 44, "RcsCapabilitiesProviderExceptionHandler.java")).t("RcsCapabilitiesProviderExceptionHandler: start downstreamProvider.getCapabilities for chatEndpoint %s", cskt.b(awuiVar.d));
        return this.c.b(awuiVar).f(avlo.class, new eroh() { // from class: avrn
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ((ensz) ((ensz) ((ensz) avrp.a.j()).g((avlo) obj)).h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesProviderExceptionHandler", "getCapabilities", 53, "RcsCapabilitiesProviderExceptionHandler.java")).q("Capabilities failed with an exception from the downstream provider.");
                return avrp.this.b.b(awuiVar);
            }
        }, erpp.a);
    }
}
