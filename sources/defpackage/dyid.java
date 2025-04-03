package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyid extends dyio {
    public int a;

    @Override // defpackage.dyio
    public final dyip a() {
        int i = this.a;
        if (i != 0) {
            return new dyie(i);
        }
        throw new IllegalStateException("Missing required properties: status");
    }
}
