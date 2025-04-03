package defpackage;

import android.util.Log;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaed extends eaee {
    private final String b;

    public eaed(String str) {
        super(str);
        this.b = "brella";
    }

    @Override // defpackage.eaee
    public final void a(Level level, String str, Throwable th, String str2, Object... objArr) {
        int i;
        if (level.equals(Level.SEVERE)) {
            i = 6;
        } else {
            if (!level.equals(Level.WARNING)) {
                if (level.equals(Level.INFO)) {
                    i = 4;
                } else if (level.equals(Level.FINE)) {
                    i = 3;
                }
            }
            i = 5;
        }
        if (objArr.length > 0) {
            str2 = String.format(str2, objArr);
        }
        if (th != null) {
            str2 = str2 + "\n" + Log.getStackTraceString(th);
        }
        Log.println(i, this.b + "." + str, str2);
    }
}
