package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gcj extends ffkk implements ffjm {
    final /* synthetic */ fzr a;
    final /* synthetic */ ham b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcj(fzr fzrVar, ham hamVar, int i) {
        super(2);
        this.a = fzrVar;
        this.b = hamVar;
        this.c = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a = hip.a(this.c | 1);
        gcy.f(this.a, this.b, (hfd) obj, a);
        return ffcu.a;
    }
}
