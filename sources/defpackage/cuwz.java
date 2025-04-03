package defpackage;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuwz {
    public static final /* synthetic */ int a = 0;
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/util/text/Base32Utils");
    private static final emyl c = emys.a(new emyl() { // from class: cuwy
        @Override // defpackage.emyl
        public final Object get() {
            int i = cuwz.a;
            return Pattern.compile("^(?:[a-z2-7]{8})*(?:[a-z2-7]{2}={6}|[a-z2-7]{4}={4}|[a-z2-7]{5}={3}|[a-z2-7]{7}=)?$");
        }
    });
    private static final eoeg d = eoeg.g.f();

    public final String a(String str) {
        if (b(str)) {
            try {
                return new String(d.k(str), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                ensk i = b.i();
                i.Y(ente.a, "Bugle");
                ((enrr) ((enrr) ((enrr) i).g(e)).h("com/google/android/apps/messaging/shared/util/text/Base32Utils", "decode", 'c', "Base32Utils.java")).q("UTF-8 unsupported, cannot decode Base32");
                return str;
            } catch (IllegalArgumentException unused) {
                ensk j = b.j();
                j.Y(ente.a, "Bugle");
                ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/util/text/Base32Utils", "decode", 96, "Base32Utils.java")).t("Base32Utils. %s is not Base32 encoded.", str);
            }
        }
        return str;
    }

    public final boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((Pattern) c.get()).matcher(str).matches();
    }

    public final String c(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, "@");
        if (!stringTokenizer.hasMoreTokens()) {
            return null;
        }
        StringBuilder sb = new StringBuilder(a(stringTokenizer.nextToken()));
        while (stringTokenizer.hasMoreTokens()) {
            sb.append("@");
            sb.append(stringTokenizer.nextToken());
        }
        return sb.toString();
    }

    public final String d(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, "@");
        StringBuilder sb = new StringBuilder();
        if (stringTokenizer.hasMoreTokens()) {
            sb.append(d.j(stringTokenizer.nextToken().getBytes(StandardCharsets.UTF_8)));
            while (stringTokenizer.hasMoreTokens()) {
                sb.append("@");
                sb.append(stringTokenizer.nextToken());
            }
        }
        return sb.toString();
    }
}
