package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjhz {
    public static int a(int i) {
        if (i == 0) {
            return 5;
        }
        switch (i) {
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                return 1;
            case 102:
                return 2;
            case 103:
                return 3;
            case 104:
                return 4;
            default:
                return 0;
        }
    }
}
