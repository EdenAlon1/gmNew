package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gio {
    public final boolean a;
    public final boolean b;
    public final int c;

    public gio(boolean z, boolean z2) {
        this.c = 1;
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gio)) {
            return false;
        }
        gio gioVar = (gio) obj;
        int i = gioVar.c;
        return this.a == gioVar.a && this.b == gioVar.b;
    }

    public final int hashCode() {
        key.a(1);
        return ((((gin.a(true) + 31) * 31) + gin.a(this.a)) * 31) + gin.a(this.b);
    }

    public gio() {
        this(true, true);
    }
}
