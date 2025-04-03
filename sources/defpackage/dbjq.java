package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbjq extends ffhv implements ffji {
    int a;
    final /* synthetic */ dbjv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbjq(dbjv dbjvVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = dbjvVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dbjv dbjvVar = this.b;
            this.a = 1;
            Object a = dbjvVar.a.b.a(this);
            if (a != ffhh.a) {
                a = ffcu.a;
            }
            if (a == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dbjq(this.b, (ffgu) obj).b(ffcu.a);
    }
}
