package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class bcpr {
    private String sB;

    public void g(String str) {
        if (!j(str)) {
            throw new IllegalStateException();
        }
        this.sB = null;
        h();
    }

    public void ga(String str) {
        if (i() || str == null) {
            throw new IllegalStateException();
        }
        this.sB = str;
    }

    protected abstract void h();

    protected boolean i() {
        return this.sB != null;
    }

    public final boolean j(String str) {
        return str.equals(this.sB);
    }
}
