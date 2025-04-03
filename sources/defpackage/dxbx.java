package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxbx extends dxcb {
    private final dwns a;

    public dxbx(dwns dwnsVar) {
        this.a = dwnsVar;
    }

    @Override // defpackage.dxcb, defpackage.dxcc
    public final dwns a() {
        return this.a;
    }

    @Override // defpackage.dxcc
    public final int b() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dxcc) {
            dxcc dxccVar = (dxcc) obj;
            if (dxccVar.b() == 3 && this.a.equals(dxccVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
