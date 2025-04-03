package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehxb implements ServiceConnection {
    final /* synthetic */ ehxc a;

    public ehxb(ehxc ehxcVar) {
        this.a = ehxcVar;
    }

    public final void a(ComponentName componentName) {
        csjy.n("RcsClientLib", "Binding to " + componentName.getClassName() + " has died.");
        ehxc ehxcVar = this.a;
        ehxcVar.g(ehxcVar.getServiceNameLoggingEnum(), 5);
    }

    public final void b(ComponentName componentName) {
        csjy.n("RcsClientLib", "Null IBinder returned for ".concat(String.valueOf(componentName.getClassName())));
        if (((Boolean) ehxc.a.e()).booleanValue()) {
            this.a.c(ehxh.NULL_BINDING);
        }
        ehxc ehxcVar = this.a;
        ehxcVar.g(ehxcVar.getServiceNameLoggingEnum(), 6);
    }

    public final void c(IBinder iBinder) {
        Object obj;
        ehxc ehxcVar = this.a;
        synchronized (ehxcVar.d) {
            Class<?>[] declaredClasses = ehxcVar.c.getDeclaredClasses();
            int i = 0;
            while (true) {
                obj = null;
                if (i >= declaredClasses.length) {
                    break;
                }
                if (declaredClasses[i].getName().endsWith("Stub")) {
                    try {
                        obj = declaredClasses[i].getMethod("asInterface", IBinder.class).invoke(null, iBinder);
                        break;
                    } catch (Exception e) {
                        csjy.h("RcsClientLib", e, "Error while getting stub: ".concat(String.valueOf(e.getMessage())));
                    }
                }
                i++;
            }
            ehxcVar.f = obj;
        }
        if (ehxcVar.f != null) {
            ehxcVar.d(ehxcVar.getClass().getName());
        } else {
            ehxcVar.c(ehxh.INTERNAL_ERROR);
        }
        if (!((Boolean) ehxc.b.e()).booleanValue()) {
            synchronized (this.a.d) {
                this.a.d.notifyAll();
            }
        }
        ehxc ehxcVar2 = this.a;
        ehxcVar2.g(ehxcVar2.getServiceNameLoggingEnum(), 3);
    }

    public final void d() {
        synchronized (this.a.d) {
            this.a.f = null;
        }
        ehxc ehxcVar = this.a;
        ehxcVar.e(ehxcVar.getClass().getName());
        ehxc ehxcVar2 = this.a;
        ehxcVar2.g(ehxcVar2.getServiceNameLoggingEnum(), 4);
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(final ComponentName componentName) {
        ffbr ffbrVar = this.a.g;
        if (ffbrVar != null) {
            ((Executor) ffbrVar.b()).execute(eldl.l(new Runnable() { // from class: ehwy
                @Override // java.lang.Runnable
                public final void run() {
                    ehxb.this.a(componentName);
                }
            }));
        } else {
            a(componentName);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(final ComponentName componentName) {
        ffbr ffbrVar = this.a.g;
        if (ffbrVar != null) {
            ((Executor) ffbrVar.b()).execute(eldl.l(new Runnable() { // from class: ehwz
                @Override // java.lang.Runnable
                public final void run() {
                    ehxb.this.b(componentName);
                }
            }));
        } else {
            b(componentName);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        ffbr ffbrVar = this.a.g;
        if (ffbrVar != null) {
            ((Executor) ffbrVar.b()).execute(eldl.l(new Runnable() { // from class: ehxa
                @Override // java.lang.Runnable
                public final void run() {
                    ehxb.this.c(iBinder);
                }
            }));
        } else {
            c(iBinder);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ffbr ffbrVar = this.a.g;
        if (ffbrVar != null) {
            ((Executor) ffbrVar.b()).execute(eldl.l(new Runnable() { // from class: ehwx
                @Override // java.lang.Runnable
                public final void run() {
                    ehxb.this.d();
                }
            }));
        } else {
            d();
        }
    }
}
