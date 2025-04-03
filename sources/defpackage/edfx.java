package defpackage;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.text.TextUtils;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edfx {
    public final String a;
    public final int b;
    public final edfw c;
    public final boolean d;
    public final int e;

    public edfx(WifiInfo wifiInfo, ScanResult scanResult) {
        edfw edfwVar;
        String str = scanResult.BSSID;
        String str2 = scanResult.capabilities;
        int i = scanResult.level;
        int i2 = scanResult.frequency;
        if (TextUtils.isEmpty(str2)) {
            edfwVar = edfw.OTHER;
        } else {
            String upperCase = str2.toUpperCase(Locale.getDefault());
            edfwVar = (upperCase.equals("[ESS]") || upperCase.equals("[IBSS]")) ? edfw.NONE : upperCase.matches(".*WPA[0-9]*-PSK.*") ? edfw.PSK : upperCase.matches(".*WPA[0-9]*-EAP.*") ? edfw.EAP : edfw.OTHER;
        }
        boolean z = false;
        if (wifiInfo != null && !TextUtils.isEmpty(str) && str.equalsIgnoreCase(wifiInfo.getBSSID())) {
            z = true;
        }
        this.a = str;
        this.b = i;
        this.c = edfwVar;
        this.d = z;
        this.e = i2;
    }
}
