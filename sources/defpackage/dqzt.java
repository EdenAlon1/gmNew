package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqzt extends ffhv implements ffji {
    int a;
    final /* synthetic */ drag b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqzt(drag dragVar, String str, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = dragVar;
        this.c = str;
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
        String str = this.c;
        ffhd hT = dragVar.b.hT();
        dqzs dqzsVar = new dqzs(dragVar, str, null);
        this.a = 1;
        Object a = ffra.a(hT, dqzsVar, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dqzt(this.b, this.c, (ffgu) obj).b(ffcu.a);
    }
}
