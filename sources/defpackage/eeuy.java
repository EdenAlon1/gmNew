package defpackage;

import android.util.ArrayMap;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeuy implements eeuw {
    public final Proxy b;
    public final int c;
    public final ArrayMap d;
    private final errl f;
    private static final String e = "Sticker/1.0 ".concat(String.valueOf(System.getProperty("http.agent")));
    public static final int a = (int) TimeUnit.SECONDS.toMillis(1);

    public eeuy(Proxy proxy, int i, Map map, errl errlVar) {
        this.b = proxy;
        this.c = i;
        ArrayMap arrayMap = new ArrayMap();
        this.d = arrayMap;
        arrayMap.putAll(map);
        if (!map.containsKey("User-Agent")) {
            arrayMap.put("User-Agent", e);
        }
        this.f = errlVar;
    }

    @Override // defpackage.eeuw
    public final ListenableFuture a(final String str) {
        return erqt.m(new Callable() { // from class: eeux
            @Override // java.util.concurrent.Callable
            public final Object call() {
                URL url = new URL(str);
                eeuy eeuyVar = eeuy.this;
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection(eeuyVar.b);
                try {
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setConnectTimeout(eeuyVar.c);
                    httpURLConnection.setInstanceFollowRedirects(true);
                    for (Map.Entry entry : eeuyVar.d.entrySet()) {
                        httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Log.d("HttpFetcherImpl", "HTTP: " + responseCode + " " + httpURLConnection.getResponseMessage());
                    if (responseCode < 200 || responseCode > 299) {
                        throw new IOException(a.h(responseCode, "HTTP request failed with code: "));
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[16384];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read <= 0) {
                            inputStream.close();
                            byteArrayOutputStream.close();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            Log.d("HttpFetcherImpl", "HTTP: response size=" + byteArray.length);
                            return byteArray;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                } finally {
                    httpURLConnection.disconnect();
                }
            }
        }, this.f);
    }
}
