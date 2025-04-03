package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpek extends ffhv implements ffjm {
    final /* synthetic */ ffrp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpek(ffrp ffrpVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ffrpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpek) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((ffuq) this.a).S(ffcu.a);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpek(this.a, ffguVar);
    }
}
