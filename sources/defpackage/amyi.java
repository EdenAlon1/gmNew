package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amyi implements aqge {
    public final becj a;
    public final avjw b;
    public final BugleConversation c;
    public final ctbl d;
    private final ffsk e;
    private final ffsk f;
    private final ctbk g;

    public amyi(ffsk ffskVar, ffsk ffskVar2, ctbk ctbkVar, becj becjVar, avjw avjwVar, BugleConversation bugleConversation) {
        this.e = ffskVar;
        this.f = ffskVar2;
        this.g = ctbkVar;
        this.a = becjVar;
        this.b = avjwVar;
        this.c = bugleConversation;
        this.d = ctbkVar.a(new amyf(this));
    }

    @Override // defpackage.aqge
    public final ctbx a(final aqgd aqgdVar) {
        return this.d.a(new ctbf() { // from class: amxy
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                return aqgd.this.a();
            }
        }, "RbmConversationPropertiesSupplier::register", "RbmConversationPropertiesSupplier::callback", "RbmConversationPropertiesSupplier::unregister");
    }

    @Override // defpackage.aqge
    public final elfl b() {
        elfl c;
        c = axol.c(this.f, ffhe.a, ffsm.a, new amyd(this, null));
        return c;
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    public final elfl d() {
        elfl c;
        c = axol.c(this.e, ffhe.a, ffsm.a, new amyh(this, null));
        return c;
    }
}
