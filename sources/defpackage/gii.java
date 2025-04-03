package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gii extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffix b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gii(ffix ffixVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffixVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gii) c((ild) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ild ildVar = (ild) this.c;
            gih gihVar = new gih(this.b);
            this.a = 1;
            if (dtr.i(ildVar, null, null, null, gihVar, this, 7) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        gii giiVar = new gii(this.b, ffguVar);
        giiVar.c = obj;
        return giiVar;
    }
}
