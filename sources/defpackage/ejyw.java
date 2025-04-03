package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class ejyw extends ejyx {
    @Override // defpackage.ejyx
    public final Throwable a() {
        throw new IllegalStateException("This Result was a success, and is being polled for an error.");
    }

    @Override // defpackage.ejyx
    public abstract Object b();

    @Override // defpackage.ejyx
    public final boolean c() {
        return true;
    }
}
