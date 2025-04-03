package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dupn {
    public static final enru a = enru.c("com/google/android/libraries/inputmethod/emoji/data/EmojiVariantPreferencesBackupHelper");
    public static final emww b = emww.d(',');
    public static final emye c = emye.b(',');
    static final duvz d = duwb.d("enable_emoji_variant_preferences_backup");
    private final Context e;
    private duzk f = null;

    public dupn(Context context) {
        this.e = context;
    }

    public final duzk a() {
        if (this.f == null) {
            this.f = duzk.d(this.e);
        }
        return this.f;
    }
}
