package defpackage;

import android.util.SparseArray;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbrs extends dhwb {
    public final RecognitionOptions a;
    public final SparseArray b;

    public dbrs() {
        RecognitionOptions recognitionOptions = new RecognitionOptions();
        this.a = recognitionOptions;
        this.b = new SparseArray();
        recognitionOptions.setBarcodeFormats(256);
    }
}
