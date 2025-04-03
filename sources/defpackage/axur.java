package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axur extends ffhv implements ffjm {
    int a;
    final /* synthetic */ axus b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axur(axus axusVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = axusVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axur) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            axvh axvhVar = (axvh) this.b.b.b();
            this.a = 1;
            Object c = axvhVar.c(true, this);
            if (c != ffhh.a) {
                c = ffcu.a;
            }
            if (c == ffhhVar) {
                return ffhhVar;
            }
        }
        ((ensz) axus.a.h()).q("Successfully scheduled periodic contacts import.");
        return new ppp();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new axur(this.b, ffguVar);
    }
}
