package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class txv<T> implements ejwd<T> {
    private final String a;

    protected txv(String str) {
        this.a = str;
    }

    @Override // defpackage.ejwd
    public final void a(Throwable th) {
        axnw.d(new txu("Subscription mixin failed: ".concat(this.a), th));
    }

    @Override // defpackage.ejwd
    public final void hB() {
    }
}
