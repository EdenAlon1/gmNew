package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import javax.crypto.KeyGenerator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etqk {
    public etgb f;
    public Context a = null;
    public String b = null;
    public String c = null;
    private String g = null;
    private etfk h = null;
    public etfv d = null;
    public etzp e = null;

    private final etfk d() {
        boolean z;
        Object obj = etql.a;
        etqp etqpVar = new etqp();
        try {
            String str = this.g;
            synchronized (etqp.a) {
                String e = eujq.e(str);
                if (etqn.a().containsAlias(e)) {
                    z = false;
                } else {
                    KeyGenParameterSpec build = new KeyGenParameterSpec.Builder(e, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build();
                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                    keyGenerator.init(build);
                    keyGenerator.generateKey();
                    z = true;
                }
            }
            try {
                return etqpVar.a(this.g);
            } catch (GeneralSecurityException | ProviderException e2) {
                if (!z) {
                    throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.g), e2);
                }
                Log.w(etql.b, "cannot use Android Keystore, it'll be disabled", e2);
                return null;
            }
        } catch (GeneralSecurityException | ProviderException e3) {
            Log.w(etql.b, "cannot use Android Keystore, it'll be disabled", e3);
            return null;
        }
    }

    private final etgb e(byte[] bArr) {
        try {
            this.h = new etqp().a(this.g);
            try {
                byte[] bArr2 = new byte[0];
                etfl a = etfl.a(bArr);
                etfk etfkVar = this.h;
                try {
                    InputStream inputStream = a.a;
                    eyfc eyfcVar = eyfc.a;
                    eyib eyibVar = eyib.a;
                    etyr etyrVar = (etyr) eyfy.parseFrom(etyr.a, inputStream, eyfc.a);
                    if (etyrVar == null || etyrVar.c.d() == 0) {
                        throw new GeneralSecurityException("empty keyset");
                    }
                    try {
                        etzt etztVar = (etzt) eyfy.parseFrom(etzt.a, etfkVar.a(etyrVar.c.I(), bArr2), eyfc.a);
                        etga.g(etztVar);
                        return etgb.b(etga.b(etztVar));
                    } catch (eygu unused) {
                        throw new GeneralSecurityException("invalid keyset, corrupted key material");
                    }
                } finally {
                    a.a.close();
                }
            } catch (IOException | GeneralSecurityException e) {
                try {
                    return f(bArr);
                } catch (IOException unused2) {
                    throw e;
                }
            }
        } catch (GeneralSecurityException | ProviderException e2) {
            try {
                etgb f = f(bArr);
                Log.w(etql.b, "cannot use Android Keystore, it'll be disabled", e2);
                return f;
            } catch (IOException unused3) {
                throw e2;
            }
        }
    }

    private static final etgb f(byte[] bArr) {
        return etgb.b(etfm.a(etfl.a(bArr)));
    }

    public final synchronized etql a() {
        etql etqlVar;
        if (this.b == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        etzp etzpVar = this.e;
        if (etzpVar != null && this.d == null) {
            this.d = new etfv(etgm.a(etzpVar.toByteArray()));
        }
        synchronized (etql.a) {
            Context context = this.a;
            String str = this.b;
            String str2 = this.c;
            if (str == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            Context applicationContext = context.getApplicationContext();
            byte[] bArr = null;
            try {
                String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
                if (string != null) {
                    bArr = euiv.b(string);
                }
                if (bArr == null) {
                    if (this.g != null) {
                        this.h = d();
                    }
                    etfv etfvVar = this.d;
                    if (etfvVar == null) {
                        throw new GeneralSecurityException("cannot read or generate keyset");
                    }
                    etgf etgfVar = etfvVar.a;
                    if (etgfVar == null) {
                        etgfVar = etgm.a(etfvVar.a().toByteArray());
                    }
                    etfy etfyVar = new etfy();
                    etfw etfwVar = new etfw(etgfVar);
                    etfwVar.e = etfx.a;
                    etfwVar.a();
                    etfyVar.c(etfwVar);
                    etga a = etfyVar.a();
                    Context context2 = this.a;
                    String str3 = this.b;
                    String str4 = this.c;
                    if (str3 == null) {
                        throw new IllegalArgumentException("keysetName cannot be null");
                    }
                    Context applicationContext2 = context2.getApplicationContext();
                    SharedPreferences.Editor edit = str4 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext2).edit() : applicationContext2.getSharedPreferences(str4, 0).edit();
                    etfk etfkVar = this.h;
                    try {
                        if (etfkVar != null) {
                            etzt etztVar = a.a;
                            byte[] b = etfkVar.b(etztVar.toByteArray(), new byte[0]);
                            etyq etyqVar = (etyq) etyr.a.createBuilder();
                            eyee x = eyee.x(b);
                            etyqVar.copyOnWrite();
                            ((etyr) etyqVar.instance).c = x;
                            etzx a2 = etgn.a(etztVar);
                            etyqVar.copyOnWrite();
                            etyr etyrVar = (etyr) etyqVar.instance;
                            a2.getClass();
                            etyrVar.d = a2;
                            etyrVar.b = 1 | etyrVar.b;
                            if (!edit.putString(str3, euiv.a(((etyr) etyqVar.build()).toByteArray())).commit()) {
                                throw new IOException("Failed to write to SharedPreferences");
                            }
                        } else if (!edit.putString(str3, euiv.a(a.a.toByteArray())).commit()) {
                            throw new IOException("Failed to write to SharedPreferences");
                        }
                        this.f = etgb.b(a);
                    } catch (IOException e) {
                        throw new GeneralSecurityException(e);
                    }
                } else if (this.g != null) {
                    this.f = e(bArr);
                } else {
                    this.f = f(bArr);
                }
                etqlVar = new etql(this);
            } catch (ClassCastException | IllegalArgumentException unused) {
                throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", str));
            }
        }
        return etqlVar;
    }

    public final void b(String str) {
        if (!str.startsWith("android-keystore://")) {
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
        this.g = str;
    }

    public final void c(Context context, String str, String str2) {
        if (context == null) {
            throw new IllegalArgumentException("need an Android context");
        }
        this.a = context;
        this.b = str;
        this.c = str2;
    }
}
