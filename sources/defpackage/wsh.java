package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wsh implements ffix {
    final /* synthetic */ wsl a;
    final /* synthetic */ aaxe b;
    final /* synthetic */ Context c;
    final /* synthetic */ aawu d;

    public wsh(wsl wslVar, aaxe aaxeVar, Context context, aawu aawuVar) {
        this.a = wslVar;
        this.b = aaxeVar;
        this.c = context;
        this.d = aawuVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        Object e = wqr.a.e();
        e.getClass();
        this.a.a.b(ffdx.aA(this.b.a, (CharSequence) e, null, null, new ffji() { // from class: wsg
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                String k;
                String c;
                Object obj2;
                alxr alxrVar = (alxr) obj;
                alxrVar.getClass();
                appj g = alxrVar.g();
                if (!(g instanceof appw)) {
                    return g instanceof apps ? ((apps) g).m() : (!(g instanceof apqd) || (k = ((apqd) g).k()) == null) ? "" : k;
                }
                if (((Boolean) ((cfup) ctjd.aC.get()).e()).booleanValue()) {
                    appw appwVar = (appw) g;
                    engw a = appwVar.a();
                    a.getClass();
                    enqv it = a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (((apcy) obj2).c() == appv.ORIGINAL_TEXT) {
                            break;
                        }
                    }
                    apcy apcyVar = (apcy) obj2;
                    if (apcyVar == null || (c = apcyVar.d()) == null) {
                        c = appwVar.c();
                    }
                } else {
                    c = ((appw) g).c();
                }
                c.getClass();
                return c;
            }
        }, 30), this.c.getString(R.string.message_context_menu_text_copied_toast_text));
        this.d.b();
        return ffcu.a;
    }
}
