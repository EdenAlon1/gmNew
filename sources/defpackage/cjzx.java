package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjzx extends ffhv implements ffjm {
    final /* synthetic */ ckac a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjzx(ckac ckacVar, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ckacVar;
        this.b = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjzx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return this.a.a(this.b);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cjzx(this.a, this.b, ffguVar);
    }
}
