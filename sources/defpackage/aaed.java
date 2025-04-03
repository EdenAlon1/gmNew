package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaed extends ffhv implements ffjm {
    int a;
    final /* synthetic */ fgcm b;
    final /* synthetic */ MessageId c;
    final /* synthetic */ dnbw d;
    final /* synthetic */ aaee e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaed(fgcm fgcmVar, MessageId messageId, dnbw dnbwVar, aaee aaeeVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = fgcmVar;
        this.c = messageId;
        this.d = dnbwVar;
        this.e = aaeeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aaed) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object c;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            this.a = 1;
            if (ffsw.c(1000L, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        if (((Number) this.b.b().c()).intValue() > 0) {
            ensk e = aaee.a.e();
            e.Y(ente.a, "BugleImage");
            ((enrr) e.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/image/ImageBubbleUiAdapter$startCountdown$1$1", "invokeSuspend", 663, "ImageBubbleUiAdapter.kt")).D("Image bubble with messageId = %s has timed out and now in %s state", this.c.a(), this.d.f);
            fgcm fgcmVar = this.b;
            dnbw dnbwVar = this.d;
            do {
                c = fgcmVar.c();
            } while (!fgcmVar.g(c, dnbwVar));
        }
        aaee aaeeVar = this.e;
        aaeeVar.r.add(this.c);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aaed(this.b, this.c, this.d, this.e, ffguVar);
    }
}
