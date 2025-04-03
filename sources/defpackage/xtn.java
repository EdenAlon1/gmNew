package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xtn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ xuk b;
    final /* synthetic */ xhm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xtn(xuk xukVar, xhm xhmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = xukVar;
        this.c = xhmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xtn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            xuk xukVar = this.b;
            xhm xhmVar = this.c;
            this.a = 1;
            if (xukVar.b(xhmVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new xtn(this.b, this.c, ffguVar);
    }
}
