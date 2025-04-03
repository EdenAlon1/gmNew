package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efkg {
    private final StringBuilder a;

    public efkg(String str) {
        StringBuilder sb = new StringBuilder();
        this.a = sb;
        sb.append("CREATE TEMP TRIGGER ");
        sb.append(str);
        sb.append(" ");
    }

    public final efkh a() {
        return new efkh(this.a.toString());
    }

    public final void b(int i) {
        this.a.append(i);
    }

    public final void c(String str) {
        this.a.append(str);
    }
}
