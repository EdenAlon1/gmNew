package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dugx extends dugz {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dugz)) {
            return false;
        }
        dugz dugzVar = (dugz) obj;
        dugzVar.b();
        dugzVar.a();
        return true;
    }

    public final int hashCode() {
        return 385623363;
    }

    public final String toString() {
        return "DeleteStatusUpdateParams{markAsUndeleted=false, deleteStatus=PENDING_DELETE}";
    }

    @Override // defpackage.dugz
    public final void a() {
    }

    @Override // defpackage.dugz
    public final void b() {
    }
}
