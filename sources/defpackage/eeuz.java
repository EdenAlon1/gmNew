package defpackage;

import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeuz {
    public static void a(JSONObject jSONObject, String str, CharSequence charSequence) {
        if (charSequence.length() != 0) {
            jSONObject.putOpt(str, charSequence);
        }
    }

    public static void b(JSONObject jSONObject, String str, Number number) {
        if (number.intValue() != 0) {
            jSONObject.putOpt(str, number);
        }
    }

    public static void c(JSONObject jSONObject, String str, Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        jSONObject.putOpt(str, new JSONArray(collection));
    }

    public static void d(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        if (jSONObject2.length() != 0) {
            jSONObject.putOpt(str, jSONObject2);
        }
    }
}
