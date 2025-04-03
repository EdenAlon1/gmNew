package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class excv {
    public final emyl a;

    public excv(final Context context, final String str, final String str2, final Executor executor, final int i) {
        Log.i("BrellaInAppTraining", String.format("Initializing Brella training with population name: %s, session name: %s", str, str2));
        this.a = emys.a(new emyl() { // from class: excl
            @Override // defpackage.emyl
            public final Object get() {
                dguc dgucVar = new dguc();
                dgucVar.d(str2);
                dgucVar.b(str);
                dgucVar.c(i);
                dhre c = dgvz.c(context, executor, dgucVar.a());
                c.t(new dhqv() { // from class: exct
                    @Override // defpackage.dhqv
                    public final void d(Exception exc) {
                        if (Log.isLoggable("BrellaInAppTraining", 4)) {
                            Log.i("BrellaInAppTraining", "Error initializing Brella in-app training.");
                        }
                    }
                });
                return c;
            }
        });
    }
}
