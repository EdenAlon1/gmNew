package defpackage;

import android.content.Context;
import com.google.firebase.appindexing.internal.Thing;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euor extends eunj {
    final euoq a;

    public euor(Context context) {
        this.a = new euoq(new euol(context));
    }

    private final dhre e(eupd eupdVar) {
        boolean isEmpty;
        euoq euoqVar = this.a;
        euop euopVar = new euop(euoqVar, eupdVar);
        dhrm dhrmVar = euopVar.b.a;
        dhrmVar.o(euoqVar, euoqVar);
        synchronized (euoqVar.b) {
            isEmpty = euoqVar.b.isEmpty();
            euoqVar.b.add(euopVar);
        }
        if (isEmpty) {
            euopVar.a();
        }
        return dhrmVar;
    }

    @Override // defpackage.eunj
    public final dhre a(String... strArr) {
        return e(new eupd(3, null, strArr, null, null, null, null));
    }

    @Override // defpackage.eunj
    public final dhre b() {
        return e(new eupd(4, null, null, null, null, null, null));
    }

    @Override // defpackage.eunj
    public final dhre c(eunt... euntVarArr) {
        Thing[] thingArr;
        if (euntVarArr == null) {
            thingArr = null;
        } else {
            try {
                int length = euntVarArr.length;
                Thing[] thingArr2 = new Thing[length];
                System.arraycopy(euntVarArr, 0, thingArr2, 0, length);
                thingArr = thingArr2;
            } catch (ArrayStoreException unused) {
                return dhrt.b(new eunn("Custom Indexable-objects are not allowed. Please use the 'Indexables'-class for creating the objects."));
            }
        }
        return thingArr == null ? dhrt.b(new eunn("Indexables cannot be null.")) : e(new eupd(1, thingArr, null, null, null, null, null));
    }
}
