package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ffhr extends ffhp {
    public transient ffgu B;
    private final ffhd a;

    public ffhr(ffgu ffguVar) {
        this(ffguVar, ffguVar != null ? ffguVar.u() : null);
    }

    @Override // defpackage.ffhp
    protected void g() {
        ffgu ffguVar = this.B;
        if (ffguVar != null && ffguVar != this) {
            ffha ffhaVar = u().get(ffgw.k);
            ffhaVar.getClass();
            ((ffgw) ffhaVar).f(ffguVar);
        }
        this.B = ffhq.a;
    }

    @Override // defpackage.ffgu
    public ffhd u() {
        ffhd ffhdVar = this.a;
        ffhdVar.getClass();
        return ffhdVar;
    }

    public ffhr(ffgu ffguVar, ffhd ffhdVar) {
        super(ffguVar);
        this.a = ffhdVar;
    }
}
