package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwgr implements ffjm {
    final /* synthetic */ gcz a;
    final /* synthetic */ fzr b;
    final /* synthetic */ gae c;

    public dwgr(gcz gczVar, gae gaeVar, fzr fzrVar) {
        this.a = gczVar;
        this.c = gaeVar;
        this.b = fzrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            gcz gczVar = this.a;
            fzw.a.a(gczVar.d(), gczVar.c(), this.c, eba.c(hvi.e, dwgs.b), this.b.c, hfdVar, 199680);
        }
        return ffcu.a;
    }
}
