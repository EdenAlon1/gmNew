package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elpc extends elpe {
    private final int a;
    private final int b;

    public elpc(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.elpe
    public final int a() {
        return this.b;
    }

    @Override // defpackage.elpe
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof elpe) {
            elpe elpeVar = (elpe) obj;
            if (this.a == elpeVar.b() && this.b == elpeVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        int i = this.a;
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        int i2 = this.b;
        String num = Integer.toString(i - 2);
        if (i2 != 1) {
            return a.d(Integer.toString(i2 - 2), num, "RequestMetadata{requestType=", ", syncStatus=", "}");
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
