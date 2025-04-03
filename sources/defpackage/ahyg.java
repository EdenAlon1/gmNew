package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahyg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ahyk b;
    final /* synthetic */ ffud c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahyg(ahyk ahykVar, ffud ffudVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ahykVar;
        this.c = ffudVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahyg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                if (((auhm) this.b.q.b()).a()) {
                    this.b.i.b();
                }
                ffud ffudVar = this.c;
                this.a = 1;
                if (ffudVar.o(this) == ffhhVar) {
                    return ffhhVar;
                }
            }
            ((aigz) this.b.j.b()).h(new aikz(new aila()));
            if (((auhm) this.b.q.b()).a()) {
                this.b.i.c();
                this.b.r.b(null);
            }
            return ffcu.a;
        } catch (Throwable th) {
            if (((auhm) this.b.q.b()).a()) {
                this.b.i.c();
                this.b.r.b(null);
            }
            throw th;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ahyg(this.b, this.c, ffguVar);
    }
}
