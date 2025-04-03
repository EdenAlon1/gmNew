package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahxw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ahyk b;
    final /* synthetic */ xho c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahxw(ffgu ffguVar, ahyk ahykVar, xho xhoVar) {
        super(2, ffguVar);
        this.b = ahykVar;
        this.c = xhoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahxw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            ahyk ahykVar = this.b;
            xho xhoVar = this.c;
            xyj xyjVar = new xyj(null);
            this.a = 1;
            obj = ahykVar.k.a(xhoVar, xyjVar, null, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        xze xzeVar = ((xzc) obj).a;
        int ordinal = this.b.e.ordinal();
        return new apnn(xzeVar, ordinal != 1 ? ordinal != 2 ? eohh.UNKNOWN : eohh.FORWARD : eohh.SHARE);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ahxw ahxwVar = new ahxw(ffguVar, this.b, this.c);
        ahxwVar.d = obj;
        return ahxwVar;
    }
}
