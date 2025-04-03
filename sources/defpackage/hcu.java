package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hcu extends ffkk implements ffjm {
    final /* synthetic */ long a;
    final /* synthetic */ ffjm b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hcu(long j, ffjm ffjmVar, int i) {
        super(2);
        this.a = j;
        this.b = ffjmVar;
        this.c = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        long j = this.a;
        int i = this.c;
        hdh.d(j, this.b, (hfd) obj, hip.a(i | 1));
        return ffcu.a;
    }
}
