package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class esk extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ hho c;
    final /* synthetic */ fhi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public esk(hho hhoVar, fhi fhiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = hhoVar;
        this.d = fhiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((esk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        hho hhoVar;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            Object obj2 = this.a;
            ffci.b(obj);
            hhoVar = obj2;
        } else {
            ffci.b(obj);
            hho hhoVar2 = this.c;
            fhi fhiVar = this.d;
            this.a = hhoVar2;
            this.b = 1;
            Object a = esr.a(fhiVar, this);
            if (a == ffhhVar) {
                return ffhhVar;
            }
            hhoVar = hhoVar2;
            obj = a;
        }
        hhoVar.b(obj);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new esk(this.c, this.d, ffguVar);
    }
}
