package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evjq implements eygg {
    public static final eygg a = new evjq();

    private evjq() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        if (i != 0 && i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && i != 99) {
            switch (i) {
                default:
                    switch (i) {
                        case 110:
                        case 111:
                        case 112:
                        case 113:
                        case 114:
                        case 115:
                        case 116:
                        case 117:
                        case 118:
                            break;
                        default:
                            return false;
                    }
                case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                case 102:
                case 103:
                case 104:
                    return true;
            }
        }
        return true;
    }
}
