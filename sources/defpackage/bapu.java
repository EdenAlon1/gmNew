package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bapu extends ffhv implements ffjm {
    final /* synthetic */ bara a;
    final /* synthetic */ int b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ long e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bapu(ffgu ffguVar, bara baraVar, int i, String str, String str2, long j) {
        super(2, ffguVar);
        this.a = baraVar;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = j;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bapu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        bara baraVar = this.a;
        baraVar.n.c(baraVar.d, this.b, this.c, this.d, 131, this.e);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        bapu bapuVar = new bapu(ffguVar, this.a, this.b, this.c, this.d, this.e);
        bapuVar.f = obj;
        return bapuVar;
    }
}
