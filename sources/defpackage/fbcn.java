package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fbcn extends fbch {
    private final fbch b;

    public fbcn(fbch fbchVar) {
        this.b = fbchVar;
    }

    @Override // defpackage.fbch
    public final fbcc a(fbcd fbcdVar) {
        try {
            return new fbcl(this.b.a(fbcdVar));
        } catch (RuntimeException e) {
            fbco.d(e, this.b, fbcdVar);
            return fbcc.a;
        }
    }
}
