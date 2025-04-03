package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class circ extends RuntimeException {
    public circ() {
    }

    public circ(Throwable th) {
        super("Unable to find or allocate a thread ID.", th);
    }
}
