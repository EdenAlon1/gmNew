package defpackage;

import java.net.InetSocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class femk extends fecd {
    private static final boolean a = fedj.b(femk.class.getClassLoader());

    @Override // defpackage.febx
    public final fecc a(URI uri, febv febvVar) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        String path = uri.getPath();
        path.getClass();
        emxf.i(path.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", path, uri);
        String substring = path.substring(1);
        uri.getAuthority();
        return new femj(substring, febvVar, fend.o, new emyg(), a);
    }

    @Override // defpackage.febx
    public final String b() {
        return "dns";
    }

    @Override // defpackage.fecd
    public final Collection c() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // defpackage.fecd
    protected final void d() {
    }

    @Override // defpackage.fecd
    public final void e() {
    }
}
