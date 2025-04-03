package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgur {
    public final Context a;
    public final dguw b;
    public final ExecutorService c;
    public final Class d;

    public dgur(Context context, dguw dguwVar, ExecutorService executorService, Class cls) {
        this.a = context;
        this.b = dguwVar;
        this.c = executorService;
        this.d = cls;
    }

    public static void a(String str) {
        emxf.f(str.startsWith("/"), "collection must start with \"/\" but is \"%s\"", str);
    }
}
