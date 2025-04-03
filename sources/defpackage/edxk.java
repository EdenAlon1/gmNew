package defpackage;

import java.security.SecureRandom;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edxk {
    private final akig a;
    private final akih b;

    public edxk(akig akigVar, akih akihVar) {
        this.a = akigVar;
        this.b = akihVar;
    }

    public final edvo a(int i, int i2, emsj emsjVar, emtc emtcVar) {
        String str;
        int i3 = emtcVar.g;
        int a = emsz.a(i3);
        if (a == 0) {
            a = 1;
        }
        int i4 = a - 2;
        if (i4 == 11) {
            akis akisVar = this.b.a.a;
            fbbf fbbfVar = akisVar.oQ;
            return new edxj(akisVar.ec(), akisVar.eb(), (edxm) akisVar.fu(), (SecureRandom) fbbfVar.b(), i, i2, emsjVar, emtcVar);
        }
        if (i4 == 12) {
            akis akisVar2 = this.a.a.a;
            fbbf fbbfVar2 = akisVar2.oQ;
            return new edxg(akisVar2.ec(), akisVar2.eb(), (edxm) akisVar2.fu(), (SecureRandom) fbbfVar2.b(), i, i2, emsjVar, emtcVar);
        }
        int a2 = emsz.a(i3);
        if (a2 == 0 || a2 == 1) {
            str = "UNRECOGNIZED";
        } else if (a2 != 2) {
            switch (a2) {
                case 13:
                    str = "FLEETWIDE_OCCURRENCE_COUNTS";
                    break;
                case 14:
                    str = "UNIQUE_DEVICE_COUNTS";
                    break;
                case 15:
                    str = "UNIQUE_DEVICE_HISTOGRAMS";
                    break;
                case 16:
                    str = "HOURLY_VALUE_HISTOGRAMS";
                    break;
                case 17:
                    str = "FLEETWIDE_HISTOGRAMS";
                    break;
                case 18:
                    str = "FLEETWIDE_MEANS";
                    break;
                case 19:
                    str = "UNIQUE_DEVICE_NUMERIC_STATS";
                    break;
                case 20:
                    str = "HOURLY_VALUE_NUMERIC_STATS";
                    break;
                default:
                    switch (a2) {
                        case 22:
                            str = "STRING_COUNTS";
                            break;
                        case 23:
                            str = "UNIQUE_DEVICE_STRING_COUNTS";
                            break;
                        case 24:
                            str = "STRUCT";
                            break;
                        default:
                            str = "null";
                            break;
                    }
            }
        } else {
            str = "REPORT_TYPE_UNSET";
        }
        throw new IllegalArgumentException("Unknown generator for report type: ".concat(str));
    }
}
