package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xge {
    public static final xgf a(dqrp dqrpVar, int i) {
        int i2;
        dqro dqroVar = dqrpVar.d;
        if (ffkj.e(dqroVar, dqrm.a)) {
            i2 = 2;
        } else if (ffkj.e(dqroVar, dqrk.a)) {
            i2 = 3;
        } else if (dqroVar instanceof dqrn) {
            i2 = 4;
        } else {
            if (!ffkj.e(dqroVar, dqrl.a)) {
                throw new ffcd();
            }
            i2 = i == 3 ? 5 : 6;
        }
        return new xgf(dqrpVar.b, i2, dqrpVar.e);
    }
}
