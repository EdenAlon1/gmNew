package defpackage;

import android.content.Context;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwll {
    private static final dwlh a = new dwlh();

    public static final String a(jsw jswVar, Context context) {
        jzh.a(context);
        return ffdx.aA(jswVar.a, null, null, null, new ffji() { // from class: dwlk
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                jsv jsvVar = (jsv) obj;
                jsvVar.getClass();
                return "'" + jsvVar.a + "' " + jsvVar.b;
            }
        }, 31);
    }

    public static /* synthetic */ jsf b(jsf jsfVar, jsw jswVar) {
        jsfVar.getClass();
        jswVar.getClass();
        return Build.VERSION.SDK_INT >= 29 ? jsg.a(new dwlm(a, jsy.a, new dwlj(jswVar), new dwli(jsy.e))) : jsfVar;
    }
}
