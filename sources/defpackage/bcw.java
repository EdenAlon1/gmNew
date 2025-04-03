package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcw implements bga {
    private final awq a = new bcx();

    @Override // defpackage.awq
    public final awp a(bcu bcuVar) {
        if (this.a.a(bcuVar).e) {
            return awp.b;
        }
        Throwable th = bcuVar.c;
        if (th instanceof bdf) {
            avw.c("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
            if (((bdf) th).a > 0) {
                return awp.c;
            }
        }
        return awp.a;
    }

    @Override // defpackage.bga
    public final awq c() {
        return new bcw();
    }

    @Override // defpackage.awq
    public final void b() {
    }
}
