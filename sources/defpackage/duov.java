package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duov implements erqj {
    final /* synthetic */ dupy a;
    final /* synthetic */ duow b;

    public duov(duow duowVar, dupy dupyVar) {
        this.a = dupyVar;
        this.b = duowVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (((Boolean) dupn.d.b()).booleanValue()) {
            duow duowVar = this.b;
            String j = eoeg.e.j(this.a.toByteArray());
            duowVar.d.a().i("emoji_variant_global_prefs", j);
            if (!TextUtils.isEmpty(j)) {
                enru enruVar = duxu.a;
                duxs.a.b(dupr.a, 2);
            }
        } else {
            ((enrr) ((enrr) dupn.a.d()).h("com/google/android/libraries/inputmethod/emoji/data/EmojiVariantPreferencesBackupHelper", "backupForGlobalPreference", 70, "EmojiVariantPreferencesBackupHelper.java")).q("Emoji variant preference backup is disabled");
        }
        ((enrr) ((enrr) duow.a.g()).h("com/google/android/libraries/inputmethod/emoji/data/DefaultGlobalPreferencesProtoProvider$1", "onSuccess", 83, "DefaultGlobalPreferencesProtoProvider.java")).q("Successfully wrote sticky preferences to disk");
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        ((enrr) ((enrr) ((enrr) duow.a.j()).g(th)).h("com/google/android/libraries/inputmethod/emoji/data/DefaultGlobalPreferencesProtoProvider$1", "onFailure", 'X', "DefaultGlobalPreferencesProtoProvider.java")).q("Failed to write sticky preferences to disk");
    }
}
