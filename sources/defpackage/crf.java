package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class crf extends ffkk implements ffjm {
    final /* synthetic */ czq a;
    final /* synthetic */ hvi b;
    final /* synthetic */ cue c;
    final /* synthetic */ cug d;
    final /* synthetic */ String e;
    final /* synthetic */ ffjn f;
    final /* synthetic */ int g;
    final /* synthetic */ dys h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crf(dys dysVar, czq czqVar, hvi hviVar, cue cueVar, cug cugVar, String str, ffjn ffjnVar, int i) {
        super(2);
        this.h = dysVar;
        this.a = czqVar;
        this.b = hviVar;
        this.c = cueVar;
        this.d = cugVar;
        this.e = str;
        this.f = ffjnVar;
        this.g = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        cru.j(this.h, this.a, this.b, this.c, this.d, this.e, this.f, (hfd) obj, hip.a(this.g | 1));
        return ffcu.a;
    }
}
