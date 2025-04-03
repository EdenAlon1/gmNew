package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dkyf {
    public dkyh a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof dkyf)) {
            return false;
        }
        dkyh dkyhVar = this.a;
        dkyh dkyhVar2 = ((dkyf) obj).a;
        if (dkyhVar == null) {
            if (dkyhVar2 != null) {
                return false;
            }
        } else if (!dkyhVar.equals(dkyhVar2)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        dkyh dkyhVar = this.a;
        return (dkyhVar == null ? 0 : dkyhVar.hashCode()) + 31;
    }
}
