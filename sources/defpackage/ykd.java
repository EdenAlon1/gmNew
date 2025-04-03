package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ykd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ yks b;
    final /* synthetic */ xhu c;
    final /* synthetic */ enhk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ykd(yks yksVar, xhu xhuVar, enhk enhkVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = yksVar;
        this.c = xhuVar;
        this.d = enhkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ykd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                yks yksVar = this.b;
                ffud k = axol.k(yksVar.e, null, new ykc(yksVar, this.c, this.d, null), 3);
                this.a = 1;
                if (k.o(this) == ffhhVar) {
                    return ffhhVar;
                }
            }
            this.b.p.f(false);
            return ffcu.a;
        } catch (Throwable th) {
            this.b.p.f(false);
            throw th;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ykd(this.b, this.c, this.d, ffguVar);
    }
}
