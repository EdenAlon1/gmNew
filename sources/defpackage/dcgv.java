package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcgv extends tx {
    final /* synthetic */ dcgy c;

    public dcgv(dcgy dcgyVar) {
        this.c = dcgyVar;
    }

    @Override // defpackage.tx
    public final int b(int i) {
        int dE = this.c.z().dE(i);
        if (dE == 0 || dE == 2 || dE == 9) {
            return this.c.a;
        }
        return 1;
    }
}
