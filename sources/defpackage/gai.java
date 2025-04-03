package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gai extends ffkk implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ ffjm b;
    final /* synthetic */ ffjm c;
    final /* synthetic */ ffjm d;
    final /* synthetic */ fzr e;
    final /* synthetic */ jpo f;
    final /* synthetic */ float g = 120.0f;
    final /* synthetic */ ffjm h;
    final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gai(hvi hviVar, ffjm ffjmVar, ffjm ffjmVar2, ffjm ffjmVar3, fzr fzrVar, jpo jpoVar, float f, ffjm ffjmVar4, int i) {
        super(2);
        this.a = hviVar;
        this.b = ffjmVar;
        this.c = ffjmVar2;
        this.d = ffjmVar3;
        this.e = fzrVar;
        this.f = jpoVar;
        this.h = ffjmVar4;
        this.i = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a = hip.a(this.i | 1);
        ffjm ffjmVar = this.h;
        gcy.a(this.a, this.b, this.c, this.d, this.e, this.f, 120.0f, ffjmVar, (hfd) obj, a);
        return ffcu.a;
    }
}
