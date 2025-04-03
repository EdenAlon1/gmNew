package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duir implements fdxp {
    public static volatile duir a;
    private static final duiq b = new duiq();
    private final duiy c;

    public duir(duiy duiyVar) {
        duiyVar.getClass();
        this.c = duiyVar;
    }

    @Override // defpackage.fdxp
    public final fdxo a(febs febsVar, fdxj fdxjVar, fdxk fdxkVar) {
        duiq duiqVar = b;
        Collection collection = (Collection) fdxjVar.h(feia.c);
        ArrayList arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
        duiy duiyVar = this.c;
        arrayList.add(duiqVar);
        return duiyVar.a(febsVar, fdxjVar.f(feia.c, DesugarCollections.unmodifiableList(arrayList)), fdxkVar);
    }
}
