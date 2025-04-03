package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecva implements ecux {
    public static ecva a;
    public final Context b;
    public final ContentObserver c;
    public boolean d;

    public ecva() {
        this.d = false;
        this.b = null;
        this.c = null;
    }

    static synchronized void c() {
        Context context;
        synchronized (ecva.class) {
            ecva ecvaVar = a;
            if (ecvaVar != null && (context = ecvaVar.b) != null && ecvaVar.c != null && ecvaVar.d) {
                context.getContentResolver().unregisterContentObserver(a.c);
            }
            a = null;
        }
    }

    @Override // defpackage.ecux
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String a(final String str) {
        Context context = this.b;
        if (context != null && !dubc.d(context)) {
            try {
                return (String) ecuv.a(new ecuw() { // from class: ecuy
                    @Override // defpackage.ecuw
                    public final Object a() {
                        Context context2 = ecva.this.b;
                        context2.getClass();
                        return digu.c(context2.getContentResolver(), str, null);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e);
            }
        }
        return null;
    }

    public ecva(Context context) {
        this.d = false;
        this.b = context;
        this.c = new ecuz();
    }
}
