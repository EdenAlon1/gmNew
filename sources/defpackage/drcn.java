package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drcn extends ffhv implements ffji {
    int a;
    final /* synthetic */ drco b;
    final /* synthetic */ drap c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drcn(drco drcoVar, drap drapVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = drcoVar;
        this.c = drapVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        drco drcoVar = this.b;
        drap drapVar = this.c;
        this.a = 1;
        Object a = drcoVar.a.a(drapVar, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new drcn(this.b, this.c, (ffgu) obj).b(ffcu.a);
    }
}
