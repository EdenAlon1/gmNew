package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pmb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ pmc b;
    final /* synthetic */ Activity c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pmb(pmc pmcVar, Activity activity, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = pmcVar;
        this.c = activity;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((pmb) c((ffxe) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            final ffxe ffxeVar = (ffxe) this.d;
            ksp kspVar = new ksp() { // from class: ply
                @Override // defpackage.ksp
                public final void accept(Object obj2) {
                    ffxe.this.b((pmd) obj2);
                }
            };
            pmc pmcVar = this.b;
            pmcVar.b.a(this.c, new Executor() { // from class: plz
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    runnable.run();
                }
            }, kspVar);
            pma pmaVar = new pma(this.b, kspVar);
            this.a = 1;
            if (ffxd.b(ffxeVar, pmaVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        pmb pmbVar = new pmb(this.b, this.c, ffguVar);
        pmbVar.d = obj;
        return pmbVar;
    }
}
