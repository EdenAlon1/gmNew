package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class csjc {
    public static eovw a = eovw.ROBOLECTRIC_BUILD;

    public static boolean a() {
        return a.equals(eovw.ARIGATO_BUILD);
    }

    public static boolean b() {
        return a.equals(eovw.DOMO_BUILD);
    }

    public static boolean c() {
        return a.equals(eovw.ENG_BUILD) || a.equals(eovw.WEAR_ENG_BUILD);
    }

    public static boolean d() {
        return a.equals(eovw.ENG_BUILD) || a.equals(eovw.FISH_FOOD_BUILD) || a.equals(eovw.WEAR_ENG_BUILD) || a.equals(eovw.WEAR_FISH_FOOD_BUILD);
    }

    public static boolean e() {
        return a.equals(eovw.ENG_BUILD) || a.equals(eovw.FISH_FOOD_BUILD) || a.equals(eovw.DOG_FOOD_BUILD) || a.equals(eovw.WEAR_ENG_BUILD) || a.equals(eovw.WEAR_FISH_FOOD_BUILD) || a.equals(eovw.WEAR_DOG_FOOD_BUILD);
    }

    public static boolean f() {
        return a.equals(eovw.PERFORMANCE_BUILD);
    }

    public static boolean g() {
        return a.equals(eovw.RELEASE_BUILD) || a.equals(eovw.GO_BUILD) || a.equals(eovw.WEAR_BUILD) || a.equals(eovw.OPEN_BETA_BUILD) || a.equals(eovw.PLATFORM_BUILD) || a.equals(eovw.DITTO_SATELLITE_BUILD);
    }

    public static boolean h() {
        return a.equals(eovw.ROBOLECTRIC_BUILD);
    }

    public static boolean i() {
        return a.equals(eovw.STABILITY_BUILD) || a.equals(eovw.STABILITY_GO_BUILD) || a.equals(eovw.STABILITY_PLATFORM_BUILD);
    }

    public static boolean j() {
        return a.equals(eovw.ROBOLECTRIC_BUILD) || a.equals(eovw.ARIGATO_BUILD) || a.equals(eovw.DOMO_BUILD) || a.equals(eovw.PERFORMANCE_BUILD) || a.equals(eovw.ARTIK_BUILD) || i();
    }
}
