package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlnx {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public emxc b;
    public emxc c;
    public emxc d;
    public emxc e;
    public emxc f;
    private final Context g;

    public dlnx(Context context) {
        emux emuxVar = emux.a;
        this.b = emuxVar;
        this.c = emuxVar;
        this.d = emuxVar;
        this.e = emuxVar;
        this.f = emuxVar;
        this.g = context;
    }

    public static final int f(boolean z) {
        return z ? 4866 : 768;
    }

    public final void a() {
        Log.d("SystemUiManager", String.format("#reinstateActivitySystemUi(): activityWindow.isPresent() = %b", Boolean.valueOf(this.c.g())));
        if (!this.c.g()) {
            Log.d("SystemUiManager", "#reinstateActivitySystemUi(): activityWindow not present");
            return;
        }
        if (e()) {
            ((dlnw) this.c.c()).g();
            ((dlnw) this.c.c()).d();
        }
        ((dlnw) this.c.c()).b();
        ((dlnw) this.c.c()).e();
    }

    public final void b() {
        Log.d("SystemUiManager", String.format("#reinstatePopupWindowSystemUi(): popupWindow.isPresent() = %b", Boolean.valueOf(this.d.g())));
        if (this.d.g()) {
            if (e()) {
                ((dlnw) this.d.c()).g();
                ((dlnw) this.d.c()).d();
            }
            ((dlnw) this.d.c()).b();
            ((dlnw) this.d.c()).e();
        }
    }

    public final void c() {
        Log.d("SystemUiManager", "#reinstateSystemUi()");
        b();
        a();
        emux emuxVar = emux.a;
        this.f = emuxVar;
        this.e = emuxVar;
        this.a.set(false);
    }

    public final void d(dlnw dlnwVar) {
        if (e()) {
            dlnwVar.c();
            if (this.e.g()) {
                dlnwVar.h();
            }
        }
        dlnwVar.a();
        if (this.f.g()) {
            dlnwVar.f(((Integer) this.f.c()).intValue());
        }
    }

    public final boolean e() {
        return !dlog.a.contains(this.g.getPackageName());
    }
}
