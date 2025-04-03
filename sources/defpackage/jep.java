package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jep extends ffhv implements ffji {
    int a;
    final /* synthetic */ ffji b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jep(ffji ffjiVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = ffjiVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ffji ffjiVar = this.b;
        this.a = 1;
        Object c = hhj.c(ffjiVar, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new jep(this.b, (ffgu) obj).b(ffcu.a);
    }
}
