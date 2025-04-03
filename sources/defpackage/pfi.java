package defpackage;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pfi {
    public static WebMessage a(pes pesVar) {
        WebMessagePort[] webMessagePortArr;
        String a = pesVar.a();
        peu[] peuVarArr = pesVar.a;
        if (peuVarArr == null) {
            webMessagePortArr = null;
        } else {
            int length = peuVarArr.length;
            WebMessagePort[] webMessagePortArr2 = new WebMessagePort[length];
            for (int i = 0; i < length; i++) {
                webMessagePortArr2[i] = peuVarArr[i].a();
            }
            webMessagePortArr = webMessagePortArr2;
        }
        return new WebMessage(a, webMessagePortArr);
    }
}
