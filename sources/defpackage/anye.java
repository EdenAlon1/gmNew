package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anye implements aqge {
    public final becj a;
    public final cpfi b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final cpfu f;
    public final BugleConversationId g;
    public final aqge h;
    public final aqge i;
    public final aqge j;
    public ctbx k;
    public final ctbl l;
    private final ffsk m;
    private final ctbk n;

    public anye(ffsk ffskVar, ctbk ctbkVar, becj becjVar, cpfi cpfiVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, cpfu cpfuVar, BugleConversationId bugleConversationId, aqge aqgeVar, aqge aqgeVar2, aqge aqgeVar3) {
        this.m = ffskVar;
        this.n = ctbkVar;
        this.a = becjVar;
        this.b = cpfiVar;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = cpfuVar;
        this.g = bugleConversationId;
        this.h = aqgeVar;
        this.i = aqgeVar2;
        this.j = aqgeVar3;
        this.l = ctbkVar.a(new anyb(this));
    }

    public static final engw e() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aqge
    public final ctbx a(final aqgd aqgdVar) {
        return this.l.a(new ctbf() { // from class: anxo
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                return aqgd.this.a();
            }
        }, "SmartSuggestionObservableSupplier::register", "SmartSuggestionObservableSupplier::callback", "SmartSuggestionObservableSupplier::unregister");
    }

    @Override // defpackage.aqge
    public final elfl b() {
        elfl c;
        c = axol.c(this.m, ffhe.a, ffsm.a, new anxx(this, null));
        return c;
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        return e();
    }

    public final elfl d() {
        elfl c;
        c = axol.c(this.m, ffhe.a, ffsm.a, new anyd(this, null));
        return c;
    }
}
