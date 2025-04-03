package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apii extends ffhv implements ffjm {
    int a;
    final /* synthetic */ MessageId b;
    final /* synthetic */ apim c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apii(MessageId messageId, apim apimVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = messageId;
        this.c = apimVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((apii) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            MessageId messageId = this.b;
            if (messageId == null) {
                return null;
            }
            elfl u = this.c.k.u(messageId);
            u.getClass();
            this.a = 1;
            obj = fgfz.c(u, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return (alxr) obj;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new apii(this.b, this.c, ffguVar);
    }
}
