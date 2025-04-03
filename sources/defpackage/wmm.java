package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wmm extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ wmn c;
    final /* synthetic */ ffji d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wmm(wmn wmnVar, ffji ffjiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = wmnVar;
        this.d = ffjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wmm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        akxl akxlVar;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            Object obj2 = this.a;
            ffci.b(obj);
            akxlVar = obj2;
        } else {
            ffci.b(obj);
            akxl akxlVar2 = (akxl) this.c.a.b();
            ffji ffjiVar = this.d;
            this.a = akxlVar2;
            this.b = 1;
            Object invoke = ffjiVar.invoke(this);
            if (invoke == ffhhVar) {
                return ffhhVar;
            }
            akxlVar = akxlVar2;
            obj = invoke;
        }
        akxlVar.o((eolu) obj);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new wmm(this.c, this.d, ffguVar);
    }
}
