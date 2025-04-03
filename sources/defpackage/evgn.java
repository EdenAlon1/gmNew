package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evgn extends fdxs {
    private final Object a = new Object();
    private evgl b;
    private final evgk c;

    public evgn(evgk evgkVar) {
        this.c = evgkVar;
    }

    @Override // defpackage.fdxs
    public final fdxt a() {
        synchronized (this.a) {
            if (this.b != null) {
                return new evgm();
            }
            evgl evglVar = new evgl(this.c);
            this.b = evglVar;
            return evglVar;
        }
    }
}
