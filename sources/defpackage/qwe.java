package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qwe implements qwk, qyf, qwm {
    public static final boolean a = Log.isLoggable("Engine", 2);
    public final qwr b;
    public final qyg c;
    public final qwb d;
    public final qwz e;
    public final qwc f;
    public final qvz g;
    public final qve h;

    public qwe(qyg qygVar, qya qyaVar, qyr qyrVar, qyr qyrVar2, qyr qyrVar3, qyr qyrVar4) {
        this.c = qygVar;
        qwc qwcVar = new qwc(qyaVar);
        this.f = qwcVar;
        qve qveVar = new qve();
        this.h = qveVar;
        synchronized (this) {
            try {
                try {
                    synchronized (qveVar) {
                        try {
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    }
                    this.b = new qwr();
                    this.d = new qwb(qyrVar, qyrVar2, qyrVar4, this, this);
                    this.g = new qvz(qwcVar);
                    this.e = new qwz();
                    ((qye) qygVar).a = this;
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public static void a(String str, long j, qtp qtpVar) {
        Log.v("Engine", str + " in " + rka.a(j) + "ms, key: " + qtpVar.toString());
    }

    @Override // defpackage.qwk
    public final synchronized void b(qwj qwjVar, qtp qtpVar) {
        this.b.a(qtpVar, qwjVar);
    }

    @Override // defpackage.qwk
    public final synchronized void c(qwj qwjVar, qtp qtpVar, qwn qwnVar) {
        if (qwnVar != null) {
            if (qwnVar.a) {
                this.h.b(qtpVar, qwnVar);
            }
        }
        this.b.a(qtpVar, qwjVar);
    }
}
