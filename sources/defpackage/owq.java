package defpackage;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class owq implements lkp {
    private final owz a;

    public owq(owz owzVar) {
        this.a = owzVar;
    }

    @Override // defpackage.lkp
    public final void hg(lkr lkrVar, lki lkiVar) {
        ArrayList<String> stringArrayList;
        if (lkiVar != lki.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        lkrVar.P().d(this);
        Bundle a = this.a.U().a("androidx.savedstate.Restarter");
        if (a == null) {
            return;
        }
        if (!a.containsKey("classes_to_restore") || (stringArrayList = a.getStringArrayList("classes_to_restore")) == null) {
            throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> asSubclass = Class.forName(str, false, owq.class.getClassLoader()).asSubclass(owt.class);
                asSubclass.getClass();
                try {
                    Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object newInstance = declaredConstructor.newInstance(new Object[0]);
                        newInstance.getClass();
                        ((owt) newInstance).a(this.a);
                    } catch (Exception e) {
                        throw new RuntimeException("Failed to instantiate ".concat(String.valueOf(str)), e);
                    }
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException(a.a(str, "Class ", " wasn't found"), e3);
            }
        }
    }
}
