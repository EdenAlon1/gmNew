package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekww {
    private final elbx a;

    public ekww(elbx elbxVar) {
        this.a = elbxVar;
    }

    public final elav a(String str, String str2) {
        final emxc j = ekyf.v() ? emux.a : emxc.j(this.a.d("Invoking ".concat(str)));
        final ekzz f = eleg.f(a.w(str2, str, "."));
        return new elav() { // from class: ekwv
            /* JADX WARN: Type inference failed for: r0v2, types: [elav, java.lang.Object] */
            @Override // defpackage.elav, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                elav.this.close();
                emxc emxcVar = j;
                if (emxcVar.g()) {
                    emxcVar.c().close();
                }
            }
        };
    }
}
