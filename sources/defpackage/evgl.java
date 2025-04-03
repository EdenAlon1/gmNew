package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evgl extends fdxt {
    private final Object a = new Object();
    private long b;
    private long c;
    private final evgk d;

    public evgl(evgk evgkVar) {
        this.d = evgkVar;
    }

    @Override // defpackage.fedo
    public final void b(long j) {
        synchronized (this.a) {
            this.c += j;
        }
    }

    @Override // defpackage.fedo
    public final void c(long j) {
        synchronized (this.a) {
            this.b += j;
        }
    }

    @Override // defpackage.fedo
    public final void e() {
        synchronized (this.a) {
            evgk evgkVar = this.d;
            long j = this.b;
            boolean z = true;
            emxf.b(j >= 0, "Cannot record negative request bytes.");
            evgkVar.j.add(Long.valueOf(j));
            evgk evgkVar2 = this.d;
            long j2 = this.c;
            if (j2 < 0) {
                z = false;
            }
            emxf.b(z, "Cannot record negative response bytes.");
            evgkVar2.k.add(Long.valueOf(j2));
        }
    }
}
