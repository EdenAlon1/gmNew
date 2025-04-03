package com.google.knowledge.cerebra.sense.textclassifier.lib3;

import defpackage.ewvj;
import defpackage.ewvk;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class DocumentsAnnotatorModel implements Closeable {
    private final AtomicBoolean a = new AtomicBoolean(false);
    private long b;

    /* compiled from: PG */
    public static final class DocumentsAnnotatorRequest {
        public TextBlock[] getTextBlocks() {
            throw null;
        }

        public String getType() {
            throw null;
        }

        public boolean getVerifyCheckSums() {
            throw null;
        }
    }

    /* compiled from: PG */
    public static final class DocumentsAnnotatorResponse {
        public float getConfidenceScore() {
            throw null;
        }

        public byte[] getSerializedDocumentData() {
            throw null;
        }

        public String getType() {
            throw null;
        }
    }

    /* compiled from: PG */
    public static final class TextBlock {
        public ewvj[] getLines() {
            throw null;
        }
    }

    static {
        ewvk.a();
    }

    public DocumentsAnnotatorModel() {
        long nativeNewDocumentsAnnotator = nativeNewDocumentsAnnotator();
        this.b = nativeNewDocumentsAnnotator;
        if (nativeNewDocumentsAnnotator == 0) {
            throw new IllegalArgumentException("Couldn't initialize Documents annotator.");
        }
    }

    private native void nativeCloseDocumentsAnnotator(long j);

    private static native long nativeNewDocumentsAnnotator();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.a.compareAndSet(false, true)) {
            nativeCloseDocumentsAnnotator(this.b);
            this.b = 0L;
        }
    }

    protected final void finalize() {
        try {
            close();
        } finally {
            super.finalize();
        }
    }
}
