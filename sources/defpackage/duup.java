package defpackage;

import android.os.SystemClock;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duup extends les {
    final /* synthetic */ duut a;

    public duup(duut duutVar) {
        this.a = duutVar;
    }

    @Override // defpackage.les
    public final void a(Throwable th) {
        synchronized (this.a.h) {
            Iterator it = this.a.h.iterator();
            while (it.hasNext()) {
                ((duus) it.next()).b();
            }
        }
        this.a.i = 0L;
        ((enrr) ((enrr) duut.a.i()).h("com/google/android/libraries/inputmethod/emoji/renderer/EmojiCompatManager$1", "onFailed", 236, "EmojiCompatManager.java")).q("EmojiCompat failed its initialization");
    }

    @Override // defpackage.les
    public final void b() {
        synchronized (this.a.h) {
            Iterator it = this.a.h.iterator();
            while (it.hasNext()) {
                ((duus) it.next()).a();
            }
        }
        if (this.a.i > 0) {
            SystemClock.elapsedRealtime();
            this.a.i = 0L;
        }
        ((enrr) ((enrr) duut.a.e()).h("com/google/android/libraries/inputmethod/emoji/renderer/EmojiCompatManager$1", "onInitialized", 218, "EmojiCompatManager.java")).q("EmojiCompat has been initialized");
    }
}
