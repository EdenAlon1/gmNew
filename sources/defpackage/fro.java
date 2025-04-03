package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fro extends ffhv implements ffjm {
    final /* synthetic */ frr a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fro(frr frrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = frrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fro) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ffsk ffskVar = (ffsk) this.b;
        ffqy.d(ffskVar, null, null, new frl(this.a, null), 3);
        ffqy.d(ffskVar, null, null, new frm(this.a, null), 3);
        return ffqy.d(ffskVar, null, null, new frn(this.a, null), 3);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        fro froVar = new fro(this.a, ffguVar);
        froVar.b = obj;
        return froVar;
    }
}
