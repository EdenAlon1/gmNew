package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iqz extends ffkk implements ffjm {
    final /* synthetic */ irf a;
    final /* synthetic */ hvi b;
    final /* synthetic */ ffjm c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqz(irf irfVar, hvi hviVar, ffjm ffjmVar, int i) {
        super(2);
        this.a = irfVar;
        this.b = hviVar;
        this.c = ffjmVar;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a = hip.a(this.d | 1);
        ira.b(this.a, this.b, this.c, (hfd) obj, a);
        return ffcu.a;
    }
}
