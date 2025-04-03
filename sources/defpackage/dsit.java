package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsit implements dqnn {
    static final /* synthetic */ ffmx[] a;
    public static final enru b;
    private final ffls d = new dsis(this);
    public final ffdn c = new ffdn();

    static {
        ffko ffkoVar = new ffko(dsit.class, "delegate", "getDelegate()Lcom/google/android/libraries/compose/draft/text/ObservableEmojiDraftTextController;", 0);
        int i = fflc.a;
        a = new ffmx[]{ffkoVar};
        b = enru.c("com/google/android/libraries/compose/ui/composable/text/DelegatingEmojiDraftTextController");
    }

    private final void p(ffji ffjiVar) {
        dqnn n = n();
        if (n != null) {
            ffjiVar.invoke(n);
        } else {
            this.c.addLast(ffjiVar);
        }
    }

    @Override // defpackage.dqmn
    public final CharSequence a() {
        CharSequence a2;
        dqnn n = n();
        return (n == null || (a2 = n.a()) == null) ? "" : a2;
    }

    @Override // defpackage.dqmn
    public final void b(final CharSequence charSequence) {
        p(new ffji() { // from class: dsio
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dqnn dqnnVar = (dqnn) obj;
                enru enruVar = dsit.b;
                dqnnVar.getClass();
                dqnnVar.b(charSequence);
                return ffcu.a;
            }
        });
    }

    @Override // defpackage.dqmn
    public final void c(final CharSequence charSequence) {
        p(new ffji() { // from class: dsil
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dqnn dqnnVar = (dqnn) obj;
                enru enruVar = dsit.b;
                dqnnVar.getClass();
                dqnnVar.c(charSequence);
                return ffcu.a;
            }
        });
    }

    @Override // defpackage.dqmn
    public final void d() {
        p(new ffji() { // from class: dsiq
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dqnn dqnnVar = (dqnn) obj;
                enru enruVar = dsit.b;
                dqnnVar.getClass();
                dqnnVar.d();
                return ffcu.a;
            }
        });
    }

    @Override // defpackage.dqmn
    public final void e() {
        p(new ffji() { // from class: dsin
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dqnn dqnnVar = (dqnn) obj;
                enru enruVar = dsit.b;
                dqnnVar.getClass();
                dqnnVar.e();
                return ffcu.a;
            }
        });
    }

    @Override // defpackage.dqmn
    public final void f(final dqrp dqrpVar) {
        p(new ffji() { // from class: dsim
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dqnn dqnnVar = (dqnn) obj;
                enru enruVar = dsit.b;
                dqnnVar.getClass();
                dqnnVar.f(dqrp.this);
                return ffcu.a;
            }
        });
    }

    @Override // defpackage.dqmn
    public final void g(final CharSequence charSequence) {
        p(new ffji() { // from class: dsij
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dqnn dqnnVar = (dqnn) obj;
                enru enruVar = dsit.b;
                dqnnVar.getClass();
                dqnnVar.g(charSequence);
                return ffcu.a;
            }
        });
    }

    @Override // defpackage.dqmn
    public final void h() {
        p(new ffji() { // from class: dsif
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dqnn dqnnVar = (dqnn) obj;
                enru enruVar = dsit.b;
                dqnnVar.getClass();
                dqnnVar.h();
                return ffcu.a;
            }
        });
    }

    @Override // defpackage.dqmn
    public final void i(final CharSequence charSequence) {
        p(new ffji() { // from class: dsik
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dqnn dqnnVar = (dqnn) obj;
                enru enruVar = dsit.b;
                dqnnVar.getClass();
                dqnnVar.i(charSequence);
                return ffcu.a;
            }
        });
    }

    @Override // defpackage.dqms
    public final void j(final dqlt dqltVar) {
        p(new ffji() { // from class: dsii
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dqnn dqnnVar = (dqnn) obj;
                enru enruVar = dsit.b;
                dqnnVar.getClass();
                dqnnVar.j(dqlt.this);
                return ffcu.a;
            }
        });
    }

    @Override // defpackage.dqnm
    public final void k(final dqnl dqnlVar) {
        p(new ffji() { // from class: dsip
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dqnn dqnnVar = (dqnn) obj;
                enru enruVar = dsit.b;
                dqnnVar.getClass();
                dqnnVar.k(dqnl.this);
                return ffcu.a;
            }
        });
    }

    @Override // defpackage.dqnm
    public final void l(final dqnl dqnlVar) {
        p(new ffji() { // from class: dsih
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dqnn dqnnVar = (dqnn) obj;
                enru enruVar = dsit.b;
                dqnnVar.getClass();
                dqnnVar.l(dqnl.this);
                return ffcu.a;
            }
        });
    }

    @Override // defpackage.dqms
    public final void m(final dqlt dqltVar) {
        p(new ffji() { // from class: dsig
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dqnn dqnnVar = (dqnn) obj;
                enru enruVar = dsit.b;
                dqnnVar.getClass();
                dqnnVar.m(dqlt.this);
                return ffcu.a;
            }
        });
    }

    public final dqnn n() {
        return (dqnn) this.d.c(a[0]);
    }

    public final void o(dqnn dqnnVar) {
        this.d.d(a[0], dqnnVar);
    }
}
