package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sun extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ sup d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sun(sup supVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.d = supVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        sun sunVar = new sun(this.d, (ffgu) obj3);
        sunVar.b = (ffcf) obj;
        sunVar.c = (engw) obj2;
        return sunVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        Object obj2 = this.b;
        Object obj3 = this.c;
        ffcf ffcfVar = (ffcf) obj2;
        amop amopVar = (amop) ffcfVar.a;
        amop amopVar2 = (amop) ffcfVar.b;
        sup supVar = this.d;
        this.b = null;
        this.a = 1;
        Object a = supVar.a(amopVar, amopVar2, (engw) obj3, this);
        return a == ffhhVar ? ffhhVar : a;
    }
}
