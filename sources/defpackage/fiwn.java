package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fiwn extends fizd implements fiwo {
    private static final long serialVersionUID = 5971755205903597024L;
    final int a;
    final int b;

    public fiwn(fizd fizdVar, int i, long j) {
        super(fizdVar);
        this.a = i;
        this.b = fiwq.a(fizdVar.e(), j);
    }

    @Override // defpackage.fiwo
    public final int a(int i) {
        return this.a - i;
    }

    @Override // defpackage.fiwo
    public final boolean b() {
        return ((int) (System.currentTimeMillis() / 1000)) >= this.b;
    }

    @Override // defpackage.fizd
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        stringBuffer.append(" cl = ");
        stringBuffer.append(this.a);
        return stringBuffer.toString();
    }
}
