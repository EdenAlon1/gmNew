package defpackage;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzcn {
    public static final void a(fexv fexvVar) {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, null, null);
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            emxf.m(true, "Cannot change security when using ChannelCredentials");
            fexvVar.f = socketFactory;
            fexvVar.n = 1;
        } catch (KeyManagementException | NoSuchAlgorithmException unused) {
            dyhr.c("OkHttpChannelBuilder", "Failed to set SocketFactory");
        }
    }
}
