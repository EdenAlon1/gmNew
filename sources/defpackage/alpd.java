package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alpd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ alqf b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alpd(ffgu ffguVar, alqf alqfVar, int i, int i2) {
        super(2, ffguVar);
        this.b = alqfVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((alpd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        alqf alqfVar = this.b;
        alpe alpeVar = new alpe(this.c, this.d);
        this.a = 1;
        Object b = ctzl.b(alqfVar.a, alpeVar, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        alpd alpdVar = new alpd(ffguVar, this.b, this.c, this.d);
        alpdVar.e = obj;
        return alpdVar;
    }
}
