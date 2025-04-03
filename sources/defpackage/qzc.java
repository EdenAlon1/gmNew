package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qzc implements rao {
    private final qyy a;

    public qzc(qyy qyyVar) {
        this.a = qyyVar;
    }

    @Override // defpackage.rao
    public final /* bridge */ /* synthetic */ ran a(Object obj, int i, int i2, qtu qtuVar) {
        byte[] bArr = (byte[]) obj;
        return new ran(new rjn(bArr), new qyz(bArr, this.a));
    }

    @Override // defpackage.rao
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }
}
