package defpackage;

import androidx.work.WorkerParameters;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class corl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ corn b;
    final /* synthetic */ WorkerParameters c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public corl(corn cornVar, WorkerParameters workerParameters, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cornVar;
        this.c = workerParameters;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((corl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        corn.a.n().q("Received work request. Starting internal work.");
        corn cornVar = this.b;
        WorkerParameters workerParameters = this.c;
        this.a = 1;
        Object f = cornVar.f(workerParameters, this);
        return f == ffhhVar ? ffhhVar : f;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new corl(this.b, this.c, ffguVar);
    }
}
