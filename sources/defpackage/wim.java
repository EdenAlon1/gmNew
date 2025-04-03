package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wim implements wik {
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final enru i;
    public final String j;
    private final ffbr k;
    private final ffbr l;
    private final ffbz m;

    public wim(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10) {
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        this.k = ffbrVar;
        this.a = ffbrVar2;
        this.b = ffbrVar3;
        this.c = ffbrVar4;
        this.d = ffbrVar5;
        this.e = ffbrVar6;
        this.f = ffbrVar7;
        this.g = ffbrVar8;
        this.h = ffbrVar9;
        this.l = ffbrVar10;
        this.i = enru.c("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/MagicComposeSensitiveClassifierImpl");
        this.m = ffca.a(new ffix() { // from class: wil
            @Override // defpackage.ffix
            public final Object invoke() {
                wim wimVar = wim.this;
                if (((ctis) wimVar.b.b()).a()) {
                    csli.b(wimVar.j);
                } else {
                    ((enrr) wimVar.i.i().h("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/MagicComposeSensitiveClassifierImpl", "sensitiveClassifier_delegate$lambda$0", 75, "MagicComposeSensitiveClassifierImpl.kt")).q("Failed to load hobbesTfLite");
                }
                emkm emkmVar = (emkm) emko.a.createBuilder();
                emkmVar.getClass();
                emix emixVar = (emix) emjc.a.createBuilder();
                emixVar.getClass();
                emhu emhuVar = (emhu) emhv.a.createBuilder();
                emhuVar.getClass();
                emhw emhwVar = (emhw) emhx.a.createBuilder();
                emhwVar.getClass();
                emhy.b((String) wimVar.c.b(), emhwVar);
                emhy.c((String) wimVar.d.b(), emhwVar);
                emht.b(emhy.a(emhwVar), emhuVar);
                emhv a = emht.a(emhuVar);
                emixVar.copyOnWrite();
                emjc emjcVar = (emjc) emixVar.instance;
                emjcVar.c = a;
                emjcVar.b |= 1;
                emixVar.copyOnWrite();
                emjc emjcVar2 = (emjc) emixVar.instance;
                emjcVar2.g = 2;
                emjcVar2.b |= 4;
                DesugarCollections.unmodifiableList(emjcVar2.e).getClass();
                emja emjaVar = (emja) emjb.a.createBuilder();
                emjaVar.getClass();
                double doubleValue = ((Number) wimVar.h.b()).doubleValue();
                emjaVar.copyOnWrite();
                emjb emjbVar = (emjb) emjaVar.instance;
                emjbVar.b |= 4;
                emjbVar.e = doubleValue;
                int longValue = (int) ((Number) wimVar.f.b()).longValue();
                emjaVar.copyOnWrite();
                emjb emjbVar2 = (emjb) emjaVar.instance;
                emjbVar2.b = 2 | emjbVar2.b;
                emjbVar2.d = longValue;
                String str = (String) wimVar.e.b();
                str.getClass();
                emjaVar.copyOnWrite();
                emjb emjbVar3 = (emjb) emjaVar.instance;
                emjbVar3.b |= 1;
                emjbVar3.c = str;
                eyfy build = emjaVar.build();
                build.getClass();
                emixVar.copyOnWrite();
                emjc emjcVar3 = (emjc) emixVar.instance;
                emjcVar3.a();
                emjcVar3.e.add((emjb) build);
                eyfy build2 = emixVar.build();
                build2.getClass();
                emkmVar.copyOnWrite();
                emko emkoVar = (emko) emkmVar.instance;
                emkoVar.d = (emjc) build2;
                emkoVar.c = 3;
                int longValue2 = (int) ((Number) wimVar.g.b()).longValue();
                emkmVar.copyOnWrite();
                emko emkoVar2 = (emko) emkmVar.instance;
                emkoVar2.b |= 1;
                emkoVar2.e = longValue2;
                eyfy build3 = emkmVar.build();
                build3.getClass();
                return new empm((emko) build3, new ctox((emmt) wimVar.a.b()));
            }
        });
        this.j = "sensitive_classifier_jni";
    }

    @Override // defpackage.wik
    public final boolean a(String str) {
        str.getClass();
        if (ffpc.J(str)) {
            return false;
        }
        fbum fbumVar = (fbum) fbun.a.createBuilder();
        fbumVar.getClass();
        fbumVar.copyOnWrite();
        ((fbun) fbumVar.instance).d = "0";
        long epochMilli = ((cqoh) this.k.b()).f().toEpochMilli() * 1000;
        fbumVar.copyOnWrite();
        ((fbun) fbumVar.instance).e = epochMilli;
        fbon.b(str, fbumVar);
        return b(ffdx.b(fbon.a(fbumVar)));
    }

    @Override // defpackage.wik
    public final boolean b(List list) {
        if (list.isEmpty()) {
            return false;
        }
        try {
            ((enrr) this.i.e().h("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/MagicComposeSensitiveClassifierImpl", "isSensitive", 90, "MagicComposeSensitiveClassifierImpl.kt")).q("Running sensitive classifier for Magic Compose.");
            empf empfVar = (empf) this.m.a();
            fbtr fbtrVar = (fbtr) fbts.b.createBuilder();
            fbtrVar.getClass();
            fbuo fbuoVar = (fbuo) fbup.a.createBuilder();
            fbuoVar.getClass();
            DesugarCollections.unmodifiableList(((fbup) fbuoVar.instance).b).getClass();
            fboo.b(list, fbuoVar);
            fbup a = fboo.a(fbuoVar);
            fbtrVar.copyOnWrite();
            fbts fbtsVar = (fbts) fbtrVar.instance;
            fbtsVar.f = a;
            fbtsVar.c |= 2;
            fbtrVar.copyOnWrite();
            ((fbts) fbtrVar.instance).g = "0";
            eyfy build = fbtrVar.build();
            build.getClass();
            return ffdx.at(empfVar.a((fbts) build));
        } catch (Throwable th) {
            ((enrr) ((enrr) this.i.i()).g(th).h("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/MagicComposeSensitiveClassifierImpl", "isSensitive", 93, "MagicComposeSensitiveClassifierImpl.kt")).q("Exception running sensitive classifier");
            if (!((Boolean) this.l.b()).booleanValue()) {
                return false;
            }
            if (th instanceof Exception) {
                throw th;
            }
            throw new Exception(th);
        }
    }
}
