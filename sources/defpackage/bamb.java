package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bamb extends ffhv implements ffjm {
    final /* synthetic */ bamw a;
    final /* synthetic */ byte[] b;
    final /* synthetic */ lx c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bamb(ffgu ffguVar, bamw bamwVar, byte[] bArr, lx lxVar) {
        super(2, ffguVar);
        this.a = bamwVar;
        this.b = bArr;
        this.c = lxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bamb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cskc cskcVar = bamw.a;
        this.a.o.d(this.b, this.c);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        bamb bambVar = new bamb(ffguVar, this.a, this.b, this.c);
        bambVar.d = obj;
        return bambVar;
    }
}
