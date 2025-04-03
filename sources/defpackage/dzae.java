package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzae extends dzbd {
    public dzsc a;
    public dzbf b;
    private boolean c;
    private byte d;

    public dzae() {
    }

    @Override // defpackage.dzbd
    public final dzbg a() {
        dzbf dzbfVar;
        if (this.d == 1 && (dzbfVar = this.b) != null) {
            return new dzaf(this.a, this.c, dzbfVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == 0) {
            sb.append(" skipNotification");
        }
        if (this.b == null) {
            sb.append(" oneOfType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzbd
    public final void b(boolean z) {
        this.c = z;
        this.d = (byte) 1;
    }

    @Override // defpackage.dzbd
    public final void c(dzbf dzbfVar) {
        this.b = dzbfVar;
    }

    public dzae(dzbg dzbgVar) {
        dzaf dzafVar = (dzaf) dzbgVar;
        this.a = dzafVar.a;
        this.c = dzafVar.b;
        this.b = dzafVar.c;
        this.d = (byte) 1;
    }
}
