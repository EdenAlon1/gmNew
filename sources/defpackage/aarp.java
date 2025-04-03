package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aarp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aasc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aarp(aasc aascVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aascVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aarp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            aasc aascVar = this.b;
            this.a = 1;
            if (aascVar.c(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aarp(this.b, ffguVar);
    }
}
