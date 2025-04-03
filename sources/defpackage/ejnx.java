package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejnx extends ejoh {
    public final String a;
    public final poz b;

    public ejnx(String str, poz pozVar) {
        this.a = str;
        if (pozVar == null) {
            throw new NullPointerException("Null existingWorkPolicy");
        }
        this.b = pozVar;
    }

    @Override // defpackage.ejoh
    public final poz a() {
        return this.b;
    }

    @Override // defpackage.ejoh
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ejoh) {
            ejoh ejohVar = (ejoh) obj;
            if (this.a.equals(ejohVar.b()) && this.b.equals(ejohVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "UniqueWorkSpec{uniquenessKey=" + this.a + ", existingWorkPolicy=" + this.b.toString() + "}";
    }
}
