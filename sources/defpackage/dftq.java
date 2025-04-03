package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dftq {
    public static dftn a(Object obj, String str) {
        dfwv.o(obj, "Listener must not be null");
        dfwv.o(str, "Listener type must not be null");
        dfwv.m(str, "Listener type must not be empty");
        return new dftn(obj, str);
    }

    public static dftp b(Object obj, Looper looper, String str) {
        dfwv.o(obj, "Listener must not be null");
        dfwv.o(looper, "Looper must not be null");
        dfwv.o(str, "Listener type must not be null");
        return new dftp(looper, obj, str);
    }

    public static dftp c(Object obj, Executor executor, String str) {
        dfwv.o(obj, "Listener must not be null");
        dfwv.o(executor, "Executor must not be null");
        dfwv.o(str, "Listener type must not be null");
        return new dftp(executor, obj, str);
    }
}
