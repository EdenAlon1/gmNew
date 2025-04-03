package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dusy implements erqj {
    final /* synthetic */ duul a;
    final /* synthetic */ int b;
    final /* synthetic */ dutb c;

    public dusy(dutb dutbVar, duul duulVar, int i) {
        this.a = duulVar;
        this.b = i;
        this.c = dutbVar;
    }

    @Override // defpackage.erqj
    public final /* synthetic */ void b(Object obj) {
        engw engwVar = (engw) obj;
        ((enrr) ((enrr) dutb.a.h()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController$6", "onSuccess", 977, "EmojiPickerController.java")).r("Emoji picker pageable data loaded %d items.", engwVar.size());
        dutb dutbVar = this.c;
        dusd f = dutbVar.f();
        dutbVar.r++;
        duul duulVar = this.a;
        if (duulVar.f()) {
            engr engrVar = new engr();
            engrVar.j(engwVar);
            engrVar.h(duvd.a);
            engwVar = engrVar.g();
        } else if (engwVar.isEmpty()) {
            String d = duulVar.d();
            d.getClass();
            engwVar = engw.r(new duvc(d));
        }
        duui.a(dutbVar.l, engwVar, dutbVar.q, dutbVar.t, dutbVar.f, dutbVar.e);
        boolean z = f.e;
        this.c.m.set(false);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        ((enrr) ((enrr) ((enrr) dutb.a.j()).g(th)).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController$6", "onFailure", 987, "EmojiPickerController.java")).r("Emoji picker pageable data loading page %d failed.", this.b);
        dusd f = this.c.f();
        int i = duty.c;
        dutb dutbVar = this.c;
        dutbVar.f().F(dutbVar.q);
        this.a.h();
        boolean z = f.e;
        this.c.m.set(false);
    }
}
