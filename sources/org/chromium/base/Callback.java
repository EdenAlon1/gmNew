package org.chromium.base;

import j$.util.Optional;

/* compiled from: PG */
@FunctionalInterface
/* loaded from: classes6.dex */
public interface Callback<T> {

    /* compiled from: PG */
    public final class Helper {
        static void onBooleanResultFromNative(Callback callback, boolean z) {
            callback.a();
        }

        static void onIntResultFromNative(Callback callback, int i) {
            callback.a();
        }

        static void onLongResultFromNative(Callback callback, long j) {
            callback.a();
        }

        static void onObjectResultFromNative(Callback callback, Object obj) {
            callback.a();
        }

        static void onOptionalStringResultFromNative(Callback<Optional<String>> callback, boolean z, String str) {
            if (z) {
                Optional.of(str);
            } else {
                Optional.empty();
            }
            callback.a();
        }

        static void onTimeResultFromNative(Callback callback, long j) {
            callback.a();
        }

        static void runRunnable(Runnable runnable) {
            runnable.run();
        }
    }

    void a();
}
