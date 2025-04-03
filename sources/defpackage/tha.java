package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tha extends ffhv implements ffjm {
    int a;
    final /* synthetic */ thb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tha(thb thbVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = thbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tha) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl a = this.b.c.a();
            a.getClass();
            this.a = 1;
            obj = fgfz.c(a, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        thb thbVar = this.b;
        fbew fbewVar = (fbew) obj;
        enip d = thbVar.d.d();
        fbewVar.getClass();
        return Boolean.valueOf(d.contains(thbVar.e.k(thbVar.e.n(fbewVar.c))) && fbewVar.b);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new tha(this.b, ffguVar);
    }
}
