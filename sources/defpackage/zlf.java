package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zlf extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ zmw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zlf(zmw zmwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = zmwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zlf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        fgcm fgcmVar;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            Object obj2 = this.a;
            ffci.b(obj);
            fgcmVar = obj2;
        } else {
            ffci.b(obj);
            ((enrr) zmw.a.g().h("com/google/android/apps/messaging/conversation2/messagelist/PagedMessageListUiAdapterImpl$2", "invokeSuspend", 204, "PagedMessageListUiAdapterImpl.kt")).q("Updating spatula settings");
            zmw zmwVar = this.c;
            cutv cutvVar = (cutv) zmwVar.E.b();
            zmw zmwVar2 = this.c;
            fgcm fgcmVar2 = zmwVar.K;
            this.a = fgcmVar2;
            this.b = 1;
            Object c = cutvVar.c(zmwVar2.C, this);
            if (c == ffhhVar) {
                return ffhhVar;
            }
            fgcmVar = fgcmVar2;
            obj = c;
        }
        fgcmVar.f(Boolean.valueOf(((cutr) obj).a));
        ((enrr) zmw.a.g().h("com/google/android/apps/messaging/conversation2/messagelist/PagedMessageListUiAdapterImpl$2", "invokeSuspend", 207, "PagedMessageListUiAdapterImpl.kt")).t("Spatula settings updated to %s", this.c.K.c());
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new zlf(this.c, ffguVar);
    }
}
