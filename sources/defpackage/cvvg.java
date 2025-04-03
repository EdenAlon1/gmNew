package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvvg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cvvj b;
    final /* synthetic */ cwir c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvvg(cvvj cvvjVar, cwir cwirVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cvvjVar;
        this.c = cwirVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvvg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cvvj cvvjVar = this.b;
            cwir cwirVar = this.c;
            this.a = 1;
            if (cvvjVar.b(cwirVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cvvg(this.b, this.c, ffguVar);
    }
}
