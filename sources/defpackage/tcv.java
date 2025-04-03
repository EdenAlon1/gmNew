package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tcv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eisx b;
    final /* synthetic */ tcw c;
    final /* synthetic */ eiva d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tcv(eisx eisxVar, tcw tcwVar, eiva eivaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eisxVar;
        this.c = tcwVar;
        this.d = eivaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tcv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        tif tifVar;
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                eisx eisxVar = this.b;
                if (eisxVar.a() == -1) {
                    ensk h = tcw.a.h();
                    h.Y(ente.a, "BugleCms");
                    ((enrr) h.h("com/google/android/apps/messaging/cloudstore/accounts/FiAccountRequirement$validateFor$1", "invokeSuspend", 50, "FiAccountRequirement.kt")).q("received Invalid account.");
                    throw new tcx(1);
                }
                elfl c = ((tcz) ekhv.a(this.c.b, tcz.class, eisxVar)).b().c();
                c.getClass();
                this.a = 1;
                obj = fgfz.c(c, this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
            }
            tif tifVar2 = (tif) obj;
            if (tifVar2 == null) {
                ffkj.c("fiVerificationData");
                tifVar = null;
            } else {
                tifVar = tifVar2;
            }
            if (!tifVar.c) {
                ensk h2 = tcw.a.h();
                h2.Y(ente.a, "BugleCms");
                ((enrr) h2.h("com/google/android/apps/messaging/cloudstore/accounts/FiAccountRequirement$validateFor$1", "invokeSuspend", 81, "FiAccountRequirement.kt")).q("The selected account is not an active Fi account.");
                throw new tcx(2);
            }
            ensk h3 = tcw.a.h();
            h3.Y(ente.a, "BugleCms");
            ((enrr) h3.h("com/google/android/apps/messaging/cloudstore/accounts/FiAccountRequirement$validateFor$1", "invokeSuspend", 77, "FiAccountRequirement.kt")).q("The selected account is an active Fi account.");
            Intent intent = this.d.a;
            if (intent != null) {
                intent.putExtra("RCS_IS_ON", tifVar2.d);
            }
            return eixm.d();
        } catch (Exception e) {
            ensk j = tcw.a.j();
            j.Y(ente.a, "BugleCms");
            ((enrr) ((enrr) j).g(e).h("com/google/android/apps/messaging/cloudstore/accounts/FiAccountRequirement$validateFor$1", "invokeSuspend", 69, "FiAccountRequirement.kt")).q("internal error when get FiVerificationData.");
            throw new tcx(3, e);
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new tcv(this.b, this.c, this.d, ffguVar);
    }
}
