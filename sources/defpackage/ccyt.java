package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccyt extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ ffjn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccyt(ffjn ffjnVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.d = ffjnVar;
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        Object obj4 = ((ffch) obj2).a;
        ccyt ccytVar = new ccyt(this.d, (ffgu) obj3);
        ccytVar.b = obj;
        ccytVar.c = new ffch(obj4);
        return ccytVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
        } catch (Throwable th) {
            obj = ffci.a(th);
        }
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            Object obj2 = this.b;
            Object obj3 = ((ffch) this.c).a;
            ffjn ffjnVar = this.d;
            if (!ffch.d(obj3)) {
                obj = obj3;
                return new ffch(obj);
            }
            this.b = null;
            this.a = 1;
            obj = ffjnVar.a(obj2, obj3, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return new ffch(obj);
    }
}
