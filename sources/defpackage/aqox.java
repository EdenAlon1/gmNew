package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqox implements aqge {
    public static final entd a = entd.c("BugleRecipients");
    public final ctbl b;
    public final azaw c;
    public final azaw d;
    public final aoku e;
    public final int f;
    private final errl g;
    private final errl h;

    public aqox(ctbk ctbkVar, errl errlVar, errl errlVar2, azei azeiVar, azaw azawVar, azaw azawVar2, aoku aokuVar, int i) {
        this.b = ctbkVar.a(new aqot(azeiVar, new aqow(this)));
        this.g = errlVar;
        this.h = errlVar2;
        this.c = azawVar;
        this.d = azawVar2;
        this.e = aokuVar;
        this.f = i;
    }

    @Override // defpackage.aqge
    public final ctbx a(final aqgd aqgdVar) {
        if (!this.e.e().isEmpty()) {
            return this.b.a(new ctbf() { // from class: aqop
                @Override // defpackage.ctbf
                public final elfl a(Object obj) {
                    entd entdVar = aqox.a;
                    return aqgd.this.a();
                }
            }, "ProviderRcsCapabilitiesSupplier::register", "ProviderRcsCapabilitiesSupplier::callback", "ProviderRcsCapabilitiesSupplier::unregister");
        }
        ensz enszVar = (ensz) a.h();
        enszVar.Y(csux.D, d());
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/ProviderRcsCapabilitiesSupplier", "subscribeToChanges", 136, "ProviderRcsCapabilitiesSupplier.java")).q("RCS Capabilities will NEVER change: No RCS Identifier.");
        return ctbx.d;
    }

    @Override // defpackage.aqge
    public final elfl b() {
        elfl h;
        if (this.e.e().isEmpty()) {
            ensz enszVar = (ensz) a.h();
            enszVar.Y(csux.D, d());
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/ProviderRcsCapabilitiesSupplier", "getAsync", 86, "ProviderRcsCapabilitiesSupplier.java")).q("RCS Disabled: No RCS Identifier.");
            return elfo.e(aqpk.a(azau.c()));
        }
        if (this.f == 1) {
            ensz enszVar2 = (ensz) a.h();
            enszVar2.Y(csux.D, d());
            ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/ProviderRcsCapabilitiesSupplier", "getAsync", 95, "ProviderRcsCapabilitiesSupplier.java")).q("Retrieving RCS Capabilities from Network.");
            h = elfo.h(new erog() { // from class: aqoq
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    aqox aqoxVar = aqox.this;
                    return aqoxVar.c.c(aqoxVar.e);
                }
            }, this.h);
        } else {
            ensz enszVar3 = (ensz) a.h();
            enszVar3.Y(csux.D, d());
            ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/ProviderRcsCapabilitiesSupplier", "getAsync", 103, "ProviderRcsCapabilitiesSupplier.java")).q("Retrieving RCS Capabilities from Storage.");
            h = elfo.h(new erog() { // from class: aqor
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    aqox aqoxVar = aqox.this;
                    return aqoxVar.d.c(aqoxVar.e);
                }
            }, this.h);
        }
        return h.h(new emwl() { // from class: aqos
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                azau azauVar = (azau) obj;
                ensz enszVar4 = (ensz) aqox.a.h();
                aqox aqoxVar = aqox.this;
                enszVar4.Y(csux.D, aqoxVar.d());
                ((ensz) enszVar4.h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/ProviderRcsCapabilitiesSupplier", "getAsync", 114, "ProviderRcsCapabilitiesSupplier.java")).t(aqoxVar.f == 1 ? "Network RCS Capabilities retrieved: %s." : "Storage RCS Capabilities retrieved: %s.", azauVar);
                return aqpk.a(azauVar);
            }
        }, this.g);
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    public final String d() {
        return cskt.c(this.e).toString();
    }
}
