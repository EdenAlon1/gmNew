package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class scj extends sbn {
    private final Object a;
    private final sco b;

    public scj(Object obj, sco scoVar) {
        if (obj == null) {
            throw new NullPointerException("Null getService");
        }
        this.a = obj;
        this.b = scoVar;
    }

    @Override // defpackage.sbn
    public final sco a() {
        return this.b;
    }

    @Override // defpackage.sbn
    public final Object b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sbn) {
            sbn sbnVar = (sbn) obj;
            if (this.a.equals(sbnVar.b()) && this.b.equals(sbnVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        sco scoVar = this.b;
        return "InferenceServiceContext{getService=" + this.a.toString() + ", disconnectSignal=" + scoVar.toString() + "}";
    }
}
