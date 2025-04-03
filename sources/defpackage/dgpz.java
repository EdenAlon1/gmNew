package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgpz {
    final SharedPreferences a;
    final Context b;
    private final dgpk c;
    private final Map d;

    public dgpz(Context context) {
        dgpk dgpkVar = new dgpk();
        this.d = new cmh();
        this.b = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.a = sharedPreferences;
        this.c = dgpkVar;
        File noBackupFilesDir = context.getNoBackupFilesDir();
        dgwl dgwlVar = dgwj.a;
        File file = new File(dgwk.a(noBackupFilesDir, "com.google.android.gms.appid-no-backup"));
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || sharedPreferences.getAll().isEmpty()) {
                return;
            }
            Log.i("InstanceID/Store", "App restored, clearing state");
            dgph.a(context, this);
        } catch (IOException e) {
            if (Log.isLoggable("InstanceID/Store", 3)) {
                Log.d("InstanceID/Store", "Error creating file in no backup dir: ".concat(String.valueOf(e.getMessage())));
            }
        }
    }

    static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    static String c(String str, String str2) {
        return a.w(str2, str, "|S|");
    }

    private static final String i(String str) {
        return String.valueOf(str).concat("|T|496232013492|GCM");
    }

    private static final String j(String str) {
        return String.valueOf(str).concat("|T-timestamp|496232013492|GCM");
    }

    public final synchronized dgpi a(String str) {
        dgpi a;
        dgpi dgpiVar = (dgpi) this.d.get(str);
        if (dgpiVar != null) {
            return dgpiVar;
        }
        try {
            dgpk dgpkVar = this.c;
            Context context = this.b;
            a = dgpkVar.b(context, str);
            if (a == null) {
                a = dgpkVar.a(context, str);
            }
        } catch (dgpj unused) {
            Log.w("InstanceID/Store", "Stored data is corrupt, generating new identity");
            dgph.a(this.b, this);
            a = this.c.a(this.b, str);
        }
        this.d.put(str, a);
        return a;
    }

    public final synchronized void d() {
        this.d.clear();
        File[] listFiles = dgpk.c(this.b).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.getName().startsWith("com.google.InstanceId")) {
                    file.delete();
                }
            }
        }
        this.a.edit().clear().commit();
    }

    public final synchronized String e() {
        return this.a.getString("appVersion", null);
    }

    public final synchronized String f(String str) {
        return this.a.getString(i(str), null);
    }

    public final synchronized long g(String str) {
        return this.a.getLong(j(str), -1L);
    }

    public final synchronized void h(String str, String str2, String str3) {
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString(i(str), str2);
        edit.putLong(j(str), System.currentTimeMillis());
        edit.putString("appVersion", str3);
        edit.commit();
    }
}
