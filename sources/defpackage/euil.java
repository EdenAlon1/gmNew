package defpackage;

import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euil {
    public static final euil a = new euil(new euim());
    public static final euil b = new euil(new euiq());
    public static final euil c = new euil(new euis());
    public static final euil d = new euil(new euir());
    public static final euil e = new euil(new euin());
    public static final euil f = new euil(new euip());
    public static final euil g = new euil(new euio());
    private final euik h;

    public euil(euit euitVar) {
        if (etmk.a()) {
            this.h = new euij(euitVar);
        } else if (eujp.d()) {
            this.h = new euih(euitVar);
        } else {
            this.h = new euii(euitVar);
        }
    }

    public static List b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object a(String str) {
        return this.h.a(str);
    }
}
