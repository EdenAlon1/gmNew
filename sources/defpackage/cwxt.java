package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwxt extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aetu b;
    final /* synthetic */ aeuk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwxt(aetu aetuVar, aeuk aeukVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aetuVar;
        this.c = aeukVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwxt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            aetu aetuVar = this.b;
            aeuk aeukVar = this.c;
            this.a = 1;
            if (aetuVar.d(aeukVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cwxt(this.b, this.c, ffguVar);
    }
}
