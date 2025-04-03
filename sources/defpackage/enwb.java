package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class enwb {
    public enwo b = null;
    public envq c = null;

    protected enwb() {
    }

    public abstract enwd a();

    public final void b(ensn ensnVar, Object obj) {
        if (obj == null) {
            return;
        }
        if (this.c == null) {
            this.c = new envq();
        }
        this.c.b.add(new envs(ensnVar, obj));
    }

    public final void c(enwo enwoVar) {
        enxb.b(this.b == null, "tags already set");
        this.b = enwoVar;
    }
}
