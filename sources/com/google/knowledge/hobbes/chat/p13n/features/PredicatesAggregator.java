package com.google.knowledge.hobbes.chat.p13n.features;

import defpackage.enhk;
import defpackage.enoz;
import defpackage.exdm;
import java.io.Closeable;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class PredicatesAggregator implements Closeable {
    long a;

    public PredicatesAggregator(long j) {
        this.a = j;
    }

    private native void internalClose(long j);

    public static native long nativeCreatePredicateEvaluator(byte[] bArr);

    private native Map<String, Integer> nativeGetMatchedPredicates(long j, List<String> list);

    public final synchronized enhk a(List list) {
        if (list.isEmpty()) {
            return enoz.a;
        }
        long j = this.a;
        if (j == 0) {
            throw new exdm();
        }
        return enhk.j(nativeGetMatchedPredicates(j, list));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        internalClose(this.a);
        this.a = 0L;
    }

    protected final void finalize() {
        close();
    }
}
