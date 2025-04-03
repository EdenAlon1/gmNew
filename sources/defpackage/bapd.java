package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.RebuildShortcutsAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class bapd implements erqj {
    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((ensz) ((ensz) RebuildShortcutsAction.a.h()).h("com/google/android/apps/messaging/shared/datamodel/action/RebuildShortcutsAction$1", "onSuccess", 132, "RebuildShortcutsAction.java")).q("Successfully finished rebuilding shortcuts");
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        ((ensz) ((ensz) ((ensz) RebuildShortcutsAction.a.j()).g(th)).h("com/google/android/apps/messaging/shared/datamodel/action/RebuildShortcutsAction$1", "onFailure", (char) 137, "RebuildShortcutsAction.java")).q("Error rebuilding shortcuts");
    }
}
