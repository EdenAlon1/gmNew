package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ctbx extends Closeable {
    public static final ctbx d = new ctbx() { // from class: ctbv
        @Override // defpackage.ctbx, java.io.Closeable, java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            ctbw.a(this);
        }

        @Override // defpackage.ctbx
        public final void a() {
        }
    };

    void a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();
}
