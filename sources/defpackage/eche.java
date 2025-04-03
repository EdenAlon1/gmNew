package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eche extends echk {
    public final boolean a;
    private final engw b;

    public eche(boolean z, engw engwVar) {
        this.a = z;
        if (engwVar == null) {
            throw new NullPointerException("Null runningAppProcessInfosInternal");
        }
        this.b = engwVar;
    }

    @Override // defpackage.echk
    public final engw a() {
        return this.b;
    }

    @Override // defpackage.echk
    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof echk) {
            echk echkVar = (echk) obj;
            if (this.a == echkVar.b() && enkr.h(this.b, echkVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "RunningAppProcessInfoResponse{getStatus=" + this.a + ", runningAppProcessInfosInternal=" + this.b.toString() + "}";
    }
}
