package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlhy implements Closeable {
    public static final enru a = enru.c("com/google/android/libraries/abuse/hades/moirai/service/MoiraiExecutor");
    public final ffqh b;
    public final dlhg c;

    public dlhy(ffqh ffqhVar, dlhg dlhgVar) {
        this.b = ffqhVar;
        this.c = dlhgVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
    }
}
