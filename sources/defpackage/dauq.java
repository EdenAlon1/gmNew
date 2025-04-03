package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dauq {
    public static void a(String str) {
        try {
            new ProcessBuilder(new String[0]).command(str).start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
            ensk e2 = dauv.c.e();
            e2.Y(ente.a, "Bugle");
            ((enrr) ((enrr) ((enrr) e2).g(e)).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl$ChangeLinkedFile", "exec", 6453, "DebugUtilsImpl.java")).t("Failed execute %s", str);
        }
    }
}
