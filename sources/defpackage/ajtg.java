package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajtg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ajth b;
    final /* synthetic */ ajuh c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajtg(ffgu ffguVar, ajth ajthVar, ajuh ajuhVar) {
        super(2, ffguVar);
        this.b = ajthVar;
        this.c = ajuhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajtg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ajth ajthVar = this.b;
        ajuh ajuhVar = this.c;
        this.a = 1;
        ajql ajqlVar = ajthVar.c;
        ajqlVar.c.a().d(ajuhVar.a, new ajqe(ajuhVar.b, emyg.c(ajqlVar.e)));
        Object g = ajthVar.b.g(ajuhVar.a, this);
        return g == ffhhVar ? ffhhVar : g;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ajtg ajtgVar = new ajtg(ffguVar, this.b, this.c);
        ajtgVar.d = obj;
        return ajtgVar;
    }
}
