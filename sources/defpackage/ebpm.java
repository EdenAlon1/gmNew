package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebpm extends ebrv {
    public ebrx a;
    public ebsj b;

    public ebpm() {
    }

    @Override // defpackage.ebrv
    public final ebry a() {
        ebsj ebsjVar;
        ebrx ebrxVar = this.a;
        if (ebrxVar != null && (ebsjVar = this.b) != null) {
            return new ebpn(ebrxVar, ebsjVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" onContinueWithAccountListenerWithAsyncCallback");
        }
        if (this.b == null) {
            sb.append(" features");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ebrv
    public final void b(ebrx ebrxVar) {
        this.a = ebrxVar;
    }

    public ebpm(ebry ebryVar) {
        ebpn ebpnVar = (ebpn) ebryVar;
        this.a = ebpnVar.a;
        this.b = ebpnVar.b;
    }
}
