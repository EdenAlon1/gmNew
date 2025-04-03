package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class draf extends ffhv implements ffji {
    int a;
    final /* synthetic */ drag b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public draf(drag dragVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = dragVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        drag dragVar = this.b;
        ffhd hT = dragVar.b.hT();
        drae draeVar = new drae(dragVar, null);
        this.a = 1;
        Object a = ffra.a(hT, draeVar, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new draf(this.b, (ffgu) obj).b(ffcu.a);
    }
}
