package defpackage;

import java.io.File;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akad extends ffhv implements ffjm {
    final /* synthetic */ UUID a;
    final /* synthetic */ akag b;
    final /* synthetic */ File c;
    final /* synthetic */ som d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akad(ffgu ffguVar, UUID uuid, akag akagVar, File file, som somVar) {
        super(2, ffguVar);
        this.a = uuid;
        this.b = akagVar;
        this.c = file;
        this.d = somVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akad) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ensk h = akag.a.h();
        h.Y(ente.a, "BugleBackup");
        ((enrr) h.h("com/google/android/apps/messaging/restore/impl/BasicRestoreWorkflowSteps$requestBugleDbRestore$lambda$3$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 114, "BasicRestoreWorkflowSteps.kt")).t("Requested DB restore [%s]", this.a);
        akcf akcfVar = (akcf) akcg.a.createBuilder();
        akcfVar.getClass();
        akch.d(this.c.getAbsolutePath(), akcfVar);
        akcc akccVar = (akcc) akcd.a.createBuilder();
        akccVar.getClass();
        som somVar = this.d;
        akce.b(somVar.b, akccVar);
        akce.f(somVar.a, akccVar);
        akce.c(eykn.b(somVar.c), akccVar);
        akce.d(somVar.d, akccVar);
        akce.e(somVar.e, akccVar);
        akch.c(akce.a(akccVar), akcfVar);
        ((cbwj) this.b.f.b()).b("requestBugleDbRestore", new akac(this.b, this.a, akch.a(akcfVar), this.d));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        akad akadVar = new akad(ffguVar, this.a, this.b, this.c, this.d);
        akadVar.e = obj;
        return akadVar;
    }
}
