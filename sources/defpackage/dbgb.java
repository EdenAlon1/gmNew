package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbgb extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ hho d;
    final /* synthetic */ String e;
    final /* synthetic */ ffji f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbgb(hho hhoVar, String str, ffji ffjiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = hhoVar;
        this.e = str;
        this.f = ffjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbgb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        hho hhoVar;
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.c != 0) {
                obj2 = this.b;
                Object obj3 = this.a;
                ffci.b(obj);
                hhoVar = obj3;
            } else {
                ffci.b(obj);
                this.d.b(this.e.concat(" clicked\n"));
                hho hhoVar2 = this.d;
                Object a = hhoVar2.a();
                ffji ffjiVar = this.f;
                this.a = hhoVar2;
                this.b = a;
                this.c = 1;
                Object invoke = ffjiVar.invoke(this);
                if (invoke == ffhhVar) {
                    return ffhhVar;
                }
                obj2 = a;
                obj = invoke;
                hhoVar = hhoVar2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(obj2);
            sb.append(obj);
            hhoVar.b(sb.toString());
        } catch (Exception e) {
            hho hhoVar3 = this.d;
            hhoVar3.b(hhoVar3.a() + "Exception: " + e);
        }
        String str = this.e;
        hho hhoVar4 = this.d;
        dbgh.a.p(str + " result " + hhoVar4.a());
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dbgb(this.d, this.e, this.f, ffguVar);
    }
}
