package j$.time.zone;

import java.security.PrivilegedAction;
import java.util.ArrayList;

/* loaded from: classes9.dex */
final class f implements PrivilegedAction {
    final /* synthetic */ ArrayList a;

    f(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        String property = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
        if (property == null) {
            h.e(new g());
            return null;
        }
        try {
            h hVar = (h) h.class.cast(Class.forName(property, true, h.class.getClassLoader()).newInstance());
            h.e(hVar);
            this.a.add(hVar);
            return null;
        } catch (Exception e) {
            throw new Error(e);
        }
    }
}
