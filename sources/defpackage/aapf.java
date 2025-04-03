package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aapf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ fgcm b;
    final /* synthetic */ MessageId c;
    final /* synthetic */ aapj d;
    final /* synthetic */ aapg e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aapf(fgcm fgcmVar, MessageId messageId, aapj aapjVar, aapg aapgVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = fgcmVar;
        this.c = messageId;
        this.d = aapjVar;
        this.e = aapgVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aapf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
            ((enrr) aapg.a.e().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/video2/VideoBubbleUiAdapter$startCountdown$1$1", "invokeSuspend", 438, "VideoBubbleUiAdapter.kt")).D("Video bubble with messageId = %s has timed out and now in %s state", this.c.a(), this.d.e);
            fgcm fgcmVar = this.b;
            aapj aapjVar = this.d;
            do {
                c = fgcmVar.c();
            } while (!fgcmVar.g(c, aapjVar));
        }
        aapg aapgVar = this.e;
        aapgVar.o.add(this.c);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aapf(this.b, this.c, this.d, this.e, ffguVar);
    }
}
