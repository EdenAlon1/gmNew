package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnpf extends ffhv implements ffjm {
    final /* synthetic */ aene a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnpf(aene aeneVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = aeneVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnpf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((ejvp) this.a.a.b()).a(elfo.e(null), aefc.a);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cnpf(this.a, ffguVar);
    }
}
