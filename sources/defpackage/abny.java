package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abny extends ffhv implements ffjm {
    int a;
    final /* synthetic */ abnz b;
    final /* synthetic */ apep c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abny(abnz abnzVar, apep apepVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = abnzVar;
        this.c = apepVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abny) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            abnz abnzVar = this.b;
            apep apepVar = this.c;
            apeq e = abnzVar.c.e();
            this.a = 1;
            if (e.c(apepVar) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new abny(this.b, this.c, ffguVar);
    }
}
