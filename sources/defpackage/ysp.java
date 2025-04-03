package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ysp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ysz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ysp(ysz yszVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = yszVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ysp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ensk g = ysz.b.g();
            g.Y(ente.a, "BugleComposeRow2");
            ((enrr) g.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/contacts/ContactsShortcutHandler$1", "invokeSuspend", 98, "ContactsShortcutHandler.kt")).q("Checking to recover contact picker result");
            ysz yszVar = this.b;
            this.a = 1;
            if (yszVar.f(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ysp(this.b, ffguVar);
    }
}
