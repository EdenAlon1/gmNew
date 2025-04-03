package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class csln {
    public static final ExecutorService a(String str, int i, int i2) {
        return Executors.newFixedThreadPool(i, new cskh(str, i2));
    }
}
