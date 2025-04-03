package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzin extends dzpl {
    private dzpg a;
    private dzps b;

    @Override // defpackage.dzpl
    public final dzpt a() {
        dzps dzpsVar;
        dzpg dzpgVar = this.a;
        if (dzpgVar != null && (dzpsVar = this.b) != null) {
            return new dzmy(dzpgVar, dzpsVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" owner");
        }
        if (this.b == null) {
            sb.append(" oneOfId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzpl
    public final void b(dzps dzpsVar) {
        this.b = dzpsVar;
    }

    @Override // defpackage.dzpl
    public final void c(dzpg dzpgVar) {
        if (dzpgVar == null) {
            throw new NullPointerException("Null owner");
        }
        this.a = dzpgVar;
    }
}
