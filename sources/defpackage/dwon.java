package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwon extends dwxe {
    private final int a;

    public dwon(int i) {
        this.a = i;
    }

    @Override // defpackage.dwxe
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof dwxe) && this.a == ((dwxe) obj).a();
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        return "RemoveFileGroupsByFilterResponse{removedFileGroupsCount=" + this.a + "}";
    }
}
