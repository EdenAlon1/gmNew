package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dend {
    public final List a;
    public final fgdj b;
    public final ffji c;

    public dend(List list, fgdj fgdjVar, ffji ffjiVar) {
        this.a = list;
        this.b = fgdjVar;
        this.c = ffjiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dend)) {
            return false;
        }
        dend dendVar = (dend) obj;
        return ffkj.e(this.a, dendVar.a) && ffkj.e(this.b, dendVar.b) && ffkj.e(this.c, dendVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ProfileSharingMenuUiData(preferences=" + this.a + ", showProfileSharingMenu=" + this.b + ", toggleProfileSharingMenu=" + this.c + ")";
    }
}
