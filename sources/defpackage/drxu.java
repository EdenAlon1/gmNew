package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drxu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ehrt b;
    final /* synthetic */ drxw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drxu(ehrt ehrtVar, drxw drxwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ehrtVar;
        this.c = drxwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drxu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxx c = dslh.c(this.b.i);
            drxt drxtVar = new drxt(this.b);
            this.a = 1;
            if (c.a(drxtVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new drxu(this.b, this.c, ffguVar);
    }
}
