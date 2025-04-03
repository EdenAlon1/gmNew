package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wlw {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/MagicRewriteStyleMap");
    public final Context b;
    private final ffbz c;

    public wlw(Context context) {
        context.getClass();
        this.b = context;
        this.c = ffca.a(new ffix() { // from class: wlv
            @Override // defpackage.ffix
            public final Object invoke() {
                wlw wlwVar = wlw.this;
                Map g = ffew.g(new ffcf(esgx.TONE_REPHRASE, wlwVar.b.getString(R.string.rephrase_tone)), new ffcf(esgx.TONE_SHAKESPEARE, wlwVar.b.getString(R.string.shakespeare_tone)), new ffcf(esgx.TONE_CHILL, wlwVar.b.getString(R.string.fellow_kid_tone)), new ffcf(esgx.TONE_EXCITED, wlwVar.b.getString(R.string.excited_tone)), new ffcf(esgx.TONE_RHYMES, wlwVar.b.getString(R.string.rhyme_tone)), new ffcf(esgx.TONE_FORMAL, wlwVar.b.getString(R.string.formal_tone)), new ffcf(esgx.TONE_CONCISE, wlwVar.b.getString(R.string.concise_tone)));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str = (String) ctjd.aT.e();
                ArrayList<esgx> arrayList = new ArrayList();
                if (str != null) {
                    for (String str2 : cuxt.e(str)) {
                        str2.getClass();
                        if (str2.length() > 0) {
                            try {
                                arrayList.add(esgx.c(str2));
                            } catch (IllegalArgumentException e) {
                                ensk i = wlw.a.i();
                                i.Y(ente.a, "Bugle");
                                ((enrr) ((enrr) i).g(e).h("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/MagicRewriteStyleMap", "allowedStyles", 50, "MagicRewriteStyleMap.kt")).t("Unknown Magic Compose style %s", str2);
                            }
                        }
                    }
                }
                for (esgx esgxVar : arrayList) {
                    String str3 = (String) g.get(esgxVar);
                    if (str3 != null) {
                        linkedHashMap.put(str3, esgxVar);
                    }
                }
                return linkedHashMap;
            }
        });
    }

    public final LinkedHashMap a() {
        return (LinkedHashMap) this.c.a();
    }
}
