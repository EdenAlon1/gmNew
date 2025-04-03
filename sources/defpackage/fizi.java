package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fizi extends Thread {
    private final fiyh a;
    private final Object b;
    private final fizj c;
    private final fixi d;

    public fizi(fizj fizjVar, fiyh fiyhVar, Object obj, fixi fixiVar) {
        this.c = fizjVar;
        this.a = fiyhVar;
        this.b = obj;
        this.d = fixiVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.d.c(this.c.a(this.a));
        } catch (Exception e) {
            this.d.a(this.b, e);
        }
    }
}
