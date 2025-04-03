package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gfv extends ffkk implements ffjm {
    final /* synthetic */ fxz a;
    final /* synthetic */ giz b;
    final /* synthetic */ glv c;
    final /* synthetic */ gvs d;
    final /* synthetic */ ffjm e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfv(fxz fxzVar, giz gizVar, glv glvVar, gvs gvsVar, ffjm ffjmVar) {
        super(2);
        this.a = fxzVar;
        this.b = gizVar;
        this.c = glvVar;
        this.d = gvsVar;
        this.e = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            fxz fxzVar = this.a;
            giz gizVar = this.b;
            if (gizVar == null) {
                gizVar = new gix();
            }
            gga.b(fxzVar, gizVar, this.c, this.d, this.e, hfdVar, 0);
        }
        return ffcu.a;
    }
}
