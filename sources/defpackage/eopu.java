package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eopu extends eyfq implements eyht {
    public eopu() {
        super(eopv.a);
    }

    public final void a(eohk eohkVar) {
        copyOnWrite();
        eopv eopvVar = (eopv) this.instance;
        eohl eohlVar = (eohl) eohkVar.build();
        eopv eopvVar2 = eopv.a;
        eohlVar.getClass();
        eopvVar.a();
        eopvVar.b.add(eohlVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final eohl b() {
        return (eohl) ((eopv) this.instance).b.get(0);
    }

    public final void c(eohk eohkVar) {
        copyOnWrite();
        eopv eopvVar = (eopv) this.instance;
        eohl eohlVar = (eohl) eohkVar.build();
        eopv eopvVar2 = eopv.a;
        eohlVar.getClass();
        eopvVar.a();
        eopvVar.b.set(0, eohlVar);
    }
}
