package defpackage;

import android.os.Bundle;
import android.util.ArrayMap;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baae {
    public final ReentrantLock a = new ReentrantLock();
    public final Map b = new ArrayMap();
    public boolean c = false;
    public final cqoh d;
    public final ffbr e;
    public final ffbr f;
    private final ScheduledExecutorService g;
    private final errl h;

    public baae(cqoh cqohVar, ffbr ffbrVar, ffbr ffbrVar2, errl errlVar, errm errmVar) {
        this.d = cqohVar;
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.h = errlVar;
        this.g = errmVar;
    }

    public static final euof c(baad baadVar) {
        if (baadVar.a == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        String str = baadVar.a;
        dfwv.n(str);
        euoe euoeVar = new euoe();
        dfwv.o(str, "setObject is required before calling build().");
        return new euof("ViewAction", "Viewed SMS/MMS Message", str, null, euoeVar, null, bundle);
    }

    public final void a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            euof c = c((baad) it.next());
            if (c != null) {
                this.e.b();
                eunp eunpVar = (eunp) this.f.b();
                if (eunpVar != null) {
                    eunpVar.b(c);
                }
            }
        }
    }

    public final void b() {
        erqt.r(erqt.k(new erog() { // from class: baab
            @Override // defpackage.erog
            public final ListenableFuture a() {
                return erqt.i(null);
            }
        }, 150L, TimeUnit.MILLISECONDS, this.g), axou.a(new csvw(new Consumer() { // from class: baac
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                baae baaeVar = baae.this;
                long epochMilli = baaeVar.d.f().toEpochMilli();
                ArrayList arrayList = new ArrayList();
                baaeVar.c = false;
                baaeVar.a.lock();
                try {
                    for (baad baadVar : baaeVar.b.values()) {
                        if (baadVar.c == 1) {
                            if (epochMilli - baadVar.b > 300) {
                                baadVar.c = 2;
                                arrayList.add(baadVar);
                            } else {
                                baaeVar.c = true;
                            }
                        }
                    }
                    baaeVar.a.unlock();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        euof c = baae.c((baad) it.next());
                        if (c != null) {
                            baaeVar.e.b();
                            eunp eunpVar = (eunp) baaeVar.f.b();
                            if (eunpVar != null) {
                                eunpVar.c(c);
                            }
                        }
                    }
                    if (baaeVar.c) {
                        baaeVar.b();
                    }
                } catch (Throwable th) {
                    baaeVar.a.unlock();
                    throw th;
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        })), this.h);
    }
}
