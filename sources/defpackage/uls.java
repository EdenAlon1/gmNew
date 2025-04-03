package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uls implements dqlv {
    private final alcb a;
    private final Supplier b;
    private final ffji c;

    public uls(alcb alcbVar, Supplier supplier, ffji ffjiVar) {
        this.a = alcbVar;
        this.b = supplier;
        this.c = ffjiVar;
    }

    @Override // defpackage.dqlv
    public final Object a(doxs doxsVar, ffgu ffguVar) {
        Object obj;
        MessagePartCoreData messagePartCoreData = (MessagePartCoreData) this.c.invoke(doxsVar);
        obj = this.b.get();
        int c = ((ugl) obj).c(messagePartCoreData);
        this.a.g(messagePartCoreData.O(), c);
        return dqmj.a;
    }

    @Override // defpackage.dqlv
    public final /* synthetic */ void c(doxs doxsVar) {
        doxsVar.getClass();
    }

    @Override // defpackage.dqlv
    public final void d(doxs doxsVar) {
        Object obj;
        MessagePartCoreData messagePartCoreData = (MessagePartCoreData) this.c.invoke(doxsVar);
        obj = this.b.get();
        ((ugl) obj).h(messagePartCoreData);
        this.a.h(messagePartCoreData.O());
    }

    @Override // defpackage.dqlv
    public final /* synthetic */ void b() {
    }
}
