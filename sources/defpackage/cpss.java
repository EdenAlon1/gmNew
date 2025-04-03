package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpss extends ffhv implements ffjm {
    final /* synthetic */ cpsu a;
    final /* synthetic */ awui b;
    final /* synthetic */ febo c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpss(ffgu ffguVar, cpsu cpsuVar, awui awuiVar, febo feboVar) {
        super(2, ffguVar);
        this.a = cpsuVar;
        this.b = awuiVar;
        this.c = feboVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpss) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return this.a.c(this.b, this.c);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cpss cpssVar = new cpss(ffguVar, this.a, this.b, this.c);
        cpssVar.d = obj;
        return cpssVar;
    }
}
