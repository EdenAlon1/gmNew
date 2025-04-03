package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class qol implements Comparable {
    public final qow a;
    public final String b;
    public final int c;
    public final Object d;
    public qop e;
    public Integer f;
    public qoo g;
    public final boolean h;
    public boolean i;
    public qnv j;
    public qoa k;
    public qoy l;
    private boolean m;

    public qol(String str, qop qopVar) {
        Uri parse;
        String host;
        this.a = qow.a ? new qow() : null;
        this.d = new Object();
        this.h = true;
        int i = 0;
        this.m = false;
        this.i = false;
        this.j = null;
        this.b = str;
        this.e = qopVar;
        this.k = new qoa(2500, 1, 1.0f);
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i = host.hashCode();
        }
        this.c = i;
    }

    public final int a() {
        return this.k.a;
    }

    protected abstract qor b(qoh qohVar);

    public Map c() {
        return Collections.EMPTY_MAP;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        qol qolVar = (qol) obj;
        int k = qolVar.k();
        int k2 = k();
        return k2 == k ? this.f.intValue() - qolVar.f.intValue() : (k - 1) - (k2 - 1);
    }

    public final void d(String str) {
        if (qow.a) {
            this.a.a(str, Thread.currentThread().getId());
        }
    }

    public void e() {
        synchronized (this.d) {
            this.m = true;
            this.e = null;
        }
    }

    protected abstract void f(Object obj);

    final void g(String str) {
        qoo qooVar = this.g;
        if (qooVar != null) {
            synchronized (qooVar.a) {
                qooVar.a.remove(this);
            }
            synchronized (qooVar.g) {
                Iterator it = qooVar.g.iterator();
                while (it.hasNext()) {
                    ((qon) it.next()).a();
                }
            }
            qooVar.b();
        }
        if (qow.a) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new qok(this, str, id));
            } else {
                this.a.a(str, id);
                this.a.b(toString());
            }
        }
    }

    public final void h() {
        synchronized (this.d) {
            this.i = true;
        }
    }

    final void i() {
        qoy qoyVar;
        synchronized (this.d) {
            qoyVar = this.l;
        }
        if (qoyVar != null) {
            qoyVar.a(this);
        }
    }

    public final boolean j() {
        boolean z;
        synchronized (this.d) {
            z = this.m;
        }
        return z;
    }

    public int k() {
        return 2;
    }

    final void l(qoy qoyVar) {
        synchronized (this.d) {
            this.l = qoyVar;
        }
    }

    final void m() {
        qoo qooVar = this.g;
        if (qooVar != null) {
            qooVar.b();
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.c));
        String str = true != j() ? "[ ] " : "[X] ";
        String str2 = k() != 1 ? "NORMAL" : "LOW";
        return str + this.b + " " + "0x".concat(valueOf) + " " + str2 + " " + this.f;
    }
}
