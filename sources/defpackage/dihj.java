package defpackage;

import android.content.Context;
import android.telephony.ServiceState;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dihj extends dihi {
    private static final dktn d = new dktn("MobileNetworkAccess");
    private static final diyy e = dizd.a(184659928);
    private static final diyy f = dizd.a(184656641);
    private static final diyy g = dizd.a(340231737);
    final dkvt c;

    public dihj(Context context) {
        this.c = dkvt.g(context);
    }

    private static final String h(int i) {
        String upperCase = Integer.toHexString(i).toUpperCase(Locale.US);
        int length = 4 - upperCase.length();
        if (length < 0) {
            dkty.r(d, "incorrect expected bits %d for number: %d", 16, Integer.valueOf(i));
            return upperCase;
        }
        if (length <= 0) {
            return upperCase;
        }
        StringBuilder sb = new StringBuilder(upperCase);
        for (int i2 = 0; i2 < length; i2++) {
            sb.insert(0, 0);
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0119  */
    @Override // defpackage.dihi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a() {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dihj.a():java.lang.String");
    }

    @Override // defpackage.dihi
    public final String b() {
        int duplexMode;
        int c = this.c.c();
        ServiceState serviceState = null;
        switch (c) {
            case 1:
            case 2:
                break;
            case 3:
            case 8:
            case 9:
            case 10:
            case 15:
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 12:
                break;
            case 11:
            case 16:
            case 18:
            case 19:
            default:
                dkty.r(d, "Unknown mobile access. Type=%d", Integer.valueOf(c));
                break;
            case 13:
                if (!((Boolean) e.a()).booleanValue()) {
                    if (ctid.b) {
                        try {
                            serviceState = this.c.a.getServiceState();
                        } catch (SecurityException unused) {
                        }
                        if (serviceState != null) {
                            duplexMode = serviceState.getDuplexMode();
                            if (duplexMode == 1) {
                            }
                        }
                    }
                }
                break;
            case 14:
                break;
            case 17:
                break;
            case 20:
                if (!((Boolean) g.a()).booleanValue()) {
                    dkty.r(d, "5G NR mobile access type disabled. Type=%d", Integer.valueOf(c));
                    break;
                }
                break;
        }
        return null;
    }
}
