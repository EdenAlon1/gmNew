package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eovw implements eyge {
    NOT_SET_LEGACY_BUILD(0),
    ROBOLECTRIC_BUILD(1),
    ARIGATO_BUILD(2),
    DOMO_BUILD(3),
    STABILITY_BUILD(4),
    STABILITY_GO_BUILD(7),
    STABILITY_PLATFORM_BUILD(8),
    PERFORMANCE_BUILD(5),
    ARTIK_BUILD(6),
    ENG_BUILD(100),
    WEAR_BUILD(EnergyProfile.EVCONNECTOR_TYPE_OTHER),
    FISH_FOOD_BUILD(102),
    DOG_FOOD_BUILD(103),
    OPEN_BETA_BUILD(104),
    RELEASE_BUILD(105),
    PLATFORM_BUILD(106),
    GO_BUILD(107),
    DITTO_SATELLITE_BUILD(108),
    WEAR_ENG_BUILD(109),
    WEAR_FISH_FOOD_BUILD(110),
    WEAR_DOG_FOOD_BUILD(111),
    WEAR_OPEN_BETA_BUILD(112),
    WEAR_RELEASE_BUILD(113);

    public final int x;

    eovw(int i) {
        this.x = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.x;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.x);
    }
}
