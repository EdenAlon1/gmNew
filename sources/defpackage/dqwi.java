package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqwi implements dtal {
    final /* synthetic */ dqwj a;

    public dqwi(dqwj dqwjVar) {
        this.a = dqwjVar;
    }

    @Override // defpackage.dtal
    public final void a() {
        ffud ffudVar = this.a.h;
        if (ffudVar != null) {
            ffudVar.t(null);
        }
        dqwj dqwjVar = this.a;
        dqwjVar.i = null;
        dqwjVar.f.invoke();
    }

    @Override // defpackage.dtal
    public final void b() {
        dqwj dqwjVar = this.a;
        if (dqwjVar.g == null) {
            dqwjVar.g = ffqy.d(dqwjVar.c, null, null, new dqwg(dqwjVar, null), 3);
            return;
        }
        enrr enrrVar = (enrr) dqwj.a.i();
        enrrVar.aa(ensy.MEDIUM);
        ((enrr) enrrVar.h("com/google/android/libraries/compose/emoji/ui/screen/search/EmojiSearchRenderer$resultsRenderer$1", "enable", 50, "EmojiSearchRenderer.kt")).q("ResultsRenderer.enable should only be called once!");
    }

    @Override // defpackage.dtal
    public final void c(String str) {
        ffud ffudVar = this.a.h;
        if (ffudVar != null) {
            ffudVar.t(null);
        }
        dqwj dqwjVar = this.a;
        dqwjVar.h = ffqy.d(dqwjVar.c, null, null, new dqwh(this, dqwjVar, str, null), 3);
    }
}
