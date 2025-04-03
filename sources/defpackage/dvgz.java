package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvgz implements dvgl {
    private final PackageManager a;
    private final dvdy b;

    public dvgz(Context context, dvdy dvdyVar) {
        this.a = context.getPackageManager();
        this.b = dvdyVar;
    }

    @Override // defpackage.dvgl
    public final dvgk a() {
        return dvgk.INSTALLED_APPS;
    }

    @Override // defpackage.emva
    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        int parseInt;
        PackageInfo packageInfo;
        ewag ewagVar = (ewag) obj;
        dvgn dvgnVar = (dvgn) obj2;
        if (!ewagVar.f.isEmpty()) {
            for (evye evyeVar : ewagVar.f) {
                evsp evspVar = evyeVar.c;
                if (evspVar == null) {
                    evspVar = evsp.a;
                }
                String str = evspVar.c == 4 ? (String) evspVar.d : "";
                evsp evspVar2 = evyeVar.c;
                if (evspVar2 == null) {
                    evspVar2 = evsp.a;
                }
                if (evspVar2.e.isEmpty()) {
                    parseInt = 0;
                } else {
                    evsp evspVar3 = evyeVar.c;
                    if (evspVar3 == null) {
                        evspVar3 = evsp.a;
                    }
                    parseInt = Integer.parseInt(evspVar3.e);
                }
                try {
                    packageInfo = this.a.getPackageInfo(str, 0);
                } catch (PackageManager.NameNotFoundException unused) {
                    packageInfo = null;
                } catch (Exception e) {
                    this.b.f(dvgnVar.a(), e, str);
                    return false;
                }
                int i = evyeVar.d;
                int a = evyd.a(i);
                if (a == 0) {
                    a = 1;
                }
                int i2 = a - 1;
                if (i2 != 1) {
                    if (i2 != 2) {
                        dvdy dvdyVar = this.b;
                        dvdp a2 = dvgnVar.a();
                        int a3 = evyd.a(i);
                        dvdyVar.d(a2, "Invalid InstallStatus for %s: %s", str, (a3 == 0 || a3 == 1) ? "UNKNOWN" : a3 != 2 ? "INSTALLED" : "NOT_INSTALLED");
                    } else {
                        if (packageInfo == null) {
                            this.b.c(dvgnVar.a(), "App is not installed (null package info)", new Object[0]);
                            return false;
                        }
                        if (packageInfo.versionCode < parseInt) {
                            this.b.c(dvgnVar.a(), "Want version: %s \nHave version: %s", Integer.valueOf(parseInt), Integer.valueOf(packageInfo.versionCode));
                            return false;
                        }
                    }
                } else if (packageInfo != null && packageInfo.versionCode >= parseInt) {
                    this.b.c(dvgnVar.a(), "App is installed AND has version: %s but want less than version %s", Integer.valueOf(packageInfo.versionCode), Integer.valueOf(parseInt));
                    return false;
                }
            }
        }
        return true;
    }
}
