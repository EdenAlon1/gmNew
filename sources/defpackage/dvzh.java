package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvzh implements dvyz {
    final /* synthetic */ dvzi a;

    public dvzh(dvzi dvziVar) {
        this.a = dvziVar;
    }

    @Override // defpackage.dvyz
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        long a = this.a.d.a();
        if (a != -1) {
            dvxq dvxqVar = ((dvxe) obj).c;
            dvxqVar.copyOnWrite();
            dvxr dvxrVar = (dvxr) dvxqVar.instance;
            dvxr dvxrVar2 = dvxr.a;
            dvxrVar.b |= 4;
            dvxrVar.f = a * 1000;
        }
        dvzl dvzlVar = this.a.c;
        boolean z = dvzlVar.h;
        Collection collection = (Collection) dvzlVar.f.remove(obj);
        if (collection != null) {
            collection.clear();
            dvzlVar.g = collection;
        }
        dvxe dvxeVar = (dvxe) obj;
        if (dvxeVar.f()) {
            Object d = dvxeVar.f.d();
            if (dvxeVar.f.p() || (d != null && ((dvxe) d).f())) {
                Collection collection2 = (Collection) dvzlVar.f.get(d);
                if (collection2 != null) {
                    collection2.add(dvxeVar.a());
                } else {
                    Collection collection3 = dvzlVar.g;
                    if (collection3 != null) {
                        dvzlVar.g = null;
                    } else {
                        if (Log.isLoggable("GIL", 2)) {
                            Log.v("GIL", "Array Alloc for Removal");
                        }
                        collection3 = new ArrayList();
                    }
                    collection3.add(dvxeVar.a());
                    dvzlVar.f.put(d, collection3);
                }
            }
        }
        dvzlVar.a.remove(obj);
        dvzlVar.b.remove(obj);
        if (dvzlVar.f.isEmpty()) {
            return;
        }
        this.a.b();
    }

    @Override // defpackage.dvyz
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        long a = this.a.d.a();
        if (a != -1) {
            dvxq dvxqVar = ((dvxe) obj).c;
            dvxqVar.copyOnWrite();
            dvxr dvxrVar = (dvxr) dvxqVar.instance;
            dvxr dvxrVar2 = dvxr.a;
            dvxrVar.b |= 4;
            dvxrVar.f = a * 1000;
        }
        dvxe dvxeVar = (dvxe) obj;
        dvzb dvzbVar = dvxeVar.f;
        if (dvzbVar instanceof dvxv) {
            dvxv dvxvVar = (dvxv) dvzbVar;
            if (!dvxeVar.c.d(dwcf.a)) {
                dvxvVar.r(false);
            } else if (!dvzbVar.p()) {
                dvxvVar.r(true);
            }
        }
        dvzi dvziVar = this.a;
        dvzb dvzbVar2 = dvxeVar.f;
        dvxq dvxqVar2 = dvxeVar.c;
        erhk erhkVar = ((dvxr) dvxqVar2.instance).d;
        if (erhkVar == null) {
            erhkVar = erhk.a;
        }
        dvzl dvzlVar = dvziVar.c;
        if ((erhkVar.b & 2048) != 0) {
            int t = dvzbVar2.t();
            int b = epnz.b(((dvxr) dvxqVar2.instance).e);
            if ((b != 0 ? b : 1) == t || !dvzlVar.c(dvxeVar, t)) {
                return;
            }
        } else {
            dvzlVar.a.add(obj);
        }
        this.a.b();
    }

    @Override // defpackage.dvyz
    public final /* synthetic */ void c(Object obj) {
        ((dvxe) obj).g();
    }

    @Override // defpackage.dvyz
    public final /* bridge */ /* synthetic */ void e() {
        efbd.c();
    }

    @Override // defpackage.dvyz
    public final /* bridge */ /* synthetic */ void f() {
        efbd.c();
        Runnable runnable = this.a.g;
        if (runnable != null) {
            efbd.f(runnable);
            final dvzi dvziVar = this.a;
            dvziVar.b.a(new Runnable() { // from class: dvzg
                @Override // java.lang.Runnable
                public final void run() {
                    dvzi.this.a();
                }
            }).run();
        }
    }

    @Override // defpackage.dvyz
    public final /* bridge */ /* synthetic */ void g(Object obj, int i) {
        long a = this.a.d.a();
        if (a != -1) {
            dvxq dvxqVar = ((dvxe) obj).c;
            dvxqVar.copyOnWrite();
            dvxr dvxrVar = (dvxr) dvxqVar.instance;
            dvxr dvxrVar2 = dvxr.a;
            dvxrVar.b |= 4;
            dvxrVar.f = a * 1000;
        }
        if (this.a.c.c((dvxe) obj, i)) {
            this.a.b();
        }
    }

    @Override // defpackage.dvyz
    public final /* synthetic */ void d() {
    }
}
