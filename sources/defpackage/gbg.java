package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gbg extends ffkk implements ffjm {
    final /* synthetic */ String a;
    final /* synthetic */ hvi b;
    final /* synthetic */ boolean c;
    final /* synthetic */ ffix d;
    final /* synthetic */ boolean e;
    final /* synthetic */ boolean f;
    final /* synthetic */ boolean g;
    final /* synthetic */ String h;
    final /* synthetic */ fzr i;
    final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbg(String str, hvi hviVar, boolean z, ffix ffixVar, boolean z2, boolean z3, boolean z4, String str2, fzr fzrVar, int i) {
        super(2);
        this.a = str;
        this.b = hviVar;
        this.c = z;
        this.d = ffixVar;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = str2;
        this.i = fzrVar;
        this.j = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        String str = this.a;
        hvi hviVar = this.b;
        boolean z = this.c;
        ffix ffixVar = this.d;
        boolean z2 = this.e;
        boolean z3 = this.f;
        boolean z4 = this.g;
        String str2 = this.h;
        gcy.p(str, hviVar, z, ffixVar, z2, z3, z4, str2, this.i, (hfd) obj, hip.a(this.j | 1));
        return ffcu.a;
    }
}
