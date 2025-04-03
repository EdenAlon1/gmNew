package defpackage;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkeh {
    public static dkbm a() {
        return dkbn.i(ezez.RCS_PROVISIONING_UNKNOWN_STATE, Optional.empty());
    }

    public static String b(String str) {
        URL url = new URL(str);
        if (!url.getProtocol().equals("https")) {
            if (!url.getProtocol().equals("http")) {
                dkty.g("Error converting [%s] to secure link", str);
                throw new MalformedURLException(a.a(str, "Only HTTPS or HTTP protocols are allowed in the URL [", "]"));
            }
            if (!((Boolean) dint.e.a()).booleanValue()) {
                return str.replace("http:", "https:");
            }
        }
        return str;
    }

    static final void c(Uri.Builder builder, dkbm dkbmVar, String str, String str2, int i) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Parameter name must not be empty");
        }
        if (i <= 0) {
            throw new IllegalArgumentException("Max length must be positive");
        }
        if (str2 == null) {
            str2 = "";
        } else if (str2.length() > i) {
            str2 = str2.substring(0, i);
        }
        builder.appendQueryParameter(str, str2);
        dkbmVar.l(str, str2);
    }

    static final void d(Uri.Builder builder, dkbm dkbmVar, String str) {
        if (TextUtils.isEmpty(null)) {
            return;
        }
        c(builder, dkbmVar, str, null, 15);
    }

    public static final Uri.Builder f(String str, djtp djtpVar, dkef dkefVar, dkeg dkegVar, dkbm dkbmVar) {
        final Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        Optional d = dkbmVar.d();
        buildUpon.getClass();
        d.ifPresent(new Consumer() { // from class: dkee
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                buildUpon.path((String) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        eyyu b = dkbmVar.b();
        b.copyOnWrite();
        eyzd eyzdVar = (eyzd) b.instance;
        eyzd eyzdVar2 = eyzd.a;
        str.getClass();
        eyzdVar.b |= 2;
        eyzdVar.d = str;
        for (Map.Entry entry : DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((eyzd) dkbmVar.b().instance).e)).entrySet()) {
            Iterator<E> it = ((eyzb) entry.getValue()).b.iterator();
            while (it.hasNext()) {
                buildUpon.appendQueryParameter((String) entry.getKey(), (String) it.next());
            }
        }
        buildUpon.appendQueryParameter("vers", Integer.toString(djtpVar.e()));
        dkbmVar.l("vers", Integer.toString(djtpVar.e()));
        if (djai.Y()) {
            int b2 = djtpVar.b();
            buildUpon.appendQueryParameter("rcs_state", Integer.toString(b2));
            dkbmVar.l("rcs_state", Integer.toString(b2));
        }
        if (!TextUtils.isEmpty(dkefVar.e)) {
            buildUpon.appendQueryParameter("instance_id_token", dkefVar.e);
            dkbmVar.l("instance_id_token", dkefVar.e);
        }
        if (!TextUtils.isEmpty(dkefVar.f)) {
            buildUpon.appendQueryParameter("IMSI", dkefVar.f);
            dkbmVar.l("IMSI", dkefVar.f);
        }
        if (!TextUtils.isEmpty(dkefVar.g)) {
            buildUpon.appendQueryParameter("IMEI", dkefVar.g);
            dkbmVar.l("IMEI", dkefVar.g);
        }
        if (!TextUtils.isEmpty(dkefVar.h)) {
            buildUpon.appendQueryParameter("device_type", dkefVar.h);
            dkbmVar.l("device_type", dkefVar.h);
        }
        c(buildUpon, dkbmVar, "terminal_model", g(dkegVar.b), ((Integer) djai.t().a.aD.a()).intValue());
        c(buildUpon, dkbmVar, "terminal_vendor", g(dkegVar.a), 4);
        c(buildUpon, dkbmVar, "terminal_sw_version", g(dkegVar.c), 10);
        c(buildUpon, dkbmVar, "client_vendor", dkefVar.d, 4);
        c(buildUpon, dkbmVar, "client_version", dkefVar.c, 15);
        d(buildUpon, dkbmVar, "bugle_version");
        d(buildUpon, dkbmVar, "cs_version");
        c(buildUpon, dkbmVar, "rcs_profile", dkefVar.a, 15);
        c(buildUpon, dkbmVar, "rcs_version", dkefVar.b, 4);
        String str2 = (String) dkrz.e.d();
        if (!TextUtils.isEmpty(str2)) {
            buildUpon.appendQueryParameter("provision_id", str2);
            dkbmVar.l("provision_id", str2);
        }
        return buildUpon;
    }

    private static final String g(String str) {
        return str.replaceAll("[:/?#\\[\\]@=;&$+!*'(),]", "");
    }

    public final void e(String str, djtp djtpVar, String str2, String str3, int i, dkef dkefVar, Optional optional) {
        if (str3 == null) {
            throw new IllegalArgumentException("Token must not be null!");
        }
        dkbm dkbmVar = (dkbm) optional.orElse(a());
        Uri.Builder f = f(str, djtpVar, dkefVar, new dkeg(Build.MANUFACTURER, Build.MODEL, Build.VERSION.RELEASE), dkbmVar);
        if (!TextUtils.isEmpty(str2)) {
            f.appendQueryParameter("msisdn", str2);
            dkbmVar.l("msisdn", str2);
        }
        f.appendQueryParameter("token", str3);
        dkbmVar.l("token", str3);
        f.appendQueryParameter("SMS_port", String.valueOf(i));
        dkbmVar.l("SMS_port", String.valueOf(i));
        dkbmVar.f(b(f.build().toString()));
    }
}
