package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eldl {
    public static long a = Math.abs(new Random().nextInt()) << 30;
    public static final HashMap b = new HashMap();
    public static final Object c = new Object();
    public static elav d;

    public static final emwl a(emwl emwlVar) {
        emwlVar.getClass();
        return new eldi(ekyf.e(), emwlVar);
    }

    public static final emyl b(final emyl emylVar) {
        final elat e = ekyf.e();
        return new emyl() { // from class: elcs
            @Override // defpackage.emyl
            public final Object get() {
                long j = eldl.a;
                elat h = ekyf.h(ekyf.b(), elat.this);
                try {
                    return emylVar.get();
                } finally {
                }
            }
        };
    }

    public static final erog c(erog erogVar) {
        return new eldb(ekyf.e(), erogVar);
    }

    public static final eroh d(eroh erohVar) {
        return new eldc(ekyf.e(), erohVar);
    }

    public static final erot e(final erot erotVar) {
        final elat e = ekyf.e();
        return new erot() { // from class: elcw
            @Override // defpackage.erot
            public final erph a(erpc erpcVar, Object obj) {
                long j = eldl.a;
                erpcVar.getClass();
                elat h = ekyf.h(ekyf.b(), elat.this);
                try {
                    return erotVar.a(erpcVar, obj);
                } finally {
                }
            }
        };
    }

    public static final erov f(final erov erovVar) {
        final elat e = ekyf.e();
        return new erov() { // from class: elcq
            @Override // defpackage.erov
            public final Object a(erpc erpcVar) {
                long j = eldl.a;
                erpcVar.getClass();
                elat h = ekyf.h(ekyf.b(), elat.this);
                try {
                    return erovVar.a(erpcVar);
                } finally {
                }
            }
        };
    }

    public static final erow g(final erow erowVar) {
        final elat e = ekyf.e();
        return new erow() { // from class: elcv
            @Override // defpackage.erow
            public final Object a(erpc erpcVar, Object obj) {
                long j = eldl.a;
                erpcVar.getClass();
                elat h = ekyf.h(ekyf.b(), elat.this);
                try {
                    return erowVar.a(erpcVar, obj);
                } finally {
                }
            }
        };
    }

    public static final eroz h(final eroz erozVar) {
        final elat e = ekyf.e();
        return new eroz() { // from class: elcp
            @Override // defpackage.eroz
            public final erph a(erpc erpcVar, erpd erpdVar) {
                long j = eldl.a;
                erpcVar.getClass();
                elat h = ekyf.h(ekyf.b(), elat.this);
                try {
                    return erozVar.a(erpcVar, erpdVar);
                } finally {
                }
            }
        };
    }

    public static final erqj i(erqj erqjVar) {
        erqjVar.getClass();
        return new eldj(ekyf.e(), erqjVar);
    }

    public static final Closeable j(final Closeable closeable) {
        final elat e = ekyf.e();
        return new Closeable() { // from class: elcx
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                long j = eldl.a;
                elat h = ekyf.h(ekyf.b(), elat.this);
                try {
                    closeable.close();
                } finally {
                }
            }
        };
    }

    public static final Runnable k(Runnable runnable) {
        return new elde(v(), runnable);
    }

    public static final Runnable l(Runnable runnable) {
        runnable.getClass();
        elat e = ekyf.e();
        fflb fflbVar = new fflb();
        if (ekxo.a == 1) {
            int i = elep.a;
        }
        return new eldk(fflbVar, e, runnable);
    }

    public static final Callable m(Callable callable) {
        return new eldd(ekyf.e(), callable);
    }

    public static final Callable n(Callable callable) {
        return new eldf(v(), callable);
    }

    public static final void o(Intent intent) {
        intent.getClass();
        if (elag.a != 1 && !intent.hasExtra("tracing_intent_id")) {
            throw new IllegalStateException("Was supposed to propagate trace for startActivity - did you forget to propagate it? See http://go/tiktok-conformance-violations/TRACE_PROPAGATION_FOR_START_ACTIVITY for more details.");
        }
    }

    public static final void p(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        Intent intent2 = new Intent(intent);
        elcz u = u(intent2);
        try {
            context.startActivity(intent2);
            ffig.a(u, null);
        } finally {
        }
    }

    public static final void q(Context context, Intent intent, Bundle bundle) {
        context.getClass();
        intent.getClass();
        Intent intent2 = new Intent(intent);
        elcz u = u(intent2);
        try {
            context.startActivity(intent2, bundle);
            ffig.a(u, null);
        } finally {
        }
    }

    public static final elat r(Intent intent, boolean z) {
        elat elatVar;
        try {
            if (!intent.hasExtra("tracing_intent_id")) {
                return null;
            }
            long longExtra = intent.getLongExtra("tracing_intent_id", -1L);
            HashMap hashMap = b;
            synchronized (hashMap) {
                elatVar = (elat) (z ? hashMap.remove(Long.valueOf(longExtra)) : hashMap.get(Long.valueOf(longExtra)));
            }
            return elatVar;
        } catch (BadParcelableException unused) {
            return null;
        }
    }

    public static final boolean s() {
        elao b2 = ekyf.b();
        elat elatVar = b2.c;
        return ((elatVar == null || ffkj.e(elatVar, ekzt.a)) && b2.d == null) ? false : true;
    }

    public static final elat t(Intent intent) {
        return r(intent, false);
    }

    public static final elcz u(Intent intent) {
        long j;
        elat e = ekyf.e();
        elat c2 = ekyf.c();
        if (c2 != null) {
            elae elaeVar = ekxh.a;
            if (!c2.i(ekxh.b).b()) {
                synchronized (c2) {
                    if (!c2.i(ekxh.b).b()) {
                        c2.o(ekxh.b, true);
                    }
                }
            }
        }
        HashMap hashMap = b;
        synchronized (hashMap) {
            j = a;
            a = 1 + j;
        }
        intent.putExtra("tracing_intent_id", j);
        return new elcz(j);
    }

    private static final elat v() {
        elao b2 = ekyf.b();
        elat elatVar = b2.c;
        if (elatVar != null && !ffkj.e(elatVar, ekzt.a)) {
            elat elatVar2 = b2.c;
            elatVar2.getClass();
            return elatVar2;
        }
        elat elatVar3 = b2.d;
        if (elatVar3 != null) {
            return elatVar3;
        }
        throw new IllegalStateException("This is not reachable if guarded by shouldPropagateExecutorTrace.");
    }
}
