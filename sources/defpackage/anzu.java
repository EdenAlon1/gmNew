package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anzu implements aqge {
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
    private final anwi l;
    private final anvm m;
    private final anyg n;

    public anzu(ffsk ffskVar, ffsk ffskVar2, ctbk ctbkVar, anyg anygVar, anwi anwiVar, anvm anvmVar, aqge aqgeVar, aqge aqgeVar2, aqge aqgeVar3, BugleConversationId bugleConversationId) {
        aqge a;
        this.j = ffskVar;
        this.a = ffskVar2;
        this.k = ctbkVar;
        this.n = anygVar;
        this.l = anwiVar;
        this.m = anvmVar;
        this.b = aqgeVar;
        this.d = ctbkVar.a(new anzr(this));
        a = anygVar.a(null, bugleConversationId, aqgeVar2, aqgeVar3, aqgeVar);
        this.g = a;
        ffsk ffskVar3 = (ffsk) anwiVar.a.b();
        ffskVar3.getClass();
        ffsk ffskVar4 = (ffsk) anwiVar.b.b();
        ffskVar4.getClass();
        ctbk ctbkVar2 = (ctbk) anwiVar.c.b();
        ctbkVar2.getClass();
        becj becjVar = (becj) anwiVar.d.b();
        becjVar.getClass();
        this.h = new anwh(ffskVar3, ffskVar4, ctbkVar2, becjVar, bugleConversationId);
        ffsk ffskVar5 = (ffsk) anvmVar.a.b();
        ffskVar5.getClass();
        ffsk ffskVar6 = (ffsk) anvmVar.b.b();
        ffskVar6.getClass();
        ctbk ctbkVar3 = (ctbk) anvmVar.c.b();
        ctbkVar3.getClass();
        becj becjVar2 = (becj) anvmVar.d.b();
        becjVar2.getClass();
        this.i = new anvl(ffskVar5, ffskVar6, ctbkVar3, becjVar2, bugleConversationId);
    }

    @Override // defpackage.aqge
    public final ctbx a(final aqgd aqgdVar) {
        return this.d.a(new ctbf() { // from class: anzi
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                return aqgd.this.a();
            }
        }, "SuggestionObservableSupplier::register", "SuggestionObservableSupplier::callback", "SuggestionObservableSupplier::unregister");
    }

    @Override // defpackage.aqge
    public final elfl b() {
        elfl c;
        c = axol.c(this.a, ffhe.a, ffsm.a, new anzm(this, null));
        return c;
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    public final elfl d() {
        elfl c;
        c = axol.c(this.j, ffhe.a, ffsm.a, new anzt(this, null));
        return c;
    }
}
