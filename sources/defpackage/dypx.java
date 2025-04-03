package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dypx extends dyqk {
    public emxc a = emux.a;
    public int b;

    @Override // defpackage.dyqk
    public final dyql a() {
        int i = this.b;
        if (i != 0) {
            return new dypy(i, this.a);
        }
        throw new IllegalStateException("Missing required properties: status");
    }
}
