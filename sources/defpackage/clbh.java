package defpackage;

import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clbh {
    public static Optional a(fayv fayvVar, clbg clbgVar, String str) {
        if (fayvVar == null) {
            return Optional.empty();
        }
        clbgVar.getClass();
        for (Map.Entry entry : DesugarCollections.unmodifiableMap(fayvVar.b).entrySet()) {
            if (emuz.e(clbgVar.o, (String) entry.getKey())) {
                for (Map.Entry entry2 : DesugarCollections.unmodifiableMap(((fayz) entry.getValue()).b).entrySet()) {
                    if (emuz.e(str, (String) entry2.getKey())) {
                        return Optional.of((String) entry2.getValue());
                    }
                }
            }
        }
        return Optional.empty();
    }
}
