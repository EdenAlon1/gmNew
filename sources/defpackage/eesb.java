package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eesb {
    private final eesa b;
    public final Set a = new HashSet();
    private final Handler c = new Handler(Looper.getMainLooper());

    public eesb(Context context) {
        this.b = new eesa(context);
    }

    public final List a() {
        ArrayList arrayList;
        synchronized (this.b) {
            arrayList = new ArrayList(this.b.a());
        }
        return arrayList;
    }

    public final void b(final String str, final boolean z) {
        synchronized (this.b) {
            if (!z) {
                this.b.a().remove(str);
                this.b.c();
            } else if (!this.b.a().contains(str)) {
                this.b.a().add(str);
                this.b.c();
            }
            this.b.d(false);
        }
        for (final eerx eerxVar : this.a) {
            this.c.post(new Runnable() { // from class: eerz
                @Override // java.lang.Runnable
                public final void run() {
                    eerx.this.a(str, z);
                }
            });
        }
    }

    public final void c(boolean z) {
        synchronized (this.b) {
            this.b.d(z);
        }
    }

    public final void d(List list) {
        synchronized (this.b) {
            if (this.b.a().equals(list)) {
                return;
            }
            this.b.a().clear();
            this.b.a().addAll(list);
            this.b.c();
            for (final eerx eerxVar : this.a) {
                Handler handler = this.c;
                eerxVar.getClass();
                handler.post(new Runnable() { // from class: eery
                    @Override // java.lang.Runnable
                    public final void run() {
                        eerx.this.b();
                    }
                });
            }
        }
    }

    public final boolean e() {
        boolean z;
        synchronized (this.b) {
            eesa eesaVar = this.b;
            eesaVar.b();
            z = eesaVar.a;
        }
        return z;
    }
}
