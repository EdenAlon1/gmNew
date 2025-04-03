package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acs extends ffkk implements ffjm {
    final /* synthetic */ boolean a;
    final /* synthetic */ ffix b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acs(boolean z, ffix ffixVar, int i, int i2) {
        super(2);
        this.a = z;
        this.b = ffixVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a = hip.a(this.c | 1);
        int i = this.d;
        acu.a(this.a, this.b, (hfd) obj, a, i);
        return ffcu.a;
    }
}
