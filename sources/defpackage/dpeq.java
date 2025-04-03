package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpeq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dpev b;
    final /* synthetic */ Exception c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpeq(dpev dpevVar, Exception exc, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dpevVar;
        this.c = exc;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpeq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dpev dpevVar = this.b;
            Exception exc = this.c;
            this.a = 1;
            if (dpevVar.e(exc, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpeq(this.b, this.c, ffguVar);
    }
}
