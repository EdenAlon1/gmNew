package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwke extends ffhv implements ffjm {
    final /* synthetic */ cwkj a;
    final /* synthetic */ String b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwke(ffgu ffguVar, cwkj cwkjVar, String str) {
        super(2, ffguVar);
        this.a = cwkjVar;
        this.b = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwke) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return ((ctqh) this.a.c.b()).f(this.b);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cwke cwkeVar = new cwke(ffguVar, this.a, this.b);
        cwkeVar.c = obj;
        return cwkeVar;
    }
}
