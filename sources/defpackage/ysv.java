package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ysv extends ffhv implements ffjm {
    final /* synthetic */ ysz a;
    final /* synthetic */ dbyf b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ysv(ffgu ffguVar, ysz yszVar, dbyf dbyfVar) {
        super(2, ffguVar);
        this.a = yszVar;
        this.b = dbyfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ysv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return this.a.g.a(this.b);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ysv ysvVar = new ysv(ffguVar, this.a, this.b);
        ysvVar.c = obj;
        return ysvVar;
    }
}
