package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffwu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffxi b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffwu(ffxi ffxiVar, Object obj, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffxiVar;
        this.c = obj;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ffwu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object a;
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                ffxi ffxiVar = this.b;
                Object obj2 = this.c;
                this.a = 1;
                if (ffxiVar.a(obj2, this) == ffhhVar) {
                    return ffhhVar;
                }
            }
            a = ffcu.a;
        } catch (Throwable th) {
            a = ffci.a(th);
        }
        return new ffws(ffch.d(a) ? ffcu.a : new ffwq(ffch.c(a)));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ffwu ffwuVar = new ffwu(this.b, this.c, ffguVar);
        ffwuVar.d = obj;
        return ffwuVar;
    }
}
