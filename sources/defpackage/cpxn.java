package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cpxn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cpxo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpxn(cpxo cpxoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cpxoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpxn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cpxm cpxmVar = (cpxm) this.b.a.b();
            this.a = 1;
            if (cpxmVar.a(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cpxn(this.b, ffguVar);
    }
}
