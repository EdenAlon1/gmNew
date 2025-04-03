package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alec extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aled b;
    final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alec(aled aledVar, long j, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aledVar;
        this.c = j;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((alec) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl a = this.b.b.a(new IllegalArgumentException("BugleComposeRow2 ComposeNavigationEvent duration exceeded INT_MAX: " + this.c));
            this.a = 1;
            if (fgfz.c(a, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new alec(this.b, this.c, ffguVar);
    }
}
