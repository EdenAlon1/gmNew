package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yul extends ffhv implements ffjn {
    /* synthetic */ boolean a;
    /* synthetic */ Object b;
    final /* synthetic */ yvf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yul(yvf yvfVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = yvfVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        yul yulVar = new yul(this.c, (ffgu) obj3);
        yulVar.a = booleanValue;
        yulVar.b = (Integer) obj2;
        return yulVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        boolean z = this.a;
        Object obj2 = this.b;
        if (z) {
            Object e = ardj.c.e();
            e.getClass();
            return ernk.g(((Number) e).intValue());
        }
        if (((Boolean) ardj.a.e()).booleanValue()) {
            Object e2 = ardj.b.e();
            e2.getClass();
            return ernk.g(((Number) e2).intValue());
        }
        if (obj2 == null) {
            return null;
        }
        Duration g = ernk.g((((Number) obj2).intValue() * 8) / this.c.c);
        if (g.compareTo(ernk.e(1)) >= 0) {
            Duration a = yvf.a(g, ernk.e(1));
            a.getClass();
            return a;
        }
        Duration a2 = yvf.a(g, ernk.g(10));
        a2.getClass();
        return a2;
    }
}
