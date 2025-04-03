package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abcc extends ffhv implements ffjp {
    /* synthetic */ Object a;
    /* synthetic */ boolean b;
    /* synthetic */ Object c;
    /* synthetic */ boolean d;
    final /* synthetic */ abcd e;
    final /* synthetic */ alxr f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abcc(abcd abcdVar, alxr alxrVar, ffgu ffguVar) {
        super(5, ffguVar);
        this.e = abcdVar;
        this.f = alxrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [aqux, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        final apza apzaVar;
        apyd i;
        Iterator it;
        doef doeeVar;
        apyd i2;
        ffci.b(obj);
        ?? r1 = this.a;
        boolean z = this.b;
        Object obj2 = this.c;
        Integer num = null;
        if (this.d || !z) {
            return null;
        }
        if (((auqo) this.e.e.b()).a()) {
            if (r1 != 0 && (i2 = this.f.i()) != 0) {
                apzaVar = i2.c(r1);
            }
            apzaVar = null;
        } else {
            apyv b = (r1 == 0 || (i = this.f.i()) == 0) ? null : i.b(r1);
            if (b != null) {
                apzaVar = new apza(b, null);
            }
            apzaVar = null;
        }
        final abcd abcdVar = this.e;
        final alxr alxrVar = this.f;
        apyb b2 = obj2 != null ? apzb.b((dqzc) obj2) : null;
        engw engwVar = (((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue() && zro.b(alxrVar)) ? abbc.b : abbc.a;
        if (b2 != null) {
            List am = ffdx.am(engwVar);
            am.set(5, b2);
            engwVar = engq.a(am);
        }
        if (apzaVar != null) {
            Integer valueOf = Integer.valueOf(engwVar.indexOf(apzaVar.a));
            if (valueOf.intValue() != -1) {
                num = valueOf;
            }
        }
        final int i3 = true != ctjd.d() ? 3 : 5;
        final abca abcaVar = abcdVar.d;
        final cmrx cmrxVar = abcdVar.f;
        final ffix ffixVar = new ffix() { // from class: abbz
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        };
        engwVar.getClass();
        ArrayList arrayList = new ArrayList(ffdx.n(engwVar, 10));
        Iterator it2 = engwVar.iterator();
        int i4 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i5 = i4 + 1;
            if (i4 < 0) {
                ffdx.l();
            }
            final apyv apyvVar = (apyv) next;
            boolean z2 = num != null && num.intValue() == i4;
            ffix ffixVar2 = new ffix() { // from class: abbw
                @Override // defpackage.ffix
                public final Object invoke() {
                    apyv apyvVar2 = apyvVar;
                    apyvVar2.getClass();
                    abca.this.b(apyvVar2, alxrVar, apzaVar, cmrxVar, ffixVar);
                    return ffcu.a;
                }
            };
            if (apyvVar instanceof apxx) {
                Object obj3 = abcaVar.d.get(((apxx) apyvVar).a);
                obj3.getClass();
                aagm aagmVar = (aagm) obj3;
                qgw qgwVar = aagmVar.a;
                it = it2;
                String string = abcaVar.a.getString(aagmVar.b);
                string.getClass();
                doeeVar = new doec(qgwVar, abcaVar.a(string, z2), ffixVar2);
            } else {
                it = it2;
                if (!(apyvVar instanceof apyb)) {
                    throw new ffcd();
                }
                apyb apybVar = (apyb) apyvVar;
                doeeVar = new doee(apybVar.b(), abcaVar.a(apybVar.b(), z2), ffixVar2);
            }
            arrayList.add(doeeVar);
            i4 = i5;
            it2 = it;
        }
        return new dofh(arrayList, num, new ffix() { // from class: abcb
            @Override // defpackage.ffix
            public final Object invoke() {
                final ffix ffixVar3 = new ffix() { // from class: abby
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        return ffcu.a;
                    }
                };
                final alxr alxrVar2 = alxrVar;
                final Long p = alxrVar2.p();
                final apza apzaVar2 = apzaVar;
                final apyv apyvVar2 = apzaVar2 != null ? apzaVar2.a : null;
                abcd abcdVar2 = abcd.this;
                final int i6 = i3;
                final abca abcaVar2 = abcdVar2.d;
                final ffji ffjiVar = new ffji() { // from class: abbx
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj4) {
                        apyv apyvVar3 = (apyv) obj4;
                        apyvVar3.getClass();
                        abca.this.b(apyvVar3, alxrVar2, apzaVar2, cmrx.CUSTOM_REACTION_PICKER, ffixVar3);
                        return ffcu.a;
                    }
                };
                final ffji ffjiVar2 = new ffji() { // from class: abbl
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj4) {
                        ((String) obj4).getClass();
                        return ffcu.a;
                    }
                };
                final abbs abbsVar = abcaVar2.c;
                abbsVar.a.b(p);
                abbsVar.b.e(new ffji() { // from class: abbm
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj4) {
                        ajiy ajiyVar = (ajiy) obj4;
                        ajiyVar.getClass();
                        return new abgs(new hpw(1259934815, true, new abbr(ffji.this, ajiyVar, abbsVar, p, ffjiVar2, i6, apyvVar2)));
                    }
                });
                return ffcu.a;
            }
        });
    }

    @Override // defpackage.ffjp
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((Boolean) obj4).booleanValue();
        abcc abccVar = new abcc(this.e, this.f, (ffgu) obj5);
        abccVar.a = (aqux) obj;
        abccVar.b = booleanValue;
        abccVar.c = (dqzc) obj3;
        abccVar.d = booleanValue2;
        return abccVar.b(ffcu.a);
    }
}
