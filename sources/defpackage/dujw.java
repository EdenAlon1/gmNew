package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dujw implements Runnable {
    final /* synthetic */ dujx a;
    private final Uri b;

    public dujw(dujx dujxVar, Uri uri) {
        this.a = dujxVar;
        this.b = uri;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.lang.String] */
    @Override // java.lang.Runnable
    public final void run() {
        HttpURLConnection httpURLConnection;
        try {
            if (this.a.a.equals("/")) {
                Log.d("HatsLibTransmitter", "Skipping transmission of beacon since answerUrl was \"/\", this should only happen during debugging.");
                return;
            }
            String queryParameter = this.b.getQueryParameter("t");
            byte[] bytes = this.b.getEncodedQuery().getBytes(duiz.a);
            cmh cmhVar = new cmh();
            cmhVar.put(fhpi.a, "application/x-www-form-urlencoded");
            cmhVar.put("Content-Length", Integer.toString(bytes.length));
            cmhVar.put("charset", "utf-8");
            cmhVar.put("Connection", "close");
            dukb.c();
            cmhVar.put("User-Agent", dujz.a);
            dujx dujxVar = this.a;
            String b = dujxVar.b.b(dujxVar.a);
            if (!TextUtils.isEmpty(b)) {
                cmhVar.put("Cookie", b);
            }
            dukb c = dukb.c();
            if (((dujz) c).d == null) {
                synchronized (c) {
                    if (((dujz) c).d == null) {
                        ((dujz) c).d = new dukg();
                    }
                }
            }
            dukg dukgVar = ((dujz) c).d;
            HttpURLConnection httpURLConnection2 = null;
            httpURLConnection2 = null;
            try {
                try {
                    httpURLConnection = (HttpURLConnection) new URL(this.a.a).openConnection();
                } catch (Throwable th) {
                    th = th;
                }
            } catch (IOException e) {
                e = e;
            }
            try {
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setRequestMethod("POST");
                for (Map.Entry entry : cmhVar.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpURLConnection.setUseCaches(false);
                new DataOutputStream(httpURLConnection.getOutputStream()).write(bytes);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), duiz.a));
                while (bufferedReader.readLine() != null) {
                }
                bufferedReader.close();
                int responseCode = httpURLConnection.getResponseCode();
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                if (responseCode == 200) {
                    Log.d("HatsLibTransmitter", "Successfully transmitted answer beacon of type: ".concat(String.valueOf(queryParameter)));
                    dujx dujxVar2 = this.a;
                    dujxVar2.b.c(dujxVar2.a, headerFields);
                    httpURLConnection2 = "Successfully transmitted answer beacon of type: ";
                } else {
                    Log.e("HatsLibTransmitter", a.z(responseCode, queryParameter, "Failed to transmit answer beacon of type: ", "; response code was: "));
                    httpURLConnection2 = "Failed to transmit answer beacon of type: ";
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            } catch (IOException e2) {
                e = e2;
                httpURLConnection2 = httpURLConnection;
                Log.d("HatsLibTransmitter", "Failed to put answer", e);
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection2 = httpURLConnection;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                throw th;
            }
        } catch (Exception e3) {
            Log.e("HatsLibTransmitter", "Transmission of answer beacon failed.", e3);
        }
    }
}
