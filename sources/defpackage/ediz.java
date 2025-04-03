package defpackage;

import j$.time.Duration;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ediz {
    public static final edqi a(exjb exjbVar) {
        ArrayList arrayList = new ArrayList();
        for (exja exjaVar : exjbVar.b) {
            eyev eyevVar = exjaVar.b;
            if (eyevVar == null) {
                eyevVar = eyev.a;
            }
            arrayList.add(new ednh(Duration.ofSeconds(eyevVar.b, eyevVar.c), exjaVar.c));
        }
        return new edoh(engw.n(arrayList));
    }
}
