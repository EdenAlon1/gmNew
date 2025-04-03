package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oul extends ffhv implements ffjm {
    int a;
    final /* synthetic */ our b;
    final /* synthetic */ ffix c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oul(our ourVar, ffix ffixVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ourVar;
        this.c = ffixVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((oul) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            our ourVar = this.b;
            this.a = 1;
            obj = ourVar.b(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new oul(this.b, this.c, ffguVar);
    }
}
