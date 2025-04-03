package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cprc implements fbba {
    public static espp a(Context context, cgwp cgwpVar) {
        fcef fcefVar = (fcef) fceg.a.createBuilder();
        int b = crob.b(context);
        fcefVar.copyOnWrite();
        ((fceg) fcefVar.instance).b = b;
        int c = crob.c(context);
        fcefVar.copyOnWrite();
        ((fceg) fcefVar.instance).c = c;
        int a = crob.a(context);
        fcefVar.copyOnWrite();
        ((fceg) fcefVar.instance).d = a;
        String d = crob.d(context);
        fcefVar.copyOnWrite();
        fceg fcegVar = (fceg) fcefVar.instance;
        d.getClass();
        fcegVar.h = d;
        fcefVar.copyOnWrite();
        ((fceg) fcefVar.instance).e = 4;
        int a2 = cgwpVar.a();
        fcefVar.copyOnWrite();
        ((fceg) fcefVar.instance).g = fgti.a(a2);
        fceg fcegVar2 = (fceg) fcefVar.build();
        if (fcegVar2 != null) {
            return new espp(fcegVar2, "RCS");
        }
        throw new NullPointerException("Null clientInfo");
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
