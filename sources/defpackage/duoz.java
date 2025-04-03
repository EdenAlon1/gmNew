package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duoz implements erqj {
    final /* synthetic */ dupq a;
    final /* synthetic */ dupa b;

    public duoz(dupa dupaVar, dupq dupqVar) {
        this.a = dupqVar;
        this.b = dupaVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((enrr) ((enrr) dupa.a.g()).h("com/google/android/libraries/inputmethod/emoji/data/DefaultStickyPreferencesProtoProvider$1", "onSuccess", 141, "DefaultStickyPreferencesProtoProvider.java")).q("Successfully wrote sticky preferences to disk");
        enhk j = enhk.j(DesugarCollections.unmodifiableMap(this.a.b));
        if (!((Boolean) dupn.d.b()).booleanValue()) {
            ((enrr) ((enrr) dupn.a.d()).h("com/google/android/libraries/inputmethod/emoji/data/EmojiVariantPreferencesBackupHelper", "backup", 108, "EmojiVariantPreferencesBackupHelper.java")).q("Emoji variant preference backup is disabled");
            return;
        }
        HashSet hashSet = new HashSet();
        enqu listIterator = j.entrySet().listIterator();
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            hashSet.add(dupn.b.g(entry.getKey(), entry.getValue(), new Object[0]));
        }
        this.b.d.a().h.a().putStringSet("emoji_variant_prefs", hashSet).apply();
        if (!j.isEmpty()) {
            enru enruVar = duxu.a;
            duxs.a.b(dupr.a, 0);
        }
        ((enrr) ((enrr) dupn.a.g()).h("com/google/android/libraries/inputmethod/emoji/data/EmojiVariantPreferencesBackupHelper", "backup", 123, "EmojiVariantPreferencesBackupHelper.java")).q("Backed up emoji variant preferences to SharedPreferences");
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        ((enrr) ((enrr) ((enrr) dupa.a.j()).g(th)).h("com/google/android/libraries/inputmethod/emoji/data/DefaultStickyPreferencesProtoProvider$1", "onFailure", (char) 147, "DefaultStickyPreferencesProtoProvider.java")).q("Failed to write sticky preferences to disk");
    }
}
