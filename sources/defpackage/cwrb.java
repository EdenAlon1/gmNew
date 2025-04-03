package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwrb extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ cwrd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwrb(cwrd cwrdVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = cwrdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwrb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object a;
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        if (this.c != 0) {
            obj2 = this.b;
            a = this.a;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            cwrd cwrdVar = this.d;
            a = cwrh.a((cwrf) cwrg.a.createBuilder());
            this.a = a;
            this.b = a;
            this.c = 1;
            obj = cwrdVar.e(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
            obj2 = a;
        }
        ((cwri) obj2).b(((Boolean) obj).booleanValue());
        return ((cwri) a).a();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cwrb(this.d, ffguVar);
    }
}
