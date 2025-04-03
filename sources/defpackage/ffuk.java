package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffuk extends ffrh {
    private final ffuq f;

    public ffuk(ffgu ffguVar, ffuq ffuqVar) {
        super(ffguVar, 1);
        this.f = ffuqVar;
    }

    @Override // defpackage.ffrh
    protected final String q() {
        return "AwaitContinuation";
    }

    @Override // defpackage.ffrh
    public final Throwable r(ffud ffudVar) {
        Throwable d;
        Object E = this.f.E();
        return (!(E instanceof ffum) || (d = ((ffum) E).d()) == null) ? E instanceof ffrt ? ((ffrt) E).b : ffudVar.p() : d;
    }
}
