package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fwm extends ffkk implements ffjm {
    final /* synthetic */ ffix a;
    final /* synthetic */ hvi b;
    final /* synthetic */ boolean c;
    final /* synthetic */ idh d;
    final /* synthetic */ fwd e;
    final /* synthetic */ fwi f;
    final /* synthetic */ ffjn g;
    final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fwm(ffix ffixVar, hvi hviVar, boolean z, idh idhVar, fwd fwdVar, fwi fwiVar, ffjn ffjnVar, int i) {
        super(2);
        this.a = ffixVar;
        this.b = hviVar;
        this.c = z;
        this.d = idhVar;
        this.e = fwdVar;
        this.f = fwiVar;
        this.g = ffjnVar;
        this.h = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        fwo.c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (hfd) obj, hip.a(this.h | 1));
        return ffcu.a;
    }
}
