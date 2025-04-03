package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ciho extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cihr b;
    final /* synthetic */ fbzt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ciho(cihr cihrVar, fbzt fbztVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cihrVar;
        this.c = fbztVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ciho) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                cihr cihrVar = this.b;
                fbzt fbztVar = this.c;
                this.a = 1;
                obj = cihrVar.c(fbztVar, this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
            }
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            return bool;
        } catch (cihm e) {
            ensk i = cihr.a.i();
            i.Y(ente.a, "BugleDittoRcs");
            ((enrr) ((enrr) i).g(e).h("com/google/android/apps/messaging/shared/net/handler/reflectedmessage/ReflectedMessageInboxMessageHandler$handleInboxMessage$1", "invokeSuspend", 59, "ReflectedMessageInboxMessageHandler.kt")).q("Failed to handle inboxMessage");
            return true;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ciho(this.b, this.c, ffguVar);
    }
}
