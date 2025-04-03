package defpackage;

import com.google.knowledge.hobbes.chat.common.PredictorResult;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emno implements emnk {
    private final emlu a;
    private final enhk b;
    private final enhk c;
    private final enhk d;
    private final int e;
    private final boolean f;
    private final int g;

    public emno(emlu emluVar, enhk enhkVar, enhk enhkVar2, enhk enhkVar3, int i, boolean z, int i2) {
        this.a = emluVar;
        this.b = enhkVar;
        this.c = enhkVar2;
        this.d = enhkVar3;
        this.e = i;
        this.g = i2;
        this.f = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.emnk
    public final engw a(fbup fbupVar, String str, emrk emrkVar) {
        fbup fbupVar2 = fbupVar;
        if (fbupVar2 == null) {
            throw new emlq("LinguaModel: MessageStream is null.");
        }
        try {
            emlt a = this.a.a();
            try {
                excx excxVar = (excx) a.a();
                if (excxVar == null) {
                    throw new emlq("LinguaModel: predictor is null.");
                }
                int i = this.g;
                if (i > 0) {
                    int size = fbupVar2.b.size();
                    fbuo fbuoVar = (fbuo) fbupVar2.toBuilder();
                    fbuoVar.copyOnWrite();
                    ((fbup) fbuoVar.instance).b = fbup.emptyProtobufList();
                    fbuoVar.a(fbupVar2.b.subList(Math.max(size - i, 0), size));
                    fbupVar2 = (fbup) fbuoVar.build();
                }
                eygr eygrVar = fbupVar2.b;
                if (!eygrVar.isEmpty()) {
                    fbun fbunVar = (fbun) eygrVar.get(eygrVar.size() - 1);
                    int i2 = 30;
                    if (!(fbunVar.b == 30 ? (String) fbunVar.c : "").isEmpty()) {
                        List b = emnp.b(fbupVar2.b, str, System.currentTimeMillis() / 1000.0f);
                        enhd enhdVar = new enhd();
                        enhdVar.g(this.d);
                        if (this.f) {
                            enhd enhdVar2 = new enhd();
                            for (emri emriVar : emrkVar.b) {
                                String str2 = emriVar.b;
                                if (str2.startsWith("SPToken_")) {
                                    enhdVar2.k(Integer.valueOf(Integer.parseInt(str2.substring(8))), Float.valueOf(emriVar.c));
                                }
                            }
                            enhk c = enhdVar2.c();
                            int i3 = ((enoz) c).d;
                            int[] iArr = new int[i3];
                            float[] fArr = new float[i3];
                            enqu listIterator = c.entrySet().listIterator();
                            int i4 = 0;
                            while (listIterator.hasNext()) {
                                Map.Entry entry = (Map.Entry) listIterator.next();
                                iArr[i4] = ((Integer) entry.getKey()).intValue();
                                fArr[i4] = ((Float) entry.getValue()).floatValue();
                                i4++;
                            }
                            enhdVar.g(enhk.m("user_profile_token_index", iArr, "user_profile_token_weight", fArr));
                        }
                        Map<String, List<? extends PredictorResult.Prediction>> generatePredictions = excxVar.generatePredictions(new exda(b, enhdVar.c()), this.b);
                        a.close();
                        int c2 = emlr.c(fbupVar2, str);
                        if (generatePredictions == null) {
                            int i5 = engw.d;
                            return enou.a;
                        }
                        int i6 = engw.d;
                        engr engrVar = new engr();
                        int max = Math.max(0, eygrVar.size() - this.e);
                        while (max < eygrVar.size()) {
                            fbun fbunVar2 = (fbun) eygrVar.get(max);
                            for (fbuk fbukVar : fbunVar2.f) {
                                int i7 = fbukVar.c;
                                if (i7 == 6) {
                                    emng h = emnh.h();
                                    h.h(fbukVar.c == 6 ? (fbsk) fbukVar.d : fbsk.a);
                                    h.f((fbunVar2.b == i2 ? (String) fbunVar2.c : "").substring(fbukVar.h, fbukVar.i));
                                    engrVar.h(h.a());
                                } else if (i7 == 9) {
                                    emng h2 = emnh.h();
                                    h2.e((fbukVar.c == 9 ? (fbxy) fbukVar.d : fbxy.a).c);
                                    h2.f((fbunVar2.b == i2 ? (String) fbunVar2.c : "").substring(fbukVar.h, fbukVar.i));
                                    h2.d((fbukVar.c == 9 ? (fbxy) fbukVar.d : fbxy.a).d);
                                    engrVar.h(h2.a());
                                    i2 = 30;
                                }
                            }
                            max++;
                            i2 = 30;
                        }
                        engw g = engrVar.g();
                        engr engrVar2 = new engr();
                        for (String str3 : generatePredictions.keySet()) {
                            if (!generatePredictions.get(str3).isEmpty() && this.b.containsKey(str3) && ((Integer) this.b.get(str3)).intValue() > 0) {
                                if (generatePredictions.get(str3).get(0) instanceof PredictorResult.BooleanPrediction) {
                                    PredictorResult.BooleanPrediction booleanPrediction = (PredictorResult.BooleanPrediction) generatePredictions.get(str3).get(0);
                                    if (booleanPrediction.indicator && (!this.c.containsKey(str3) || booleanPrediction.score >= ((Double) this.c.get(str3)).doubleValue())) {
                                        emni f = emnj.f();
                                        f.c(str3);
                                        f.d(booleanPrediction.score);
                                        f.b(g);
                                        f.e(fbrg.MULTI_TASK);
                                        engrVar2.h(f.a());
                                    }
                                } else if (c2 != 4 || generatePredictions.containsKey("EMOTION_COMPLETE") || generatePredictions.containsKey("BUSINESS_MESSAGE")) {
                                    for (PredictorResult.Prediction prediction : generatePredictions.get(str3)) {
                                        boolean e = emuz.e(str3, "BUSINESS_MESSAGE");
                                        PredictorResult.TextPrediction textPrediction = (PredictorResult.TextPrediction) prediction;
                                        String str4 = e ? textPrediction.text : str3;
                                        if (!this.c.containsKey(str4) || prediction.score >= ((Double) this.c.get(str4)).doubleValue()) {
                                            emni f2 = emnj.f();
                                            f2.c(str4);
                                            f2.d(textPrediction.score);
                                            f2.e(fbrg.MULTI_TASK);
                                            if (!e) {
                                                f2.f(textPrediction.text);
                                                emng h3 = emnh.h();
                                                h3.g(textPrediction.text);
                                                emnh a2 = h3.a();
                                                String valueOf = String.valueOf(str3);
                                                emng h4 = emnh.h();
                                                h4.g(valueOf.concat("_ENTITY"));
                                                h4.f(textPrediction.text);
                                                f2.b(engw.s(a2, h4.a()));
                                            }
                                            engrVar2.h(f2.a());
                                        }
                                    }
                                }
                            }
                        }
                        return engrVar2.g();
                    }
                }
                int i8 = engw.d;
                engw engwVar = enou.a;
                a.close();
                return engwVar;
            } finally {
            }
        } catch (Throwable th) {
            throw new emlq("LinguaModel: Exception/Error getting interpretations from Predictor.", th);
        }
    }

    @Override // defpackage.emnk
    public final void b() {
        this.a.b();
    }
}
