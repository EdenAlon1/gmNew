package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffur {
    public static final fgho a = new fgho("COMPLETING_ALREADY");
    public static final fgho b = new fgho("COMPLETING_WAITING_CHILDREN");
    public static final fgho c = new fgho("COMPLETING_RETRY");
    public static final fgho d = new fgho("TOO_LATE_TO_CANCEL");
    public static final fgho e = new fgho("SEALED");
    public static final ffth f = new ffth(false);
    public static final ffth g = new ffth(true);

    public static final Object a(Object obj) {
        return obj instanceof fftx ? new ffty((fftx) obj) : obj;
    }

    public static final Object b(Object obj) {
        fftx fftxVar;
        ffty fftyVar = obj instanceof ffty ? (ffty) obj : null;
        return (fftyVar == null || (fftxVar = fftyVar.a) == null) ? obj : fftxVar;
    }
}
