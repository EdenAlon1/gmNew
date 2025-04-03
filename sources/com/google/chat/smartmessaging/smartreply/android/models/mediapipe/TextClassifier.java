package com.google.chat.smartmessaging.smartreply.android.models.mediapipe;

import defpackage.enrr;
import defpackage.enru;
import defpackage.exnq;
import defpackage.exod;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class TextClassifier implements AutoCloseable, exnq {
    public static final List a = DesugarCollections.unmodifiableList(Arrays.asList("TEXT:text_in"));
    public static final List b = DesugarCollections.unmodifiableList(Arrays.asList("CLASSIFICATIONS:classifications_out"));
    private static final enru d = enru.c("com/google/chat/smartmessaging/smartreply/android/models/mediapipe/TextClassifier");
    public final exod c;

    public TextClassifier(exod exodVar) {
        this.c = exodVar;
    }

    @Override // defpackage.exnq
    public final void a(RuntimeException runtimeException) {
        ((enrr) ((enrr) ((enrr) d.i()).g(runtimeException)).h("com/google/chat/smartmessaging/smartreply/android/models/mediapipe/TextClassifier", "onError", 207, "TextClassifier.java")).o();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        exod exodVar = this.c;
        exodVar.c = this;
        exodVar.close();
    }
}
