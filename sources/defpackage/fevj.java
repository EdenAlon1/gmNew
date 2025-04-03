package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fevj implements Runnable {
    final /* synthetic */ fevk a;
    final /* synthetic */ fevl b;
    final /* synthetic */ Object c;
    final /* synthetic */ fevm d;

    public fevj(fevm fevmVar, fevk fevkVar, fevl fevlVar, Object obj) {
        this.a = fevkVar;
        this.b = fevlVar;
        this.c = obj;
        this.d = fevmVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.d) {
            if (this.a.b == 0) {
                try {
                    this.b.b(this.c);
                    this.d.a.remove(this.b);
                    if (this.d.a.isEmpty()) {
                        this.d.b.shutdown();
                        this.d.b = null;
                    }
                } catch (Throwable th) {
                    this.d.a.remove(this.b);
                    if (this.d.a.isEmpty()) {
                        this.d.b.shutdown();
                        this.d.b = null;
                    }
                    throw th;
                }
            }
        }
    }
}
