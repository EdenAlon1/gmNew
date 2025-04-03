package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.ims.provisioning.config.Configuration;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.security.GeneralSecurityException;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djtw implements djtu {
    private final Context a;
    private final dkbt b;
    private final ctwb c;

    public djtw(Context context, dkbt dkbtVar, ctwb ctwbVar) {
        this.a = context;
        this.b = dkbtVar;
        this.c = ctwbVar;
    }

    private static final boolean e() {
        return ((Integer) dkrz.h.d()).equals(1);
    }

    @Override // defpackage.djtu
    public final djtp a(InputStream inputStream) {
        Configuration configuration = new Configuration();
        this.b.a(inputStream, configuration, false);
        return configuration;
    }

    public final Configuration.Token b() {
        csjy.c("RcsProvisioning", "Retrieving backup token");
        dkrw d = d();
        for (int i = 0; !d.f && i < 20; i++) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = 100 + currentTimeMillis;
                while (currentTimeMillis < j) {
                    try {
                        wait(j - currentTimeMillis);
                        currentTimeMillis = System.currentTimeMillis();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
        if (!d.f) {
            csjy.n("RcsProvisioning", "Unable to retrieve backup token!");
            return Configuration.a;
        }
        String c = d.c("token_value", "");
        long a = d.a("token_expiration", 0L);
        if (TextUtils.isEmpty(c)) {
            csjy.c("RcsProvisioning", "No backup token found");
            return Configuration.a;
        }
        csjy.c("RcsProvisioning", "Backup token found");
        return new Configuration.Token(c, TimeUnit.MILLISECONDS.toSeconds(a - System.currentTimeMillis()));
    }

    public final djtp c() {
        String str;
        djtp djtpVar = null;
        try {
            Context context = this.a;
            boolean e = e();
            int i = djtv.a;
            dkty.c("Loading configuration with %s key", true != e ? "old" : "new");
            if (e) {
                str = djtv.a(context);
            } else {
                try {
                    try {
                        str = dkvt.g(context).a.getDeviceId();
                    } catch (SecurityException e2) {
                        throw new dkvd("READ_PRIVILEGED_PHONE_STATE permission is missing.", e2);
                    }
                } catch (dkvd unused) {
                    dkty.g("No permissions to get device id", new Object[0]);
                    str = null;
                }
            }
            Cipher b = djtv.b(2, str);
            FileInputStream openFileInput = context.openFileInput("rcsconfig");
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(new CipherInputStream(openFileInput, b));
                Object readObject = objectInputStream.readObject();
                objectInputStream.close();
                if (openFileInput != null) {
                    openFileInput.close();
                }
                djtpVar = (djtp) readObject;
            } finally {
            }
        } catch (FileNotFoundException e3) {
            csjy.j("RcsProvisioning", "Failed to read config: no config found %s", e3.getMessage());
        } catch (StreamCorruptedException unused2) {
            csjy.i("RcsProvisioning", "Failed to read configuration: obsolete encryption");
        } catch (Exception e4) {
            csjy.p("RcsProvisioning", e4, "Failed to read configuration: ".concat(String.valueOf(e4.getMessage())));
        }
        if (djtpVar == null) {
            Configuration.Token b2 = b();
            Configuration configuration = new Configuration();
            configuration.I(b2);
            return configuration;
        }
        if (e()) {
            return djtpVar;
        }
        csjy.i("RcsProvisioning", "Migrating RCS config encryption key...");
        try {
            Context context2 = this.a;
            Cipher b3 = djtv.b(1, djtv.a(context2));
            FileOutputStream openFileOutput = context2.openFileOutput("rcsconfig", 0);
            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(new CipherOutputStream(openFileOutput, b3));
                objectOutputStream.writeObject(djtpVar);
                objectOutputStream.flush();
                objectOutputStream.close();
                if (openFileOutput != null) {
                    openFileOutput.close();
                }
                dkrz.h.e(1);
                return djtpVar;
            } finally {
            }
        } catch (IOException | GeneralSecurityException e5) {
            csjy.p("RcsProvisioning", e5, "Failed to migrate encryption key: ".concat(String.valueOf(e5.getMessage())));
            return djtpVar;
        }
    }

    public final dkrw d() {
        String str;
        try {
            str = this.c.k().y(this.a);
        } catch (Exception unused) {
            csjy.c("RcsProvisioning", "Exception while getting subscriber Id. Using default");
            str = "default";
        }
        return new dkrw(this.a, (true != TextUtils.isEmpty(str) ? str : "default").concat(".tbak"));
    }
}
