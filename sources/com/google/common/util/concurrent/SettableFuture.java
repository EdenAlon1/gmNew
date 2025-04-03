package com.google.common.util.concurrent;

import defpackage.ernr;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class SettableFuture<V> extends ernr.i<V> {
    public static final /* synthetic */ int a = 0;

    private SettableFuture() {
    }

    public static <V> SettableFuture<V> create() {
        return new SettableFuture<>();
    }

    @Override // defpackage.ernr
    public boolean set(V v) {
        return super.set(v);
    }

    @Override // defpackage.ernr
    public boolean setException(Throwable th) {
        return super.setException(th);
    }
}
