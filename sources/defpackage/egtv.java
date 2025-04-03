package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egtv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ egub b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egtv(egub egubVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = egubVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((egtv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            egub egubVar = this.b;
            this.a = 1;
            if (egubVar.a.a() == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new egtv(this.b, ffguVar);
    }
}
