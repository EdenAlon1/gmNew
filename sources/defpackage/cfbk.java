package defpackage;

import androidx.work.WorkerParameters;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfbk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cfbn b;
    final /* synthetic */ WorkerParameters c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfbk(cfbn cfbnVar, WorkerParameters workerParameters, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cfbnVar;
        this.c = workerParameters;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfbk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cfbn cfbnVar = this.b;
        WorkerParameters workerParameters = this.c;
        workerParameters.getClass();
        this.a = 1;
        Object c = cfbnVar.c(workerParameters, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cfbk(this.b, this.c, ffguVar);
    }
}
