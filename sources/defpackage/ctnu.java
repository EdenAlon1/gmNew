package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctnu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ctof b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctnu(ctof ctofVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ctofVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctnu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ctos ctosVar = (ctos) this.b.k.b();
            this.a = 1;
            if (ctosVar.a(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ctnu(this.b, ffguVar);
    }
}
