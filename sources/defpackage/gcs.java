package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gcs extends ffkk implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ long b;
    final /* synthetic */ ffji c;
    final /* synthetic */ ham d;
    final /* synthetic */ ffmj e;
    final /* synthetic */ fzr f;
    final /* synthetic */ int g;
    final /* synthetic */ dmug h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcs(hvi hviVar, long j, ffji ffjiVar, dmug dmugVar, ham hamVar, ffmj ffmjVar, fzr fzrVar, int i) {
        super(2);
        this.a = hviVar;
        this.b = j;
        this.c = ffjiVar;
        this.h = dmugVar;
        this.d = hamVar;
        this.e = ffmjVar;
        this.f = fzrVar;
        this.g = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        hvi hviVar = this.a;
        long j = this.b;
        ffji ffjiVar = this.c;
        dmug dmugVar = this.h;
        ham hamVar = this.d;
        ffmj ffmjVar = this.e;
        gcy.k(hviVar, j, ffjiVar, dmugVar, hamVar, ffmjVar, this.f, (hfd) obj, hip.a(this.g | 1));
        return ffcu.a;
    }
}
