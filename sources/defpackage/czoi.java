package defpackage;

import android.content.Intent;
import android.net.Uri;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czoi {
    private static final enru a = enru.c("com/google/android/apps/messaging/ui/conversation/rbm/RbmIdExtractor");
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;

    public czoi(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        ffbrVar.getClass();
        ffbrVar3.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
    }

    public final Optional a(Intent intent) {
        intent.getClass();
        Uri data = intent.getData();
        if (data == null) {
            return Optional.empty();
        }
        String queryParameter = czoh.a(data).getQueryParameter("service_id");
        if (queryParameter != null) {
            return Optional.of(queryParameter);
        }
        Optional b = ((ctbd) this.b.b()).b(intent);
        if (b.isEmpty() || ((Object[]) b.get()).length != 1) {
            return Optional.empty();
        }
        String str = ((String[]) b.get())[0];
        cskc cskcVar = cpdg.a;
        return aoqw.h(str) ? Optional.of(((String[]) b.get())[0]) : Optional.empty();
    }

    public final Optional b(Intent intent) {
        intent.getClass();
        Optional a2 = a(intent);
        if (a2.isPresent()) {
            ((enrr) a.h().h("com/google/android/apps/messaging/ui/conversation/rbm/RbmIdExtractor", "getShortCode", 56, "RbmIdExtractor.kt")).t("Not a short code: bot id present: %s", a2.get());
            return Optional.empty();
        }
        Uri data = intent.getData();
        if (data == null) {
            ((enrr) a.h().h("com/google/android/apps/messaging/ui/conversation/rbm/RbmIdExtractor", "getShortCode", 61, "RbmIdExtractor.kt")).q("Not a short code: no uri");
            return Optional.empty();
        }
        String scheme = czoh.a(data).getScheme();
        if (scheme == null) {
            scheme = "";
        }
        if (!scheme.equals("sms") && !scheme.equals("smsto")) {
            ((enrr) a.h().h("com/google/android/apps/messaging/ui/conversation/rbm/RbmIdExtractor", "getShortCode", 66, "RbmIdExtractor.kt")).t("Not a short code: not SMS scheme: %s", cskt.b(data.toString()));
            return Optional.empty();
        }
        if (intent.getBooleanExtra("rbm_sms_short_code_fallback", false)) {
            ((enrr) a.h().h("com/google/android/apps/messaging/ui/conversation/rbm/RbmIdExtractor", "getShortCode", 71, "RbmIdExtractor.kt")).t("RBM already attempted: fallback to SMS: %s", cskt.b(data.toString()));
            return Optional.empty();
        }
        Optional b = ((ctbd) this.b.b()).b(intent);
        if (b.isEmpty()) {
            ((enrr) a.h().h("com/google/android/apps/messaging/ui/conversation/rbm/RbmIdExtractor", "getShortCode", 76, "RbmIdExtractor.kt")).q("Not a short code: no recipients");
            return Optional.empty();
        }
        if (!((auoe) this.c.b()).a()) {
            ((enrr) a.h().h("com/google/android/apps/messaging/ui/conversation/rbm/RbmIdExtractor", "getShortCode", 80, "RbmIdExtractor.kt")).t("Short code disabled: %s", cskt.b(data.toString()));
            return Optional.empty();
        }
        String str = ((String[]) b.get())[0];
        try {
            int parseInt = Integer.parseInt(str);
            if (str.length() <= ((Number) this.d.b()).longValue() && parseInt > 0) {
                return Optional.of(str);
            }
            ((enrr) a.h().h("com/google/android/apps/messaging/ui/conversation/rbm/RbmIdExtractor", "getShortCode", 87, "RbmIdExtractor.kt")).t("Too long for short code: %s", cskt.b(str));
            return Optional.empty();
        } catch (NumberFormatException unused) {
            ((enrr) a.h().h("com/google/android/apps/messaging/ui/conversation/rbm/RbmIdExtractor", "getShortCode", 92, "RbmIdExtractor.kt")).t("Not a short code: %s", cskt.b(str));
            return Optional.empty();
        }
    }
}
