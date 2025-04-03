package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chvv extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ chvw c;
    final /* synthetic */ boolean d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chvv(chvw chvwVar, boolean z, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = chvwVar;
        this.d = z;
        this.e = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chvv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object it;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            it = this.a;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            if (((Optional) this.c.c.b()).isEmpty()) {
                ensk h = chvw.a.h();
                h.Y(ente.a, "BugleGDitto");
                ((enrr) h.h("com/google/android/apps/messaging/shared/net/handler/GaiaPairingInfoUpdateHandler$processOnAllActiveDesktops$1", "invokeSuspend", 40, "GaiaPairingInfoUpdateHandler.kt")).q("DittoRetryExecutor not present, skip send Gaia pairing info");
                return ffcu.a;
            }
            if (!this.d) {
                int b = ((bzgd) this.c.d.b()).b(true);
                ensk e = chvw.a.e();
                e.Y(ente.a, "BugleGDitto");
                ((enrr) e.h("com/google/android/apps/messaging/shared/net/handler/GaiaPairingInfoUpdateHandler$processOnAllActiveDesktops$1", "invokeSuspend", 45, "GaiaPairingInfoUpdateHandler.kt")).r("Enabled [%s] QR clients", b);
            }
            it = ((bzgd) this.c.d.b()).l().iterator();
            it.getClass();
        }
        while (true) {
            enqu enquVar = (enqu) it;
            if (!enquVar.hasNext()) {
                if (this.d) {
                    int b2 = ((bzgd) this.c.d.b()).b(false);
                    ensk e2 = chvw.a.e();
                    e2.Y(ente.a, "BugleGDitto");
                    ((enrr) e2.h("com/google/android/apps/messaging/shared/net/handler/GaiaPairingInfoUpdateHandler$processOnAllActiveDesktops$1", "invokeSuspend", 56, "GaiaPairingInfoUpdateHandler.kt")).r("Disabled [%s] QR clients", b2);
                }
                return ffcu.a;
            }
            bzej bzejVar = (bzej) enquVar.next();
            if (ffkj.e(bzejVar.c().a.d, "Bugle")) {
                chvw chvwVar = this.c;
                bzejVar.getClass();
                String str = this.e;
                boolean z = this.d;
                ensk e3 = chvw.a.e();
                e3.Y(ente.a, "BugleGDitto");
                ((enrr) e3.h("com/google/android/apps/messaging/shared/net/handler/GaiaPairingInfoUpdateHandler", "sendGaiaPairingInfoRpc", 67, "GaiaPairingInfoUpdateHandler.kt")).t("send GaiaPairingInfo to desktop with requestId: %s", bzejVar.e());
                chwu a = ((chww) chvwVar.b.b()).a(bzejVar.c(), esaa.GET_UPDATES);
                a.c = bzejVar.e();
                erxg erxgVar = (erxg) erxi.a.createBuilder();
                erxgVar.getClass();
                ervw ervwVar = (ervw) ervx.a.createBuilder();
                ervwVar.getClass();
                ervwVar.copyOnWrite();
                ((ervx) ervwVar.instance).b = str;
                ervwVar.copyOnWrite();
                ((ervx) ervwVar.instance).c = z;
                eyfy build = ervwVar.build();
                build.getClass();
                erxgVar.copyOnWrite();
                erxi erxiVar = (erxi) erxgVar.instance;
                erxiVar.c = (ervx) build;
                erxiVar.b = 15;
                eyfy build2 = erxgVar.build();
                build2.getClass();
                a.b((erxi) build2);
                elfl a2 = ((cikg) ((Optional) chvwVar.c.b()).get()).a(a.a());
                a2.getClass();
                this.a = it;
                this.b = 1;
                if (fgfz.c(a2, this) == ffhhVar) {
                    return ffhhVar;
                }
            }
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new chvv(this.c, this.d, this.e, ffguVar);
    }
}
