package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class luf {
    public final Object a;
    public lpy b = new lpy();
    public boolean c;
    public boolean d;

    public luf(Object obj) {
        this.a = obj;
    }

    public final void a(lue lueVar) {
        this.d = true;
        if (this.c) {
            this.c = false;
            lueVar.a(this.a, this.b.a());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((luf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
