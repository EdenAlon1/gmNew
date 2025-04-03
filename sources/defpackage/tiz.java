package defpackage;

import com.google.android.gms.auth.UserRecoverableAuthException;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tiz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ tja b;
    final /* synthetic */ eisx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tiz(tja tjaVar, eisx eisxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = tjaVar;
        this.c = eisxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tiz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                tiy tiyVar = (tiy) ((Optional) ((fbbb) this.b.b).a).get();
                this.a = 1;
                obj = tiyVar.a();
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
            }
            tix tixVar = (tix) obj;
            eszw b = eszw.b(tixVar.b);
            if (b == null) {
                b = eszw.MULTI_DEVICE_STATE_UNSPECIFIED;
            }
            if (b == eszw.ENABLED) {
                String str = tixVar.c;
                str.getClass();
                if (str.length() > 0 && tixVar.d) {
                    ((adsd) this.b.c.b()).a(30);
                    ((akzt) this.b.d.b()).c("Bugle.Prompt.Fi.SignIn.Trigger.Event.Counts");
                }
            }
        } catch (Throwable th) {
            ensk j = tja.a.j();
            j.Y(ente.a, "BugleCms");
            ((enrr) ((enrr) j).g(th).h("com/google/android/apps/messaging/cloudstore/fi/signinpromo/FiSignInPromoOnDelayedAccountChanged$execute$1", "invokeSuspend", 55, "FiSignInPromoOnDelayedAccountChanged.kt")).q("Failed to retrieve FiSignInPromoData");
            if ((th instanceof fedn) && (th.getCause() instanceof UserRecoverableAuthException)) {
                ((akzt) this.b.d.b()).e("Bugle.Prompt.Fi.SignIn.Failure.Event.Counts", 1);
            } else {
                ((akzt) this.b.d.b()).e("Bugle.Prompt.Fi.SignIn.Failure.Event.Counts", 0);
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new tiz(this.b, this.c, ffguVar);
    }
}
