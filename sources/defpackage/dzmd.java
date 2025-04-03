package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzmd extends dzjj {
    private emxc a;
    private emxc b;

    public dzmd() {
        emux emuxVar = emux.a;
        this.a = emuxVar;
        this.b = emuxVar;
    }

    @Override // defpackage.dzjj
    public final dzjk a() {
        return new dzme(this.a, this.b);
    }

    @Override // defpackage.dzjj
    public final void b(dzqo dzqoVar) {
        this.a = emxc.j(dzqoVar);
    }

    @Override // defpackage.dzjj
    public final void c(dzpw dzpwVar) {
        this.b = emxc.j(dzpwVar);
    }
}
