package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaoz extends ffhv implements ffjm {
    final /* synthetic */ MessageId a;
    final /* synthetic */ aapg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaoz(MessageId messageId, aapg aapgVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = messageId;
        this.b = aapgVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aaoz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((enrr) aapg.a.h().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/video2/VideoBubbleUiAdapter$onCancelClicked$1", "invokeSuspend", 462, "VideoBubbleUiAdapter.kt")).t("Pausing file transfer for messageId=%s", this.a);
        this.b.n.A(this.a);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aaoz(this.a, this.b, ffguVar);
    }
}
