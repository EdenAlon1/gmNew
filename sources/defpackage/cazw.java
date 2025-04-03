package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cazw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ bcyd b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cazw(bcyd bcydVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = bcydVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cazw) c((ffxe) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxe ffxeVar = (ffxe) this.c;
            bcyd bcydVar = this.b;
            bcydVar.c = new cazv(ffxeVar);
            bcydVar.ga("createVCardContentUiData");
            final bcyd bcydVar2 = this.b;
            ffix ffixVar = new ffix() { // from class: cazu
                @Override // defpackage.ffix
                public final Object invoke() {
                    ((enrr) cazx.a.e().h("com/google/android/apps/messaging/shared/datamodel/media/VCardCallbackFlow$get$1", "invokeSuspend$lambda$0", 36, "VCardCallbackFlow.kt")).q("Unbinding listener to vcard");
                    bcyd.this.g("createVCardContentUiData");
                    return ffcu.a;
                }
            };
            this.a = 1;
            if (ffxd.b(ffxeVar, ffixVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cazw cazwVar = new cazw(this.b, ffguVar);
        cazwVar.c = obj;
        return cazwVar;
    }
}
