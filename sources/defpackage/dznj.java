package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dznj extends dzqe {
    private int a;
    private int b;
    private byte c;

    @Override // defpackage.dzqe
    public final dzqf a() {
        if (this.c == 3) {
            return new dznk(this.a, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" badge");
        }
        if ((this.c & 2) == 0) {
            sb.append(" profileLabelStyle");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzqe
    public final void b(int i) {
        this.a = i;
        this.c = (byte) (this.c | 1);
    }

    @Override // defpackage.dzqe
    public final void c(int i) {
        this.b = i;
        this.c = (byte) (this.c | 2);
    }
}
