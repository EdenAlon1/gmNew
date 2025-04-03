package j$.nio.file;

import java.nio.file.PathMatcher;

/* loaded from: classes9.dex */
public final /* synthetic */ class A implements PathMatcher {
    public final /* synthetic */ B a;

    private /* synthetic */ A(B b) {
        this.a = b;
    }

    public static /* synthetic */ PathMatcher a(B b) {
        if (b == null) {
            return null;
        }
        return b instanceof z ? ((z) b).a : new A(b);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        B b = this.a;
        if (obj instanceof A) {
            obj = ((A) obj).a;
        }
        return b.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.PathMatcher
    public final /* synthetic */ boolean matches(java.nio.file.Path path) {
        return this.a.a(s.o(path));
    }
}
