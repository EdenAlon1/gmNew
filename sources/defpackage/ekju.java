package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekju implements lms {
    public final ea a;
    private final lms b;
    private final Set c;
    private final lms d;

    /* compiled from: PG */
    interface a {
        Map be();
    }

    public ekju(ea eaVar, lms lmsVar, Set set, akla aklaVar) {
        this.a = eaVar;
        this.b = lmsVar;
        this.c = set;
        this.d = new ekjt(this, aklaVar);
    }

    @Override // defpackage.lms
    public final lml a(Class cls) {
        return this.c.contains(cls.getName()) ? lmr.b() : this.b.a(cls);
    }

    @Override // defpackage.lms
    public final lml b(Class cls, lnx lnxVar) {
        return this.c.contains(cls.getName()) ? this.d.b(cls, lnxVar) : this.b.b(cls, lnxVar);
    }

    @Override // defpackage.lms
    public final /* synthetic */ lml c(ffmo ffmoVar, lnx lnxVar) {
        return lmr.a(this, ffmoVar, lnxVar);
    }
}
