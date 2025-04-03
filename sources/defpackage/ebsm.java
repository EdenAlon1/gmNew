package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebsm extends ebso {
    public final Runnable a;
    private final engw b;

    public ebsm(engw engwVar, Runnable runnable) {
        this.b = engwVar;
        this.a = runnable;
    }

    @Override // defpackage.ebso, defpackage.ebse
    public final engw a() {
        return this.b;
    }

    @Override // defpackage.ebso, defpackage.ebse
    public final Runnable b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebso) {
            ebso ebsoVar = (ebso) obj;
            if (enkr.h(this.b, ebsoVar.a()) && this.a.equals(ebsoVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        Runnable runnable = this.a;
        return "CustomCancelableFeatureImpl{possibleCancelStringList=" + this.b.toString() + ", onCancel=" + runnable.toString() + "}";
    }
}
