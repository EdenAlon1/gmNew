package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amrp implements aqge {
    public final ffsk a;
    public final BugleConversation b;
    public final ctbl c;
    private final ffsk d;
    private final ctbk e;

    public amrp(ffsk ffskVar, ffsk ffskVar2, ctbk ctbkVar, BugleConversation bugleConversation) {
        this.a = ffskVar;
        this.d = ffskVar2;
        this.e = ctbkVar;
        this.b = bugleConversation;
        this.c = ctbkVar.a(new amrm(this));
    }

    @Override // defpackage.aqge
    public final ctbx a(final aqgd aqgdVar) {
        return this.c.a(new ctbf() { // from class: amri
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                return aqgd.this.a();
            }
        }, "EmergencyConversationPropertiesSupplier::register", "EmergencyConversationPropertiesSupplier::callback", "EmergencyConversationPropertiesSupplier::unregister");
    }

    @Override // defpackage.aqge
    public final elfl b() {
        elfl c;
        c = axol.c(this.d, ffhe.a, ffsm.a, new amrk(this, null));
        return c;
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}
