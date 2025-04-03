package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mtc {
    public static final /* synthetic */ int a = 0;
    private static final AtomicLong b = new AtomicLong();

    public mtc() {
    }

    public static long a() {
        return b.getAndIncrement();
    }

    public mtc(lwv lwvVar) {
        Uri uri = lwvVar.a;
        Map map = Collections.EMPTY_MAP;
    }
}
