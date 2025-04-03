package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyqg extends dyqt {
    private int a;
    private emxc b;
    private emxc c;
    private byte d;

    public dyqg() {
        emux emuxVar = emux.a;
        this.b = emuxVar;
        this.c = emuxVar;
    }

    @Override // defpackage.dyqt
    public final dyqu a() {
        if (this.d == 1) {
            return new dyqh(this.a, this.b, this.c);
        }
        throw new IllegalStateException("Missing required properties: status");
    }

    @Override // defpackage.dyqt
    public final void b(dzjq dzjqVar) {
        this.c = emxc.j(dzjqVar);
    }

    @Override // defpackage.dyqt
    public final void c(int i) {
        this.a = i;
        this.d = (byte) 1;
    }

    @Override // defpackage.dyqt
    public final void d(dzja dzjaVar) {
        this.b = emxc.j(dzjaVar);
    }
}
