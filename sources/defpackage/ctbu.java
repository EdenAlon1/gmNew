package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctbu implements ctbx {
    private final List a;

    public ctbu(List list) {
        this.a = list;
    }

    @Override // defpackage.ctbx
    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ctbx) it.next()).a();
        }
    }

    @Override // defpackage.ctbx, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        ctbw.a(this);
    }
}
