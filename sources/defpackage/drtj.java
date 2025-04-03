package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drtj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ drud b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drtj(drud drudVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = drudVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drtj) c((edfo) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        edfo edfoVar = (edfo) this.c;
        drud drudVar = this.b;
        edek edekVar = (edek) edel.a.createBuilder();
        edekVar.getClass();
        edem.b(drudVar.a, edekVar);
        edel a = edem.a(edekVar);
        this.a = 1;
        Object b = edfoVar.b(a, new febo(), this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        drtj drtjVar = new drtj(this.b, ffguVar);
        drtjVar.c = obj;
        return drtjVar;
    }
}
