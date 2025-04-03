package com.google.knowledge.cerebra.sense.textclassifier.lib3;

import defpackage.ewvk;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class GuardedNativeModels implements Closeable {
    private long a = nativeNewGuardedModels();

    static {
        ewvk.a();
    }

    private static native void nativeClose(long j);

    private static native long nativeNewGuardedModels();

    private static native void nativeSetActionsSuggestions(long j, long j2);

    private static native void nativeSetAnnotator(long j, long j2);

    private static native void nativeSetLangId(long j, long j2);

    public final synchronized long a() {
        return this.a;
    }

    public final synchronized void b(ActionsSuggestionsModel actionsSuggestionsModel) {
        long j = this.a;
        if (j == 0) {
            return;
        }
        nativeSetActionsSuggestions(j, actionsSuggestionsModel != null ? actionsSuggestionsModel.nativeGetNativeModelPtr(actionsSuggestionsModel.a) : 0L);
    }

    public final synchronized void c(AnnotatorModel annotatorModel) {
        long j = this.a;
        if (j == 0) {
            return;
        }
        nativeSetAnnotator(j, annotatorModel.a());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        long j = this.a;
        if (j == 0) {
            return;
        }
        nativeClose(j);
        this.a = 0L;
    }

    public final synchronized void d(LangIdModel langIdModel) {
        long j = this.a;
        if (j == 0) {
            return;
        }
        nativeSetLangId(j, langIdModel != null ? langIdModel.a : 0L);
    }
}
