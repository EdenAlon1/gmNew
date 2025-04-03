package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qdt {
    private final List a = new ArrayList();

    final void a(qel qelVar) {
        this.a.add(qelVar);
    }

    public final void b(Path path) {
        int size = this.a.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            qel qelVar = (qel) this.a.get(size);
            ThreadLocal threadLocal = qlw.a;
            if (qelVar != null && !qelVar.a) {
                qlw.e(path, ((qev) qelVar.b).k() / 100.0f, ((qev) qelVar.c).k() / 100.0f, ((qev) qelVar.d).k() / 360.0f);
            }
        }
    }
}
