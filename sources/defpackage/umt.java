package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class umt extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ ffgu c;
    final /* synthetic */ umw d;
    final /* synthetic */ doxs e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public umt(ffgu ffguVar, umw umwVar, doxs doxsVar, ffgu ffguVar2) {
        super(2, ffguVar2);
        this.c = ffguVar;
        this.d = umwVar;
        this.e = doxsVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((umt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffgu ffguVar;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            Object obj2 = this.a;
            ffci.b(obj);
            ffguVar = obj2;
        } else {
            ffci.b(obj);
            ffgu ffguVar2 = this.c;
            dqlx dqlxVar = ((dqls) this.d.f.invoke()).b;
            doxs doxsVar = this.e;
            this.a = ffguVar2;
            this.b = 1;
            Object a = dqlxVar.a(doxsVar, this);
            if (a == ffhhVar) {
                return ffhhVar;
            }
            ffguVar = ffguVar2;
            obj = a;
        }
        ffguVar.w(new Integer(((Boolean) obj).booleanValue() ? 1 : 0));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new umt(this.c, this.d, this.e, ffguVar);
    }
}
