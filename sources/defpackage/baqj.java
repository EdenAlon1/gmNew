package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baqj extends ffhv implements ffjm {
    final /* synthetic */ bara a;
    final /* synthetic */ long b;
    final /* synthetic */ String c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baqj(ffgu ffguVar, bara baraVar, long j, String str) {
        super(2, ffguVar);
        this.a = baraVar;
        this.b = j;
        this.c = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((baqj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return this.a.k.w(this.b, this.c);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        baqj baqjVar = new baqj(ffguVar, this.a, this.b, this.c);
        baqjVar.d = obj;
        return baqjVar;
    }
}
