package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axrd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ axre b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axrd(axre axreVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = axreVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axrd) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxy ffxyVar = (ffxy) this.c;
            axre axreVar = this.b;
            this.a = 1;
            if (ffxyVar.fQ(axreVar.a, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        axrd axrdVar = new axrd(this.b, ffguVar);
        axrdVar.c = obj;
        return axrdVar;
    }
}
