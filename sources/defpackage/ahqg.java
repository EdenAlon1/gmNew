package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahqg extends abo {
    final /* synthetic */ ahqt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahqg(ahqt ahqtVar) {
        super(false);
        this.a = ahqtVar;
    }

    @Override // defpackage.abo
    public final void b() {
        vvn p;
        this.a.z.p("handleBackPressed");
        ea k = this.a.k();
        if (k == null || !k.aF()) {
            this.a.z.m("Conversation Root fragment is not attached; ignoring back press.");
            return;
        }
        boolean c = this.a.n().c();
        boolean d = this.a.n().d();
        if (!c && !d) {
            throw new IllegalArgumentException("expecting either the contact picker or the conversation fragment to be shown");
        }
        if (c && d && ((p = this.a.p()) == null || (p.aX() && ahqe.b(p)))) {
            this.a.z.p("handled back press by delegating to conversation fragment");
            return;
        }
        this.a.L();
        if (!c && !this.a.N() && ahqe.b(this.a.p())) {
            this.a.z.p("handled back press by delegating to conversation fragment");
            return;
        }
        ahqt ahqtVar = this.a;
        if (ahqtVar.I || ahqtVar.b.getIntent().getBooleanExtra("should_launch_home_on_back", false)) {
            this.a.N = 2;
        }
        if (d || c) {
            ahqt ahqtVar2 = this.a;
            if (!ahpj.a(ahqtVar2.b, ahqtVar2.i.a) && !this.a.n().b()) {
                this.a.d();
                this.a.z.p("handled back press by finishing conversation");
                return;
            }
        }
        try {
            h(false);
            this.a.b.gE().d();
        } catch (IllegalStateException e) {
            ensk i = ahqt.a.i();
            i.Y(ente.a, "Bugle");
            ((enrr) ((enrr) i).g(e).h("com/google/android/apps/messaging/main/MainActivityPeer$LegacyDelegatingBackPressedCallback", "handleOnBackPressed", 2730, "MainActivityPeer.kt")).q("MainActivity: FragmentActivity.OnBackPressed threw IllegalStateException - continuing");
        }
    }
}
