package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dflt {
    protected final int a;

    public dflt() {
        dfwv.c(true, "bad alias: %s", 1);
        this.a = 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dflt)) {
            return false;
        }
        int i = ((dflt) obj).a;
        return true;
    }
}
