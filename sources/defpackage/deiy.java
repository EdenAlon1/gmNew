package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class deiy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ deoa b;
    final /* synthetic */ deji c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public deiy(deoa deoaVar, deji dejiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = deoaVar;
        this.c = dejiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((deiy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            deoa deoaVar = this.b;
            deix deixVar = new deix(this.c);
            this.a = 1;
            if (fgct.g((fgct) deoaVar.g, deixVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new deiy(this.b, this.c, ffguVar);
    }
}
