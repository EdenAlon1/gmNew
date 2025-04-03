package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fazu implements lms {
    public static final lnw a = new fazr();
    private final Map b;
    private final lms c;
    private final lms d;

    /* compiled from: PG */
    public interface a {
        Map c();

        Map d();
    }

    public fazu(Map map, lms lmsVar, aklr aklrVar) {
        this.b = map;
        this.c = lmsVar;
        this.d = new fazt(aklrVar);
    }

    @Override // defpackage.lms
    public final lml a(Class cls) {
        return this.b.containsKey(cls) ? lmr.b() : this.c.a(cls);
    }

    @Override // defpackage.lms
    public final lml b(Class cls, lnx lnxVar) {
        return this.b.containsKey(cls) ? this.d.b(cls, lnxVar) : this.c.b(cls, lnxVar);
    }

    @Override // defpackage.lms
    public final /* synthetic */ lml c(ffmo ffmoVar, lnx lnxVar) {
        return lmr.a(this, ffmoVar, lnxVar);
    }
}
