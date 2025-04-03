package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class olp {
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public olp(int i, int i2, int i3, int i4) {
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public final int a(ofz ofzVar) {
        ofzVar.getClass();
        int ordinal = ofzVar.ordinal();
        if (ordinal == 0) {
            throw new IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
        }
        if (ordinal == 1) {
            return this.c;
        }
        if (ordinal == 2) {
            return this.d;
        }
        throw new ffcd();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof olp)) {
            return false;
        }
        olp olpVar = (olp) obj;
        return this.c == olpVar.c && this.d == olpVar.d && this.e == olpVar.e && this.f == olpVar.f;
    }

    public int hashCode() {
        return this.c + this.d + this.e + this.f;
    }
}
