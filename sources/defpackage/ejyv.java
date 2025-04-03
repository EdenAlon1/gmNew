package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class ejyv extends ejyx {
    @Override // defpackage.ejyx
    public abstract Throwable a();

    @Override // defpackage.ejyx
    public final Object b() {
        throw new IllegalStateException("This Result was a failure, and is being polled for data.");
    }

    @Override // defpackage.ejyx
    public final boolean c() {
        return false;
    }
}
