package defpackage;

import org.tensorflow.lite.task.text.nlclassifier.NLClassifier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fivw extends NLClassifier.NLClassifierOptions {
    private final String a = "INPUT";
    private final String b = "OUTPUT_SCORE";
    private final String c = "OUTPUT_LABEL";

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NLClassifier.NLClassifierOptions) {
            NLClassifier.NLClassifierOptions nLClassifierOptions = (NLClassifier.NLClassifierOptions) obj;
            if (nLClassifierOptions.getInputTensorIndex() == 0 && nLClassifierOptions.getOutputScoreTensorIndex() == 0 && nLClassifierOptions.getOutputLabelTensorIndex() == -1 && this.a.equals(nLClassifierOptions.getInputTensorName()) && this.b.equals(nLClassifierOptions.getOutputScoreTensorName()) && this.c.equals(nLClassifierOptions.getOutputLabelTensorName())) {
                nLClassifierOptions.a();
                return true;
            }
        }
        return false;
    }

    @Override // org.tensorflow.lite.task.text.nlclassifier.NLClassifier.NLClassifierOptions
    public int getInputTensorIndex() {
        return 0;
    }

    @Override // org.tensorflow.lite.task.text.nlclassifier.NLClassifier.NLClassifierOptions
    public String getInputTensorName() {
        return this.a;
    }

    @Override // org.tensorflow.lite.task.text.nlclassifier.NLClassifier.NLClassifierOptions
    public int getOutputLabelTensorIndex() {
        return -1;
    }

    @Override // org.tensorflow.lite.task.text.nlclassifier.NLClassifier.NLClassifierOptions
    public String getOutputLabelTensorName() {
        return this.c;
    }

    @Override // org.tensorflow.lite.task.text.nlclassifier.NLClassifier.NLClassifierOptions
    public int getOutputScoreTensorIndex() {
        return 0;
    }

    @Override // org.tensorflow.lite.task.text.nlclassifier.NLClassifier.NLClassifierOptions
    public String getOutputScoreTensorName() {
        return this.b;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() ^ (-1526764948)) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
    }

    public final String toString() {
        return "NLClassifierOptions{inputTensorIndex=0, outputScoreTensorIndex=0, outputLabelTensorIndex=-1, inputTensorName=" + this.a + ", outputScoreTensorName=" + this.b + ", outputLabelTensorName=" + this.c + ", baseOptions=null}";
    }

    @Override // org.tensorflow.lite.task.text.nlclassifier.NLClassifier.NLClassifierOptions
    public final void a() {
    }
}
