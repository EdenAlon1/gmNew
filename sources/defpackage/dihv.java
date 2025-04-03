package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.ims.businessinfo.json.BusinessInfoJsonParser;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabase;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dihv extends dihw {
    private volatile String a;
    private final BusinessInfoDatabase e;
    private final boolean f;
    private final ctvb g;

    public dihv(String str, Context context, BusinessInfoDatabase businessInfoDatabase, boolean z, ctvb ctvbVar) {
        super(str, context, dihz.AVAILABILITY_UNKNOWN);
        this.e = businessInfoDatabase;
        this.f = z;
        this.g = ctvbVar;
        emxc<String> businessInfoVersion = businessInfoDatabase.getBusinessInfoVersion(str);
        if (businessInfoVersion.g()) {
            this.a = (String) businessInfoVersion.c();
        }
        this.d = businessInfoDatabase.isMetadataLocallyAvailable(str) ? dihz.INFO_LOCALLY_AVAILABLE : dihz.AVAILABILITY_UNKNOWN;
    }

    private final void g(BusinessInfoDatabase businessInfoDatabase, HttpsURLConnection httpsURLConnection) {
        String headerField = httpsURLConnection.getHeaderField("ETag");
        this.a = headerField;
        String headerField2 = httpsURLConnection.getHeaderField("Cache-Control");
        long j = 0;
        if (headerField2 != null) {
            String[] split = TextUtils.split(headerField2, ",");
            int length = split.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String trim = split[i].trim();
                if (trim.startsWith("max-age=")) {
                    try {
                        j = TimeUnit.SECONDS.toMillis(Long.parseLong(trim.substring(8))) + dkvj.a().longValue();
                        break;
                    } catch (Exception e) {
                        dkty.i(e, "Failed to parse the cache-control header: %s", headerField2);
                    }
                }
                i++;
            }
        }
        businessInfoDatabase.insertOrUpdateBusinessInfoMetadata(this.b, headerField, j);
    }

    @Override // defpackage.dihw
    protected final dihz a(HttpsURLConnection httpsURLConnection) {
        dihz dihzVar;
        URL url = httpsURLConnection.getURL();
        dkty.k("Fetching business info metadata from %s...", dkty.a(url));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream()));
        try {
            boolean z = this.f;
            String str = this.b;
            BusinessInfoData parse = z ? BusinessInfoJsonParser.parse(str, bufferedReader, this.g) : BusinessInfoJsonParser.legacyParse(str, bufferedReader, this.g);
            if (parse != null) {
                String rbmBotId = parse.getRbmBotId();
                String name = parse.getName();
                dkty.k("Saving bot info metadata for botId: %s name: %s...", dkty.a(rbmBotId), dkty.a(name));
                g(this.e, httpsURLConnection);
                if (this.e.insertOrUpdateBusinessInfoData(parse)) {
                    dkty.k("Saved bot business info metadata for botId %s name: %s.", dkty.a(rbmBotId), dkty.a(name));
                    dihzVar = dihz.INFO_LOCALLY_AVAILABLE;
                } else {
                    dkty.g("Error saving bot business info metadata for botId %s name: %s.", dkty.a(rbmBotId), dkty.a(name));
                    dihzVar = dihz.CLIENT_ERROR;
                }
            } else {
                dkty.g("Business info data model object is null for botId %s.", dkty.a(str));
                dkty.g("Unable to save business info for %s / %s.", dkty.a(str), dkty.a(url));
                dihzVar = dihz.CLIENT_ERROR;
            }
            bufferedReader.close();
            return dihzVar;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.dihw
    public final String b() {
        return this.b + "_" + this.f;
    }

    @Override // defpackage.dihw
    public final String c() {
        String str;
        String str2 = this.b;
        String str3 = null;
        if (str2 == null) {
            dkty.g("Cannot build bot info metadata server url with null rbmBotId.", new Object[0]);
            return null;
        }
        String str4 = (String) diyr.a().b.d.a();
        if (TextUtils.isEmpty(str4)) {
            str4 = dksz.a(str2);
            if (TextUtils.isEmpty(str4)) {
                dkty.g("Cannot build bot info metadata server url with invalid rbmBotId %s", dkty.a(str2));
                return null;
            }
        }
        Context context = this.c;
        String m = dkvt.g(context).m();
        if (!TextUtils.isEmpty(m) && m.length() >= 5) {
            if (m.length() != 6) {
                str3 = String.format(Locale.US, "%d%03d", Integer.valueOf(Integer.parseInt(m.substring(0, 3))), Integer.valueOf(Integer.parseInt(m.substring(3))));
            } else {
                str3 = m;
            }
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").authority(str4).path("bot").appendQueryParameter("id", "sip:".concat(str2));
        if (!TextUtils.isEmpty(str3)) {
            appendQueryParameter.appendQueryParameter("ho", str3);
        }
        if (((Boolean) diyr.a.a()).booleanValue()) {
            try {
                str = kqt.a(context.getResources().getConfiguration()).f(0).getLanguage();
            } catch (NullPointerException e) {
                dkty.i(e, "Error finding language code on device for rbmBotId %s", dkty.a(str2));
                str = "";
            }
            if (TextUtils.isEmpty(str)) {
                dkty.k("Defaulting to English locale for business info retrieval", new Object[0]);
                str = "en";
            }
            appendQueryParameter.appendQueryParameter("hl", str);
        } else {
            try {
                appendQueryParameter.appendQueryParameter("hl", kqt.a(context.getResources().getConfiguration()).f(0).getLanguage());
            } catch (NullPointerException e2) {
                dkty.i(e2, "Error finding language code on device for rbmBotId %s", dkty.a(str2));
            }
        }
        boolean z = this.f;
        String str5 = (String) diyr.a().b.c.a();
        if (z && !TextUtils.isEmpty(str5)) {
            appendQueryParameter.appendQueryParameter("v", String.format("%s", str5));
        }
        String uri = appendQueryParameter.build().toString();
        dkty.k("Built bot info server url %s for rbmBotId %s", dkty.a(uri), dkty.a(str2));
        return uri;
    }

    @Override // defpackage.dihw
    protected final void d(HttpsURLConnection httpsURLConnection) {
        g(this.e, httpsURLConnection);
    }

    @Override // defpackage.dihw
    protected final boolean e() {
        return true;
    }

    @Override // defpackage.dihw
    public final HttpsURLConnection f(String str) {
        HttpsURLConnection f = super.f(str);
        String str2 = this.a;
        boolean isEmpty = TextUtils.isEmpty(str2);
        String str3 = this.b;
        if (isEmpty) {
            dkty.k("Creating connection with missing bot info version for botId: %s", dkty.a(str3));
            return f;
        }
        dkty.k("Creating connection with bot info version: %s for botId: %s", str2, dkty.a(str3));
        f.setRequestProperty("If-None-Match", str2);
        return f;
    }
}
