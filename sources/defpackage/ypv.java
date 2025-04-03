package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ypv extends ffhv implements ffjo {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ yqb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypv(yqb yqbVar, ffgu ffguVar) {
        super(4, ffguVar);
        this.d = yqbVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        ypv ypvVar = new ypv(this.d, (ffgu) obj4);
        ypvVar.a = (cnpk) obj;
        ypvVar.b = (aqux) obj2;
        ypvVar.c = (aqvj) obj3;
        return ypvVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aqux, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        dsat b;
        ffci.b(obj);
        Object obj2 = this.a;
        ?? r0 = this.b;
        if ((((atti) this.d.n.b()).a() ? ((aqvj) this.c).a() : ((cnpk) obj2).b()) && (r0 == 0 || !r0.s())) {
            return ((ysk) this.d.d.b()).b(true);
        }
        b = ((ysk) this.d.d.b()).b(false);
        return b;
    }
}
