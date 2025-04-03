package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.os.Bundle;
import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvbj {
    private static final enru a = enru.c("com/google/android/libraries/inputmethod/webdebugbridge/util/WebDebugBridgeUtil");

    public static dvay a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("result");
        if (string == null) {
            ((enrr) ((enrr) a.j()).h("com/google/android/libraries/inputmethod/webdebugbridge/util/WebDebugBridgeUtil", "getResponseFromBundle", 83, "WebDebugBridgeUtil.java")).q("There's no result in the WDB response.");
            return null;
        }
        try {
            return (dvay) eyfy.parseFrom(dvay.a, eoeg.e.k(string), eyfc.a());
        } catch (eygu unused) {
            ((enrr) ((enrr) a.j()).h("com/google/android/libraries/inputmethod/webdebugbridge/util/WebDebugBridgeUtil", "getResponseFromBundle", 90, "WebDebugBridgeUtil.java")).q("The result in the WDB response is not a valid proto.");
            return null;
        }
    }

    public static Bundle b(Context context, String str, dvau dvauVar) {
        ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(str);
        if (acquireUnstableContentProviderClient == null) {
            ((enrr) ((enrr) a.j()).h("com/google/android/libraries/inputmethod/webdebugbridge/util/WebDebugBridgeUtil", "sendRequestForBundle", 57, "WebDebugBridgeUtil.java")).q("Fail to get content provider client.");
            return null;
        }
        Bundle call = acquireUnstableContentProviderClient.call("9003", dvauVar != null ? Base64.encodeToString(dvauVar.toByteArray(), 3) : null, null);
        acquireUnstableContentProviderClient.release();
        if (call == null) {
            ((enrr) ((enrr) a.j()).h("com/google/android/libraries/inputmethod/webdebugbridge/util/WebDebugBridgeUtil", "sendRequestForBundle", 71, "WebDebugBridgeUtil.java")).q("The response bundle is null.");
        }
        return call;
    }
}
