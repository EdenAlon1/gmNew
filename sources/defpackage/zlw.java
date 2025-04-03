package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zlw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ zmw b;
    final /* synthetic */ MessageId c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zlw(zmw zmwVar, MessageId messageId, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = zmwVar;
        this.c = messageId;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zlw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            zmw zmwVar = this.b;
            MessageId messageId = this.c;
            this.a = 1;
            if (zmwVar.h.c(messageId, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new zlw(this.b, this.c, ffguVar);
    }
}
