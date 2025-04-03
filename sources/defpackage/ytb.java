package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ytb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ yti b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ytb(yti ytiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ytiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ytb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ensk g = yti.b.g();
            g.Y(ente.a, "BugleComposeRow2");
            ((enrr) g.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/files/FilesShortcutHandler$1", "invokeSuspend", 75, "FilesShortcutHandler.kt")).q("Checking to recover file picker result");
            yti ytiVar = this.b;
            this.a = 1;
            if (ytiVar.f(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ytb(this.b, ffguVar);
    }
}
