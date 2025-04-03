package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axoq implements ejxi {
    private static final ejui a = new ejtz("ImmediateLocalDataSource");
    private final Object b;

    public axoq(Object obj) {
        this.b = obj;
    }

    @Override // defpackage.ejxi
    public final /* synthetic */ ejuj a() {
        return a;
    }

    @Override // defpackage.ejxi
    public final ListenableFuture b() {
        elfl e = elfo.e(this.b);
        e.getClass();
        return e;
    }
}
