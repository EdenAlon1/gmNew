package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class snm implements cgr {
    final /* synthetic */ Conversation a;
    final /* synthetic */ snp b;

    public snm(snp snpVar, Conversation conversation) {
        this.a = conversation;
        this.b = snpVar;
    }

    @Override // defpackage.cgr
    public final void a() {
        ((akzt) this.b.h.b()).c("Bugle.Auto.App.ReadMessage");
        this.a.c().y().i(new eroh() { // from class: snj
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return snm.this.b.p.a();
            }
        }, this.b.m);
    }

    @Override // defpackage.cgr
    public final void b(final String str) {
        Conversation conversation = this.a;
        alxs a = conversation.a();
        final alxu b = conversation.b();
        fjay a2 = cslr.a();
        ((akzt) this.b.h.b()).c("Bugle.Auto.App.ReplyMessage");
        alyx alyxVar = alyx.BEST_AVAILABLE;
        appw appwVar = new appw() { // from class: sna
            @Override // defpackage.appw
            public final /* synthetic */ engw a() {
                int i = engw.d;
                return enou.a;
            }

            @Override // defpackage.appw, defpackage.appj
            public final /* synthetic */ String b() {
                return "text/plain";
            }

            @Override // defpackage.appw
            public final String c() {
                return str;
            }
        };
        int i = engw.d;
        elfl m = a.m(alyxVar, appwVar, enou.a, null, null, null, eooi.ANDROID_AUTO_REPLY, a2, null);
        b.getClass();
        axnw.h(m.i(new eroh() { // from class: snk
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return alxu.this.b((alxv) obj);
            }
        }, this.b.m).e(alxe.class, new emwl() { // from class: snl
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ensk j = snp.d.j();
                j.Y(ente.a, "BugleAppOnAuto");
                ((enrr) ((enrr) ((enrr) j).g((alxe) obj)).h("com/google/android/apps/messaging/auto/MessagingTemplateScreen$1", "onTextReply", 318, "MessagingTemplateScreen.java")).q("Attempted to reply to non reply capable conversation");
                return null;
            }
        }, this.b.m));
    }
}
