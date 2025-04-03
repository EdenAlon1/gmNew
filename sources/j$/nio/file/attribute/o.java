package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttribute;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes9.dex */
final class o implements FileAttribute {
    final /* synthetic */ m a;

    o(m mVar) {
        this.a = mVar;
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final String name() {
        return "posix:permissions";
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final Object value() {
        return Collections.unmodifiableSet(j$.nio.file.o.i((Set) this.a.value()));
    }
}
