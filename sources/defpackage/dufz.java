package defpackage;

import io.grpc.Status;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dufz {
    public static void a(enhk enhkVar) {
        HashSet hashSet = new HashSet();
        enfz enfzVar = new enfz();
        enqu listIterator = enhkVar.keySet().listIterator();
        while (listIterator.hasNext()) {
            ezib ezibVar = (ezib) listIterator.next();
            dufs dufsVar = (dufs) enhkVar.get(ezibVar);
            if (dufsVar != null) {
                if (dufsVar.b().isEmpty()) {
                    hashSet.add(ezibVar);
                } else {
                    engw b = dufsVar.b();
                    int i = ((enou) b).c;
                    for (int i2 = 0; i2 < i; i2++) {
                        enfzVar.t((Throwable) b.get(i2), ezibVar);
                    }
                }
            }
        }
        for (Throwable th : enfzVar.x()) {
            enfzVar.c(th);
            if (th instanceof fedn) {
                ((fedn) th).a.getCode();
            }
        }
        Status.Code code = Status.Code.OK;
    }
}
