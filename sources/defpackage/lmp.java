package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lmp extends lmt {
    public static lmp a;
    public static final lnw b = new lmo();
    private final Application e;

    public lmp(Application application) {
        this.e = application;
    }

    private static final lml d(Class cls, Application application) {
        if (!ljq.class.isAssignableFrom(cls)) {
            return loi.a(cls);
        }
        try {
            lml lmlVar = (lml) cls.getConstructor(Application.class).newInstance(application);
            lmlVar.getClass();
            return lmlVar;
        } catch (IllegalAccessException e) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e);
        } catch (InstantiationException e2) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e2);
        } catch (NoSuchMethodException e3) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e3);
        } catch (InvocationTargetException e4) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e4);
        }
    }

    @Override // defpackage.lmt, defpackage.lms
    public final lml a(Class cls) {
        Application application = this.e;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // defpackage.lmt, defpackage.lms
    public final lml b(Class cls, lnx lnxVar) {
        if (this.e != null) {
            return a(cls);
        }
        Application application = (Application) lnxVar.a(b);
        if (application != null) {
            return d(cls, application);
        }
        if (ljq.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return loi.a(cls);
    }

    public lmp() {
        this(null);
    }
}
