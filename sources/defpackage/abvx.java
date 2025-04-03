package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abvx extends abwf {
    private engw a;

    @Override // defpackage.abwf
    public final abwi a() {
        if (this.a == null) {
            int i = engw.d;
            this.a = enou.a;
        }
        return new abvy(this.a);
    }

    @Override // defpackage.abwf
    public final void b(Iterable iterable) {
        this.a = engw.j(iterable);
    }
}
