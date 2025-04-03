package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acfr extends acfm {
    private final acfs g;

    public acfr(acfk acfkVar, acfs acfsVar) {
        super(acfkVar, "GServices and Phenotype logging");
        this.g = acfsVar;
    }

    @Override // defpackage.acfm
    public final acfn a() {
        this.a.b("GServices keys and values:");
        this.a.b(((acfq) this.g).a);
        this.a.b("Phenotype keys and values:");
        this.a.b(((acfq) this.g).b);
        return acfn.a;
    }
}
