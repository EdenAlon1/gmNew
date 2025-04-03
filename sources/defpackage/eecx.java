package defpackage;

import android.text.TextUtils;
import java.io.IOException;
import java.security.KeyStore;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class eecx implements eecy {
    public final /* synthetic */ KeyStore a;
    public final /* synthetic */ String b;

    public /* synthetic */ eecx(KeyStore keyStore, String str) {
        this.a = keyStore;
        this.b = str;
    }

    @Override // defpackage.eecy
    public final SSLContext a() {
        KeyManager[] keyManagerArr;
        char[] cArr = eect.a;
        KeyStore keyStore = this.a;
        try {
            String defaultAlgorithm = KeyManagerFactory.getDefaultAlgorithm();
            KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(defaultAlgorithm);
            keyManagerFactory.init(keyStore, eect.a);
            dkty.c("Returning key managers for %s", defaultAlgorithm);
            keyManagerArr = keyManagerFactory.getKeyManagers();
        } catch (Exception e) {
            dkty.i(e, "Error while creating key managers: %s", e.getMessage());
            keyManagerArr = null;
        }
        if (keyManagerArr == null) {
            throw new IOException("Key managers could not be created!");
        }
        String str = this.b;
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        if (TextUtils.isEmpty(str)) {
            dkty.q("No fingerprint, using default trust manager", new Object[0]);
            sSLContext.init(keyManagerArr, null, null);
        } else {
            sSLContext.init(keyManagerArr, new TrustManager[]{new eecr(str)}, null);
        }
        return sSLContext;
    }
}
