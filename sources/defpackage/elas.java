package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class elas implements elav {
    public final ekzz a;

    public elas(ekzz ekzzVar) {
        this.a = ekzzVar;
    }

    @Override // defpackage.elav, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }
}
