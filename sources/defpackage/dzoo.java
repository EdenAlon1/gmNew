package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzoo extends dzsh {
    public emxc a;
    private emxc b;

    public dzoo() {
        emux emuxVar = emux.a;
        this.b = emuxVar;
        this.a = emuxVar;
    }

    @Override // defpackage.dzsh
    public final dzsi a() {
        return new dzop(this.b, this.a);
    }

    @Override // defpackage.dzsh
    public final void b(boolean z) {
        this.b = emxc.j(Boolean.valueOf(z));
    }
}
