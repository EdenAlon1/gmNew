package defpackage;

import android.content.Context;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euvi {
    private static final Pattern a = Pattern.compile("[0-9]+s");
    private static final Charset b = Charset.forName("UTF-8");
    private final Context c;
    private final euug d;
    private final euvl e = new euvl();

    public euvi(Context context, euug euugVar) {
        this.c = context;
        this.d = euugVar;
    }

    static long a(String str) {
        dfwv.b(a.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009d A[Catch: NameNotFoundException -> 0x00df, TryCatch #0 {NameNotFoundException -> 0x00df, blocks: (B:8:0x0068, B:10:0x0080, B:12:0x0086, B:15:0x008d, B:17:0x009d, B:21:0x00b3, B:23:0x00bf, B:25:0x00da), top: B:7:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b3 A[Catch: NameNotFoundException -> 0x00df, TryCatch #0 {NameNotFoundException -> 0x00df, blocks: (B:8:0x0068, B:10:0x0080, B:12:0x0086, B:15:0x008d, B:17:0x009d, B:21:0x00b3, B:23:0x00bf, B:25:0x00da), top: B:7:0x0068 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.net.HttpURLConnection d(java.net.URL r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.euvi.d(java.net.URL, java.lang.String):java.net.HttpURLConnection");
    }

    private static void e() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    private static void f(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, b));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        Log.w("Firebase-Installations", str4);
        Log.w("Firebase-Installations", String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", str2, str3, TextUtils.isEmpty(str) ? "" : ", ".concat(String.valueOf(str))));
    }

    private static void g(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    private static boolean h(int i) {
        return i >= 200 && i < 300;
    }

    private static byte[] i(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    private static final URL j(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e) {
            throw new euup(e.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r1v1, types: [euvi] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5 */
    public final euvk b(String str, String str2, String str3, String str4, String str5) {
        JSONObject jSONObject;
        int responseCode;
        euvk a2;
        euvi euviVar = this;
        if (!euviVar.e.b()) {
            throw new euup("Firebase Installations Service is unavailable. Please try again later.");
        }
        ?? r8 = 1;
        int i = 0;
        URL j = j(String.format("projects/%s/installations", str3));
        ?? r1 = euviVar;
        while (i <= r8) {
            TrafficStats.setThreadStatsTag(32769);
            ?? d = r1.d(j, str);
            try {
                try {
                    d.setRequestMethod("POST");
                    d.setDoOutput(r8);
                    if (str5 != null) {
                        d.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    try {
                        jSONObject = new JSONObject();
                    } catch (JSONException e) {
                        e = e;
                    }
                } catch (IOException | AssertionError unused) {
                }
                try {
                    try {
                        jSONObject.put("fid", str2);
                        jSONObject.put("appId", str4);
                        jSONObject.put("authVersion", "FIS_v2");
                        jSONObject.put("sdkVersion", "a:17.0.2_1p");
                        g(d, i(jSONObject));
                        responseCode = d.getResponseCode();
                        r1.e.a(responseCode);
                    } catch (IOException | AssertionError unused2) {
                        r1 = r8;
                        d.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i++;
                        r8 = r1;
                        r1 = this;
                    }
                    if (h(responseCode)) {
                        InputStream inputStream = d.getInputStream();
                        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, b));
                        euvm d2 = euvn.d();
                        euve euveVar = new euve();
                        jsonReader.beginObject();
                        r8 = r8;
                        while (jsonReader.hasNext()) {
                            try {
                                String nextName = jsonReader.nextName();
                                InputStream inputStream2 = inputStream;
                                if (nextName.equals("name")) {
                                    euveVar.a = jsonReader.nextString();
                                } else if (nextName.equals("fid")) {
                                    euveVar.b = jsonReader.nextString();
                                } else if (nextName.equals("refreshToken")) {
                                    euveVar.c = jsonReader.nextString();
                                } else if (nextName.equals("authToken")) {
                                    jsonReader.beginObject();
                                    while (jsonReader.hasNext()) {
                                        String nextName2 = jsonReader.nextName();
                                        if (nextName2.equals("token")) {
                                            ((euvg) d2).a = jsonReader.nextString();
                                        } else if (nextName2.equals("expiresIn")) {
                                            d2.b(a(jsonReader.nextString()));
                                        } else {
                                            jsonReader.skipValue();
                                        }
                                    }
                                    euveVar.d = d2.a();
                                    jsonReader.endObject();
                                } else {
                                    jsonReader.skipValue();
                                }
                                inputStream = inputStream2;
                                r8 = 1;
                            } catch (IOException | AssertionError unused3) {
                                r1 = 1;
                            }
                        }
                        jsonReader.endObject();
                        jsonReader.close();
                        inputStream.close();
                        euveVar.e = 1;
                        a2 = euveVar.a();
                    } else {
                        try {
                            r1 = r8 == true ? 1 : 0;
                            f(d, str4, str, str3);
                        } catch (IOException | AssertionError unused4) {
                            continue;
                        }
                        if (responseCode == 429) {
                            throw new euup("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            e();
                            euve euveVar2 = new euve();
                            euveVar2.e = 2;
                            a2 = euveVar2.a();
                        } else {
                            d.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i++;
                            r8 = r1;
                            r1 = this;
                        }
                    }
                    return a2;
                } catch (JSONException e2) {
                    e = e2;
                    boolean z = r8 == true ? 1 : 0;
                    throw new IllegalStateException(e);
                }
            } finally {
                d.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new euup("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final euvn c(String str, String str2, String str3, String str4) {
        euvn a2;
        if (!this.e.b()) {
            throw new euup("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL j = j(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection d = d(j, str);
            try {
                try {
                    d.setRequestMethod("POST");
                    d.addRequestProperty("Authorization", a.t(str4, "FIS_v2 "));
                    d.setDoOutput(true);
                } finally {
                    d.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("sdkVersion", "a:17.0.2_1p");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("installation", jSONObject);
                g(d, i(jSONObject2));
                int responseCode = d.getResponseCode();
                this.e.a(responseCode);
                if (h(responseCode)) {
                    InputStream inputStream = d.getInputStream();
                    JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, b));
                    euvm d2 = euvn.d();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (nextName.equals("token")) {
                            ((euvg) d2).a = jsonReader.nextString();
                        } else if (nextName.equals("expiresIn")) {
                            d2.b(a(jsonReader.nextString()));
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    jsonReader.close();
                    inputStream.close();
                    ((euvg) d2).b = 1;
                    a2 = d2.a();
                } else {
                    f(d, null, str, str3);
                    if (responseCode != 401 && responseCode != 404) {
                        if (responseCode == 429) {
                            throw new euup("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            e();
                            euvm d3 = euvn.d();
                            ((euvg) d3).b = 2;
                            a2 = d3.a();
                        } else {
                            d.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    }
                    euvm d4 = euvn.d();
                    ((euvg) d4).b = 3;
                    a2 = d4.a();
                }
                return a2;
            } catch (JSONException e) {
                throw new IllegalStateException(e);
            }
        }
        throw new euup("Firebase Installations Service is unavailable. Please try again later.");
    }
}
