package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfel {
    private static dfel b;
    final dfep a;

    private dfel(Context context) {
        dfep c = dfep.c(context);
        this.a = c;
        c.a();
        c.b();
    }

    public static synchronized dfel a(Context context) {
        dfel d;
        synchronized (dfel.class) {
            d = d(context.getApplicationContext());
        }
        return d;
    }

    private static synchronized dfel d(Context context) {
        synchronized (dfel.class) {
            dfel dfelVar = b;
            if (dfelVar != null) {
                return dfelVar;
            }
            dfel dfelVar2 = new dfel(context);
            b = dfelVar2;
            return dfelVar2;
        }
    }

    public final synchronized void b() {
        dfep dfepVar = this.a;
        dfepVar.a.lock();
        try {
            dfepVar.b.edit().clear().apply();
        } finally {
            dfepVar.a.unlock();
        }
    }

    public final synchronized void c(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        dfwv.n(googleSignInOptions);
        dfep dfepVar = this.a;
        dfepVar.f("defaultGoogleSignInAccount", googleSignInAccount.h);
        dfwv.n(googleSignInOptions);
        String str = googleSignInAccount.h;
        String e = dfepVar.e("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.a;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            String str3 = googleSignInAccount.b;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.c;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            String str5 = googleSignInAccount.d;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.j;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.k;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.e;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.f;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.g);
            jSONObject.put("obfuscatedIdentifier", googleSignInAccount.h);
            JSONArray jSONArray = new JSONArray();
            List list = googleSignInAccount.i;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new Comparator() { // from class: dfdu
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((Scope) obj).b.compareTo(((Scope) obj2).b);
                }
            });
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.b);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            dfepVar.f(e, jSONObject.toString());
            String e2 = dfepVar.e("googleSignInOptions", str);
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                Collections.sort(googleSignInOptions.h, GoogleSignInOptions.f);
                Iterator it = googleSignInOptions.h.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(((Scope) it.next()).b);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.i;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.j);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.l);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.k);
                if (!TextUtils.isEmpty(googleSignInOptions.m)) {
                    jSONObject2.put("serverClientId", googleSignInOptions.m);
                }
                if (!TextUtils.isEmpty(googleSignInOptions.n)) {
                    jSONObject2.put("hostedDomain", googleSignInOptions.n);
                }
                dfepVar.f(e2, jSONObject2.toString());
            } catch (JSONException e3) {
                throw new RuntimeException(e3);
            }
        } catch (JSONException e4) {
            throw new RuntimeException(e4);
        }
    }
}
