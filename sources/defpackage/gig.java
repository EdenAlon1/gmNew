package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gig extends ffkk implements ffjm {
    final /* synthetic */ long a;
    final /* synthetic */ ffix b;
    final /* synthetic */ boolean c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gig(long j, ffix ffixVar, boolean z, int i) {
        super(2);
        this.a = j;
        this.b = ffixVar;
        this.c = z;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        long j = this.a;
        ffix ffixVar = this.b;
        gim.a(j, ffixVar, this.c, (hfd) obj, hip.a(this.d | 1));
        return ffcu.a;
    }
}
