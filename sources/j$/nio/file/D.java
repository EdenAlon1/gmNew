package j$.nio.file;

/* loaded from: classes9.dex */
final class D implements G {
    private final String a;
    private final Class b;

    D(Class cls, String str) {
        this.a = str;
        this.b = cls;
    }

    @Override // j$.nio.file.G
    public final String name() {
        return this.a;
    }

    public final String toString() {
        return this.a;
    }

    @Override // j$.nio.file.G
    public final Class type() {
        return this.b;
    }
}
