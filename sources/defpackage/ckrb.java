package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckrb extends ckrc {
    public final boolean a;
    public final boolean b;

    public ckrb(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.ckrc
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.ckrc
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ckrc) {
            ckrc ckrcVar = (ckrc) obj;
            if (this.a == ckrcVar.a() && this.b == ckrcVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true == this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "GroupRenameNotifyEventLoggingInfo{causedNameChange=" + this.a + ", containedSubjectExtension=" + this.b + "}";
    }
}
