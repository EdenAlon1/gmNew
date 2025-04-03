package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axlp extends ffhv implements ffjm {
    final /* synthetic */ axlx a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axlp(ffgu ffguVar, axlx axlxVar) {
        super(2, ffguVar);
        this.a = axlxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axlp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        bqvj c = ((cryg) this.a.a.b()).c(2);
        if (c == null) {
            throw new crvu("No backup key available");
        }
        String o = c.o();
        if (o == null || o.length() == 0) {
            throw new csgz("Missing Cms ID for Backup Key.");
        }
        return c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        axlp axlpVar = new axlp(ffguVar, this.a);
        axlpVar.b = obj;
        return axlpVar;
    }
}
