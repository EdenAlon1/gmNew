package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adhq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ adhr b;
    final /* synthetic */ adhm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adhq(adhr adhrVar, adhm adhmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = adhrVar;
        this.c = adhmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adhq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            adhr adhrVar = this.b;
            adhm adhmVar = this.c;
            this.a = 1;
            if (adhrVar.a.fQ(adhmVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new adhq(this.b, this.c, ffguVar);
    }
}
