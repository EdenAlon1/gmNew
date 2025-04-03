package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evdb extends evdf {
    private final String a;

    public evdb(String str) {
        if (str == null) {
            throw new NullPointerException("Null host");
        }
        this.a = str;
    }

    @Override // defpackage.evdf
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof evdf) {
            evdf evdfVar = (evdf) obj;
            if (this.a.equals(evdfVar.a())) {
                evdfVar.c();
                evdfVar.b();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ 443) * 1000003) ^ 443;
    }

    public final String toString() {
        return "QuicHint{host=" + this.a + ", port=443, alternatePort=443}";
    }

    @Override // defpackage.evdf
    public final void b() {
    }

    @Override // defpackage.evdf
    public final void c() {
    }
}
