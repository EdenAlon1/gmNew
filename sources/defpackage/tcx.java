package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tcx extends RuntimeException {
    public final Throwable a;
    public final int b;

    public tcx(int i, Throwable th) {
        super("Fi Account validation failure");
        this.b = i;
        this.a = th;
    }

    public /* synthetic */ tcx(int i) {
        this(i, null);
    }
}
