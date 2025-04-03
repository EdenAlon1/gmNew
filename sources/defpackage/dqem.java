package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqem extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dqfc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqem(dqfc dqfcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dqfcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqem) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dqfc dqfcVar = this.b;
            dqli q = dqfcVar.q();
            List aU = dqfcVar.aU();
            this.a = 1;
            obj = q.b(aU, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            this.b.bc();
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqem(this.b, ffguVar);
    }
}
