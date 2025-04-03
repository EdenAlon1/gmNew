package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnnn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cnno b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnnn(cnno cnnoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cnnoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnnn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cnno cnnoVar = this.b;
            this.a = 1;
            if (cnnoVar.c(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cnnn(this.b, ffguVar);
    }
}
