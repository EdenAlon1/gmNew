package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anxm implements aqge {
    public final ffsk a;
    public final becj b;
    public final ffbr c;
    public final BugleConversationId d;
    public ctbx e;
    public final ctbl f;
    private final ctbk g;

    public anxm(ffsk ffskVar, ctbk ctbkVar, becj becjVar, ffbr ffbrVar, BugleConversationId bugleConversationId) {
        this.a = ffskVar;
        this.g = ctbkVar;
        this.b = becjVar;
        this.c = ffbrVar;
        this.d = bugleConversationId;
        this.f = ctbkVar.a(new anxi(this));
    }

    @Override // defpackage.aqge
    public final ctbx a(final aqgd aqgdVar) {
        return this.f.a(new ctbf() { // from class: anxf
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                return aqgd.this.a();
            }
        }, "ScreenEffectSuggestionObservableSupplierV2::register", "ScreenEffectSuggestionObservableSupplierV2::callback", "ScreenEffectSuggestionObservableSupplierV2::unregister");
    }

    @Override // defpackage.aqge
    public final elfl b() {
        elfl c;
        c = axol.c(this.a, ffhe.a, ffsm.a, new anxh(this, null));
        return c;
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}
