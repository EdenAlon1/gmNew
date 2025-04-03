package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ump extends ffhv implements ffjm {
    final /* synthetic */ umw a;
    final /* synthetic */ dbyf b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ump(ffgu ffguVar, umw umwVar, dbyf dbyfVar) {
        super(2, ffguVar);
        this.a = umwVar;
        this.b = dbyfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ump) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return this.a.d.a(this.b);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ump umpVar = new ump(ffguVar, this.a, this.b);
        umpVar.c = obj;
        return umpVar;
    }
}
