package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfkg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cfki b;
    final /* synthetic */ Throwable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfkg(cfki cfkiVar, Throwable th, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cfkiVar;
        this.c = th;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfkg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cfki cfkiVar = this.b;
            elfl b = cfkiVar.e.b(this.c);
            this.a = 1;
            if (fgfz.c(b, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cfkg(this.b, this.c, ffguVar);
    }
}
