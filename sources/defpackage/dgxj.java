package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgxj extends dgxm {
    public emxc a;
    public emxc b;
    public emxc c;
    public emxc d;
    private emxc e;

    public dgxj() {
        emux emuxVar = emux.a;
        this.e = emuxVar;
        this.a = emuxVar;
        this.b = emuxVar;
        this.c = emuxVar;
        this.d = emuxVar;
    }

    @Override // defpackage.dgxm
    public final dgxm a(int i) {
        this.e = emxc.j(Integer.valueOf(i));
        return this;
    }

    @Override // defpackage.dgxm
    public final dgxn b() {
        return new dgxk(this.e, this.a, this.b, this.c, this.d);
    }
}
