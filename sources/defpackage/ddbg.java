package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddbg implements aefa, ejlr {
    private static final enru a = enru.c("com/google/android/apps/messaging/ui/rcs/setup/manual/PositiveButtonOnClickListener");
    private final clzh b;
    private final cmao c;
    private final ajid d;

    public ddbg(clzh clzhVar, cmao cmaoVar, ajid ajidVar) {
        this.b = clzhVar;
        this.c = cmaoVar;
        this.d = ajidVar;
    }

    @Override // defpackage.aefa
    public final void a(ejlq ejlqVar, View view) {
        String str = (String) this.c.h().orElse(null);
        if (str != null) {
            clzh clzhVar = this.b;
            clza b = clzhVar.b(3, 10);
            clze clzeVar = clze.PROMO_BANNER;
            b.copyOnWrite();
            clzf clzfVar = (clzf) b.instance;
            clzf clzfVar2 = clzf.a;
            clzfVar.h = clzeVar.a();
            clzfVar.b |= 64;
            ejlqVar.i(ejlp.b(clzhVar.a(str, b.build())), new ejlm(null), this);
        }
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        ajhy ajhyVar;
        if (this.d.d() && (ajhyVar = this.d.k) != null) {
            ajhyVar.d();
        }
        ((enrr) ((enrr) a.e()).h("com/google/android/apps/messaging/ui/rcs/setup/manual/PositiveButtonOnClickListener", "onSuccess", 76, "PositiveButtonOnClickListener.java")).q("Successfully stored Banner Accepted event, triggering Input Bottomsheet Popup");
        this.d.e(6);
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
        ((enrr) ((enrr) ((enrr) a.j()).g(th)).h("com/google/android/apps/messaging/ui/rcs/setup/manual/PositiveButtonOnClickListener", "onFailure", 'S', "PositiveButtonOnClickListener.java")).q("Failed to store PhoneNumberInputUIEvent");
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void b(Object obj) {
    }
}
