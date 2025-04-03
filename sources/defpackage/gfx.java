package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gfx extends ffkk implements ffjm {
    final /* synthetic */ fxz a;
    final /* synthetic */ glv b;
    final /* synthetic */ gvs c;
    final /* synthetic */ ffjm d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfx(fxz fxzVar, glv glvVar, gvs gvsVar, ffjm ffjmVar, int i) {
        super(2);
        this.a = fxzVar;
        this.b = glvVar;
        this.c = gvsVar;
        this.d = ffjmVar;
        this.e = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        gga.c(this.a, this.b, this.c, this.d, (hfd) obj, hip.a(this.e | 1));
        return ffcu.a;
    }
}
