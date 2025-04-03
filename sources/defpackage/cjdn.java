package defpackage;

import android.content.Context;
import android.widget.Toast;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjdn {
    public static final void a(final Context context, final String str) {
        efbd.e(new Runnable() { // from class: cjdm
            @Override // java.lang.Runnable
            public final void run() {
                Toast.makeText(context, str, 1).show();
            }
        });
    }
}
