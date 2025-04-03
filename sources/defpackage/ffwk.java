package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffwk {
    public static final ffwt a = new ffwt(-1, null, null, 0);
    public static final int b = fghp.a("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);
    public static final int c = fghp.a("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);
    public static final fgho d = new fgho("BUFFERED");
    public static final fgho e = new fgho("SHOULD_BUFFER");
    public static final fgho f = new fgho("S_RESUMING_BY_RCV");
    public static final fgho g = new fgho("RESUMING_BY_EB");
    public static final fgho h = new fgho("POISONED");
    public static final fgho i = new fgho("DONE_RCV");
    public static final fgho j = new fgho("INTERRUPTED_SEND");
    public static final fgho k = new fgho("INTERRUPTED_RCV");
    public static final fgho l = new fgho("CHANNEL_CLOSED");
    public static final fgho m = new fgho("SUSPEND");
    public static final fgho n = new fgho("SUSPEND_NO_WAITER");
    public static final fgho o = new fgho("FAILED");
    public static final fgho p = new fgho("NO_RECEIVE_RESULT");
    public static final fgho q = new fgho("CLOSE_HANDLER_CLOSED");
    public static final fgho r = new fgho("CLOSE_HANDLER_INVOKED");
    public static final fgho s = new fgho("NO_CLOSE_CAUSE");

    public static final long a(long j2, boolean z) {
        return (true != z ? 0L : 4611686018427387904L) + j2;
    }

    public static final long b(long j2, int i2) {
        return (i2 << 60) + j2;
    }

    public static final boolean c(ffrf ffrfVar, Object obj) {
        Object l2 = ffrfVar.l(obj, null);
        if (l2 == null) {
            return false;
        }
        ffrfVar.a(l2);
        return true;
    }
}
