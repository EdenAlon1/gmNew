package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyif extends dyiq {
    public int a;

    @Override // defpackage.dyiq
    public final dyir a() {
        int i = this.a;
        if (i != 0) {
            return new dyig(i);
        }
        throw new IllegalStateException("Missing required properties: status");
    }
}
