package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aoai implements aqge {
    public final ffsk a;
    public final aqge b;
    public ctbx c;
    public final ctbl d;
    public final Object e = new Object();
    public final AtomicBoolean f = new AtomicBoolean(true);
    public final aqge g;
    public final aqge h;
    public final aqge i;
    private final ffsk j;
    private final ctbk k;
    private final anws l;
    private final anvx m;
    private final anyz n;

    public aoai(ffsk ffskVar, ffsk ffskVar2, ctbk ctbkVar, anyz anyzVar, anws anwsVar, anvx anvxVar, aqge aqgeVar, aqge aqgeVar2, aqge aqgeVar3, BugleConversationId bugleConversationId) {
        aqge a;
        this.j = ffskVar;
        this.a = ffskVar2;
        this.k = ctbkVar;
        this.n = anyzVar;
        this.l = anwsVar;
        this.m = anvxVar;
        this.b = aqgeVar;
        this.d = ctbkVar.a(new aoaf(this));
        a = anyzVar.a(bugleConversationId, aqgeVar2, aqgeVar3, aqgeVar, null);
        this.g = a;
        ffsk ffskVar3 = (ffsk) anwsVar.a.b();
        ffskVar3.getClass();
        ffsk ffskVar4 = (ffsk) anwsVar.b.b();
        ffskVar4.getClass();
        ctbk ctbkVar2 = (ctbk) anwsVar.c.b();
        ctbkVar2.getClass();
        becj becjVar = (becj) anwsVar.d.b();
        becjVar.getClass();
        this.h = new anwr(ffskVar3, ffskVar4, ctbkVar2, becjVar, bugleConversationId);
        ffsk ffskVar5 = (ffsk) anvxVar.a.b();
        ffskVar5.getClass();
        ffsk ffskVar6 = (ffsk) anvxVar.b.b();
        ffskVar6.getClass();
        ctbk ctbkVar3 = (ctbk) anvxVar.c.b();
        ctbkVar3.getClass();
        becj becjVar2 = (becj) anvxVar.d.b();
        becjVar2.getClass();
        this.i = new anvw(ffskVar5, ffskVar6, ctbkVar3, becjVar2, bugleConversationId);
    }

    @Override // defpackage.aqge
    public final ctbx a(final aqgd aqgdVar) {
        return this.d.a(new ctbf() { // from class: anzw
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                return aqgd.this.a();
            }
        }, "SuggestionObservableSupplierV2::register", "SuggestionObservableSupplierV2::callback", "SuggestionObservableSupplierV2::unregister");
    }

    @Override // defpackage.aqge
    public final elfl b() {
        elfl c;
        c = axol.c(this.a, ffhe.a, ffsm.a, new aoaa(this, null));
        return c;
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    public final elfl d() {
        elfl c;
        c = axol.c(this.j, ffhe.a, ffsm.a, new aoah(this, null));
        return c;
    }
}
