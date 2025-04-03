package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqzr extends ffhv implements ffji {
    int a;
    final /* synthetic */ drag b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ dqzc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqzr(drag dragVar, String str, String str2, dqzc dqzcVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = dragVar;
        this.c = str;
        this.d = str2;
        this.e = dqzcVar;
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
        String str2 = this.d;
        dqzc dqzcVar = this.e;
        ffhd hT = dragVar.b.hT();
        dqzq dqzqVar = new dqzq(dragVar, str, str2, dqzcVar, null);
        this.a = 1;
        Object a = ffra.a(hT, dqzqVar, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dqzr(this.b, this.c, this.d, this.e, (ffgu) obj).b(ffcu.a);
    }
}
