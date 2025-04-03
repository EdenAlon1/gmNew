package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lal extends ffhv implements ffji {
    int a;
    final /* synthetic */ lai b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lal(lai laiVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = laiVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            lai laiVar = this.b;
            this.a = 1;
            if (laiVar.a() == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new lal(this.b, (ffgu) obj).b(ffcu.a);
    }
}
