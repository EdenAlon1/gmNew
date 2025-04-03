package defpackage;

import com.google.knowledge.hobbes.chat.common.PredictorResult;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface excx {
    void close();

    Map<String, List<? extends PredictorResult.Prediction>> generatePredictions(exda exdaVar, Map<String, Integer> map);

    void onTrimMemory();
}
