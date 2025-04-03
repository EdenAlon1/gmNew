package defpackage;

import android.os.Looper;
import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jbz extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        Choreographer choreographer = Choreographer.getInstance();
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            throw new IllegalStateException("no Looper on this thread");
        }
        jcc jccVar = new jcc(choreographer, kqv.a(myLooper));
        return jccVar.plus(jccVar.j);
    }
}
