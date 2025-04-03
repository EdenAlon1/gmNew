package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eakq implements eako {
    @Override // defpackage.eako
    public final eumr a(Context context) {
        return eumr.c(context);
    }

    @Override // defpackage.eako
    public final FirebaseInstanceId b(eumr eumrVar) {
        return FirebaseInstanceId.getInstance(eumrVar);
    }

    @Override // defpackage.eako
    public final eumr c(Context context, eunc euncVar) {
        String str;
        try {
            return eumr.d(context, euncVar, "CHIME_ANDROID_SDK");
        } catch (IllegalStateException unused) {
            synchronized (eumr.a) {
                eumr eumrVar = (eumr) eumr.b.get("CHIME_ANDROID_SDK");
                if (eumrVar != null) {
                    ((euta) eumrVar.f.a()).c();
                    return eumrVar;
                }
                ArrayList arrayList = new ArrayList();
                synchronized (eumr.a) {
                    Iterator it = eumr.b.values().iterator();
                    while (it.hasNext()) {
                        arrayList.add(((eumr) it.next()).g());
                    }
                    Collections.sort(arrayList);
                    if (arrayList.isEmpty()) {
                        str = "";
                    } else {
                        str = "Available app names: " + TextUtils.join(", ", arrayList);
                    }
                    throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", "CHIME_ANDROID_SDK", str));
                }
            }
        }
    }
}
