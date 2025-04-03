package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aadm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aaee b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aadm(aaee aaeeVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aaeeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aadm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ensk g = aaee.a.g();
            g.Y(ente.a, "BugleImage");
            ((enrr) g.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/image/ImageBubbleUiAdapter$1", "invokeSuspend", 181, "ImageBubbleUiAdapter.kt")).q("Checking to recover media viewer result");
            aaee aaeeVar = this.b;
            this.a = 1;
            obj = aaeeVar.x.a(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        ainw ainwVar = (ainw) obj;
        if (ainwVar != null) {
            ensk g2 = aaee.a.g();
            g2.Y(ente.a, "BugleImage");
            ((enrr) g2.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/image/ImageBubbleUiAdapter$1", "invokeSuspend", 184, "ImageBubbleUiAdapter.kt")).q("Recovered media viewer result");
            this.b.b(ainwVar);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aadm(this.b, ffguVar);
    }
}
