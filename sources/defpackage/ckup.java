package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckup extends ffhv implements ffjm {
    final /* synthetic */ ckut a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckup(ffgu ffguVar, ckut ckutVar) {
        super(2, ffguVar);
        this.a = ckutVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckup) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return Boolean.valueOf(this.a.d.d());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ckup ckupVar = new ckup(ffguVar, this.a);
        ckupVar.b = obj;
        return ckupVar;
    }
}
