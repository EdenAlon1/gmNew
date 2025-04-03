package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czds implements ehrp {
    final /* synthetic */ czdz a;

    public czds(czdz czdzVar) {
        this.a = czdzVar;
    }

    @Override // defpackage.ehro
    public final void a(ehrt ehrtVar) {
        ensk h = czdz.ah.h();
        h.Y(ente.a, "emojiGallery");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/ui/conversation/emoji/EmojiGalleryFragment$1", "onTabReselected", 83, "EmojiGalleryFragment.java")).t("onTabReselected(%s)", ehrtVar.a());
        this.a.q(ehrtVar.e);
    }

    @Override // defpackage.ehro
    public final void b(ehrt ehrtVar) {
        ensk h = czdz.ah.h();
        h.Y(ente.a, "emojiGallery");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/ui/conversation/emoji/EmojiGalleryFragment$1", "onTabSelected", 91, "EmojiGalleryFragment.java")).t("onTabSelected(%s)", ehrtVar.a());
        czdz czdzVar = this.a;
        int i = ehrtVar.e;
        if (i != czdzVar.am) {
            czdzVar.am = i;
            czdzVar.q(i);
        }
    }

    @Override // defpackage.ehro
    public final void c(ehrt ehrtVar) {
        ensk h = czdz.ah.h();
        h.Y(ente.a, "emojiGallery");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/ui/conversation/emoji/EmojiGalleryFragment$1", "onTabUnselected", 102, "EmojiGalleryFragment.java")).t("onTabUnselected(%s)", ehrtVar.a());
    }
}
