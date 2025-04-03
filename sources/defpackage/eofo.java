package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eofo implements Runnable {
    final int a;
    Thread b;
    volatile Thread c;
    eofn d;
    int e;
    long f;
    volatile long g;
    final /* synthetic */ eofp h;
    volatile int i = 2;

    public eofo(eofp eofpVar, int i) {
        this.h = eofpVar;
        this.a = i;
    }

    private final void d() {
        if (this.h.j) {
            long j = this.f + 1;
            this.f = j;
            this.g = j;
        }
    }

    public final void a() {
        if (this.b != null) {
            this.h.f.incrementAndGet();
        }
        this.b = null;
        this.c = null;
        this.i = 3;
        this.h.o.countDown();
    }

    public final void b() {
        this.h.i.newThread(this).start();
    }

    public final void c(eofn eofnVar) {
        int i = this.e;
        if (i < 5) {
            eofnVar.a = this.d;
            eofnVar.b = this.a;
            this.d = eofnVar;
            this.e = i + 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0119, code lost:
    
        a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011c, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eofo.run():void");
    }
}
