package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeos {
    public static final /* synthetic */ int d = 0;
    private static final ExecutorService e = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: eeoe
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            int i = eeos.d;
            return new Thread(runnable, "ObservableStateMachineNotifierThread");
        }
    });
    public final eeom a;
    public final eeoo b;
    public final Set c;
    private final Set f;

    private eeos(eeoo eeooVar) {
        eeooVar.getClass();
        this.b = eeooVar;
        this.a = new eeom();
        this.c = new HashSet();
        this.f = new HashSet();
    }

    public static eeos a(eeoo eeooVar) {
        eeos eeosVar = new eeos(eeooVar);
        emxf.m(eeosVar.a.b(), "already entered the initial state");
        eeosVar.a.c(new eeol(eeosVar.b.c, null));
        return eeosVar;
    }

    public static void i(Set set, final eeoh eeohVar) {
        Collection.EL.stream(set).forEach(new Consumer() { // from class: eeoc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                eeon eeonVar = (eeon) obj;
                int i = eeos.d;
                try {
                    eeonVar.a(eeoh.this);
                } catch (Exception e2) {
                    dkty.i(e2, "exception in ObservableStateMachine.onStateTransition observer", new Object[0]);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    private final void j(eeol eeolVar) {
        eeom eeomVar = this.a;
        Set set = this.f;
        final eeoh c = eeomVar.c(eeolVar);
        i(set, c);
        e.execute(new Runnable() { // from class: eeod
            @Override // java.lang.Runnable
            public final void run() {
                eeos.i(eeos.this.c, c);
            }
        });
    }

    public final Object b(eeot eeotVar) {
        return d(null, eeotVar, null);
    }

    public final Object c(eeop eeopVar, eeot eeotVar) {
        return d(eeopVar, eeotVar, null);
    }

    public final Object d(eeop eeopVar, eeot eeotVar, eeop eeopVar2) {
        h(eeopVar);
        try {
            Object b = eeotVar.b();
            h(eeopVar2);
            return b;
        } catch (Exception e2) {
            g(e2);
            if (eeotVar.a().isInstance(e2)) {
                throw ((Throwable) eeotVar.a().cast(e2));
            }
            if (e2 instanceof RuntimeException) {
                throw ((RuntimeException) e2);
            }
            throw new IllegalStateException("unexpected exception", e2);
        }
    }

    public final void e(eeok eeokVar, Map map) {
        eeokVar.e(new eeog(this, map));
    }

    public final void f(eeon eeonVar) {
        if (eeonVar instanceof eeoi) {
            this.f.add(eeonVar);
        } else {
            this.c.add(eeonVar);
        }
    }

    public final void g(Throwable th) {
        eeom eeomVar = this.a;
        eeoo eeooVar = this.b;
        enhk enhkVar = eeooVar.b;
        eeop a = eeomVar.a();
        Optional empty = !enhkVar.containsKey(a) ? Optional.empty() : Optional.ofNullable((eeop) ((eeoq) eeooVar.b.get(a)).a.get(th.getClass()));
        if (empty.isPresent()) {
            h((eeop) empty.get());
        } else {
            j(eeol.a(this.b.d, th));
        }
    }

    public final void h(eeop eeopVar) {
        if (eeopVar == null) {
            return;
        }
        try {
            eeoo eeooVar = this.b;
            eeop a = this.a.a();
            if (!eeooVar.a(eeopVar)) {
                if (!eeooVar.a.s(a)) {
                    throw new eeoj(String.format(Locale.US, "unknown transition from[%s] to[%s]", a, eeopVar));
                }
                if (!eeooVar.a.y(a, eeopVar)) {
                    throw new eeoj(String.format(Locale.US, "invalid transition from[%s] -> to[%s]", a, eeopVar));
                }
            }
            j(new eeol(eeopVar, null));
        } catch (eeoj e2) {
            j(eeol.a(eeopVar, e2));
        }
    }
}
