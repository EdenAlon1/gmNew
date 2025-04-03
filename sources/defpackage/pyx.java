package defpackage;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pyx implements Callable {
    final /* synthetic */ otj a;
    final /* synthetic */ pzg b;

    public pyx(pzg pzgVar, otj otjVar) {
        this.b = pzgVar;
        this.a = otjVar;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean call() {
        boolean z;
        Cursor a = ovn.a(this.b.a, this.a, false);
        try {
            if (a.moveToFirst()) {
                z = Boolean.valueOf(a.getInt(0) != 0);
            } else {
                z = false;
            }
            return z;
        } finally {
            a.close();
        }
    }

    protected final void finalize() {
        this.a.j();
    }
}
