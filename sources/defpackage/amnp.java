package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amnp extends ffhv implements ffjm {
    final /* synthetic */ amnr a;
    final /* synthetic */ awui b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amnp(amnr amnrVar, awui awuiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = amnrVar;
        this.b = awuiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amnp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return ((aqky) this.a.c.b()).a(((aolr) this.a.d.b()).b(this.b));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new amnp(this.a, this.b, ffguVar);
    }
}
