package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cczs extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ cdaf c;
    final /* synthetic */ bqvj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cczs(cdaf cdafVar, bqvj bqvjVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = cdafVar;
        this.d = bqvjVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cczs cczsVar = new cczs(this.c, this.d, (ffgu) obj3);
        cczsVar.b = (ccui) obj2;
        return cczsVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object b;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        Object obj2 = this.b;
        cdaf cdafVar = this.c;
        Object obj3 = ((ccui) obj2).a;
        bqvj bqvjVar = this.d;
        this.a = 1;
        b = cdafVar.f.b(obj3, bqvjVar, true, ccup.a, this);
        return b == ffhhVar ? ffhhVar : b;
    }
}
