package defpackage;

import com.google.knowledge.hobbes.chat.common.PredictorResult;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emrc {
    public static final enru a = enru.c("com/google/chat/smartmessaging/smartreply/android/templating/Templater");
    public static final emqv b;
    public static final emqv c;
    public static final emqv d;
    public static final emqv e;
    public final engy f;
    public final emqq g;
    public final boolean h;
    public final boolean i;

    static {
        emqu emquVar = (emqu) emqv.a.createBuilder();
        fbri fbriVar = fbri.FULL_MESSAGE;
        emquVar.copyOnWrite();
        emqv emqvVar = (emqv) emquVar.instance;
        emqvVar.c = fbriVar.a();
        emqvVar.b |= 1;
        emquVar.copyOnWrite();
        emqv emqvVar2 = (emqv) emquVar.instance;
        emqvVar2.h = fbrl.a(3);
        emqvVar2.b |= 8;
        emquVar.a(PredictorResult.Types.REPLY_SUGGESTION);
        b = (emqv) emquVar.build();
        emqu emquVar2 = (emqu) emqv.a.createBuilder();
        fbri fbriVar2 = fbri.SPAM;
        emquVar2.copyOnWrite();
        emqv emqvVar3 = (emqv) emquVar2.instance;
        emqvVar3.c = fbriVar2.a();
        emqvVar3.b |= 1;
        emquVar2.copyOnWrite();
        emqv emqvVar4 = (emqv) emquVar2.instance;
        emqvVar4.h = fbrl.a(3);
        emqvVar4.b |= 8;
        emquVar2.a("SPAM");
        c = (emqv) emquVar2.build();
        emqu emquVar3 = (emqu) emqv.a.createBuilder();
        fbri fbriVar3 = fbri.CATEGORY_BERT;
        emquVar3.copyOnWrite();
        emqv emqvVar5 = (emqv) emquVar3.instance;
        emqvVar5.c = fbriVar3.a();
        emqvVar5.b |= 1;
        emquVar3.copyOnWrite();
        emqv emqvVar6 = (emqv) emquVar3.instance;
        emqvVar6.h = fbrl.a(3);
        emqvVar6.b |= 8;
        emquVar3.a("CATEGORY_BERT");
        d = (emqv) emquVar3.build();
        emqu emquVar4 = (emqu) emqv.a.createBuilder();
        fbri fbriVar4 = fbri.CATEGORY_BERT;
        emquVar4.copyOnWrite();
        emqv emqvVar7 = (emqv) emquVar4.instance;
        emqvVar7.c = fbriVar4.a();
        emqvVar7.b |= 1;
        emquVar4.copyOnWrite();
        emqv emqvVar8 = (emqv) emquVar4.instance;
        emqvVar8.h = fbrl.a(4);
        emqvVar8.b |= 8;
        emquVar4.a("CATEGORY_BERT");
        e = (emqv) emquVar4.build();
    }

    public emrc(emqq emqqVar, engy engyVar, boolean z, boolean z2) {
        this.g = emqqVar;
        this.f = engyVar;
        this.h = z;
        this.i = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static engw a(engw engwVar) {
        engr engrVar = new engr();
        for (int i = 0; i < ((enou) engwVar).c; i++) {
            emnh emnhVar = (emnh) engwVar.get(i);
            if (!emnhVar.e().isEmpty()) {
                fbtm fbtmVar = (fbtm) fbtn.a.createBuilder();
                String e2 = emnhVar.e();
                fbtmVar.copyOnWrite();
                ((fbtn) fbtmVar.instance).b = e2;
                engrVar.h((fbtn) fbtmVar.build());
            }
        }
        return engrVar.g();
    }

    public static fbwx b(emnj emnjVar, emra emraVar, fbri fbriVar) {
        fbxj fbxjVar = (fbxj) fbxk.a.createBuilder();
        emqa emqaVar = (emqa) emraVar;
        Optional optional = emqaVar.c;
        if (optional.isPresent()) {
            Object obj = optional.get();
            fbxjVar.copyOnWrite();
            ((fbxk) fbxjVar.instance).c = (String) obj;
        }
        Optional optional2 = emqaVar.d;
        if (optional2.isPresent()) {
            Object obj2 = optional2.get();
            fbxjVar.copyOnWrite();
            ((fbxk) fbxjVar.instance).d = (String) obj2;
        }
        Optional optional3 = emqaVar.e;
        if (optional3.isPresent()) {
            fbvo fbvoVar = (fbvo) fbvp.a.createBuilder();
            long longValue = ((Long) optional3.get()).longValue();
            fbvoVar.copyOnWrite();
            ((fbvp) fbvoVar.instance).b = longValue;
            fbxjVar.copyOnWrite();
            fbxk fbxkVar = (fbxk) fbxjVar.instance;
            fbvp fbvpVar = (fbvp) fbvoVar.build();
            fbvpVar.getClass();
            fbxkVar.e = fbvpVar;
            fbxkVar.b |= 1;
        }
        fbwx c2 = c(emnjVar, fbriVar, emqaVar.f);
        c2.copyOnWrite();
        fbwy fbwyVar = (fbwy) c2.instance;
        fbxk fbxkVar2 = (fbxk) fbxjVar.build();
        eygj eygjVar = fbwy.a;
        fbxkVar2.getClass();
        fbwyVar.j = fbxkVar2;
        fbwyVar.c |= 2;
        return c2;
    }

    public static fbwx c(emnj emnjVar, fbri fbriVar, Optional optional) {
        fbwx fbwxVar = (fbwx) fbwy.b.createBuilder();
        float floatValue = optional.isPresent() ? ((Float) optional.get()).floatValue() : emnjVar.a();
        fbwxVar.copyOnWrite();
        ((fbwy) fbwxVar.instance).f = floatValue;
        fbub fbubVar = (fbub) fbuc.a.createBuilder();
        String d2 = emnjVar.d();
        fbubVar.copyOnWrite();
        ((fbuc) fbubVar.instance).b = d2;
        fbubVar.a(a(emnjVar.b()));
        fbwxVar.copyOnWrite();
        fbwy fbwyVar = (fbwy) fbwxVar.instance;
        fbuc fbucVar = (fbuc) fbubVar.build();
        fbucVar.getClass();
        fbwyVar.i = fbucVar;
        fbwyVar.c |= 1;
        fbrg c2 = emnjVar.c();
        fbwxVar.copyOnWrite();
        ((fbwy) fbwxVar.instance).g = c2.a();
        fbwxVar.copyOnWrite();
        ((fbwy) fbwxVar.instance).l = fbriVar.a();
        return fbwxVar;
    }
}
