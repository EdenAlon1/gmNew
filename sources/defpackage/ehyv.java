package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehyv extends eibd {
    private final boolean a;

    public ehyv(boolean z) {
        this.a = z;
    }

    @Override // defpackage.eibd
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof eibd) && this.a == ((eibd) obj).a();
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        return "GroupRemoteCapabilities{supportsSubjectManagement=" + this.a + "}";
    }
}
