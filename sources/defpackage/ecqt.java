package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecqt extends ecqx {
    public emxc a = emux.a;
    public byte b;
    public int c;

    @Override // defpackage.ecqx
    public final ecqy a() {
        int i;
        if (this.b == 1 && (i = this.c) != 0) {
            return new ecqu(i, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == 0) {
            sb.append(" enablement");
        }
        if (this.b == 0) {
            sb.append(" manualCapture");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
