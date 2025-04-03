package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsok extends ffhv implements ffji {
    int a;
    final /* synthetic */ dsol b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsok(dsol dsolVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = dsolVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        dsol dsolVar = this.b;
        ffhd hT = dsolVar.c.hT();
        dsoj dsojVar = new dsoj(dsolVar, null);
        this.a = 1;
        Object a = ffra.a(hT, dsojVar, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dsok(this.b, (ffgu) obj).b(ffcu.a);
    }
}
