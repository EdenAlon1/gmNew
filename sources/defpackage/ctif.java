package defpackage;

import android.content.Context;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctif {
    public final Context a;

    public ctif(Context context) {
        this.a = context;
    }

    public final void a(int i) {
        fgsd fgsdVar = fgsf.a;
        try {
            fgsd fgsdVar2 = fgsf.a;
            Context context = this.a;
            if (fgsdVar2 == null && !fgsf.a(context)) {
                throw new fgse("No default launcher available");
            }
            try {
                fgsf.a.b(context, fgsf.b, i);
            } catch (Exception e) {
                throw new fgse(e);
            }
        } catch (fgse e2) {
            if (Log.isLoggable("ShortcutBadger", 3)) {
                Log.d("ShortcutBadger", "Unable to execute badge", e2);
            }
        }
    }

    public final boolean b() {
        if (((Boolean) cipg.a.e()).booleanValue()) {
            return false;
        }
        return fgsf.b(this.a);
    }
}
