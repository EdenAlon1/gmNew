package com.google.knowledge.hobbes.chat.jni;

import com.google.knowledge.hobbes.chat.common.PredictorResult;
import com.google.knowledge.hobbes.chat.jni.JniPredictor;
import defpackage.emyl;
import defpackage.engw;
import defpackage.enqv;
import defpackage.excx;
import defpackage.excz;
import defpackage.exda;
import defpackage.exdj;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class JniPredictor implements excx {
    public static final /* synthetic */ int a = 0;
    static String[] predictionTypes = {PredictorResult.Types.REPLY_SUGGESTION};
    private boolean closeRequested;
    private final String modelUri;
    private int ongoingRunCounter;
    private long tfSession;

    private JniPredictor(emyl<String> emylVar) {
        this.tfSession = 0L;
        this.ongoingRunCounter = 0;
        this.closeRequested = false;
        String str = emylVar.get();
        this.modelUri = str;
        this.tfSession = createFromUri(str);
    }

    public static JniPredictor createFromSerializedURI(final String str) {
        return new JniPredictor((emyl<String>) new emyl() { // from class: exdl
            @Override // defpackage.emyl
            public final Object get() {
                int i = JniPredictor.a;
                return str;
            }
        });
    }

    private native long createFromUri(String str);

    private native void internalClose();

    private synchronized void onPostRun() {
        int i = this.ongoingRunCounter - 1;
        this.ongoingRunCounter = i;
        if (i == 0 && this.closeRequested) {
            this.closeRequested = false;
            close();
        }
    }

    private native Map<String, List<? extends PredictorResult.Prediction>> runGraph(List<String> list, List<Integer> list2, List<Float> list3, int i, Map<String, Object> map);

    @Override // defpackage.excx
    public synchronized void close() {
        internalClose();
        this.tfSession = 0L;
    }

    protected void finalize() {
        close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.excx
    public Map<String, List<? extends PredictorResult.Prediction>> generatePredictions(exda exdaVar, Map<String, Integer> map) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        enqv it = ((engw) exdaVar.a).iterator();
        while (it.hasNext()) {
            excz exczVar = (excz) it.next();
            arrayList.add(exczVar.a);
            arrayList2.add(Integer.valueOf(exczVar.b));
            arrayList3.add(Float.valueOf(exczVar.c));
        }
        int intValue = map.containsKey(PredictorResult.Types.REPLY_SUGGESTION) ? map.get(PredictorResult.Types.REPLY_SUGGESTION).intValue() : 0;
        Map<String, Object> map2 = exdaVar.b;
        Integer.valueOf(intValue).getClass();
        return exdj.a(runGraphWrapper(arrayList, arrayList2, arrayList3, intValue, map2), map);
    }

    public List<? extends PredictorResult.Prediction> generateSuggestions(List<String> list, List<Integer> list2, List<Float> list3, int i, Map<String, Object> map) {
        return runGraphWrapper(list, list2, list3, i, map).get(PredictorResult.Types.REPLY_SUGGESTION);
    }

    public synchronized boolean isClosed() {
        return this.tfSession == 0;
    }

    public synchronized void onPreRun() {
        if (isClosed()) {
            this.tfSession = createFromUri(this.modelUri);
        }
        this.ongoingRunCounter++;
    }

    @Override // defpackage.excx
    public synchronized void onTrimMemory() {
        if (isClosed()) {
            return;
        }
        if (this.ongoingRunCounter == 0) {
            close();
        } else {
            this.closeRequested = true;
        }
    }

    public Map<String, List<? extends PredictorResult.Prediction>> runGraphWrapper(List<String> list, List<Integer> list2, List<Float> list3, int i, Map<String, Object> map) {
        onPreRun();
        try {
            return runGraph(list, list2, list3, i, map);
        } finally {
            onPostRun();
        }
    }

    public String[] supportedPredictionTypes() {
        return predictionTypes;
    }

    @Deprecated
    public JniPredictor(final String str) {
        this((emyl<String>) new emyl() { // from class: exdk
            @Override // defpackage.emyl
            public final Object get() {
                String concat;
                concat = "file:".concat(String.valueOf(str));
                return concat;
            }
        });
    }

    static /* synthetic */ String lambda$createFromSerializedURI$0(String str) {
        return str;
    }
}
