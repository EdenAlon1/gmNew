package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fpf extends ffkk implements ffjm {
    final /* synthetic */ long a;
    final /* synthetic */ jpo b;
    final /* synthetic */ ffjm c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fpf(long j, jpo jpoVar, ffjm ffjmVar, int i, int i2) {
        super(2);
        this.a = j;
        this.b = jpoVar;
        this.c = ffjmVar;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        fpi.d(this.a, this.b, this.c, (hfd) obj, hip.a(this.d | 1), this.e);
        return ffcu.a;
    }
}
