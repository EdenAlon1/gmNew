package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evby extends evcc {
    public enin a;
    private emxc b = emux.a;
    private enip c;

    @Override // defpackage.evcc
    public final evcd a() {
        enin eninVar = this.a;
        if (eninVar != null) {
            this.c = eninVar.g();
        } else if (this.c == null) {
            this.c = enpd.a;
        }
        return new evbz(this.b, this.c);
    }

    @Override // defpackage.evcc
    public final void b(enip enipVar) {
        this.b = emxc.j(enipVar);
    }
}
