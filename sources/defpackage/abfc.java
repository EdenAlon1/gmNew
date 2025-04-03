package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abfc implements dmfn {
    public final List a;
    public final ffix b;
    private final boolean c;

    public abfc(List list, ffix ffixVar) {
        list.getClass();
        this.a = list;
        this.c = true;
        this.b = ffixVar;
    }

    @Override // defpackage.dmfn
    public final dmfn a(ffix ffixVar) {
        return new abfc(this.a, this.b);
    }

    @Override // defpackage.dmfn
    public final ffix b() {
        return this.b;
    }

    @Override // defpackage.dmfn
    public final boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abfc)) {
            return false;
        }
        abfc abfcVar = (abfc) obj;
        if (!ffkj.e(this.a, abfcVar.a)) {
            return false;
        }
        boolean z = abfcVar.c;
        return ffkj.e(this.b, abfcVar.b);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + 1231) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DebugActionsBottomSheetUiData(debugActions=" + this.a + ", includeScrim=true, onDismiss=" + this.b + ")";
    }
}
