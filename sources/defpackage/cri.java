package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cri extends ffkk implements ffjm {
    final /* synthetic */ boolean a;
    final /* synthetic */ hvi b;
    final /* synthetic */ cue c;
    final /* synthetic */ cug d;
    final /* synthetic */ String e;
    final /* synthetic */ ffjn f;
    final /* synthetic */ int g;
    final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cri(boolean z, hvi hviVar, cue cueVar, cug cugVar, String str, ffjn ffjnVar, int i, int i2) {
        super(2);
        this.a = z;
        this.b = hviVar;
        this.c = cueVar;
        this.d = cugVar;
        this.e = str;
        this.f = ffjnVar;
        this.g = i;
        this.h = i2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        cru.b(this.a, this.b, this.c, this.d, this.e, this.f, (hfd) obj, hip.a(this.g | 1), this.h);
        return ffcu.a;
    }
}
