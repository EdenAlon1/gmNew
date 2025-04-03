package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czdt implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ czdz a;

    public czdt(czdz czdzVar) {
        this.a = czdzVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ensk e = czdz.ah.e();
        e.Y(ente.a, "emojiGallery");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/ui/conversation/emoji/EmojiGalleryFragment$2", "onGlobalLayout", 119, "EmojiGalleryFragment.java")).q("onGlobalLayout()");
        this.a.p(this);
        czdz czdzVar = this.a;
        czeh czehVar = czdzVar.aj;
        if (czehVar != null) {
            czehVar.H(ddzd.b(czdzVar.z()).x);
            czehVar.I(czehVar.o, czehVar.q);
            czdz czdzVar2 = this.a;
            czdzVar2.al.r(czdzVar2.aj.u);
            this.a.aj.p();
            int F = this.a.aj.F();
            this.a.q(F);
            this.a.r(F);
        }
    }
}
