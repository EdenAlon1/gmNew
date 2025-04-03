package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fhdh extends fgwo {
    public static final fhdh c = new fhdg(0);
    public static final fhdh d = new fhdg(1);
    public static final fhdh e = new fhdg(5);
    public static final fhdh f = new fhdg(9);
    private static final long serialVersionUID = -5654367843953827397L;
    private int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhdh() {
        super("PRIORITY");
        fgyu fgyuVar = fgyu.a;
        this.g = c.g;
    }

    @Override // defpackage.fguw
    public final String a() {
        return String.valueOf(this.g);
    }

    @Override // defpackage.fgwo
    public void c(String str) {
        this.g = Integer.parseInt(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhdh(fgwl fgwlVar, int i) {
        super("PRIORITY", fgwlVar);
        fgyu fgyuVar = fgyu.a;
        this.g = i;
    }
}
