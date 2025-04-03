package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqtp extends tx {
    final /* synthetic */ dqtz c;

    public dqtp(dqtz dqtzVar) {
        this.c = dqtzVar;
    }

    @Override // defpackage.tx
    public final int b(int i) {
        dqur dqurVar = this.c.ag;
        if (dqurVar == null || dqurVar.I(i).b() != 1) {
            return 1;
        }
        dqur dqurVar2 = this.c.ag;
        if (dqurVar2 == null) {
            ffkj.c("currentAdapter");
            dqurVar2 = null;
        }
        return dqurVar2.h;
    }
}
