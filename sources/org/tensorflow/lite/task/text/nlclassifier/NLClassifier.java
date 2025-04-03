package org.tensorflow.lite.task.text.nlclassifier;

import defpackage.fivu;
import java.nio.ByteBuffer;
import java.util.List;
import org.tensorflow.lite.support.label.Category;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class NLClassifier extends fivu {
    public static final /* synthetic */ int b = 0;

    /* compiled from: PG */
    public static abstract class NLClassifierOptions {
        public abstract void a();

        public abstract int getInputTensorIndex();

        public abstract String getInputTensorName();

        public abstract int getOutputLabelTensorIndex();

        public abstract String getOutputLabelTensorName();

        public abstract int getOutputScoreTensorIndex();

        public abstract String getOutputScoreTensorName();
    }

    public NLClassifier(long j) {
        super(j);
    }

    public static native List<Category> classifyNative(long j, String str);

    private native void deinitJni(long j);

    public static native long initJniWithByteBuffer(NLClassifierOptions nLClassifierOptions, ByteBuffer byteBuffer, long j);

    @Override // defpackage.fivu
    protected final void a(long j) {
        deinitJni(j);
    }
}
