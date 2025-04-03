package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dfjd implements ffaz {
    private final int a;
    private final dfjc b;

    public dfjd(dfjc dfjcVar, int i) {
        this.b = dfjcVar;
        this.a = i;
    }

    @Override // defpackage.ffaz
    public final void a(Object obj, ffbc ffbcVar) {
        if (this.a != 0) {
            this.b.i((dfkj) obj, ffbcVar);
        } else {
            this.b.h((dfjs) obj, ffbcVar);
        }
    }
}
