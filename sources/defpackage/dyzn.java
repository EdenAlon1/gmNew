package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyzn extends dzaj {
    public emxc a;
    public emxc b;
    private boolean c;
    private byte d;

    public dyzn() {
        emux emuxVar = emux.a;
        this.a = emuxVar;
        this.b = emuxVar;
    }

    @Override // defpackage.dzaj
    public final dzak a() {
        if (this.d == 1) {
            return new dyzo(this.a, this.c, this.b);
        }
        throw new IllegalStateException("Missing required properties: syncBlockStatus");
    }

    @Override // defpackage.dzaj
    public final void b(boolean z) {
        this.c = z;
        this.d = (byte) 1;
    }
}
