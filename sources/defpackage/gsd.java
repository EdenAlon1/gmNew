package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gsd extends ffkk implements ffjm {
    final /* synthetic */ grs a;
    final /* synthetic */ cmw b;
    final /* synthetic */ ftb c;
    final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsd(grs grsVar, cmw cmwVar, ftb ftbVar, boolean z) {
        super(2);
        this.a = grsVar;
        this.b = cmwVar;
        this.c = ftbVar;
        this.d = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hfz.a(fzc.a.c(new ibw(this.a.a(false))), hpx.d(-596940007, new gsc(this.b, this.c, this.d), hfdVar), hfdVar, 56);
        }
        return ffcu.a;
    }
}
