package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mmc {
    public boolean a;
    public boolean b;
    public boolean c;

    public final mmd a() {
        if (this.a || !(this.b || this.c)) {
            return new mmd(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    public final void b() {
        this.a = true;
    }
}
