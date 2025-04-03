package defpackage;

import java.util.ArrayList;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class empe implements empj {
    @Override // defpackage.empj
    public final ArrayList a(fbts fbtsVar, Locale locale) {
        locale.getClass();
        ArrayList arrayList = new ArrayList();
        if ((fbtsVar.c & 2) != 0) {
            fbup fbupVar = fbtsVar.f;
            if (fbupVar == null) {
                fbupVar = fbup.a;
            }
            if (fbupVar.b.size() > 0 && empd.a(fbtsVar).f.size() > 0) {
                for (fbuk fbukVar : empd.a(fbtsVar).f) {
                    fbqt b = fbqt.b(fbukVar.e);
                    if (b == null) {
                        b = fbqt.UNRECOGNIZED;
                    }
                    if (b == fbqt.OTP && fbukVar.c == 2) {
                        fbwz fbwzVar = (fbwz) fbxa.a.createBuilder();
                        fbwzVar.getClass();
                        fbva fbvaVar = fbukVar.c == 2 ? (fbva) fbukVar.d : fbva.a;
                        fbvaVar.getClass();
                        fbwzVar.copyOnWrite();
                        fbxa fbxaVar = (fbxa) fbwzVar.instance;
                        fbxaVar.d = fbvaVar;
                        fbxaVar.c = 18;
                        arrayList.add(fbro.a(fbwzVar));
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
