package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enup {
    public final enwx a;
    public final String b;

    public enup(enwx enwxVar, String str) {
        enwxVar.getClass();
        this.a = enwxVar;
        str.getClass();
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof enup) {
            enup enupVar = (enup) obj;
            if (this.a.equals(enupVar.a) && this.b.equals(enupVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        return str.hashCode() ^ this.a.hashCode();
    }
}
