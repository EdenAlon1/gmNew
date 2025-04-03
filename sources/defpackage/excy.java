package defpackage;

import android.net.Uri;
import com.google.knowledge.hobbes.chat.jni.JniPredictor;
import com.google.knowledge.hobbes.chat.tflite.TfLitePredictor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class excy {
    public static excx a(int i, Uri uri) {
        if (uri == null || uri.equals(Uri.EMPTY)) {
            throw new IllegalArgumentException("Cannot load empty Uri");
        }
        if (i - 1 == 0) {
            return JniPredictor.createFromSerializedURI(uri.toString());
        }
        String uri2 = uri.toString();
        int i2 = TfLitePredictor.b;
        if (emxe.c(uri2)) {
            throw new IllegalArgumentException("Model Uri must be specified.");
        }
        return new TfLitePredictor(TfLitePredictor.createFromUri(uri2));
    }
}
