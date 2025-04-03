package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebog {
    public static ThreadFactory a() {
        ersf ersfVar = new ersf();
        ersfVar.d("OneGoogle #%d");
        ersfVar.c(false);
        ersfVar.e(5);
        ersfVar.a = new ThreadFactory() { // from class: ebof
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable);
            }
        };
        return ersf.b(ersfVar);
    }
}
