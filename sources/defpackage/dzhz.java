package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzhz extends dzif {
    private emxc a;
    private emxc b;
    private emxc c;

    public dzhz() {
        emux emuxVar = emux.a;
        this.a = emuxVar;
        this.b = emuxVar;
        this.c = emuxVar;
    }

    @Override // defpackage.dzif
    public final dzig a() {
        return new dzia(this.a, this.b, this.c);
    }

    @Override // defpackage.dzif
    public final void b(int i) {
        this.b = emxc.j(Integer.valueOf(i));
    }

    @Override // defpackage.dzif
    public final void c(int i) {
        this.c = emxc.j(Integer.valueOf(i));
    }

    @Override // defpackage.dzif
    public final void d(int i) {
        this.a = emxc.j(Integer.valueOf(i));
    }
}
