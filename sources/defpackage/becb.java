package defpackage;

import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.shared.datamodel.database.upgrade.CustomUpgradeSteps;
import com.google.android.apps.messaging.shared.datamodel.database.upgrade.OnDeviceDatabaseUpgradeHandler;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class becb implements dtux {
    final /* synthetic */ OnDeviceDatabaseUpgradeHandler a;
    private final engw b;
    private final boolean c;
    private int d;

    public becb(OnDeviceDatabaseUpgradeHandler onDeviceDatabaseUpgradeHandler, boolean z, List list) {
        this.a = onDeviceDatabaseUpgradeHandler;
        this.c = z;
        int i = engw.d;
        engr engrVar = new engr();
        if (list != null) {
            engrVar.j(list);
        }
        this.b = engrVar.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dtux
    public final int a() {
        int versionForMethod;
        engw engwVar = this.b;
        int i = ((enou) engwVar).c;
        int i2 = this.d;
        if (i2 >= i) {
            return Alert.DURATION_SHOW_INDEFINITELY;
        }
        versionForMethod = OnDeviceDatabaseUpgradeHandler.versionForMethod((Method) engwVar.get(i2));
        return versionForMethod;
    }

    @Override // defpackage.dtux
    public final int b() {
        return this.c ? 3 : 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dtux
    public final dtuw c(final dtve dtveVar) {
        Annotation annotationOrThrow;
        final Method method = (Method) this.b.get(this.d);
        this.d++;
        Runnable runnable = new Runnable() { // from class: bebz
            @Override // java.lang.Runnable
            public final void run() {
                CustomUpgradeSteps customUpgradeSteps;
                becb becbVar = becb.this;
                Method method2 = method;
                dtve dtveVar2 = dtveVar;
                try {
                    method2.setAccessible(true);
                    customUpgradeSteps = becbVar.a.customUpgradeSteps;
                    method2.invoke(customUpgradeSteps, dtveVar2);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new beba("exception running upgrade step ".concat(String.valueOf(method2.getName())), e);
                }
            }
        };
        annotationOrThrow = OnDeviceDatabaseUpgradeHandler.getAnnotationOrThrow(method, beaz.class);
        return new beca(runnable, ((beaz) annotationOrThrow).b());
    }

    @Override // defpackage.dtux
    public final String d() {
        return "?";
    }

    @Override // defpackage.dtux
    public final boolean e() {
        return this.d < ((enou) this.b).c;
    }

    @Override // defpackage.dtux
    public final boolean f() {
        return !this.c;
    }
}
