package defpackage;

import java.io.File;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akbl extends ffhv implements ffjm {
    final /* synthetic */ akbo a;
    final /* synthetic */ UUID b;
    final /* synthetic */ File c;
    final /* synthetic */ som d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akbl(ffgu ffguVar, akbo akboVar, UUID uuid, File file, som somVar) {
        super(2, ffguVar);
        this.a = akboVar;
        this.b = uuid;
        this.c = file;
        this.d = somVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akbl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ensk h = akbo.a.h();
        h.Y(ente.a, "BugleBackup");
        ((enrr) h.h("com/google/android/apps/messaging/restore/impl/RestoreAnytimeCompatibleRestoreWorkflowSteps$requestBugleDbRestore$lambda$3$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 149, "RestoreAnytimeCompatibleRestoreWorkflowSteps.kt")).w("Requested DB restore: workflowVersion: [%s] sessionId: [%s]", 5, this.b);
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
        ((cbwj) this.a.f.b()).b("requestBugleDbRestore", new akbk(this.a, this.b, akch.a(akcfVar), this.d));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        akbl akblVar = new akbl(ffguVar, this.a, this.b, this.c, this.d);
        akblVar.e = obj;
        return akblVar;
    }
}
