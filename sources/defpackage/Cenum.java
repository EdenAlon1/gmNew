package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* renamed from: enum, reason: invalid class name */
/* loaded from: classes5.dex */
public abstract class Cenum {
    private static String a = "enuu";
    private static String b = "com.google.common.flogger.backend.google.GooglePlatform";
    private static String c = "envj";
    private static final String[] d = {"enuu", "com.google.common.flogger.backend.google.GooglePlatform", "envj"};

    public static int a() {
        return enxd.a().a;
    }

    public static long b() {
        return enuk.a.c();
    }

    public static ento d(String str) {
        return enuk.a.e(str);
    }

    public static ents f() {
        return i().b();
    }

    public static enul g() {
        return enuk.a.h();
    }

    public static envp i() {
        return enuk.a.j();
    }

    public static enwo k() {
        return i().d();
    }

    public static String l() {
        return enuk.a.m();
    }

    public static boolean n(String str, Level level, boolean z) {
        i().e(str, level, z);
        return false;
    }

    protected long c() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    protected abstract ento e(String str);

    protected abstract enul h();

    protected envp j() {
        return envz.a;
    }

    protected abstract String m();
}
