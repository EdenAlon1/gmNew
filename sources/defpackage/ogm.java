package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ogm extends ogo {
    public final ofy a;
    public final ofy b = null;

    public ogm(ofy ofyVar) {
        this.a = ofyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogm)) {
            return false;
        }
        ogm ogmVar = (ogm) obj;
        if (!ffkj.e(this.a, ogmVar.a)) {
            return false;
        }
        ofy ofyVar = ogmVar.b;
        return ffkj.e(null, null);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        String c;
        c = ffpc.c(("PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: " + this.a + "\n                    ").concat("|)"), "|");
        return c;
    }
}
