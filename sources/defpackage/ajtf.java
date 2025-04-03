package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajtf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ajth b;
    final /* synthetic */ ajuo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajtf(ajth ajthVar, ajuo ajuoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ajthVar;
        this.c = ajuoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajtf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ajth ajthVar = this.b;
            ajuo ajuoVar = this.c;
            this.a = 1;
            ajql ajqlVar = ajthVar.c;
            Object a = ffra.a(ekxi.a(ajqlVar.b), new ajqf(null, ajqlVar, ajuoVar.a), this);
            if (a != ffhh.a) {
                a = ffcu.a;
            }
            if (a == obj2) {
                return obj2;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ajtf(this.b, this.c, ffguVar);
    }
}
