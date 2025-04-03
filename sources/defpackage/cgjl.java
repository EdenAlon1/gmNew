package defpackage;

import android.content.Context;
import com.google.android.libraries.messaging.lighter.Lighter;
import j$.util.Optional;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgjl implements fbba {
    public static dygx a(Context context, Optional optional, final dzht dzhtVar, final dzhq dzhqVar, cgla cglaVar, ffbr ffbrVar, cglg cglgVar, ffbr ffbrVar2) {
        Lighter j = Lighter.j(new cgjf(), context, new cgjg(), new cgjh(context), new cgji(context), new cgjj(ffbrVar, optional, ffbrVar2, cglgVar), cglaVar, new dygz(dzss.c(), dzgj.c()), new HashMap());
        final dzhs a = dzhs.a();
        dyia.b().a.submit(new Runnable() { // from class: dzhr
            @Override // java.lang.Runnable
            public final void run() {
                boolean b = fdpw.a.get().b();
                dzht dzhtVar2 = dzhtVar;
                if (b) {
                    dzhs dzhsVar = dzhs.this;
                    synchronized (dzhsVar.a) {
                        dzhsVar.a.add(dzhtVar2);
                    }
                }
            }
        });
        final dzhp a2 = dzhp.a();
        dyia.b().a.submit(new Runnable() { // from class: dzho
            @Override // java.lang.Runnable
            public final void run() {
                boolean a3 = fdpw.a.get().a();
                dzhq dzhqVar2 = dzhqVar;
                if (a3) {
                    dzhp dzhpVar = dzhp.this;
                    synchronized (dzhpVar.a) {
                        dzhpVar.a.add(dzhqVar2);
                    }
                }
            }
        });
        j.getClass();
        return j;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
