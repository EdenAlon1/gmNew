package defpackage;

import com.google.knowledge.hobbes.chat.common.PredictorResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class empm implements empf {
    private final emko a;
    private final excx b;
    private final double c;
    private final String d;
    private final enhk e;

    /* JADX WARN: Multi-variable type inference failed */
    public empm(emko emkoVar, emlo emloVar) {
        this.a = emkoVar;
        emjc emjcVar = emkoVar.c == 3 ? (emjc) emkoVar.d : emjc.a;
        int a = emjg.a(emjcVar.g);
        a = a == 0 ? 2 : a;
        emhv emhvVar = emjcVar.c;
        this.b = emloVar.b(a, emhvVar == null ? emhv.a : emhvVar);
        if (emjcVar.e.size() != 1) {
            ArrayList arrayList = new ArrayList(emjcVar.e.size());
            Iterator<E> it = emjcVar.e.iterator();
            while (it.hasNext()) {
                arrayList.add(((emjb) it.next()).c);
            }
            throw new emlq("TfLiteSensitiveClassifier: Expected only one task: ".concat(arrayList.toString()));
        }
        emjb emjbVar = (emjb) emjcVar.e.get(0);
        this.c = emjbVar.e;
        String str = emjbVar.c;
        this.d = str;
        this.e = enhk.l(str, Integer.valueOf(emjbVar.d));
    }

    @Override // defpackage.empf
    public final Set a(fbts fbtsVar) {
        List a = empb.a(fbtsVar, System.currentTimeMillis());
        int i = ((enou) a).c;
        if (i > this.a.e) {
            engr engrVar = new engr();
            for (int i2 = i - this.a.e; i2 < i; i2++) {
                engrVar.h((excz) a.get(i2));
            }
            a = engrVar.g();
        }
        exda exdaVar = new exda(a, null);
        new HashMap();
        try {
            Map<String, List<? extends PredictorResult.Prediction>> generatePredictions = this.b.generatePredictions(exdaVar, this.e);
            HashSet hashSet = new HashSet();
            if (generatePredictions.containsKey(this.d)) {
                Iterator<? extends PredictorResult.Prediction> it = generatePredictions.get(this.d).iterator();
                while (it.hasNext()) {
                    PredictorResult.TextPrediction textPrediction = (PredictorResult.TextPrediction) it.next();
                    if (textPrediction.score > this.c) {
                        String str = textPrediction.text;
                        if (!str.equals("NOT-SENSITIVE") && (this.a.f.size() == 0 || this.a.f.contains(str))) {
                            hashSet.add(textPrediction.text);
                        }
                    }
                }
            }
            return hashSet;
        } catch (Throwable th) {
            throw new emlq("TfLiteSensitiveClassifier: Exception/Error getting results from Predictor.", th);
        }
    }
}
