package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doqy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dorc b;
    final /* synthetic */ gvi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doqy(dorc dorcVar, gvi gviVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dorcVar;
        this.c = gviVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((doqy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object a;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            gvi gviVar = this.c;
            this.a = 1;
            a = gviVar.a(dhy.a, this);
            if (a == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new doqy(this.b, this.c, ffguVar);
    }
}
