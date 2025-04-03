package j$.util.concurrent;

/* loaded from: classes9.dex */
final class y extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final Object initialValue() {
        return new ThreadLocalRandom(0);
    }
}
