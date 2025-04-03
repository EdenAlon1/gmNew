package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuos extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cuot b;
    final /* synthetic */ cupq c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuos(ffgu ffguVar, cuot cuotVar, cupq cupqVar) {
        super(2, ffguVar);
        this.b = cuotVar;
        this.c = cupqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cuos) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cupj cupjVar = (cupj) this.b.b.b();
        cupq cupqVar = this.c;
        this.a = 1;
        Object c = cupjVar.c(cupqVar, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cuos cuosVar = new cuos(ffguVar, this.b, this.c);
        cuosVar.d = obj;
        return cuosVar;
    }
}
