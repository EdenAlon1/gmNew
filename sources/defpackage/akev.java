package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akev extends ffhv implements ffjm {
    final /* synthetic */ akew a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akev(akew akewVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = akewVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akev) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        if (!this.a.d() || ((ctwb) this.a.e.b()).a() > 0) {
            return ffcu.a;
        }
        ((enrr) akew.a.h().h("com/google/android/apps/messaging/retailmode/RetailModeEntryPointImpl$addFakeSimIfNeeded$1", "invokeSuspend", 78, "RetailModeEntryPointImpl.kt")).q("Adding fake SIM for Retail Demo mode");
        ((ctwb) this.a.e.b()).u(2, "123456789123456789", 2, "Demo SIM", "Demo Carrier", ((aolr) this.a.f.b()).c("555-35-35", new emyl() { // from class: akeu
            @Override // defpackage.emyl
            public final Object get() {
                return Optional.of("US");
            }
        }), 132, akew.b);
        ((cbeq) this.a.g.b()).c();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new akev(this.a, ffguVar);
    }
}
