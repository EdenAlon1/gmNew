package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fzy extends ffkk implements ffjm {
    final /* synthetic */ ffjm a;
    final /* synthetic */ ffjm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzy(ffjm ffjmVar, ffjm ffjmVar2) {
        super(2);
        this.a = ffjmVar;
        this.b = ffjmVar2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            fsx.a(gac.b, gac.c, hpx.d(1241707635, new fzx(this.a, this.b), hfdVar), hfdVar, 438);
        }
        return ffcu.a;
    }
}
