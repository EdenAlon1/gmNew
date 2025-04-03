package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgez extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffjn b;
    final /* synthetic */ ffxy c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgez(ffjn ffjnVar, ffxy ffxyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffjnVar;
        this.c = ffxyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fgez) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffsk ffskVar = (ffsk) this.d;
            ffjn ffjnVar = this.b;
            ffxy ffxyVar = this.c;
            this.a = 1;
            if (ffjnVar.a(ffskVar, ffxyVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        fgez fgezVar = new fgez(this.b, this.c, ffguVar);
        fgezVar.d = obj;
        return fgezVar;
    }
}
