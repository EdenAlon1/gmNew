package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czfd implements czes {
    public static final enru a = enru.c("com/google/android/apps/messaging/ui/conversation/emoji/ResourceBasedEmojiVariantService");
    public final Context b;
    public final effy c;
    public final errl d;
    public final Map e = new ConcurrentHashMap();
    public final Map f = new ConcurrentHashMap();
    public final Map g = new ConcurrentHashMap();
    public int h = 1;
    public int i = 1;

    public czfd(Context context, effy effyVar, errl errlVar) {
        this.b = context;
        this.c = effyVar;
        this.d = errlVar;
    }

    @Override // defpackage.czes
    public final String a(String str) {
        return (String) Map.EL.getOrDefault(this.f, str, str);
    }

    @Override // defpackage.czes
    public final String b(String str) {
        java.util.Map map = this.g;
        String a2 = a(str);
        return (String) Map.EL.getOrDefault(map, a2, a2);
    }

    @Override // defpackage.czes
    public final List c(String str) {
        return (List) Map.EL.getOrDefault(this.e, a(str), engw.r(str));
    }

    @Override // defpackage.czes
    public final void d() {
        axos.a(new Runnable() { // from class: czez
            @Override // java.lang.Runnable
            public final void run() {
                czfd czfdVar = czfd.this;
                if (czfdVar.h == 3 && czfdVar.i == 3) {
                    return;
                }
                ensk e = czfd.a.e();
                e.Y(ente.a, "Bugle");
                ((enrr) ((enrr) e).h("com/google/android/apps/messaging/ui/conversation/emoji/ResourceBasedEmojiVariantService", "cacheVariantMap", 163, "ResourceBasedEmojiVariantService.java")).q("Caching emoji variant map.");
                czfdVar.h = 2;
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(czfdVar.b.getResources().openRawResource(R.raw.emoji_variant_map), StandardCharsets.UTF_8));
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            Iterator it = emye.b(',').g(readLine).iterator();
                            if (it.hasNext()) {
                                ArrayList b = enkr.b(it);
                                String str = (String) b.get(0);
                                czfdVar.e.put(str, b);
                                Iterator it2 = b.iterator();
                                while (it2.hasNext()) {
                                    czfdVar.f.put((String) it2.next(), str);
                                }
                            }
                        } finally {
                        }
                    }
                    ensk e2 = czfd.a.e();
                    e2.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/ui/conversation/emoji/ResourceBasedEmojiVariantService", "cacheVariantMap", 192, "ResourceBasedEmojiVariantService.java")).q("Finished caching emoji variant map.");
                    czfdVar.h = 3;
                    bufferedReader.close();
                } catch (IOException e3) {
                    ensk i = czfd.a.i();
                    i.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) ((enrr) i).g(e3)).h("com/google/android/apps/messaging/ui/conversation/emoji/ResourceBasedEmojiVariantService", "cacheVariantMap", 197, "ResourceBasedEmojiVariantService.java")).r("Failed to cache emoji variant map. Successfully cached %1$s variant sets.", czfdVar.e.size());
                    czfdVar.h = 4;
                }
                ensk e4 = czfd.a.e();
                e4.Y(ente.a, "Bugle");
                ((enrr) ((enrr) e4).h("com/google/android/apps/messaging/ui/conversation/emoji/ResourceBasedEmojiVariantService", "cacheVariantPreferences", 219, "ResourceBasedEmojiVariantService.java")).q("Caching emoji variant preferences.");
                czfdVar.i = 2;
                erqt.r(czfdVar.c.a(), axou.a(new czfc(czfdVar)), czfdVar.d);
            }
        }, this.d);
    }

    @Override // defpackage.czes
    public final void e() {
        axos.a(new Runnable() { // from class: czey
            @Override // java.lang.Runnable
            public final void run() {
                ensk e = czfd.a.e();
                e.Y(ente.a, "Bugle");
                ((enrr) ((enrr) e).h("com/google/android/apps/messaging/ui/conversation/emoji/ResourceBasedEmojiVariantService", "clearVariantMapCache", 206, "ResourceBasedEmojiVariantService.java")).q("Clearing emoji variant map cache.");
                czfd czfdVar = czfd.this;
                czfdVar.h = 2;
                czfdVar.e.clear();
                czfdVar.f.clear();
                ensk e2 = czfd.a.e();
                e2.Y(ente.a, "Bugle");
                ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/ui/conversation/emoji/ResourceBasedEmojiVariantService", "clearVariantMapCache", 213, "ResourceBasedEmojiVariantService.java")).q("Finished clearing emoji variant map cache.");
                czfdVar.h = 1;
                ensk e3 = czfd.a.e();
                e3.Y(ente.a, "Bugle");
                ((enrr) ((enrr) e3).h("com/google/android/apps/messaging/ui/conversation/emoji/ResourceBasedEmojiVariantService", "clearVariantPreferencesCache", 254, "ResourceBasedEmojiVariantService.java")).q("Clearing emoji variant preferences cache.");
                czfdVar.i = 2;
                czfdVar.g.clear();
                ensk e4 = czfd.a.e();
                e4.Y(ente.a, "Bugle");
                ((enrr) ((enrr) e4).h("com/google/android/apps/messaging/ui/conversation/emoji/ResourceBasedEmojiVariantService", "clearVariantPreferencesCache", 260, "ResourceBasedEmojiVariantService.java")).q("Finished clearing emoji variant preferences cache.");
                czfdVar.i = 1;
            }
        }, this.d);
    }

    @Override // defpackage.czes
    public final void f(final String str) {
        final String a2 = a(str);
        enru enruVar = a;
        ensk e = enruVar.e();
        e.Y(ente.a, "Bugle");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/ui/conversation/emoji/ResourceBasedEmojiVariantService", "setPreferredVariant", 79, "ResourceBasedEmojiVariantService.java")).D("Setting %1$s as preferred emoji variant for %2$s.", str, a2);
        this.g.put(a2, str);
        ensk e2 = enruVar.e();
        e2.Y(ente.a, "Bugle");
        ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/ui/conversation/emoji/ResourceBasedEmojiVariantService", "setPreferredVariant", 84, "ResourceBasedEmojiVariantService.java")).D("Finished setting %1$s as preferred emoji variant for %2$s in cache.", str, a2);
        erqt.r(this.c.b(new emwl() { // from class: czfa
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                czei czeiVar = (czei) ((czek) obj).toBuilder();
                String str2 = a2;
                str2.getClass();
                String str3 = str;
                str3.getClass();
                czeiVar.copyOnWrite();
                czek czekVar = (czek) czeiVar.instance;
                eyhm eyhmVar = czekVar.b;
                if (!eyhmVar.b) {
                    czekVar.b = eyhmVar.a();
                }
                czekVar.b.put(str2, str3);
                return (czek) czeiVar.build();
            }
        }, this.d), axou.a(new czfb(str, a2)), this.d);
    }
}
