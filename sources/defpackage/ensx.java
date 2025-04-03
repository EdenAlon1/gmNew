package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ensx extends ense {
    private final StackTraceElement b;

    public ensx(StackTraceElement stackTraceElement) {
        this.b = stackTraceElement;
    }

    @Override // defpackage.ense
    public final int a() {
        return Math.max(this.b.getLineNumber(), 0);
    }

    @Override // defpackage.ense
    public final String b() {
        return this.b.getClassName();
    }

    @Override // defpackage.ense
    public final String c() {
        return this.b.getFileName();
    }

    @Override // defpackage.ense
    public final String d() {
        return this.b.getMethodName();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ensx) && this.b.equals(((ensx) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
