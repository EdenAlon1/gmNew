package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejor extends RuntimeException {
    public ejor() {
        super("Worker is not an account worker, or lost its tag!");
    }

    public ejor(Throwable th) {
        super("Account was no longer valid when task executed.", th);
    }
}
