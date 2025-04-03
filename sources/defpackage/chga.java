package defpackage;

import android.content.Context;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chga {
    private final Context a;
    private final cprj b;
    private final ffbr c;

    public chga(Context context, cprj cprjVar, ffbr ffbrVar) {
        this.a = context;
        this.b = cprjVar;
        this.c = ffbrVar;
    }

    private final fcfn c(String str, boolean z) {
        fcfn fcfnVar = (fcfn) fcfo.a.createBuilder();
        fcef fcefVar = (fcef) fceg.a.createBuilder();
        int b = crob.b(this.a);
        fcefVar.copyOnWrite();
        ((fceg) fcefVar.instance).b = b;
        int c = crob.c(this.a);
        fcefVar.copyOnWrite();
        ((fceg) fcefVar.instance).c = c;
        int a = crob.a(this.a);
        fcefVar.copyOnWrite();
        ((fceg) fcefVar.instance).d = a;
        String d = crob.d(this.a);
        fcefVar.copyOnWrite();
        fceg fcegVar = (fceg) fcefVar.instance;
        d.getClass();
        fcegVar.h = d;
        fcefVar.copyOnWrite();
        ((fceg) fcefVar.instance).e = 4;
        int a2 = ((cgwp) this.c.b()).a();
        fcefVar.copyOnWrite();
        ((fceg) fcefVar.instance).g = fgti.a(a2);
        fcfnVar.copyOnWrite();
        fcfo fcfoVar = (fcfo) fcfnVar.instance;
        fceg fcegVar2 = (fceg) fcefVar.build();
        fcegVar2.getClass();
        fcfoVar.g = fcegVar2;
        fcfoVar.b |= 1;
        String uuid = UUID.randomUUID().toString();
        fcfnVar.copyOnWrite();
        fcfo fcfoVar2 = (fcfo) fcfnVar.instance;
        uuid.getClass();
        fcfoVar2.c = uuid;
        fcfnVar.copyOnWrite();
        fcfo fcfoVar3 = (fcfo) fcfnVar.instance;
        str.getClass();
        fcfoVar3.e = str;
        if (z) {
            int a3 = this.b.a() - 1;
            fgsz fgszVar = (a3 == 0 || a3 == 1) ? fgsz.ACCESS_NETWORK_TYPE_UNSPECIFIED : a3 != 2 ? a3 != 3 ? fgsz.ETHERNET : fgsz.WIFI : fgsz.MOBILE;
            fcfnVar.copyOnWrite();
            ((fcfo) fcfnVar.instance).j = fgszVar.a();
        }
        return fcfnVar;
    }

    public final fcfn a(String str) {
        return c(str, false);
    }

    public final fcfn b(String str) {
        return c(str, true);
    }
}
