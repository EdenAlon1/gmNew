package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtgk extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;

    public dtgk(ffgu ffguVar) {
        super(3, ffguVar);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dtgk dtgkVar = new dtgk((ffgu) obj3);
        dtgkVar.a = (dtga) obj;
        dtgkVar.b = (Duration) obj2;
        return dtgkVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object obj2 = this.a;
        boolean z = obj2 instanceof dtfy;
        Object obj3 = this.b;
        if (!z) {
            return obj2;
        }
        obj3.getClass();
        return new dtfy((Duration) obj3);
    }
}
