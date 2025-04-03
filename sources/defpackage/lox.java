package defpackage;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import java.io.PrintWriter;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lox {
    public int b;
    public final Context c;
    public boolean d = false;
    public boolean e = false;
    public boolean f = true;
    public boolean g = false;
    public boolean h = false;
    public lop i;

    public lox(Context context) {
        this.c = context.getApplicationContext();
    }

    public static final String r(Object obj) {
        StringBuilder sb = new StringBuilder(64);
        if (obj == null) {
            sb.append("null");
        } else {
            sb.append(obj.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
            sb.append("}");
        }
        return sb.toString();
    }

    @Deprecated
    public void g(String str, PrintWriter printWriter) {
        throw null;
    }

    public void h() {
        throw null;
    }

    public final void i() {
        this.h = false;
    }

    public void j(Object obj) {
        lop lopVar = this.i;
        if (lopVar != null) {
            if (lot.e(2)) {
                Objects.toString(lopVar);
                Log.v("LoaderManager", "onLoadComplete: ".concat(lopVar.toString()));
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                lopVar.m(obj);
                return;
            }
            if (lot.e(4)) {
                Log.i("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            lopVar.j(obj);
        }
    }

    public final void k() {
        if (this.d) {
            f();
        } else {
            this.g = true;
        }
    }

    public final void o() {
        this.d = true;
        this.f = false;
        this.e = false;
        m();
    }

    public final void p() {
        this.d = false;
        n();
    }

    public final boolean q() {
        boolean z = this.g;
        this.g = false;
        this.h |= z;
        return z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" id=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    protected void f() {
    }

    public void l() {
    }

    protected void m() {
    }

    protected void n() {
    }
}
