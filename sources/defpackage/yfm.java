package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yfm extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ yfu c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yfm(ffgu ffguVar, yfu yfuVar) {
        super(3, ffguVar);
        this.c = yfuVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        yfm yfmVar = new yfm((ffgu) obj3, this.c);
        yfmVar.d = (ffxy) obj;
        yfmVar.b = obj2;
        return yfmVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r5 = this.d;
            MessageId messageId = (MessageId) this.b;
            ffxx yftVar = messageId != null ? new yft(aqfu.a(this.c.c.h(messageId)), this.c) : new ffyg(null);
            this.a = 1;
            if (ffyk.c(r5, yftVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
