package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.display.DisplayManager;
import android.util.Log;
import androidx.car.app.AppManager;
import androidx.car.app.navigation.NavigationManager;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cex extends ContextWrapper {
    public final aca a;
    public final cfb b;
    public int c;
    private final cgg d;

    protected cex(final lkk lkkVar, final cfb cfbVar) {
        super(null);
        cgg cggVar = new cgg();
        this.d = cggVar;
        this.c = 0;
        this.b = cfbVar;
        cggVar.a(AppManager.class, "app", new cgh() { // from class: cem
            @Override // defpackage.cgh
            public final cgf a() {
                lkk lkkVar2 = lkkVar;
                lkkVar2.getClass();
                return new AppManager(cex.this, cfbVar, lkkVar2);
            }
        });
        cggVar.a(NavigationManager.class, "navigation", new cgh() { // from class: cen
            @Override // defpackage.cgh
            public final cgf a() {
                lkk lkkVar2 = lkk.this;
                lkkVar2.getClass();
                return new NavigationManager(lkkVar2);
            }
        });
        cggVar.a(cfn.class, "screen", new cgh() { // from class: ceo
            @Override // defpackage.cgh
            public final cgf a() {
                return new cfn(cex.this, lkkVar);
            }
        });
        cggVar.a(cft.class, "constraints", new cgh() { // from class: cep
            @Override // defpackage.cgh
            public final cgf a() {
                return new cft();
            }
        });
        cggVar.a(cfv.class, "hardware", new cgh() { // from class: ceq
            @Override // defpackage.cgh
            public final cgf a() {
                return cfu.a(cex.this, cfbVar);
            }
        });
        cggVar.a(cgj.class, null, new cgh() { // from class: cer
            @Override // defpackage.cgh
            public final cgf a() {
                return cgi.a(cex.this);
            }
        });
        cggVar.a(ckz.class, "suggestion", new cgh() { // from class: ces
            @Override // defpackage.cgh
            public final cgf a() {
                lkk lkkVar2 = lkk.this;
                lkkVar2.getClass();
                return new ckz(lkkVar2);
            }
        });
        cggVar.a(cgm.class, "media_playback", new cgh() { // from class: cet
            @Override // defpackage.cgh
            public final cgf a() {
                lkk lkkVar2 = lkk.this;
                lkkVar2.getClass();
                return new cgm(lkkVar2);
            }
        });
        this.a = new aca(new Runnable() { // from class: ceu
            @Override // java.lang.Runnable
            public final void run() {
                cfn cfnVar = (cfn) cex.this.a(cfn.class);
                cls.a();
                if (((lkv) cfnVar.c).c.equals(lkj.DESTROYED)) {
                    if (Log.isLoggable("CarApp", 3)) {
                        Log.d("CarApp", "Popping screens after the DESTROYED state is a no-op");
                        return;
                    }
                    return;
                }
                if (cfnVar.a.size() > 1) {
                    List<cfl> singletonList = Collections.singletonList((cfl) cfnVar.a.pop());
                    cfl a = cfnVar.a();
                    a.c = true;
                    ((AppManager) cfnVar.b.a(AppManager.class)).a();
                    if (((lkv) cfnVar.c).c.a(lkj.STARTED)) {
                        a.b(lki.ON_START);
                    }
                    for (cfl cflVar : singletonList) {
                        if (Log.isLoggable("CarApp", 3)) {
                            Log.d("CarApp", a.i(cflVar, "Popping screen ", " off the screen stack"));
                        }
                        cfn.c(cflVar, true);
                    }
                    if (Log.isLoggable("CarApp", 3)) {
                        Log.d("CarApp", a.i(a, "Screen ", " is at the top of the screen stack"));
                    }
                    if (((lkv) cfnVar.c).c.a(lkj.RESUMED) && cfnVar.a.contains(a)) {
                        a.b(lki.ON_RESUME);
                    }
                }
            }
        });
        lkkVar.c(new cew(cfbVar));
    }

    public final Object a(Class cls) {
        cgg cggVar = this.d;
        RuntimeException runtimeException = (RuntimeException) cggVar.b.get(cls);
        if (runtimeException != null) {
            throw runtimeException;
        }
        cgf cgfVar = (cgf) cggVar.a.get(cls);
        if (cgfVar != null) {
            return cgfVar;
        }
        cgh cghVar = (cgh) cggVar.c.get(cls);
        if (cghVar == null) {
            throw new IllegalArgumentException(a.i(cls, "The class '", "' does not correspond to a car service"));
        }
        try {
            cgf a = cghVar.a();
            cggVar.a.put(cls, a);
            return a;
        } catch (RuntimeException e) {
            cggVar.b.put(cls, e);
            throw e;
        }
    }

    public final void b(Context context, Configuration configuration) {
        cls.a();
        if (getBaseContext() == null) {
            Object systemService = context.getSystemService("display");
            systemService.getClass();
            attachBaseContext(context.createDisplayContext(((DisplayManager) systemService).createVirtualDisplay("CarAppService", configuration.screenWidthDp, configuration.screenHeightDp, configuration.densityDpi, null, 8).getDisplay()).createConfigurationContext(configuration));
        }
        c(configuration);
    }

    public final void c(Configuration configuration) {
        cls.a();
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", "Car configuration changed, configuration: " + configuration + ", displayMetrics: " + getResources().getDisplayMetrics());
        }
        Resources resources = getResources();
        configuration.getClass();
        resources.updateConfiguration(configuration, getResources().getDisplayMetrics());
    }
}
