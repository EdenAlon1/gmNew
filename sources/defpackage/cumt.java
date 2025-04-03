package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cumt extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cumu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cumt(cumu cumuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cumuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cumt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                ((akzt) this.b.b.b()).e("Bugle.Spam.FM.TachyonFetch.Event", 1);
                cumu cumuVar = this.b;
                this.a = 1;
                if (cumuVar.a(this) == ffhhVar) {
                    return ffhhVar;
                }
            }
            ((akzt) this.b.b.b()).e("Bugle.Spam.FM.TachyonFetch.Event", 2);
        } catch (Exception e) {
            ((akzt) this.b.b.b()).e("Bugle.Spam.FM.TachyonFetch.Event", 3);
            ensk j = cumu.a.j();
            j.Y(ente.a, "BugleSpam");
            ((enrr) ((enrr) j).g(e).h("com/google/android/apps/messaging/shared/util/spam/fuzzymatching/TachyonTemplateFetcher$fetchWithoutWaitingForResults$1", "invokeSuspend", 52, "TachyonTemplateFetcher.kt")).q("failed to sync fm templates from tachyon");
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cumt(this.b, ffguVar);
    }
}
