package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euxp {
    final SharedPreferences a;

    public euxp(Context context) {
        this.a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || d()) {
                return;
            }
            Log.i("FirebaseMessaging", "App restored, clearing state");
            b();
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: ".concat(String.valueOf(e.getMessage())));
            }
        }
    }

    private static final String e(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    public final synchronized euxo a(String str, String str2) {
        euxo euxoVar;
        SharedPreferences sharedPreferences = this.a;
        String e = e(str, str2);
        euxoVar = null;
        String string = sharedPreferences.getString(e, null);
        long j = euxo.a;
        if (!TextUtils.isEmpty(string)) {
            if (string.startsWith("{")) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    euxoVar = new euxo(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
                } catch (JSONException e2) {
                    Log.w("FirebaseMessaging", "Failed to parse token: ".concat(e2.toString()));
                }
            } else {
                euxoVar = new euxo(string, null, 0L);
            }
        }
        return euxoVar;
    }

    public final synchronized void b() {
        this.a.edit().clear().commit();
    }

    public final synchronized void c(String str, String str2, String str3, String str4) {
        String str5;
        long currentTimeMillis = System.currentTimeMillis();
        long j = euxo.a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str3);
            jSONObject.put("appVersion", str4);
            jSONObject.put("timestamp", currentTimeMillis);
            str5 = jSONObject.toString();
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to encode token: ".concat(e.toString()));
            str5 = null;
        }
        if (str5 == null) {
            return;
        }
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString(e(str, str2), str5);
        edit.commit();
    }

    public final synchronized boolean d() {
        return this.a.getAll().isEmpty();
    }
}
