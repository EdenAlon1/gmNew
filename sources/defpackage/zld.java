package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zld extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ zmw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zld(zmw zmwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = zmwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zld) c((cbnd) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        cbnd cbndVar;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0 && (cbndVar = (cbnd) this.b) != null) {
            zmw zmwVar = this.c;
            ((enrr) zmw.a.h().h("com/google/android/apps/messaging/conversation2/messagelist/PagedMessageListUiAdapterImpl$1$1", "invokeSuspend", 194, "PagedMessageListUiAdapterImpl.kt")).B("Scrolling to search result %s at absolute offset %s", cbndVar.a.a(), cbndVar.b);
            this.a = 1;
            if (zmwVar.h.b(cbndVar.b, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        zld zldVar = new zld(this.c, ffguVar);
        zldVar.b = obj;
        return zldVar;
    }
}
