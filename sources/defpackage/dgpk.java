package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgpk {
    public static File c(Context context) {
        File noBackupFilesDir = context.getNoBackupFilesDir();
        if (noBackupFilesDir != null && noBackupFilesDir.isDirectory()) {
            return noBackupFilesDir;
        }
        Log.w("InstanceID", "noBackupFilesDir doesn't exist, using regular files directory instead");
        return context.getFilesDir();
    }

    private static File d(Context context, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "com.google.InstanceId.properties";
        } else {
            try {
                str2 = "com.google.InstanceId_" + dgpz.b(str.getBytes("UTF-8")) + ".properties";
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
        dgwl dgwlVar = dgwj.a;
        return new File(dgwk.a(c(context), str2));
    }

    private static final KeyPair e(String str, String str2) {
        try {
            byte[] decode = Base64.decode(str, 8);
            byte[] decode2 = Base64.decode(str2, 8);
            try {
                KeyFactory keyFactory = KeyFactory.getInstance("RSA");
                return new KeyPair(keyFactory.generatePublic(new X509EncodedKeySpec(decode)), keyFactory.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                Log.w("InstanceID", "Invalid key stored ".concat(e.toString()));
                throw new dgpj(e);
            }
        } catch (IllegalArgumentException e2) {
            throw new dgpj(e2);
        }
    }

    private static final void f(Context context, String str, dgpi dgpiVar) {
        try {
            if (Log.isLoggable("InstanceID", 3)) {
                Log.d("InstanceID", "Writing key to properties file");
            }
            File d = d(context, str);
            d.createNewFile();
            Properties properties = new Properties();
            properties.setProperty("pub", dgpiVar.b());
            properties.setProperty("pri", dgpiVar.a());
            properties.setProperty("cre", String.valueOf(dgpiVar.b));
            FileOutputStream fileOutputStream = new FileOutputStream(d);
            try {
                properties.store(fileOutputStream, (String) null);
                fileOutputStream.close();
            } finally {
            }
        } catch (IOException e) {
            Log.w("InstanceID", "Failed to write key: ".concat(e.toString()));
        }
    }

    private static final dgpi g(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            String property = properties.getProperty("pub");
            String property2 = properties.getProperty("pri");
            if (property != null && property2 != null) {
                KeyPair e = e(property, property2);
                try {
                    String property3 = properties.getProperty("cre");
                    if (property3 == null) {
                        throw new dgpj(new NullPointerException("cre"));
                    }
                    dgpi dgpiVar = new dgpi(e, Long.parseLong(property3));
                    fileInputStream.close();
                    return dgpiVar;
                } catch (NumberFormatException e2) {
                    throw new dgpj(e2);
                }
            }
            fileInputStream.close();
            return null;
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static final dgpi h(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(dgpz.c(str, "|P|"), null);
        String string2 = sharedPreferences.getString(dgpz.c(str, "|K|"), null);
        if (string == null || string2 == null) {
            return null;
        }
        KeyPair e = e(string, string2);
        String string3 = sharedPreferences.getString(dgpz.c(str, "cre"), null);
        long j = 0;
        if (string3 != null) {
            try {
                j = Long.parseLong(string3);
            } catch (NumberFormatException unused) {
            }
        }
        return new dgpi(e, j);
    }

    private static final void i(Context context, String str, dgpi dgpiVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (dgpiVar.equals(h(sharedPreferences, str))) {
                return;
            }
        } catch (dgpj unused) {
        }
        if (Log.isLoggable("InstanceID", 3)) {
            Log.d("InstanceID", "Writing key to shared preferences");
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(dgpz.c(str, "|P|"), dgpiVar.b());
        edit.putString(dgpz.c(str, "|K|"), dgpiVar.a());
        edit.putString(dgpz.c(str, "cre"), String.valueOf(dgpiVar.b));
        edit.commit();
    }

    final dgpi a(Context context, String str) {
        dgpi dgpiVar = new dgpi(dgpe.a(), System.currentTimeMillis());
        try {
            dgpi b = b(context, str);
            if (b != null) {
                if (Log.isLoggable("InstanceID", 3)) {
                    Log.d("InstanceID", "Loaded key after generating new one, using loaded one");
                }
                return b;
            }
        } catch (dgpj unused) {
        }
        if (Log.isLoggable("InstanceID", 3)) {
            Log.d("InstanceID", "Generated new key");
        }
        f(context, str, dgpiVar);
        i(context, str, dgpiVar);
        return dgpiVar;
    }

    public final dgpi b(Context context, String str) {
        dgpi g;
        try {
            File d = d(context, str);
            if (d.exists()) {
                try {
                    g = g(d);
                } catch (IOException e) {
                    if (Log.isLoggable("InstanceID", 3)) {
                        Log.d("InstanceID", "Failed to read key from file, retrying: ".concat(e.toString()));
                    }
                    try {
                        g = g(d);
                    } catch (IOException e2) {
                        Log.w("InstanceID", "IID file exists, but failed to read from it: ".concat(e2.toString()));
                        throw new dgpj(e2);
                    }
                }
            } else {
                g = null;
            }
        } catch (dgpj e3) {
            e = e3;
        }
        if (g != null) {
            i(context, str, g);
            return g;
        }
        e = null;
        try {
            dgpi h = h(context.getSharedPreferences("com.google.android.gms.appid", 0), str);
            if (h != null) {
                f(context, str, h);
                return h;
            }
        } catch (dgpj e4) {
            e = e4;
        }
        if (e == null) {
            return null;
        }
        throw e;
    }
}
