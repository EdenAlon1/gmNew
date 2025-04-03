package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asx extends awx {
    private final awy a;

    public asx(awy awyVar) {
        this.a = awyVar;
    }

    @Override // defpackage.awx
    public final awy a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof awx) {
            awx awxVar = (awx) obj;
            awxVar.b();
            if (this.a.equals(awxVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (-721379959);
    }

    public final String toString() {
        return "Event{eventCode=0, surfaceOutput=" + this.a + "}";
    }

    @Override // defpackage.awx
    public final void b() {
    }
}
