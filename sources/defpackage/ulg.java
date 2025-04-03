package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ulg extends ffhv implements ffjm {
    final /* synthetic */ drlx a;
    final /* synthetic */ ulh b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ulg(ffgu ffguVar, drlx drlxVar, ulh ulhVar) {
        super(2, ffguVar);
        this.a = drlxVar;
        this.b = ulhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ulg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return cbgi.d(le.d(this.a.a()), this.b.a);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ulg ulgVar = new ulg(ffguVar, this.a, this.b);
        ulgVar.c = obj;
        return ulgVar;
    }
}
