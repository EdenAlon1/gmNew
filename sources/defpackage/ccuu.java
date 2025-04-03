package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccuu extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ ccvj d;
    final /* synthetic */ ccvl e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccuu(ccvj ccvjVar, ccvl ccvlVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.d = ccvjVar;
        this.e = ccvlVar;
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        Object obj4 = ((ffch) obj2).a;
        ccuu ccuuVar = new ccuu(this.d, this.e, (ffgu) obj3);
        ccuuVar.b = (String) obj;
        ccuuVar.c = new ffch(obj4);
        return ccuuVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object n;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            n = ((ffch) obj).a;
        } else {
            Object obj2 = this.b;
            Object obj3 = ((ffch) this.c).a;
            ccvj ccvjVar = this.d;
            String str = (String) obj2;
            ccvl.a(this.e, str, null, 6);
            this.b = null;
            this.a = 1;
            n = ccvjVar.n(obj3, str, this);
            if (n == ffhhVar) {
                return ffhhVar;
            }
        }
        return new ffch(n);
    }
}
