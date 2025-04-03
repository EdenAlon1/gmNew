package defpackage;

import java.util.ArrayList;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class empi implements empj {
    /* JADX WARN: Multi-variable type inference failed */
    private static fbun c(fbts fbtsVar) {
        fbup fbupVar = fbtsVar.f;
        if (fbupVar == null) {
            fbupVar = fbup.a;
        }
        fbup fbupVar2 = fbtsVar.f;
        if (fbupVar2 == null) {
            fbupVar2 = fbup.a;
        }
        return (fbun) fbupVar.b.get(fbupVar2.b.size() - 1);
    }

    @Override // defpackage.empj
    public final ArrayList a(fbts fbtsVar, Locale locale) {
        ArrayList arrayList = new ArrayList();
        if ((fbtsVar.c & 2) != 0) {
            fbup fbupVar = fbtsVar.f;
            if (fbupVar == null) {
                fbupVar = fbup.a;
            }
            if (fbupVar.b.size() > 0 && c(fbtsVar).f.size() > 0) {
                for (fbuk fbukVar : c(fbtsVar).f) {
                    fbqt b = fbqt.b(fbukVar.e);
                    if (b == null) {
                        b = fbqt.UNRECOGNIZED;
                    }
                    if (b == fbqt.OTP && fbukVar.c == 2) {
                        fbwz fbwzVar = (fbwz) fbxa.a.createBuilder();
                        fbsf fbsfVar = fbsf.a;
                        fbwzVar.copyOnWrite();
                        fbxa fbxaVar = (fbxa) fbwzVar.instance;
                        fbsfVar.getClass();
                        fbxaVar.d = fbsfVar;
                        fbxaVar.c = 22;
                        fbwx fbwxVar = (fbwx) fbwy.b.createBuilder();
                        fbwxVar.copyOnWrite();
                        ((fbwy) fbwxVar.instance).f = 1.0f;
                        fbub fbubVar = (fbub) fbuc.a.createBuilder();
                        fbubVar.copyOnWrite();
                        ((fbuc) fbubVar.instance).b = "Otp";
                        fbwxVar.copyOnWrite();
                        fbwy fbwyVar = (fbwy) fbwxVar.instance;
                        fbuc fbucVar = (fbuc) fbubVar.build();
                        fbucVar.getClass();
                        fbwyVar.i = fbucVar;
                        fbwyVar.c |= 1;
                        fbrg fbrgVar = fbrg.REGEXP;
                        fbwxVar.copyOnWrite();
                        ((fbwy) fbwxVar.instance).g = fbrgVar.a();
                        fbri fbriVar = fbri.BUSINESS_MESSAGE;
                        fbwxVar.copyOnWrite();
                        ((fbwy) fbwxVar.instance).l = fbriVar.a();
                        fbwzVar.copyOnWrite();
                        fbxa fbxaVar2 = (fbxa) fbwzVar.instance;
                        fbwy fbwyVar2 = (fbwy) fbwxVar.build();
                        fbwyVar2.getClass();
                        fbxaVar2.e = fbwyVar2;
                        fbxaVar2.b |= 1;
                        arrayList.add((fbxa) fbwzVar.build());
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
