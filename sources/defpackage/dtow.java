package defpackage;

import android.os.Process;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtow extends ThreadLocal {
    public static final dtow a = new dtow();

    private dtow() {
    }

    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        int myTid = Process.myTid();
        return new dtot(Thread.currentThread(), myTid, true, Process.getThreadPriority(myTid), false, 112);
    }
}
