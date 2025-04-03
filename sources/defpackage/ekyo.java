package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekyo {
    private final elbx a;

    public ekyo(elbx elbxVar) {
        this.a = elbxVar;
    }

    public final elav a(String str) {
        ekyf.s();
        if (ekyf.v()) {
            return new elav() { // from class: ekym
                @Override // defpackage.elav, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    ekyf.q();
                }
            };
        }
        final ekzm b = this.a.b(str);
        return new elav() { // from class: ekyn
            @Override // defpackage.elav, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                ekzm.this.close();
                ekyf.q();
            }
        };
    }
}
