package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amsb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ amsc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amsb(amsc amscVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = amscVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amsb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl b = this.b.b.b();
            b.getClass();
            this.a = 1;
            obj = fgfz.c(b, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        obj.getClass();
        return new amsa(this.b.a, (amfx) obj);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new amsb(this.b, ffguVar);
    }
}
