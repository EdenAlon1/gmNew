package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpbs {
    private static final enru e = enru.c("com/google/android/apps/messaging/shared/sms/config/MmsConfigManager");
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final ctwb b;
    public final errl c;
    public final cpbu d;
    private final cpai f;
    private final ctud g;

    public cpbs(ctwb ctwbVar, cpai cpaiVar, ctud ctudVar, errl errlVar, cpbu cpbuVar) {
        this.b = ctwbVar;
        this.f = cpaiVar;
        this.g = ctudVar;
        this.c = errlVar;
        this.d = cpbuVar;
    }

    private final synchronized void e() {
        if (this.d.f) {
            return;
        }
        cpai cpaiVar = this.f;
        cpaiVar.getClass();
        c(cpaiVar);
    }

    public final cpbn a(int i) {
        if (this.f != null) {
            e();
        }
        cpbu cpbuVar = this.d;
        int a = cpbuVar.h.h(i).a();
        if (cpbuVar.i.a()) {
            cpbuVar.c();
        }
        cpbuVar.b.lock();
        try {
            cpbn cpbnVar = (cpbn) cpbuVar.d.get(a);
            if (cpbnVar != null) {
                return cpbnVar;
            }
            ensk j = cpbu.a.j();
            j.Y(ente.a, "Bugle");
            enrr enrrVar = (enrr) j;
            enrrVar.W(1, TimeUnit.MINUTES);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/sms/config/MmsConfigMap", "get", 81, "MmsConfigMap.java")).J("Get mms config failed: invalid subId. subId=%d, real subId=%d, map=%s", Integer.valueOf(i), Integer.valueOf(a), cpbuVar.d);
            cpbn cpbnVar2 = new cpbn(a, new Bundle());
            cpbuVar.d.put(a, cpbnVar2);
            return cpbnVar2;
        } finally {
            cpbuVar.b.unlock();
        }
    }

    public final List b() {
        cpbu cpbuVar = this.d;
        if (cpbuVar.i.a()) {
            cpbuVar.c();
        }
        cpbuVar.b.lock();
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < cpbuVar.d.size(); i++) {
                cpbn cpbnVar = (cpbn) cpbuVar.d.valueAt(i);
                if (cpbnVar != null) {
                    arrayList.add(cpbnVar);
                }
            }
            return arrayList;
        } finally {
            cpbuVar.b.unlock();
        }
    }

    public final void c(cpbv cpbvVar) {
        engw engwVar;
        if (this.g.l()) {
            Stream map = Collection.EL.stream(this.b.m()).map(new Function() { // from class: cpbo
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Integer.valueOf(((ctwi) obj).a());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i = engw.d;
            engwVar = (engw) map.collect(endq.a);
        } else {
            ensk j = e.j();
            j.Y(ente.a, "Bugle");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/sms/config/MmsConfigManager", "hasPhonePermissions", 153, "MmsConfigManager.java")).q("Loading mms config failed: no permission to access subscriptions.");
            int i2 = engw.d;
            engwVar = enou.a;
        }
        SparseArray sparseArray = new SparseArray();
        cpbvVar.f();
        Iterator<E> it = engwVar.iterator();
        while (it.hasNext()) {
            final int intValue = ((Integer) it.next()).intValue();
            final cpbn cpbnVar = new cpbn(intValue, cpbvVar.a(intValue));
            this.a.compareAndSet(false, cpbnVar.m());
            cpbnVar.i().ifPresent(new Consumer() { // from class: cpbp
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    cpbnVar.c = cpbm.b(intValue, (String) obj, cpbs.this.b);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            sparseArray.append(intValue, cpbnVar);
        }
        cpbu cpbuVar = this.d;
        cpbuVar.b.lock();
        try {
            cpbuVar.d.clear();
            Iterator<E> it2 = engwVar.iterator();
            while (it2.hasNext()) {
                cpbn cpbnVar2 = (cpbn) sparseArray.get(((Integer) it2.next()).intValue());
                int i3 = cpbnVar2.a;
                emxf.l(i3 != -1);
                cpbuVar.b.lock();
                try {
                    cpbuVar.d.put(i3, cpbnVar2);
                    cpbuVar.b.unlock();
                } finally {
                }
            }
        } finally {
            cpbuVar.f = true;
            if (cpbuVar.g.isEmpty()) {
                cpbuVar.g = Optional.of(Instant.now());
            }
            cpbuVar.b.unlock();
            Iterator<E> it3 = engwVar.iterator();
            while (it3.hasNext()) {
                cpbuVar.b(((Integer) it3.next()).intValue());
            }
        }
    }

    public final boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Iterator it = b().iterator();
        while (it.hasNext()) {
            if (str.equals(((cpbn) it.next()).k())) {
                return true;
            }
        }
        return false;
    }
}
