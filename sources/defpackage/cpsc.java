package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpsc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cpsm b;
    final /* synthetic */ fcgy c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpsc(ffgu ffguVar, cpsm cpsmVar, fcgy fcgyVar) {
        super(2, ffguVar);
        this.b = cpsmVar;
        this.c = fcgyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpsc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cpsm cpsmVar = this.b;
        fcgy fcgyVar = this.c;
        this.a = 1;
        Object o = essz.o(cpsmVar, fcgyVar, this);
        return o == ffhhVar ? ffhhVar : o;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cpsc cpscVar = new cpsc(ffguVar, this.b, this.c);
        cpscVar.d = obj;
        return cpscVar;
    }
}
