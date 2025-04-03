package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebgg extends ebgu {
    private final emxc a;

    public ebgg(emxc emxcVar) {
        this.a = emxcVar;
    }

    @Override // defpackage.ebgu
    public final emxc a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebgu) {
            return this.a.equals(((ebgu) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return 2041338095;
    }

    public final String toString() {
        return "NonCollapsibleFlavorFeatureImpl{minimizableStorageCardRetriever=Optional.absent()}";
    }
}
