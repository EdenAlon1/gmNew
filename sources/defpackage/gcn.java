package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gcn extends ffkk implements ffjm {
    final /* synthetic */ String a;
    final /* synthetic */ hvi b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ ffix e;
    final /* synthetic */ boolean f;
    final /* synthetic */ String g;
    final /* synthetic */ fzr h;
    final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcn(String str, hvi hviVar, boolean z, boolean z2, ffix ffixVar, boolean z3, String str2, fzr fzrVar, int i) {
        super(2);
        this.a = str;
        this.b = hviVar;
        this.c = z;
        this.d = z2;
        this.e = ffixVar;
        this.f = z3;
        this.g = str2;
        this.h = fzrVar;
        this.i = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        String str = this.a;
        hvi hviVar = this.b;
        boolean z = this.c;
        boolean z2 = this.d;
        ffix ffixVar = this.e;
        boolean z3 = this.f;
        String str2 = this.g;
        gcy.g(str, hviVar, z, z2, ffixVar, z3, str2, this.h, (hfd) obj, hip.a(this.i | 1));
        return ffcu.a;
    }
}
