package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aarw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aasc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aarw(aasc aascVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aascVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aarw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            aasc aascVar = this.b;
            this.a = 1;
            if (aascVar.b(5, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aarw(this.b, ffguVar);
    }
}
