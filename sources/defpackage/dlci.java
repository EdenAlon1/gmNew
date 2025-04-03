package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlci extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dlck b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlci(dlck dlckVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dlckVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlci) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dlck dlckVar = this.b;
            this.a = 1;
            if (dlckVar.g.b(dlckVar.a, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dlci(this.b, ffguVar);
    }
}
