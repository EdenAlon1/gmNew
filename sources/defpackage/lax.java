package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lax extends ffhv implements ffjm {
    int a;
    final /* synthetic */ lcc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lax(lcc lccVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = lccVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lax) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            lcc lccVar = this.b;
            this.a = 1;
            if (lccVar.g(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new lax(this.b, ffguVar);
    }
}
