package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lmg extends lmu implements lms {
    private Application a;
    private final lms b;
    private Bundle c;
    private lkk d;
    private owv e;

    public lmg() {
        this.b = new lmp();
    }

    @Override // defpackage.lms
    public final lml a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return e(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // defpackage.lms
    public final lml b(Class cls, lnx lnxVar) {
        String str = (String) lnxVar.a(lmw.a);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (lnxVar.a(lmc.a) == null || lnxVar.a(lmc.b) == null) {
            if (this.d != null) {
                return e(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) lnxVar.a(lmp.b);
        boolean isAssignableFrom = ljq.class.isAssignableFrom(cls);
        Constructor b = (!isAssignableFrom || application == null) ? lmh.b(cls, lmh.b) : lmh.b(cls, lmh.a);
        return b == null ? this.b.b(cls, lnxVar) : (!isAssignableFrom || application == null) ? lmh.a(cls, b, lmc.a(lnxVar)) : lmh.a(cls, b, application, lmc.a(lnxVar));
    }

    @Override // defpackage.lms
    public final lml c(ffmo ffmoVar, lnx lnxVar) {
        return b(ffiu.a(ffmoVar), lnxVar);
    }

    @Override // defpackage.lmu
    public final void d(lml lmlVar) {
        lkk lkkVar = this.d;
        if (lkkVar != null) {
            owv owvVar = this.e;
            owvVar.getClass();
            lkg.b(lmlVar, owvVar, lkkVar);
        }
    }

    public final lml e(String str, Class cls) {
        Application application;
        lkk lkkVar = this.d;
        if (lkkVar == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = ljq.class.isAssignableFrom(cls);
        Constructor b = (!isAssignableFrom || this.a == null) ? lmh.b(cls, lmh.b) : lmh.b(cls, lmh.a);
        if (b == null) {
            if (this.a != null) {
                return this.b.a(cls);
            }
            if (lmt.c == null) {
                lmt.c = new lmt();
            }
            lmt.c.getClass();
            return loi.a(cls);
        }
        owv owvVar = this.e;
        owvVar.getClass();
        llx a = lkg.a(owvVar, lkkVar, str, this.c);
        lml a2 = (!isAssignableFrom || (application = this.a) == null) ? lmh.a(cls, b, a.a) : lmh.a(cls, b, application, a.a);
        a2.fB("androidx.lifecycle.savedstate.vm.tag", a);
        return a2;
    }

    public lmg(Application application, owz owzVar, Bundle bundle) {
        lmp lmpVar;
        this.e = owzVar.U();
        this.d = owzVar.P();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (lmp.a == null) {
                lmp.a = new lmp(application);
            }
            lmpVar = lmp.a;
            lmpVar.getClass();
        } else {
            lmpVar = new lmp();
        }
        this.b = lmpVar;
    }
}
