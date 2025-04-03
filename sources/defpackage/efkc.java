package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efkc {
    public efke a;
    private final engr b;
    private final engr c;
    private final emxc d = emux.a;

    public efkc() {
        int i = engw.d;
        this.b = new engr();
        this.c = new engr();
    }

    public final efkj a() {
        if (this.a == null) {
            this.a = new efke();
        }
        return new efkj(this.d, this.b.g(), this.c.g(), this.a);
    }

    public final void b(efki efkiVar) {
        this.b.h(efkiVar);
    }

    public final void c(String str) {
        this.b.h(new efkf(str));
    }

    public final void d(efkh efkhVar) {
        this.c.h(efkhVar);
    }
}
