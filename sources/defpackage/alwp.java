package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alwp extends ffhv implements ffjm {
    final /* synthetic */ alwq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alwp(alwq alwqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = alwqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((alwp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        if (((Boolean) ((cfup) alwj.b.get()).e()).booleanValue()) {
            alwq alwqVar = this.a;
            if (!((Optional) alwqVar.a.b()).isEmpty()) {
                ((ensz) alwqVar.c.h()).q("logging the cobalt app install metric");
                alwh alwhVar = alwqVar.b;
                if (((Boolean) ((cfup) alwj.b.get()).e()).booleanValue()) {
                    if (alwhVar.b.isPresent()) {
                        ((alwk) alwhVar.b.get()).a(2L, alwhVar.a());
                    }
                    alwhVar.c.a(4, ermn.l(alwhVar.a())).t(new dhqv() { // from class: alwg
                        @Override // defpackage.dhqv
                        public final void d(Exception exc) {
                            if ((exc instanceof dfqu) && ((dfqu) exc).a() == 17) {
                                return;
                            }
                            ((enrr) ((enrr) ((enrr) alwh.a.j()).g(exc)).h("com/google/android/apps/messaging/shared/analytics/statistics/cobalt/AppInstallCobaltLogger", "logUnexpectedFailure", 71, "AppInstallCobaltLogger.java")).t("Failed to log to Cobalt in GMS Core: %s", exc);
                        }
                    });
                }
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new alwp(this.a, ffguVar);
    }
}
