package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccty extends ffhv implements ffjm {
    final /* synthetic */ ccub a;
    final /* synthetic */ Queue b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ ffji e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccty(ccub ccubVar, Queue queue, int i, int i2, ffji ffjiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ccubVar;
        this.b = queue;
        this.c = i;
        this.d = i2;
        this.e = ffjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccty) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        enip i;
        ffci.b(obj);
        try {
            i = ccub.i(this.b);
        } catch (Exception e) {
            ensk j = ccub.a.j();
            j.Y(ente.a, "BugleCms");
            ((enrr) ((enrr) j).g(e).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsZeroKeyRecoveryHelper$updateZeroKeyItemsInCms$1", "invokeSuspend", 204, "CmsZeroKeyRecoveryHelper.kt")).r("Failed to handle updates of %s.", this.d);
        }
        if (i == null) {
            return ffcu.a;
        }
        this.a.h(this.c, i.size());
        enqu listIterator = i.listIterator();
        listIterator.getClass();
        while (listIterator.hasNext()) {
            String str = (String) listIterator.next();
            try {
                ccub ccubVar = this.a;
                ccdo ccdoVar = ccubVar.d;
                ffji ffjiVar = this.e;
                int i2 = this.d;
                ccce ccceVar = ccce.a;
                cccd cccdVar = (cccd) ccce.a.createBuilder();
                cccdVar.getClass();
                str.getClass();
                ccbw.e((String) ffjiVar.invoke(str), cccdVar);
                ccbw.f(i2, cccdVar);
                ccbw.b(ccubVar.c.a(), cccdVar);
                ccbw.c(ccub.b, cccdVar);
                ccbw.d(false, cccdVar);
                ccdoVar.c(ccbw.a(cccdVar));
            } catch (Exception e2) {
                ensk j2 = ccub.a.j();
                j2.Y(ente.a, "BugleCms");
                ((enrr) ((enrr) j2).g(e2).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsZeroKeyRecoveryHelper$updateZeroKeyItemsInCms$1", "invokeSuspend", BasePaymentResult.ERROR_REQUEST_FAILED, "CmsZeroKeyRecoveryHelper.kt")).B("Failed to enqueue update of %s (type %s).", str, this.d);
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ccty(this.a, this.b, this.c, this.d, this.e, ffguVar);
    }
}
