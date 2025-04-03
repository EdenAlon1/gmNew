package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rhb implements Handler.Callback {
    private static final rha b = new rgz();
    public final cmh a = new cmh();
    private volatile qqs c;
    private final rha d;
    private final rgs e;
    private final rgx f;

    public rhb(rha rhaVar) {
        rhaVar = rhaVar == null ? b : rhaVar;
        this.d = rhaVar;
        this.f = new rgx(rhaVar);
        this.e = (rdv.b && rdv.a) ? new rgr() : new rgn();
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void e(Collection collection, Map map) {
        View view;
        if (collection == null) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ea eaVar = (ea) it.next();
            if (eaVar != null && (view = eaVar.Q) != null) {
                map.put(view, eaVar);
                e(eaVar.I().p(), map);
            }
        }
    }

    public final qqs b(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (rkh.n() && !(context instanceof Application)) {
            if (context instanceof eg) {
                return d((eg) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return b(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = this.d.a(qpt.b(context.getApplicationContext()), new rgi(), new rgo(), context.getApplicationContext());
                }
            }
        }
        return this.c;
    }

    public final qqs c(ea eaVar) {
        rkf.e(eaVar.z(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (rkh.m()) {
            return b(eaVar.z().getApplicationContext());
        }
        if (eaVar.G() != null) {
            this.e.a(eaVar.G());
        }
        eaVar.I();
        Context z = eaVar.z();
        return this.f.a(z, qpt.b(z.getApplicationContext()), eaVar.P(), eaVar.aK());
    }

    public final qqs d(eg egVar) {
        if (rkh.m()) {
            return b(egVar.getApplicationContext());
        }
        if (egVar.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.e.a(egVar);
        Activity a = a(egVar);
        boolean z = true;
        if (a != null && a.isFinishing()) {
            z = false;
        }
        qpt b2 = qpt.b(egVar.getApplicationContext());
        rgx rgxVar = this.f;
        lkk P = egVar.P();
        egVar.a();
        return rgxVar.a(egVar, b2, P, z);
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public final boolean handleMessage(Message message) {
        return false;
    }
}
