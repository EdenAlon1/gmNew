package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eovv implements eygg {
    public static final eygg a = new eovv();

    private eovv() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        eovw eovwVar;
        switch (i) {
            case 0:
                eovwVar = eovw.NOT_SET_LEGACY_BUILD;
                break;
            case 1:
                eovwVar = eovw.ROBOLECTRIC_BUILD;
                break;
            case 2:
                eovwVar = eovw.ARIGATO_BUILD;
                break;
            case 3:
                eovwVar = eovw.DOMO_BUILD;
                break;
            case 4:
                eovwVar = eovw.STABILITY_BUILD;
                break;
            case 5:
                eovwVar = eovw.PERFORMANCE_BUILD;
                break;
            case 6:
                eovwVar = eovw.ARTIK_BUILD;
                break;
            case 7:
                eovwVar = eovw.STABILITY_GO_BUILD;
                break;
            case 8:
                eovwVar = eovw.STABILITY_PLATFORM_BUILD;
                break;
            default:
                switch (i) {
                    case VCardConstants.DEFAULT_PREF /* 100 */:
                        eovwVar = eovw.ENG_BUILD;
                        break;
                    case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                        eovwVar = eovw.WEAR_BUILD;
                        break;
                    case 102:
                        eovwVar = eovw.FISH_FOOD_BUILD;
                        break;
                    case 103:
                        eovwVar = eovw.DOG_FOOD_BUILD;
                        break;
                    case 104:
                        eovwVar = eovw.OPEN_BETA_BUILD;
                        break;
                    case 105:
                        eovwVar = eovw.RELEASE_BUILD;
                        break;
                    case 106:
                        eovwVar = eovw.PLATFORM_BUILD;
                        break;
                    case 107:
                        eovwVar = eovw.GO_BUILD;
                        break;
                    case 108:
                        eovwVar = eovw.DITTO_SATELLITE_BUILD;
                        break;
                    case 109:
                        eovwVar = eovw.WEAR_ENG_BUILD;
                        break;
                    case 110:
                        eovwVar = eovw.WEAR_FISH_FOOD_BUILD;
                        break;
                    case 111:
                        eovwVar = eovw.WEAR_DOG_FOOD_BUILD;
                        break;
                    case 112:
                        eovwVar = eovw.WEAR_OPEN_BETA_BUILD;
                        break;
                    case 113:
                        eovwVar = eovw.WEAR_RELEASE_BUILD;
                        break;
                    default:
                        eovwVar = null;
                        break;
                }
        }
        return eovwVar != null;
    }
}
