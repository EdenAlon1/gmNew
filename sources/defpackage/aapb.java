package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aapb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ MessageId b;
    final /* synthetic */ aapg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aapb(MessageId messageId, aapg aapgVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = messageId;
        this.c = aapgVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aapb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ((enrr) aapg.a.h().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/video2/VideoBubbleUiAdapter$onDownloadClicked$1", "invokeSuspend", 453, "VideoBubbleUiAdapter.kt")).t("Resuming file transfer for messageId=%s", this.b);
            aapg aapgVar = this.c;
            elfl E = aapgVar.n.E(this.b);
            this.a = 1;
            obj = fgfz.c(E, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aapb(this.b, this.c, ffguVar);
    }
}
