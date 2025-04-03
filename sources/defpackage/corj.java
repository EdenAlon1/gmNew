package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class corj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ corn b;
    final /* synthetic */ eraj c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public corj(ffgu ffguVar, corn cornVar, eraj erajVar) {
        super(2, ffguVar);
        this.b = cornVar;
        this.c = erajVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((corj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            corn cornVar = this.b;
            eraj erajVar = this.c;
            this.a = 1;
            obj = cornVar.b.a(erajVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return new ppp();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        corj corjVar = new corj(ffguVar, this.b, this.c);
        corjVar.d = obj;
        return corjVar;
    }
}
