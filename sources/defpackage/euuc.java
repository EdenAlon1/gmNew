package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euuc {
    final SharedPreferences a;
    final Context b;
    private final Map c = new cmh();

    public euuc(Context context) {
        this.b = context;
        this.a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || e()) {
                return;
            }
            Log.i("FirebaseInstanceId", "App restored, clearing state");
            b();
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Error creating file in no backup dir: ".concat(String.valueOf(e.getMessage())));
            }
        }
    }

    static String f(String str) {
        return str.concat("|S|cre");
    }

    private static final String h(String str, String str2, String str3) {
        return str + "|T|" + str2 + "|" + str3;
    }

    public final synchronized euub a(String str, String str2, String str3) {
        euub euubVar;
        SharedPreferences sharedPreferences = this.a;
        String h = h(str, str2, str3);
        euubVar = null;
        String string = sharedPreferences.getString(h, null);
        long j = euub.a;
        if (!TextUtils.isEmpty(string)) {
            if (string.startsWith("{")) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    euubVar = new euub(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
                } catch (JSONException e) {
                    Log.w("FirebaseInstanceId", "Failed to parse token: ".concat(e.toString()));
                }
            } else {
                euubVar = new euub(string, null, 0L);
            }
        }
        return euubVar;
    }

    public final synchronized void b() {
        this.c.clear();
        this.a.edit().clear().commit();
    }

    public final synchronized void c(String str, String str2, String str3) {
        SharedPreferences sharedPreferences = this.a;
        String h = h(str, str2, str3);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.remove(h);
        edit.commit();
    }

    public final synchronized void d(String str, String str2, String str3, String str4, String str5) {
        String str6;
        long currentTimeMillis = System.currentTimeMillis();
        long j = euub.a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str4);
            jSONObject.put("appVersion", str5);
            jSONObject.put("timestamp", currentTimeMillis);
            str6 = jSONObject.toString();
        } catch (JSONException e) {
            Log.w("FirebaseInstanceId", "Failed to encode token: ".concat(e.toString()));
            str6 = null;
        }
        if (str6 == null) {
            return;
        }
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString(h(str, str2, str3), str6);
        edit.commit();
    }

    public final synchronized boolean e() {
        return this.a.getAll().isEmpty();
    }

    public final synchronized void g(String str) {
        SharedPreferences sharedPreferences = this.a;
        long currentTimeMillis = System.currentTimeMillis();
        if (sharedPreferences.contains(f(str))) {
            String string = this.a.getString(f(str), null);
            currentTimeMillis = 0;
            if (string != null) {
                try {
                    currentTimeMillis = Long.parseLong(string);
                } catch (NumberFormatException unused) {
                }
            }
        } else {
            SharedPreferences sharedPreferences2 = this.a;
            String f = f(str);
            SharedPreferences.Editor edit = sharedPreferences2.edit();
            edit.putString(f, String.valueOf(currentTimeMillis));
            edit.commit();
        }
        this.c.put(str, Long.valueOf(currentTimeMillis));
    }
}
