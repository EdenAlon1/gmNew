package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feqm extends fems {
    private final feql e;
    private static final ReferenceQueue c = new ReferenceQueue();
    private static final ConcurrentMap d = new ConcurrentHashMap();
    public static final Logger b = Logger.getLogger(feqm.class.getName());

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public feqm(feau feauVar) {
        super(feauVar);
        ReferenceQueue referenceQueue = c;
        ConcurrentMap concurrentMap = d;
        this.e = new feql(this, feauVar, referenceQueue, concurrentMap);
    }

    @Override // defpackage.fems, defpackage.feau
    public final feau d() {
        int i = feql.b;
        feql feqlVar = this.e;
        if (!feqlVar.a.getAndSet(true)) {
            feqlVar.clear();
        }
        feau feauVar = this.a;
        ((feqc) feauVar).q();
        return feauVar;
    }
}
