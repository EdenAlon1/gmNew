package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class ogw implements ffxy, ffke {
    final /* synthetic */ okz a;

    public ogw(okz okzVar) {
        this.a = okzVar;
    }

    @Override // defpackage.ffke
    public final ffbv b() {
        return new ffkh(2, this.a, okz.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ffxy) && (obj instanceof ffke)) {
            return ffkj.e(b(), ((ffke) obj).b());
        }
        return false;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        Object a = this.a.a((ojf) obj, ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
