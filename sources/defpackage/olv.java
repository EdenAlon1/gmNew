package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class olv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ olu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public olv(olu oluVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = oluVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((olv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            olu oluVar = this.b;
            this.a = 1;
            if (oluVar.e(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new olv(this.b, ffguVar);
    }
}
