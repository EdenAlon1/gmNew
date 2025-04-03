package defpackage;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duut implements duwa {
    public engw f;
    public final les g;
    public final Set h;
    public long i;
    public duur j;
    public final duzt k;
    public boolean l;
    public static final enru a = enru.c("com/google/android/libraries/inputmethod/emoji/renderer/EmojiCompatManager");
    public static final emye b = emye.b(',');
    public static final duvz c = duwb.b("emoji_compat_version_representatives", "\u1fae9,🙂\u200d↔️,\u1fae8,\u1fae0,😮\u200d💨,\u1f972,🧑\u200d\u1f9bd,\u1f971,\u1f970,🤪,♀️,🤣");
    public static final duvz d = duwb.b("emoji_compat_app_whitelist", "");
    public static final duut instance = new duut();
    public static boolean e = false;

    public duut() {
        int i = engw.d;
        this.f = enou.a;
        this.g = new duup(this);
        this.h = new HashSet();
        this.j = duur.a;
        this.k = duzt.b();
    }

    public static boolean b(duur duurVar) {
        duuw.a();
        return duuw.c("\u1f971", duurVar);
    }

    public final lew a() {
        try {
            lew b2 = lew.b();
            if (b2.a() == 1) {
                return b2;
            }
            if (b2.a() == 2) {
                ((enrr) ((enrr) a.j()).h("com/google/android/libraries/inputmethod/emoji/renderer/EmojiCompatManager", "getEmojiCompatIfLoaded", 336, "EmojiCompatManager.java")).q("EmojiCompat failed to load.");
            } else {
                ((enrr) ((enrr) a.h()).h("com/google/android/libraries/inputmethod/emoji/renderer/EmojiCompatManager", "getEmojiCompatIfLoaded", 338, "EmojiCompatManager.java")).q("EmojiCompat is not loaded.");
            }
            return null;
        } catch (IllegalStateException e2) {
            ((enrr) ((enrr) ((enrr) a.h()).g(e2)).h("com/google/android/libraries/inputmethod/emoji/renderer/EmojiCompatManager", "getEmojiCompatIfLoaded", (char) 343, "EmojiCompatManager.java")).q("EmojiCompat.init() was never called.");
            return null;
        }
    }
}
