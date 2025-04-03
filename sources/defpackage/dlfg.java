package defpackage;

import android.os.Build;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlfg implements dlfk {
    private final dlfm a;
    private final dlfc b;
    private final Optional c;
    private final Optional d;
    private final Optional e;
    private final List f;

    public dlfg(dlfm dlfmVar, dlfc dlfcVar, Optional optional, Optional optional2, Optional optional3) {
        this.a = dlfmVar;
        this.b = dlfcVar;
        this.c = optional;
        this.d = optional2;
        this.e = optional3;
        dlfk[] dlfkVarArr = new dlfk[2];
        dlfkVarArr[0] = (Build.VERSION.SDK_INT < 30 || !((Boolean) fflm.a(optional, false)).booleanValue()) ? null : dlfmVar;
        dlfkVarArr[1] = true != ((Boolean) fflm.a(optional2, true)).booleanValue() ? null : dlfcVar;
        this.f = ffdo.J(dlfkVarArr);
    }

    @Override // defpackage.dlfk
    public final void a(dlgb dlgbVar, dlht dlhtVar, rum rumVar) {
        dlhtVar.getClass();
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((dlfk) it.next()).a(dlgbVar, dlhtVar, rumVar);
        }
    }

    @Override // defpackage.dlfk
    public final void b(dlgb dlgbVar, eyee eyeeVar, rtm rtmVar) {
        dlgbVar.getClass();
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((dlfk) it.next()).b(dlgbVar, eyeeVar, rtmVar);
        }
    }

    @Override // defpackage.dlfk
    public final void c(dlgb dlgbVar, eyee eyeeVar, rto rtoVar) {
        dlgbVar.getClass();
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((dlfk) it.next()).c(dlgbVar, eyeeVar, rtoVar);
        }
    }

    @Override // defpackage.dlfk
    public final void d(dlgb dlgbVar, eyee eyeeVar, long j, int i, int i2, int i3) {
        dlgbVar.getClass();
        eyeeVar.getClass();
        if (i == 0 || i2 == 0 || i3 == 0) {
            throw null;
        }
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((dlfk) it.next()).d(dlgbVar, eyeeVar, j, i, i2, i3);
        }
    }

    @Override // defpackage.dlfk
    public final void e(dlgb dlgbVar, long j, eyee eyeeVar, int i, int i2) {
        if (i == 0 || i2 == 0) {
            throw null;
        }
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((dlfk) it.next()).e(dlgbVar, j, eyeeVar, i, i2);
        }
    }

    @Override // defpackage.dlfk
    public final void f(dlgb dlgbVar, int i) {
        if (((Boolean) fflm.a(this.e, false)).booleanValue()) {
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                ((dlfk) it.next()).f(dlgbVar, i);
            }
        }
    }
}
