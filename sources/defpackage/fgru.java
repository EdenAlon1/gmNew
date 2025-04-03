package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgru extends ffhv implements ffjm {
    final /* synthetic */ fgsa a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgru(ffgu ffguVar, fgsa fgsaVar) {
        super(2, ffguVar);
        this.a = fgsaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fgru) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((woi) this.a.a.b()).c(false);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        fgru fgruVar = new fgru(ffguVar, this.a);
        fgruVar.b = obj;
        return fgruVar;
    }
}
