package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xxv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ xyd b;
    final /* synthetic */ xyd c;
    final /* synthetic */ boolean d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xxv(ffgu ffguVar, xyd xydVar, xyd xydVar2, boolean z) {
        super(2, ffguVar);
        this.b = xydVar;
        this.c = xydVar2;
        this.d = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xxv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                ffci.b(obj);
                return obj;
            }
            ffci.b(obj);
            return obj;
        }
        ffci.b(obj);
        if (this.b.f.a()) {
            this.e = this;
            this.a = 1;
            ffrh ffrhVar = new ffrh(ffhi.c(this), 1);
            ffrhVar.B();
            axpl axplVar = new axpl(new axpe(ffrhVar));
            xyd xydVar = this.c;
            xydVar.d.e(new xya(axplVar, xydVar, this.d));
            Object m = ffrhVar.m();
            if (m != ffhhVar) {
                return m;
            }
        } else {
            this.e = this;
            this.a = 2;
            ffrh ffrhVar2 = new ffrh(ffhi.c(this), 1);
            ffrhVar2.B();
            axpl axplVar2 = new axpl(ffrhVar2);
            xyd xydVar2 = this.c;
            xydVar2.d.e(new xya(axplVar2, xydVar2, this.d));
            Object m2 = ffrhVar2.m();
            if (m2 != ffhhVar) {
                return m2;
            }
        }
        return ffhhVar;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        xxv xxvVar = new xxv(ffguVar, this.b, this.c, this.d);
        xxvVar.e = obj;
        return xxvVar;
    }
}
