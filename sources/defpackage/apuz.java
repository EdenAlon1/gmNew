package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apuz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ apva b;
    final /* synthetic */ MessageId c;
    long d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apuz(ffgu ffguVar, apva apvaVar, MessageId messageId) {
        super(2, ffguVar);
        this.b = apvaVar;
        this.c = messageId;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((apuz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        long j;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            j = this.d;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            apva apvaVar = this.b;
            MessageId messageId = this.c;
            long a = apvaVar.e.a();
            elfl h = apvaVar.b.h(messageId);
            h.getClass();
            this.d = a;
            this.a = 1;
            obj = fgfz.c(h, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
            j = a;
        }
        obj.getClass();
        return new apvv((alxw) obj, j);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        apuz apuzVar = new apuz(ffguVar, this.b, this.c);
        apuzVar.e = obj;
        return apuzVar;
    }
}
