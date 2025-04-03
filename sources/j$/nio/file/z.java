package j$.nio.file;

import java.nio.file.PathMatcher;

/* loaded from: classes9.dex */
public final /* synthetic */ class z implements B {
    public final /* synthetic */ PathMatcher a;

    private /* synthetic */ z(PathMatcher pathMatcher) {
        this.a = pathMatcher;
    }

    public static /* synthetic */ B b(PathMatcher pathMatcher) {
        if (pathMatcher == null) {
            return null;
        }
        return pathMatcher instanceof A ? ((A) pathMatcher).a : new z(pathMatcher);
    }

    @Override // j$.nio.file.B
    public final /* synthetic */ boolean a(Path path) {
        boolean matches;
        matches = this.a.matches(t.o(path));
        return matches;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PathMatcher pathMatcher = this.a;
        if (obj instanceof z) {
            obj = ((z) obj).a;
        }
        return pathMatcher.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
