package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aadx extends ffhv implements ffjm {
    final /* synthetic */ MessageId a;
    final /* synthetic */ aaee b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aadx(MessageId messageId, aaee aaeeVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = messageId;
        this.b = aaeeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aadx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ensk h = aaee.a.h();
        h.Y(ente.a, "BugleImage");
        ((enrr) h.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/image/ImageBubbleUiAdapter$onCancelClicked$1", "invokeSuspend", 687, "ImageBubbleUiAdapter.kt")).t("Pausing file transfer for messageId=%s", this.a);
        this.b.f.A(this.a);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aadx(this.a, this.b, ffguVar);
    }
}
