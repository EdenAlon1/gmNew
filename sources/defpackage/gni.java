package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gni extends ffhv implements ffjm {
    int a;
    final /* synthetic */ gnn b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gni(gnn gnnVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = gnnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gni) c((ild) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ild ildVar = (ild) this.c;
            gng gngVar = new gng(this.b, null);
            gnh gnhVar = new gnh(this.b);
            this.a = 1;
            if (dtr.i(ildVar, null, null, gngVar, gnhVar, this, 3) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        gni gniVar = new gni(this.b, ffguVar);
        gniVar.c = obj;
        return gniVar;
    }
}
