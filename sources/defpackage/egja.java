package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egja {
    public static final enru a = enru.c("com/google/android/libraries/user/profile/photopicker/common/model/profile/ProfileStateRepository");
    public final egct b;
    private final egcn d;
    private final errl e;
    private final ewjg f;
    private final egdu g;
    public final llg c = new llg(egdx.g());
    private int h = 1;

    public egja(egcn egcnVar, errl errlVar, ewjg ewjgVar, egdu egduVar, egct egctVar) {
        this.d = egcnVar;
        this.e = errlVar;
        this.f = ewjgVar;
        this.g = egduVar;
        this.b = egctVar;
    }

    public final void a(egdx egdxVar) {
        this.h = ((egdo) egdxVar).b;
        this.c.j(egdxVar);
    }

    public final void b() {
        synchronized (this) {
            int i = this.h;
            if (i != 2 && i != 4) {
                a(egdx.h());
                egdt a2 = this.g.a(fapt.OBAKE_GET_PROFILE_STATE);
                a2.d();
                egcn egcnVar = this.d;
                ewka ewkaVar = (ewka) ewkb.a.createBuilder();
                ewjg ewjgVar = this.f;
                ewkaVar.copyOnWrite();
                ewkb ewkbVar = (ewkb) ewkaVar.instance;
                ewkbVar.c = ewjgVar;
                ewkbVar.b |= 1;
                ewkaVar.copyOnWrite();
                ewkb.a((ewkb) ewkaVar.instance);
                erqt.r(erqc.o(egcnVar.e((ewkb) ewkaVar.build())), new egiz(this, a2), this.e);
            }
        }
    }
}
