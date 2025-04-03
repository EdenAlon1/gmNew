package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfep {
    private static final Lock c = new ReentrantLock();
    private static dfep d;
    public final Lock a = new ReentrantLock();
    public final SharedPreferences b;

    public dfep(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static dfep c(Context context) {
        dfwv.n(context);
        Lock lock = c;
        lock.lock();
        try {
            if (d == null) {
                d = new dfep(context.getApplicationContext());
            }
            dfep dfepVar = d;
            lock.unlock();
            return dfepVar;
        } catch (Throwable th) {
            c.unlock();
            throw th;
        }
    }

    public final GoogleSignInAccount a() {
        String d2;
        String d3 = d("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(d3) && (d2 = d(e("googleSignInAccount", d3))) != null) {
            try {
                if (TextUtils.isEmpty(d2)) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(d2);
                String optString = jSONObject.optString("photoUrl");
                Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
                long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
                HashSet hashSet = new HashSet();
                JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    hashSet.add(new Scope(jSONArray.getString(i)));
                }
                String optString2 = jSONObject.optString("id");
                String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
                String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
                String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
                String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
                String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
                Long valueOf = Long.valueOf(parseLong);
                String string = jSONObject.getString("obfuscatedIdentifier");
                valueOf.getClass();
                dfwv.l(string);
                GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(optString2, optString3, optString4, optString5, parse, null, parseLong, string, new ArrayList(hashSet), optString6, optString7);
                googleSignInAccount.f = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
                return googleSignInAccount;
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final GoogleSignInOptions b() {
        String d2;
        String d3 = d("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(d3) && (d2 = d(e("googleSignInOptions", d3))) != null) {
            try {
                Scope scope = GoogleSignInOptions.a;
                if (TextUtils.isEmpty(d2)) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(d2);
                HashSet hashSet = new HashSet();
                JSONArray jSONArray = jSONObject.getJSONArray("scopes");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    hashSet.add(new Scope(jSONArray.getString(i)));
                }
                String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
                return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final String d(String str) {
        this.a.lock();
        try {
            return this.b.getString(str, null);
        } finally {
            this.a.unlock();
        }
    }

    public final String e(String str, String str2) {
        return a.w(str2, str, ":");
    }

    protected final void f(String str, String str2) {
        this.a.lock();
        try {
            this.b.edit().putString(str, str2).apply();
        } finally {
            this.a.unlock();
        }
    }
}
