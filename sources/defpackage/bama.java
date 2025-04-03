package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bama extends ffhv implements ffjm {
    final /* synthetic */ bamw a;
    final /* synthetic */ int b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ long e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bama(ffgu ffguVar, bamw bamwVar, int i, String str, String str2, long j) {
        super(2, ffguVar);
        this.a = bamwVar;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = j;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bama) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        bamw bamwVar = this.a;
        bamwVar.d.c(bamwVar.c, this.b, this.c, this.d, 131, this.e);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        bama bamaVar = new bama(ffguVar, this.a, this.b, this.c, this.d, this.e);
        bamaVar.f = obj;
        return bamaVar;
    }
}
