package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekye extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        elao elaoVar = new elao(efbd.g());
        Thread currentThread = Thread.currentThread();
        synchronized (ekyf.c) {
            ekyf.c.put(currentThread, elaoVar);
        }
        return elaoVar;
    }
}
