package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class crv extends ffkk implements ffjn {
    final /* synthetic */ crw a;
    final /* synthetic */ cue b;
    final /* synthetic */ cug c;
    final /* synthetic */ String d = "animateEnterExit";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crv(crw crwVar, cue cueVar, cug cugVar) {
        super(3);
        this.a = crwVar;
        this.b = cueVar;
        this.c = cugVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        hfdVar.v(1840112047);
        hvi a = ((hvi) obj).a(ctt.i(((crx) this.a).a, this.b, this.c, null, this.d, hfdVar, 0, 4));
        hfdVar.o();
        return a;
    }
}
