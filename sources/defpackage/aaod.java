package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaod extends ffhv implements ffjm {
    final /* synthetic */ aapj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaod(aapj aapjVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = aapjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aaod) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.o.invoke();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aaod(this.a, ffguVar);
    }
}
