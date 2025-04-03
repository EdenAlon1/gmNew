package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lyb extends Thread {
    final /* synthetic */ lyc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lyb(lyc lycVar) {
        super("ExoPlayer:SimpleDecoder");
        this.a = lycVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (this.a.o());
    }
}
