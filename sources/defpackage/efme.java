package defpackage;

import android.text.TextUtils;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class efme {
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0210, code lost:
    
        if (r0 != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x03ea, code lost:
    
        if (r9 != 3) goto L166;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.efmj r23) {
        /*
            Method dump skipped, instructions count: 1486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efme.a(efmj):void");
    }

    public static final void b(efmp efmpVar) {
        efmpVar.getClass();
        String str = efmpVar.d;
        efmx efmxVar = efmx.a;
        efmxVar.j = emxe.b(str);
        if (TextUtils.isEmpty(efmxVar.j)) {
            Log.d("SurveyController", "API key was not set or set empty by the client. API key is needed if survey is targeted for signed out users as well. For surveys targeted for only signin users, api key is not needed.");
        }
        efog a = efmxVar.a(efmpVar, efmxVar.j);
        fcsk fcskVar = (fcsk) fcsl.a.createBuilder();
        String str2 = efmxVar.j;
        fcskVar.copyOnWrite();
        fcsl fcslVar = (fcsl) fcskVar.instance;
        str2.getClass();
        fcslVar.b = str2;
        fcskVar.copyOnWrite();
        ((fcsl) fcskVar.instance).c = 2;
        final fcsl fcslVar2 = (fcsl) fcskVar.build();
        efog a2 = efmxVar.a(efmpVar, "AIzaSyBmGDOmYcGmylWMKTdQxmf5vXWAuybv7qA");
        final efmw efmwVar = new efmw(efmxVar, efmpVar, a);
        if (fcslVar2 == null) {
            Log.e("NetworkCallerGrpc", "Survey startup config request was null");
            return;
        }
        long j = efow.a;
        final efnz efnzVar = (efnz) a2;
        efnp.a().execute(new Runnable() { // from class: efns
            @Override // java.lang.Runnable
            public final void run() {
                efnz.this.g(fcslVar2, efmwVar);
            }
        });
    }
}
