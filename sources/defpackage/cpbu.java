package defpackage;

import android.os.Bundle;
import android.util.SparseArray;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpbu {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/sms/config/MmsConfigMap");
    public final ctwb h;
    public final cpca i;
    private final Optional j;
    public final Lock b = new ReentrantLock();
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public boolean f = false;
    public Optional g = Optional.empty();
    public final cpbn c = new cpbn(-1, new Bundle());

    public cpbu(ctwb ctwbVar, Optional optional, cpca cpcaVar) {
        this.h = ctwbVar;
        this.j = optional;
        this.i = cpcaVar;
    }

    public final Bundle a(int i) {
        this.b.lock();
        try {
            cpbn cpbnVar = (cpbn) this.e.get(i);
            return cpbnVar == null ? Bundle.EMPTY : new Bundle(cpbnVar.b);
        } finally {
            this.b.unlock();
        }
    }

    public final void b(final int i) {
        this.j.ifPresent(new Consumer() { // from class: cpbt
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((aknl) obj).a(i);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void c() {
        this.b.lock();
        try {
            int size = this.e.size();
            for (int i = 0; i < size; i++) {
                cpbn cpbnVar = (cpbn) this.e.valueAt(i);
                int i2 = cpbnVar.a;
                cpbn cpbnVar2 = (cpbn) this.d.get(i2);
                if (cpbnVar2 != null) {
                    if (cpbnVar.i().isPresent()) {
                        cpbnVar.c = cpbm.b(i2, (String) cpbnVar.i().get(), this.h);
                    }
                    if (this.i.a()) {
                        cpbnVar2.b.putAll(cpbnVar.b);
                        cpbm cpbmVar = cpbnVar.c;
                        if (cpbmVar != null) {
                            cpbnVar2.c = cpbmVar;
                        }
                        this.d.put(i2, cpbnVar2);
                    }
                }
            }
        } finally {
            this.b.unlock();
        }
    }
}
