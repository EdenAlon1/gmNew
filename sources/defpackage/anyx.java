package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anyx implements aqge {
    public final Context a;
    public final becj b;
    public final cpfi c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final BugleConversationId g;
    public final aqge h;
    public final aqge i;
    public final aqge j;
    public final cpfu k;
    public ctbx l;
    public final ctbl m;
    private final ffsk n;
    private final ctbk o;

    public anyx(Context context, ffsk ffskVar, ctbk ctbkVar, becj becjVar, cpfi cpfiVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, BugleConversationId bugleConversationId, aqge aqgeVar, aqge aqgeVar2, aqge aqgeVar3, cpfu cpfuVar) {
        this.a = context;
        this.n = ffskVar;
        this.o = ctbkVar;
        this.b = becjVar;
        this.c = cpfiVar;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.g = bugleConversationId;
        this.h = aqgeVar;
        this.i = aqgeVar2;
        this.j = aqgeVar3;
        this.k = cpfuVar;
        this.m = ctbkVar.a(new anyu(this));
    }

    public static final engw e() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aqge
    public final ctbx a(final aqgd aqgdVar) {
        return this.m.a(new ctbf() { // from class: anyi
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                return aqgd.this.a();
            }
        }, "SmartSuggestionObservableSupplierV2::register", "SmartSuggestionObservableSupplierV2::callback", "SmartSuggestionObservableSupplierV2::unregister");
    }

    @Override // defpackage.aqge
    public final elfl b() {
        elfl c;
        c = axol.c(this.n, ffhe.a, ffsm.a, new anyq(this, null));
        return c;
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        return e();
    }

    public final elfl d() {
        elfl c;
        c = axol.c(this.n, ffhe.a, ffsm.a, new anyw(this, null));
        return c;
    }
}
