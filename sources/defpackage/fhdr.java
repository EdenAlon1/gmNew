package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhdr extends fgwo {
    private static final long serialVersionUID = -1606972893204822853L;
    private int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhdr() {
        super("SEQUENCE");
        fgyu fgyuVar = fgyu.a;
        this.c = 0;
    }

    @Override // defpackage.fguw
    public final String a() {
        return String.valueOf(this.c);
    }

    @Override // defpackage.fgwo
    public final void c(String str) {
        this.c = Integer.parseInt(str);
    }
}
