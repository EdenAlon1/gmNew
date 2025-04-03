package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class edjq extends edgn {
    private final Locale b;
    private final String c;
    private final edto d;

    protected edjq(edkr edkrVar, Locale locale, String str, edto edtoVar) {
        super(edkrVar);
        this.b = locale;
        this.c = str;
        this.d = edtoVar;
    }

    protected static void f(Map map, String str, Object obj) {
        String obj2 = obj != null ? obj.toString() : null;
        if (TextUtils.isEmpty(obj2)) {
            return;
        }
        map.put(str, obj2);
    }

    @Override // defpackage.edgn
    public final String b() {
        new HashMap();
        String str = this.c;
        emxf.b(!TextUtils.isEmpty(str), "API key cannot be empty.");
        HashMap hashMap = new HashMap(e());
        Uri.Builder buildUpon = Uri.parse("https://maps.googleapis.com/").buildUpon();
        buildUpon.appendEncodedPath("maps/api/place/");
        buildUpon.appendEncodedPath(d());
        buildUpon.appendQueryParameter("key", str);
        Locale locale = this.b;
        if (locale != null) {
            String languageTag = locale.toLanguageTag();
            if (!TextUtils.isEmpty(languageTag)) {
                buildUpon.appendQueryParameter("language", languageTag);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return buildUpon.build().toString();
    }

    @Override // defpackage.edgn
    public final Map c() {
        HashMap hashMap = new HashMap();
        Context context = this.d.a;
        String packageName = context.getPackageName();
        String a = edtc.a(context.getPackageManager(), packageName);
        enhd enhdVar = new enhd();
        if (packageName != null) {
            enhdVar.k("X-Android-Package", packageName);
        }
        if (a != null) {
            enhdVar.k("X-Android-Cert", a);
        }
        hashMap.putAll(enhdVar.c());
        hashMap.put("X-Places-Android-Sdk", "4.2.0");
        return hashMap;
    }

    protected abstract String d();

    protected abstract Map e();
}
