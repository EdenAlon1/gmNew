package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqzj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aqzo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqzj(aqzo aqzoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aqzoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqzj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            aqzo aqzoVar = this.b;
            this.a = 1;
            obj = aqzoVar.c.a(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        aqzo aqzoVar2 = this.b;
        return aqzoVar2.b.a(((aphi) obj).a);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aqzj(this.b, ffguVar);
    }
}
