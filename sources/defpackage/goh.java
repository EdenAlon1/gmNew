package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class goh extends ffkk implements ffjm {
    final /* synthetic */ ffjm a;
    final /* synthetic */ ffjm b;
    final /* synthetic */ ffjm c;
    final /* synthetic */ jpo d;
    final /* synthetic */ long e;
    final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public goh(ffjm ffjmVar, ffjm ffjmVar2, ffjm ffjmVar3, jpo jpoVar, long j, long j2) {
        super(2);
        this.a = ffjmVar;
        this.b = ffjmVar2;
        this.c = ffjmVar3;
        this.d = jpoVar;
        this.e = j;
        this.f = j2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hfdVar.v(-810703340);
            gor.a(this.b, this.a, this.c, this.d, this.e, this.f, hfdVar, 0);
            hfdVar.o();
        }
        return ffcu.a;
    }
}
