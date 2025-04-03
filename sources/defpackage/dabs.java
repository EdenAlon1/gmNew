package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.util.Log;
import j$.util.function.Consumer$CC;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dabs {
    public static final enru a = enru.c("com/google/android/apps/messaging/ui/dark/DarkModeManager");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final dabo e;
    public elfl f;
    public boolean g;
    private final Context h;
    private final AtomicInteger i = new AtomicInteger(-1);

    public dabs(Context context, dabo daboVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.h = context;
        this.b = ffbrVar;
        this.e = daboVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
    }

    public final void a(int i) {
        if (!ctid.c && i == -1) {
            i = 1;
        }
        this.i.set(i);
        int i2 = je.b;
        if (i != -1 && i != 0 && i != 1 && i != 2 && i != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (je.b != i) {
            je.b = i;
            synchronized (je.g) {
                cmi cmiVar = new cmi(je.f);
                while (cmiVar.hasNext()) {
                    je jeVar = (je) ((WeakReference) cmiVar.next()).get();
                    if (jeVar != null) {
                        jeVar.p();
                    }
                }
            }
        }
        ensk h = a.h();
        h.Y(ente.a, "Bugle");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/ui/dark/DarkModeManager", "setDarkMode", 197, "DarkModeManager.java")).r("DarkModeManager: setDarkMode: %s", i);
    }

    public final void b(final int i) {
        if (ctid.e) {
            UiModeManager uiModeManager = (UiModeManager) this.h.getSystemService("uimode");
            uiModeManager.getClass();
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    i2 = 0;
                }
            }
            uiModeManager.setApplicationNightMode(i2);
        }
        a(i);
        elfl.g(((effy) this.e.a.b()).b(new emwl() { // from class: dabl
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                dabi dabiVar = (dabi) ((dabj) obj).toBuilder();
                dabiVar.copyOnWrite();
                dabj dabjVar = (dabj) dabiVar.instance;
                dabjVar.b |= 1;
                dabjVar.c = i;
                return (dabj) dabiVar.build();
            }
        }, erpp.a)).k(axnw.c(new Consumer() { // from class: dabp
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                dabs dabsVar = dabs.this;
                int i3 = i;
                if (i3 == -1) {
                    ((akzt) dabsVar.c.b()).c("Bugle.ThemeMode.SystemDefault.Counts");
                } else if (i3 == 1) {
                    ((akzt) dabsVar.c.b()).c("Bugle.DarkMode.Disabled.Counts");
                } else {
                    if (i3 != 2) {
                        throw new IllegalArgumentException(a.h(i3, "Unsupported theme mode: "));
                    }
                    ((akzt) dabsVar.c.b()).c("Bugle.DarkMode.Enabled.Counts");
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }), (Executor) this.d.b());
    }
}
