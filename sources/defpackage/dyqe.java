package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyqe extends dyqr {
    public emxc a;
    public emxc b;
    public emxc c;
    public int d;

    public dyqe() {
        emux emuxVar = emux.a;
        this.a = emuxVar;
        this.b = emuxVar;
        this.c = emuxVar;
    }

    @Override // defpackage.dyqr
    public final dyqs a() {
        int i = this.d;
        if (i != 0) {
            return new dyqf(i, this.a, this.b, this.c);
        }
        throw new IllegalStateException("Missing required properties: status");
    }
}
