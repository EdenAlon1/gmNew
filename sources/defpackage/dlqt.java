package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlqt extends dlqu {
    private final int a;

    public dlqt(int i) {
        this.a = i;
    }

    @Override // defpackage.dlrf
    public final int b() {
        return 2;
    }

    @Override // defpackage.dlqu, defpackage.dlrf
    public final int c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dlrf) {
            dlrf dlrfVar = (dlrf) obj;
            if (dlrfVar.b() == 2 && this.a == dlrfVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a.a(Integer.toString(ewin.a(this.a)), "ConfigDataMapOrSyncFailureReason{syncFailureReason=", "}");
    }
}
