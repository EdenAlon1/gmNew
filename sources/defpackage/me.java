package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class me implements Runnable {
    final /* synthetic */ mq a;
    final /* synthetic */ mf b;

    public me(mf mfVar, mq mqVar) {
        this.b = mfVar;
        this.a = mqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mf mfVar = this.b;
        mh mhVar = mfVar.d;
        if (mhVar.f == mfVar.c) {
            mq mqVar = this.a;
            List list = mfVar.b;
            mhVar.d = list;
            mhVar.e = DesugarCollections.unmodifiableList(list);
            mqVar.b(mhVar.a);
            mhVar.b();
        }
    }
}
