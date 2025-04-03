package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aeqq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aerc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeqq(aerc aercVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aercVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aeqq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            aerc aercVar = this.b;
            this.a = 1;
            if (aercVar.b.b(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aeqq(this.b, ffguVar);
    }
}
