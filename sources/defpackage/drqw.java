package defpackage;

import j$.util.DesugarCollections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drqw {
    public static final drqr a(drlh drlhVar) {
        drqq drqqVar;
        drlhVar.getClass();
        drqo drqoVar = (drqo) drqr.a.createBuilder();
        drqoVar.getClass();
        drme n = drlhVar.n();
        n.getClass();
        int ordinal = n.ordinal();
        if (ordinal == 0) {
            drqqVar = drqq.VERY_LOW;
        } else if (ordinal == 1) {
            drqqVar = drqq.LOW;
        } else if (ordinal == 2) {
            drqqVar = drqq.HIGH;
        } else {
            if (ordinal != 3) {
                throw new ffcd();
            }
            drqqVar = drqq.ORIGINAL;
        }
        drqqVar.getClass();
        drqoVar.copyOnWrite();
        drqr drqrVar = (drqr) drqoVar.instance;
        drqrVar.c = drqqVar.a();
        drqrVar.b |= 1;
        String a = drlhVar.l().c().a();
        a.getClass();
        drqoVar.copyOnWrite();
        drqr drqrVar2 = (drqr) drqoVar.instance;
        drqrVar2.b = 2 | drqrVar2.b;
        drqrVar2.d = a;
        String f = drlhVar.f();
        drqoVar.copyOnWrite();
        drqr drqrVar3 = (drqr) drqoVar.instance;
        drqrVar3.b |= 4;
        drqrVar3.e = f;
        if (drlhVar instanceof drlg) {
            drlg drlgVar = (drlg) drlhVar;
            int i = drlgVar.i();
            drqoVar.copyOnWrite();
            drqr drqrVar4 = (drqr) drqoVar.instance;
            drqrVar4.b |= 8;
            drqrVar4.g = i;
            int h = drlgVar.h();
            drqoVar.copyOnWrite();
            drqr drqrVar5 = (drqr) drqoVar.instance;
            drqrVar5.b |= 16;
            drqrVar5.h = h;
        }
        long a2 = drlhVar.a();
        drqoVar.copyOnWrite();
        drqr drqrVar6 = (drqr) drqoVar.instance;
        drqrVar6.b |= 32;
        drqrVar6.i = a2;
        DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(drqrVar6.f)).getClass();
        Map o = drlhVar.o();
        if (o == null) {
            o = ffem.a;
        }
        drqoVar.copyOnWrite();
        drqr drqrVar7 = (drqr) drqoVar.instance;
        eyhm eyhmVar = drqrVar7.f;
        if (!eyhmVar.b) {
            drqrVar7.f = eyhmVar.a();
        }
        drqrVar7.f.putAll(o);
        eyfy build = drqoVar.build();
        build.getClass();
        return (drqr) build;
    }
}
