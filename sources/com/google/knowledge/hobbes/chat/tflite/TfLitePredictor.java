package com.google.knowledge.hobbes.chat.tflite;

import com.google.knowledge.hobbes.chat.common.PredictorResult;
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
public class TfLitePredictor implements excx {
    public static final /* synthetic */ int b = 0;
    long a;

    static {
        engw.r(PredictorResult.Types.REPLY_SUGGESTION);
    }

    public TfLitePredictor(long j) {
        this.a = j;
    }

    public static native long createFromUri(String str);

    private native void internalClose(long j);

    private native Map<String, List<? extends PredictorResult.Prediction>> runGraph(long j, List<String> list, List<Integer> list2, List<Integer> list3, Map<String, Integer> map, Map<String, Object> map2);

    @Override // defpackage.excx
    public final synchronized void close() {
        internalClose(this.a);
        this.a = 0L;
    }

    protected final void finalize() {
        close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.excx
    public final synchronized Map<String, List<? extends PredictorResult.Prediction>> generatePredictions(exda exdaVar, Map<String, Integer> map) {
        Throwable th;
        try {
            try {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                enqv it = ((engw) exdaVar.a).iterator();
                while (it.hasNext()) {
                    try {
                        excz exczVar = (excz) it.next();
                        arrayList.add(exczVar.a);
                        arrayList2.add(Integer.valueOf(exczVar.b));
                        arrayList3.add(Float.valueOf(exczVar.c));
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                int size = arrayList3.size();
                for (int i = 0; i < size; i++) {
                    arrayList4.add(Integer.valueOf((int) ((Float) arrayList3.get(i)).floatValue()));
                }
                Map<String, Object> map2 = exdaVar.b;
                long j = this.a;
                if (j == 0) {
                    throw new IllegalStateException("Predictor state uninitialized.");
                }
                return exdj.a(runGraph(j, arrayList, arrayList2, arrayList4, map, map2), map);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    @Override // defpackage.excx
    public final /* synthetic */ void onTrimMemory() {
    }
}
