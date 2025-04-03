package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cgda extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cgdb b;
    final /* synthetic */ dezu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgda(cgdb cgdbVar, dezu dezuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cgdbVar;
        this.c = dezuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgda) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl b = ((cfyt) this.b.a.b()).b(this.c);
            this.a = 1;
            if (fgfz.c(b, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cgda(this.b, this.c, ffguVar);
    }
}
