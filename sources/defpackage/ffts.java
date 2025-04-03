package defpackage;

import java.io.Closeable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ffts extends ffsd implements Closeable, AutoCloseable {
    static {
        new ffgp(ffsd.l, new ffji() { // from class: fftr
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ffha ffhaVar = (ffha) obj;
                if (ffhaVar instanceof ffts) {
                    return (ffts) ffhaVar;
                }
                return null;
            }
        });
    }

    public abstract Executor g();
}
