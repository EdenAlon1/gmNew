package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class echd {
    public Handler e;
    public ecda h;
    public int a = 0;
    public int b = 0;
    public boolean c = true;
    public boolean d = true;
    public final Set g = new HashSet();
    public final Runnable f = new Runnable() { // from class: echa
        @Override // java.lang.Runnable
        public final void run() {
            echd echdVar = echd.this;
            ecda ecdaVar = echdVar.h;
            ecdaVar.getClass();
            if (echdVar.b == 0) {
                echdVar.c = true;
                Iterator it = echdVar.g.iterator();
                while (it.hasNext()) {
                    ((ecgm) it.next()).k(ecdaVar);
                }
            }
            echdVar.h.getClass();
            echdVar.a();
        }
    };

    public echd(Context context) {
        this.e = null;
        this.e = new Handler(context.getMainLooper());
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new echb(this));
    }

    public final void a() {
        if (this.a == 0 && this.c) {
            for (ecgm ecgmVar : this.g) {
            }
            this.d = true;
        }
    }
}
