package defpackage;

import android.net.Network;
import android.text.TextUtils;
import j$.util.Map;
import j$.util.function.BiConsumer$CC;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Locale;
import java.util.function.BiConsumer;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djxx {
    private final dksv a;

    public djxx(dksv dksvVar) {
        this.a = dksvVar;
    }

    public final HttpURLConnection a(dkbn dkbnVar) {
        return b(null, dkbnVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r7v8, types: [javax.net.ssl.HttpsURLConnection] */
    public final HttpURLConnection b(Network network, dkbn dkbnVar) {
        final ?? r7;
        URL url = new URL(dkbnVar.e());
        if (url.getProtocol().equals("https")) {
            r7 = network != null ? (HttpsURLConnection) network.openConnection(url) : (HttpsURLConnection) url.openConnection();
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                URL url2 = r7.getURL();
                if (url2 == null) {
                    dkty.q("URL is null. Cannot set security for provisioning server connection.", new Object[0]);
                } else {
                    dkty.o("Creating a RCS provisioning connection for host: %s", url2.getHost());
                    sSLContext.init(null, null, null);
                    r7.setSSLSocketFactory(sSLContext.getSocketFactory());
                }
            } catch (Exception e) {
                dkty.i(e, "Unable to set security for provisioning server connection", new Object[0]);
            }
        } else {
            r7 = network != null ? (HttpURLConnection) network.openConnection(url) : (HttpURLConnection) url.openConnection();
        }
        r7.setReadTimeout(dkcg.a);
        r7.setConnectTimeout(dkcg.b);
        if (((Boolean) djai.t().a.o.a()).booleanValue()) {
            r7.setRequestProperty("client_channel", (String) djai.t().a.n.a());
        }
        r7.setRequestProperty("User-Agent", this.a.b());
        r7.setRequestProperty("Accept-Language", Locale.getDefault().toLanguageTag());
        int a = eyyz.a(dkbnVar.a().c);
        int i = a != 0 ? a : 1;
        String str = "GET";
        switch (i - 1) {
            case 2:
                str = "POST";
                break;
            case 3:
                str = "PUT";
                break;
            case 4:
                str = "HEAD";
                break;
            case 5:
                str = "DELETE";
                break;
            case 6:
                str = "PATCH";
                break;
            case 7:
                str = "OPTIONS";
                break;
        }
        r7.setRequestMethod(str);
        Map.EL.forEach(dkbnVar.j(), new BiConsumer() { // from class: djxw
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                String str2 = (String) obj;
                String str3 = (String) obj2;
                if (TextUtils.isEmpty(str3)) {
                    dkty.o("Excluding %s header in provisioning request because the value is null or empty", str2);
                } else {
                    r7.setRequestProperty(str2, str3);
                }
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
        return r7;
    }
}
