package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acny extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffbr b;
    final /* synthetic */ ffbr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acny(ffbr ffbrVar, ffbr ffbrVar2, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffbrVar;
        this.c = ffbrVar2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((acny) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffbr ffbrVar = this.b;
            ffbr ffbrVar2 = this.c;
            acoa acoaVar = acoa.a;
            this.a = 1;
            if (acoaVar.b(ffbrVar, ffbrVar2, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new acny(this.b, this.c, ffguVar);
    }
}
