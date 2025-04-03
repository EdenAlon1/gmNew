package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class frg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ frr b;
    final /* synthetic */ frh c;
    final /* synthetic */ dwp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public frg(frr frrVar, frh frhVar, dwp dwpVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = frrVar;
        this.c = frhVar;
        this.d = dwpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((frg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                frr frrVar = this.b;
                this.a = 1;
                if (frrVar.a(this) == ffhhVar) {
                    return ffhhVar;
                }
            }
            frh frhVar = this.c;
            frhVar.a.b(this.d);
            ith.a(this.c);
            return ffcu.a;
        } catch (Throwable th) {
            frh frhVar2 = this.c;
            frhVar2.a.b(this.d);
            ith.a(this.c);
            throw th;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new frg(this.b, this.c, this.d, ffguVar);
    }
}
