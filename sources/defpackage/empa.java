package defpackage;

import com.google.knowledge.hobbes.chat.common.PredictorResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class empa implements empj {
    private final excx a;
    private final emiu b;

    public empa(emiu emiuVar, emlo emloVar) {
        if (emiuVar == null) {
            throw new emlq("HobbesChatJniAdapter: config is null.");
        }
        this.b = emiuVar;
        if ((emiuVar.b & 1) == 0) {
            throw new emlq("HobbesChatJniAdapter: cannot initialize without a model file.");
        }
        int a = emjg.a(emiuVar.f);
        a = a == 0 ? 2 : a;
        emhv emhvVar = emiuVar.c;
        this.a = emloVar.b(a, emhvVar == null ? emhv.a : emhvVar);
    }

    @Override // defpackage.empj
    public final ArrayList a(fbts fbtsVar, Locale locale) {
        fbup fbupVar = fbtsVar.f;
        if (fbupVar == null) {
            fbupVar = fbup.a;
        }
        eygr eygrVar = fbupVar.b;
        if (!eygrVar.isEmpty()) {
            fbun fbunVar = (fbun) enjk.j(eygrVar);
            if (!(fbunVar.b == 30 ? (String) fbunVar.c : "").isEmpty() && !fbtsVar.g.equals(((fbun) enjk.j(eygrVar)).d)) {
                List a = empb.a(fbtsVar, System.currentTimeMillis());
                emiu emiuVar = this.b;
                int i = (emiuVar.b & 2) != 0 ? fbtsVar.h * emiuVar.e : fbtsVar.h;
                HashMap hashMap = new HashMap();
                for (emit emitVar : emiuVar.d) {
                    if (emitVar.b == 2) {
                        String str = emitVar.d;
                        Integer num = (Integer) emitVar.c;
                        num.intValue();
                        hashMap.put(str, num);
                    }
                    if (emitVar.b == 3) {
                        String str2 = emitVar.d;
                        Float f = (Float) emitVar.c;
                        f.floatValue();
                        hashMap.put(str2, f);
                    }
                    if (emitVar.b == 4) {
                        String str3 = emitVar.d;
                        Boolean bool = (Boolean) emitVar.c;
                        bool.booleanValue();
                        hashMap.put(str3, bool);
                    }
                }
                try {
                    Map<String, List<? extends PredictorResult.Prediction>> generatePredictions = this.a.generatePredictions(new exda(a, hashMap), enhk.l(PredictorResult.Types.REPLY_SUGGESTION, Integer.valueOf(i)));
                    ArrayList arrayList = new ArrayList();
                    if (generatePredictions != null) {
                        for (String str4 : generatePredictions.keySet()) {
                            for (PredictorResult.Prediction prediction : generatePredictions.get(str4)) {
                                if (str4.equals(PredictorResult.Types.REPLY_SUGGESTION)) {
                                    PredictorResult.TextPrediction textPrediction = (PredictorResult.TextPrediction) prediction;
                                    fbwz fbwzVar = (fbwz) fbxa.a.createBuilder();
                                    fbxb fbxbVar = (fbxb) fbxc.a.createBuilder();
                                    String str5 = textPrediction.text;
                                    fbxbVar.copyOnWrite();
                                    fbxc fbxcVar = (fbxc) fbxbVar.instance;
                                    str5.getClass();
                                    fbxcVar.c = str5;
                                    fbwzVar.copyOnWrite();
                                    fbxa fbxaVar = (fbxa) fbwzVar.instance;
                                    fbxc fbxcVar2 = (fbxc) fbxbVar.build();
                                    fbxcVar2.getClass();
                                    fbxaVar.d = fbxcVar2;
                                    fbxaVar.c = 2;
                                    fbwx fbwxVar = (fbwx) fbwy.b.createBuilder();
                                    float f2 = textPrediction.score;
                                    fbwxVar.copyOnWrite();
                                    ((fbwy) fbwxVar.instance).f = f2;
                                    fbrg fbrgVar = fbrg.HOBBES_CHAT_ON_DEVICE;
                                    fbwxVar.copyOnWrite();
                                    ((fbwy) fbwxVar.instance).g = fbrgVar.a();
                                    fbri fbriVar = fbri.FULL_MESSAGE;
                                    fbwxVar.copyOnWrite();
                                    ((fbwy) fbwxVar.instance).l = fbriVar.a();
                                    fbwzVar.copyOnWrite();
                                    fbxa fbxaVar2 = (fbxa) fbwzVar.instance;
                                    fbwy fbwyVar = (fbwy) fbwxVar.build();
                                    fbwyVar.getClass();
                                    fbxaVar2.e = fbwyVar;
                                    fbxaVar2.b |= 1;
                                    arrayList.add((fbxa) fbwzVar.build());
                                }
                            }
                        }
                    }
                    return arrayList;
                } catch (Throwable th) {
                    throw new emlq("HobbesChatJniAdapter: Exception/Error getting suggestions from HobbesChatJni.", th);
                }
            }
        }
        return new ArrayList();
    }

    @Override // defpackage.empj
    public final /* synthetic */ void b() {
    }
}
