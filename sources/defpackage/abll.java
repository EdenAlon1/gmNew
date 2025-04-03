package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abll implements ablf {
    static final /* synthetic */ ffmx[] a;
    public final ConversationId b;
    public final Optional c;
    public final able d;
    public final alse e;
    public final fgcm f;
    public final fgcm g;
    public final AtomicInteger h;
    private final ffsk i;
    private final ffbr j;
    private final ffls k;
    private final ffxx l;

    static {
        ffko ffkoVar = new ffko(abll.class, "timerState", "getTimerState()Lcom/google/android/apps/messaging/conversation2/search/ConversationSearchResultsImpl$TimerState;", 0);
        int i = fflc.a;
        a = new ffmx[]{ffkoVar};
    }

    public abll(ffsk ffskVar, ConversationId conversationId, ffbr ffbrVar, Optional optional, able ableVar, alse alseVar) {
        ffskVar.getClass();
        conversationId.getClass();
        ffbrVar.getClass();
        alseVar.getClass();
        this.i = ffskVar;
        this.b = conversationId;
        this.j = ffbrVar;
        this.c = optional;
        this.d = ableVar;
        this.e = alseVar;
        fgcm a2 = fgdm.a(null);
        this.f = a2;
        fgcm a3 = fgdm.a(-1);
        this.g = a3;
        this.h = new AtomicInteger();
        this.k = new abli(ablg.b, this);
        fgcm b = axrb.b(a2, "ConversationSearchResults::SearchResults");
        fgcm b2 = axrb.b(a3, "ConversationSearchResults::CurrentResult");
        long j = ffpw.a;
        Object b3 = ffbrVar.b();
        b3.getClass();
        this.l = axsp.c(b, b2, ffskVar, ffpy.e(((Number) b3).longValue(), ffpz.c), new ablh(null));
    }

    @Override // defpackage.ablf
    public final ffxx a() {
        return this.l;
    }

    @Override // defpackage.ablf
    public final /* synthetic */ ffxx b() {
        return this.f;
    }

    @Override // defpackage.ablf
    public final void c() {
        ablm ablmVar = (ablm) this.f.c();
        if (ablmVar != null) {
            fgcm fgcmVar = this.g;
            fgcmVar.f(Integer.valueOf(((Number) fgcmVar.c()).intValue() == 0 ? ffdx.e(ablmVar.b) : ((Number) this.g.c()).intValue() - 1));
        }
    }

    @Override // defpackage.ablf
    public final void d() {
        ablm ablmVar = (ablm) this.f.c();
        if (ablmVar != null) {
            fgcm fgcmVar = this.g;
            fgcmVar.f(Integer.valueOf(((Number) fgcmVar.c()).intValue() == ffdx.e(ablmVar.b) ? 0 : ((Number) this.g.c()).intValue() + 1));
        }
    }

    @Override // defpackage.ablf
    public final void e() {
        axol.k(this.i, null, new ablk(this, null), 3);
    }

    public final void f(ablg ablgVar) {
        this.k.d(a[0], ablgVar);
    }

    public final void g(String str, engw engwVar) {
        this.f.f(new ablm(str, engwVar));
        this.g.f(Integer.valueOf(true != engwVar.isEmpty() ? 0 : -1));
    }
}
