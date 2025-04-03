package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiiu {
    public static final enru a = enru.c("com/google/android/apps/messaging/navigation/targets/ActivityResultLauncher");
    private final adn b;

    public aiiu(eg egVar) {
        egVar.getClass();
        this.b = egVar.h;
    }

    public final Object a(String str, adu aduVar, Object obj, kli kliVar, ffgu ffguVar) {
        ffrh ffrhVar = new ffrh(ffhi.c(ffguVar), 1);
        ffrhVar.B();
        ffkx ffkxVar = new ffkx();
        fflb fflbVar = new fflb();
        fflbVar.a = this.b.b(str, aduVar, new aiis(ffkxVar, ffrhVar, fflbVar));
        if (ffkxVar.a) {
            ((adg) fflbVar.a).b();
            ((enrr) a.j().h("com/google/android/apps/messaging/navigation/targets/ActivityResultLauncher", "launch", 53, "ActivityResultLauncher.kt")).q("Activity result callback already invoked upon registration.");
        } else {
            try {
                ((enrr) a.e().h("com/google/android/apps/messaging/navigation/targets/ActivityResultLauncher", "launch", 56, "ActivityResultLauncher.kt")).t("Launching activity for result. key = %s", str);
                ((adg) fflbVar.a).a(obj, kliVar);
            } catch (Exception e) {
                ((enrr) a.j().h("com/google/android/apps/messaging/navigation/targets/ActivityResultLauncher", "launch", 63, "ActivityResultLauncher.kt")).q("Launching activity threw exception, clearing registration and completing continuation with failure.");
                ffkxVar.a = true;
                ffrhVar.w(ffci.a(e));
                ((adg) fflbVar.a).b();
            }
        }
        Object m = ffrhVar.m();
        if (m == ffhh.a) {
            ffguVar.getClass();
        }
        return m;
    }

    public final Object b(String str, adu aduVar, ffgu ffguVar) {
        ffrh ffrhVar = new ffrh(ffhi.c(ffguVar), 1);
        ffrhVar.B();
        ffkx ffkxVar = new ffkx();
        fflb fflbVar = new fflb();
        fflbVar.a = this.b.b(str, aduVar, new aiit(ffkxVar, ffrhVar, fflbVar));
        if (ffkxVar.a) {
            ((enrr) a.e().h("com/google/android/apps/messaging/navigation/targets/ActivityResultLauncher", "retrievePendingResult", 93, "ActivityResultLauncher.kt")).q("Activity result callback already invoked upon registration, unregistering launcher.");
            ((adg) fflbVar.a).b();
        }
        Object m = ffrhVar.m();
        if (m == ffhh.a) {
            ffguVar.getClass();
        }
        return m;
    }
}
