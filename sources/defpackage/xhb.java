package defpackage;

import java.util.List;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xhb extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ xhf c;
    final /* synthetic */ xgv d;
    final /* synthetic */ xhe e;
    final /* synthetic */ apcs f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xhb(xhf xhfVar, apcs apcsVar, xgv xgvVar, xhe xheVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = xhfVar;
        this.f = apcsVar;
        this.d = xgvVar;
        this.e = xheVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xhb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        List list;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            Object obj2 = this.a;
            ffci.b(obj);
            list = obj2;
        } else {
            ffci.b(obj);
            ensk f = xhe.a.f();
            f.Y(ente.a, "BugleComposeRow2");
            ((enrr) f.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/send/BugleMessageQueuedLogger$logMessageQueued$1", "invokeSuspend", 78, "BugleMessageQueuedLogger.kt")).J("Logging message queued: %s, analyticsId: %s, imageCompressionInfo: %s", this.c, this.f, this.d);
            xhe xheVar = this.e;
            xhf xhfVar = this.c;
            xgv xgvVar = this.d;
            List d = xheVar.d(xhfVar.a, xhfVar.b);
            if (d == null) {
                d = ffel.a;
            }
            List ad = ffdx.ad(d, ffdx.o(xheVar.c(xhfVar, xgvVar)));
            xhe xheVar2 = this.e;
            xhf xhfVar2 = this.c;
            this.a = ad;
            this.b = 1;
            Object b = xheVar2.b(xhfVar2.a, this);
            if (b == ffhhVar) {
                return ffhhVar;
            }
            list = ad;
            obj = b;
        }
        apcs apcsVar = this.f;
        xhe xheVar3 = this.e;
        xhf xhfVar3 = this.c;
        epwy epwyVar = (epwy) obj;
        equc a = equb.a((eqaq) eqar.a.createBuilder());
        a.c(apcsVar.a);
        if (!list.isEmpty()) {
            a.e();
            a.d(list);
        }
        xheVar3.e(xhfVar3.a, a);
        if (epwyVar != null) {
            a.b(epwyVar);
        }
        final eqar a2 = a.a();
        this.e.o(new Supplier() { // from class: xha
            @Override // java.util.function.Supplier
            public final Object get() {
                return eqar.this;
            }
        });
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new xhb(this.c, this.f, this.d, this.e, ffguVar);
    }
}
