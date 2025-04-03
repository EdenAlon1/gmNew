package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class owv {
    public final oxc a;
    private owp b;

    public owv(oxc oxcVar) {
        this.a = oxcVar;
    }

    public final Bundle a(String str) {
        Bundle bundle;
        oxc oxcVar = this.a;
        if (!oxcVar.f) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle2 = oxcVar.e;
        if (bundle2 == null) {
            return null;
        }
        if (!bundle2.containsKey(str)) {
            bundle = null;
        } else {
            if (!bundle2.containsKey(str)) {
                throw new IllegalArgumentException(a.a(str, "No saved state was found associated with the key '", "'."));
            }
            bundle = bundle2.getBundle(str);
            if (bundle == null) {
                throw new IllegalStateException(a.a(str, "The saved state value associated with the key '", "' is either null or not of the expected type. This might happen if the value was saved with a different type or if the saved state has been modified unexpectedly."));
            }
        }
        bundle2.remove(str);
        if (bundle2.isEmpty()) {
            oxcVar.e = null;
        }
        return bundle;
    }

    public final void b(String str, owu owuVar) {
        owuVar.getClass();
        oxc oxcVar = this.a;
        synchronized (oxcVar.b) {
            if (oxcVar.c.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            oxcVar.c.put(str, owuVar);
        }
    }

    public final void c(Class cls) {
        if (!this.a.g) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        owp owpVar = this.b;
        if (owpVar == null) {
            owpVar = new owp(this);
        }
        this.b = owpVar;
        try {
            cls.getDeclaredConstructor(new Class[0]);
            owp owpVar2 = this.b;
            if (owpVar2 != null) {
                String name = cls.getName();
                name.getClass();
                owpVar2.a.add(name);
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public final boolean d() {
        return this.a.f;
    }

    public final owu e() {
        owu owuVar;
        oxc oxcVar = this.a;
        synchronized (oxcVar.b) {
            Iterator it = oxcVar.c.entrySet().iterator();
            do {
                owuVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                owu owuVar2 = (owu) entry.getValue();
                if (true == ffkj.e(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    owuVar = owuVar2;
                }
            } while (owuVar == null);
        }
        return owuVar;
    }
}
