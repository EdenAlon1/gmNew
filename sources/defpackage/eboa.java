package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eboa {
    public static String a(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        return simpleName.endsWith("Exception") ? simpleName.contains("$") ? simpleName.substring(simpleName.lastIndexOf(36) + 1) : simpleName : th instanceof dfqu ? "ApiException" : "ObfuscatedException";
    }

    public static Throwable b(Throwable th, Class cls) {
        if (th == null) {
            return null;
        }
        return th.getClass().equals(cls) ? th : b(th.getCause(), cls);
    }
}
