package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fod extends ffkk implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ idh b;
    final /* synthetic */ long c;
    final /* synthetic */ long d;
    final /* synthetic */ long e;
    final /* synthetic */ float f;
    final /* synthetic */ int g;
    final /* synthetic */ fnv h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fod(fnv fnvVar, hvi hviVar, idh idhVar, long j, long j2, long j3, float f, int i) {
        super(2);
        this.h = fnvVar;
        this.a = hviVar;
        this.b = idhVar;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = f;
        this.g = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        foh.b(this.h, this.a, this.b, this.c, this.d, this.e, this.f, (hfd) obj, hip.a(this.g | 1));
        return ffcu.a;
    }
}
