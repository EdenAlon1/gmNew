package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class durq implements erqj {
    final /* synthetic */ engw a;
    final /* synthetic */ durt b;

    public durq(durt durtVar, engw engwVar) {
        this.a = engwVar;
        this.b = durtVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.b.g.m(this.a);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        ((enrr) ((enrr) durt.a.h()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiListController$3", "onFailure", 220, "EmojiListController.java")).q("Emoji variant loading failed.");
        this.b.g.m(this.a);
    }
}
