package j$.nio.file;

import java.nio.file.DirectoryStream;

/* loaded from: classes9.dex */
public final class u implements DirectoryStream.Filter {
    private final DirectoryStream.Filter a;

    public u(DirectoryStream.Filter filter) {
        this.a = filter;
    }

    @Override // java.nio.file.DirectoryStream.Filter
    public final boolean accept(Object obj) {
        return this.a.accept(o.c(obj));
    }
}
