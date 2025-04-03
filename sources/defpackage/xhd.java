package defpackage;

import java.util.List;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xhd extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ xhf c;
    final /* synthetic */ List d;
    final /* synthetic */ xgv e;
    final /* synthetic */ xhe f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xhd(xhf xhfVar, List list, xgv xgvVar, xhe xheVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = xhfVar;
        this.d = list;
        this.e = xgvVar;
        this.f = xheVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xhd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
            ((enrr) f.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/send/BugleMessageQueuedLogger$logSplitRcsMessageQueued$1", "invokeSuspend", 111, "BugleMessageQueuedLogger.kt")).J("Logging split RCS message queued: %s, analyticsIds: %s, imageCompressionInfo: %s", this.c, this.d, this.e);
            xhe xheVar = this.f;
            xhf xhfVar = this.c;
            xgv xgvVar = this.e;
            List ad = ffdx.ad(ffdx.h(xheVar.d(xhfVar.a, xhfVar.b)), xheVar.c(xhfVar, xgvVar));
            int size = ad.size();
            List list2 = this.d;
            if (size != list2.size()) {
                throw new IllegalArgumentException("Size of attachmentInfos (" + ad.size() + ") and attachmentAnalyticsIds (" + list2.size() + ") must match to log each messageQueuedEvent correctly");
            }
            xhe xheVar2 = this.f;
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
        final epwy epwyVar = (epwy) obj;
        for (ffcf ffcfVar : ffdx.an(list, this.d)) {
            final List list3 = (List) ffcfVar.a;
            final long longValue = ((Number) ffcfVar.b).longValue();
            ensk f2 = xhe.a.f();
            f2.Y(ente.a, "BugleComposeRow2");
            ((enrr) f2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/send/BugleMessageQueuedLogger$logSplitRcsMessageQueued$1", "invokeSuspend", 135, "BugleMessageQueuedLogger.kt")).C("Logging message queued attachmentInfo: %s, analyticsId: %s", list3, longValue);
            final xhe xheVar3 = this.f;
            final xhf xhfVar3 = this.c;
            xheVar3.o(new Supplier() { // from class: xhc
                @Override // java.util.function.Supplier
                public final Object get() {
                    equc a = equb.a((eqaq) eqar.a.createBuilder());
                    a.c(longValue);
                    a.e();
                    a.d(list3);
                    xheVar3.e(xhfVar3.a, a);
                    epwy epwyVar2 = epwyVar;
                    if (epwyVar2 != null) {
                        a.b(epwyVar2);
                    }
                    return a.a();
                }
            });
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new xhd(this.c, this.d, this.e, this.f, ffguVar);
    }
}
