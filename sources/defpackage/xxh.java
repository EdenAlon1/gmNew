package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xxh extends ffhv implements ffjm {
    int a;
    final /* synthetic */ xyd b;
    final /* synthetic */ xyd c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xxh(ffgu ffguVar, xyd xydVar, xyd xydVar2) {
        super(2, ffguVar);
        this.b = xydVar;
        this.c = xydVar2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xxh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
            this.d = this;
            this.a = 1;
            ffrh ffrhVar = new ffrh(ffhi.c(this), 1);
            ffrhVar.B();
            axpl axplVar = new axpl(new axpe(ffrhVar));
            xyd xydVar = this.c;
            xydVar.d.d(true, new xxn(axplVar, xydVar));
            Object m = ffrhVar.m();
            if (m != ffhhVar) {
                return m;
            }
        } else {
            this.d = this;
            this.a = 2;
            ffrh ffrhVar2 = new ffrh(ffhi.c(this), 1);
            ffrhVar2.B();
            axpl axplVar2 = new axpl(ffrhVar2);
            xyd xydVar2 = this.c;
            xydVar2.d.d(true, new xxn(axplVar2, xydVar2));
            Object m2 = ffrhVar2.m();
            if (m2 != ffhhVar) {
                return m2;
            }
        }
        return ffhhVar;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        xxh xxhVar = new xxh(ffguVar, this.b, this.c);
        xxhVar.d = obj;
        return xxhVar;
    }
}
