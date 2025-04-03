package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkjf extends dklk {
    public final boolean a;
    public final eido b;

    public dkjf(boolean z, eido eidoVar) {
        this.a = z;
        this.b = eidoVar;
    }

    @Override // defpackage.dklk
    public final eido a() {
        return this.b;
    }

    @Override // defpackage.dklk
    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dklk) {
            dklk dklkVar = (dklk) obj;
            if (this.a == dklkVar.b() && this.b.equals(dklkVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "SendCpimMessageRequest{requiresFailureReport=" + this.a + ", message=" + this.b.toString() + "}";
    }
}
