package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiwv extends eiwy {
    public engw a;
    private boolean b;
    private engr c;
    private engw d;
    private byte e;

    @Override // defpackage.eiwy
    public final eiwz a() {
        engr engrVar = this.c;
        if (engrVar != null) {
            this.d = engrVar.g();
        } else if (this.d == null) {
            int i = engw.d;
            this.d = enou.a;
        }
        if (this.e == 1) {
            return new eiww(this.b, this.d, this.a);
        }
        throw new IllegalStateException("Missing required properties: canSwitchAccounts");
    }

    @Override // defpackage.eiwy
    public final engr b() {
        if (this.c == null) {
            int i = engw.d;
            this.c = new engr();
        }
        return this.c;
    }

    @Override // defpackage.eiwy
    public final void c(boolean z) {
        this.b = z;
        this.e = (byte) 1;
    }
}
