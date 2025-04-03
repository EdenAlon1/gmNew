package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aadz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ MessageId b;
    final /* synthetic */ aaee c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aadz(MessageId messageId, aaee aaeeVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = messageId;
        this.c = aaeeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aadz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ensk h = aaee.a.h();
            h.Y(ente.a, "BugleImage");
            ((enrr) h.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/image/ImageBubbleUiAdapter$onDownloadClicked$1", "invokeSuspend", 678, "ImageBubbleUiAdapter.kt")).t("Resuming file transfer for messageId=%s", this.b);
            aaee aaeeVar = this.c;
            elfl E = aaeeVar.f.E(this.b);
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
        return new aadz(this.b, this.c, ffguVar);
    }
}
