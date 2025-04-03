package defpackage;

import android.net.Uri;
import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbhj {
    public static final Uri a = Uri.parse("content://com.google.android.apps.messaging.shared.datamodel.provider.sharedstorage.SharedStorageProvider");

    /* JADX WARN: Type inference failed for: r1v2, types: [eyhs, java.lang.Object] */
    public static eyhs a(String str, eyhs eyhsVar) {
        return eyhsVar.getParserForType().l(Base64.decode(str, 0), eyfc.a());
    }

    public static String b(eyhs eyhsVar) {
        return Base64.encodeToString(eyhsVar.toByteArray(), 0);
    }
}
