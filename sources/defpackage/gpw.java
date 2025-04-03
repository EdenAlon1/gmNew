package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gpw extends ffkk implements ffjm {
    final /* synthetic */ long a;
    final /* synthetic */ long b;
    final /* synthetic */ boolean c;
    final /* synthetic */ ffjm d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gpw(long j, long j2, boolean z, ffjm ffjmVar, int i) {
        super(2);
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = ffjmVar;
        this.e = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        long j = this.a;
        long j2 = this.b;
        boolean z = this.c;
        gpy.a(j, j2, z, this.d, (hfd) obj, hip.a(this.e | 1));
        return ffcu.a;
    }
}
