package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emph implements empj {
    private final int a;

    public emph(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.empj
    public final ArrayList a(fbts fbtsVar, Locale locale) {
        ArrayList arrayList = new ArrayList();
        fbup fbupVar = fbtsVar.f;
        if (fbupVar == null) {
            fbupVar = fbup.a;
        }
        HashSet hashSet = new HashSet();
        for (int i = 1; i <= Math.min(fbupVar.b.size(), this.a); i++) {
            fbun fbunVar = (fbun) fbupVar.b.get(fbupVar.b.size() - i);
            if (fbunVar.g.size() > 0) {
                for (fbxa fbxaVar : fbunVar.g) {
                    fbwy fbwyVar = fbxaVar.e;
                    if (fbwyVar == null) {
                        fbwyVar = fbwy.b;
                    }
                    fbrd b = fbrd.b(fbwyVar.d);
                    if (b == null) {
                        b = fbrd.UNRECOGNIZED;
                    }
                    if (b == fbrd.CLICKED) {
                        fbwy fbwyVar2 = fbxaVar.e;
                        if (fbwyVar2 == null) {
                            fbwyVar2 = fbwy.b;
                        }
                        hashSet.add(fbwyVar2.k);
                    }
                    if (fbxaVar.c == 19) {
                        fbwy fbwyVar3 = fbxaVar.e;
                        if (fbwyVar3 == null) {
                            fbwyVar3 = fbwy.b;
                        }
                        if (!hashSet.contains(fbwyVar3.k)) {
                            fbwy fbwyVar4 = fbxaVar.e;
                            if (fbwyVar4 == null) {
                                fbwyVar4 = fbwy.b;
                            }
                            fbrg b2 = fbrg.b(fbwyVar4.g);
                            if (b2 == null) {
                                b2 = fbrg.UNRECOGNIZED;
                            }
                            if (b2 != fbrg.STICKY_PROVIDER) {
                                fbwz fbwzVar = (fbwz) fbxaVar.toBuilder();
                                fbwy fbwyVar5 = fbxaVar.e;
                                if (fbwyVar5 == null) {
                                    fbwyVar5 = fbwy.b;
                                }
                                fbwx fbwxVar = (fbwx) fbwyVar5.toBuilder();
                                fbrg fbrgVar = fbrg.STICKY_PROVIDER;
                                fbwxVar.copyOnWrite();
                                ((fbwy) fbwxVar.instance).g = fbrgVar.a();
                                fbwy fbwyVar6 = (fbwy) fbwxVar.build();
                                fbwzVar.copyOnWrite();
                                fbxa fbxaVar2 = (fbxa) fbwzVar.instance;
                                fbwyVar6.getClass();
                                fbxaVar2.e = fbwyVar6;
                                fbxaVar2.b |= 1;
                                arrayList.add((fbxa) fbwzVar.build());
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.empj
    public final /* synthetic */ void b() {
    }
}
