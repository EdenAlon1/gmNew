package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaou extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aapg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaou(aapg aapgVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aapgVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aaou) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ((enrr) aapg.a.g().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/video2/VideoBubbleUiAdapter$1", "invokeSuspend", 103, "VideoBubbleUiAdapter.kt")).q("Checking to recover media viewer result");
            aapg aapgVar = this.b;
            this.a = 1;
            obj = aapgVar.s.a(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        ainw ainwVar = (ainw) obj;
        if (ainwVar != null) {
            ((enrr) aapg.a.g().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/video2/VideoBubbleUiAdapter$1", "invokeSuspend", 106, "VideoBubbleUiAdapter.kt")).q("Recovered media viewer result");
            this.b.a(ainwVar);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aaou(this.b, ffguVar);
    }
}
