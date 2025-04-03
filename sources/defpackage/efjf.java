package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efjf implements Callable {
    volatile boolean a;
    final /* synthetic */ efkq b;
    final /* synthetic */ efks c;
    final /* synthetic */ efjh d;

    public efjf(efjh efjhVar, efkq efkqVar, efks efksVar) {
        this.b = efkqVar;
        this.c = efksVar;
        this.d = efjhVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        emxf.m(!this.d.a.inTransaction(), "Thread is already in a transaction! This should never happen, or this will be treated as a nested transaction.");
        this.d.a.beginTransactionWithListener(new efje(this));
        try {
            this.a = true;
            Object a = this.b.a(this.c);
            efks.f();
            this.d.a.setTransactionSuccessful();
            this.a = false;
            return a;
        } finally {
            this.d.a.endTransaction();
        }
    }
}
