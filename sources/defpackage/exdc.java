package defpackage;

import android.net.Uri;
import com.google.knowledge.hobbes.chat.tflite.reranker.TfLiteReranker;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exdc {
    public static exdb a(Uri uri, Map map) {
        if (!map.containsKey("MaxSuggestions")) {
            throw new IllegalArgumentException("TFLITE-type reranker params must contain MaxSuggestions");
        }
        return new TfLiteReranker(TfLiteReranker.createFromUri(uri.toString()), ((Integer) map.get("MaxSuggestions")).intValue());
    }
}
