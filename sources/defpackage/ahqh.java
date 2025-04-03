package defpackage;

import com.google.android.apps.messaging.R;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahqh implements eivv {
    final /* synthetic */ ahqt a;

    public ahqh(ahqt ahqtVar) {
        this.a = ahqtVar;
    }

    private final void e(int i) {
        int i2 = i - 1;
        ((aemc) this.a.p.b()).d.set(i2);
        ((uph) this.a.q.b()).a.set(i2);
    }

    @Override // defpackage.eivv
    public final void aa(eivt eivtVar) {
        ea l;
        this.a.z.p("onAccountChanged called");
        axnw.h(((axpn) this.a.s.b()).a("MainActivityPeerAccountUiCallbacks#onAccountChanged"));
        this.a.m.c = null;
        e(2);
        if (this.a.n().e()) {
            ((alrv) this.a.f.b()).f(alrv.y);
        }
        this.a.z.p("Attaching newConversationListRootFragment");
        ahqt ahqtVar = this.a;
        eisx a = eivtVar.a();
        a.getClass();
        adzc adzcVar = new adzc();
        fbae.e(adzcVar);
        ekky.b(adzcVar, a);
        cg cgVar = new cg(ahqtVar.b.a());
        cgVar.x(R.id.conversation_list_root_container, adzcVar, "conversation_list_root_fragment_tag");
        cgVar.c();
        this.a.z.p("Attaching newConversationRootFragment");
        ahqt ahqtVar2 = this.a;
        eisx a2 = eivtVar.a();
        a2.getClass();
        ahqtVar2.x(a2);
        if (!((ctvs) this.a.o.b()).d() && this.a.n().c()) {
            this.a.n().b = 0;
        }
        this.a.O();
        if (csgj.a() && ffkj.e(eivtVar.b(), "pseudonymous") && (l = this.a.l()) != null) {
            ((Optional) ((fbbb) ((aedh) ekhs.a(l)).at).a).ifPresent(new Consumer() { // from class: aeaj
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((tde) obj).b();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        ((ahrb) this.a.u.b()).b = true;
    }

    @Override // defpackage.eivv
    public final void ab() {
        this.a.z.p("onAccountLoading called");
        e(4);
    }

    @Override // defpackage.eivv
    public final void ac(eiup eiupVar) {
        this.a.z.p("onAccountError called");
        e(3);
        ((adio) this.a.j.b()).a(eiupVar);
    }

    @Override // defpackage.eivv
    public final void d() {
        ((aley) this.a.w.b()).b(this.a.b, 184226);
    }
}
