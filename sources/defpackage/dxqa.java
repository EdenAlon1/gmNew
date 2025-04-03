package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxqa extends dxqc {
    private final dwso a;
    private final dwso b;

    public dxqa(dwso dwsoVar, dwso dwsoVar2) {
        this.a = dwsoVar;
        this.b = dwsoVar2;
    }

    @Override // defpackage.dxqc
    public final dwso a() {
        return this.b;
    }

    @Override // defpackage.dxqc
    public final dwso b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dxqc) {
            dxqc dxqcVar = (dxqc) obj;
            dwso dwsoVar = this.a;
            if (dwsoVar != null ? dwsoVar.equals(dxqcVar.b()) : dxqcVar.b() == null) {
                dwso dwsoVar2 = this.b;
                if (dwsoVar2 != null ? dwsoVar2.equals(dxqcVar.a()) : dxqcVar.a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        dwso dwsoVar = this.a;
        int hashCode = dwsoVar == null ? 0 : dwsoVar.hashCode();
        dwso dwsoVar2 = this.b;
        return ((hashCode ^ 1000003) * 1000003) ^ (dwsoVar2 != null ? dwsoVar2.hashCode() : 0);
    }

    public final String toString() {
        dwso dwsoVar = this.b;
        return "GroupPair{pendingGroup=" + String.valueOf(this.a) + ", downloadedGroup=" + String.valueOf(dwsoVar) + "}";
    }
}
