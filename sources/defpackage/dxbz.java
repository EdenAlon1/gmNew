package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxbz extends dxcb {
    private final dwso a;

    public dxbz(dwso dwsoVar) {
        this.a = dwsoVar;
    }

    @Override // defpackage.dxcc
    public final int b() {
        return 1;
    }

    @Override // defpackage.dxcb, defpackage.dxcc
    public final dwso d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dxcc) {
            dxcc dxccVar = (dxcc) obj;
            if (dxccVar.b() == 1 && this.a.equals(dxccVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
