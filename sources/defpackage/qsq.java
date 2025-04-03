package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qsq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ qsu b;
    final /* synthetic */ qqo c;
    final /* synthetic */ qqs d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qsq(qsu qsuVar, qqo qqoVar, qqs qqsVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = qsuVar;
        this.c = qqoVar;
        this.d = qqsVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qsq) c((ffxe) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxe ffxeVar = (ffxe) this.e;
            final qso qsoVar = new qso(ffxeVar, this.b);
            qqo qqoVar = this.c;
            qqoVar.u(qsoVar, qsoVar, qqoVar, new Executor() { // from class: qqc
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    runnable.run();
                }
            });
            final qqs qqsVar = this.d;
            ffix ffixVar = new ffix() { // from class: qsp
                @Override // defpackage.ffix
                public final Object invoke() {
                    qqs.this.l(qsoVar);
                    return ffcu.a;
                }
            };
            this.a = 1;
            if (ffxd.b(ffxeVar, ffixVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        qsq qsqVar = new qsq(this.b, this.c, this.d, ffguVar);
        qsqVar.e = obj;
        return qsqVar;
    }
}
