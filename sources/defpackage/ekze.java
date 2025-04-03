package defpackage;

import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekze {
    public static final /* synthetic */ int a = 0;

    static {
        Pattern.compile("^(([a-z]+(\\.)*)+)\\.(.+)");
    }

    public static long a(long j, int i) {
        return (j * 1000000) + i;
    }

    public static long b(ekzx ekzxVar) {
        return c(ekzxVar) + a(ekzxVar.h, ekzxVar.i);
    }

    public static long c(ekzx ekzxVar) {
        return a(ekzxVar.f, ekzxVar.g);
    }

    public static String d(ekzx ekzxVar, List list) {
        int i = ekzxVar.e;
        if (list.isEmpty()) {
            if (i == -1) {
                return "Root";
            }
        } else {
            if (list.contains(Integer.valueOf(ekzxVar.d))) {
                return "Root";
            }
            if (i == -1) {
                return "Test Root";
            }
        }
        int a2 = ekzw.a(ekzxVar.l);
        return (a2 != 0 && a2 == 2 && ekzxVar.m) ? "Synchronous Span" : "Asynchronous Span";
    }
}
