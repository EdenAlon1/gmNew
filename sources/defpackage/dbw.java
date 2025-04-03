package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbw implements dbv {
    public final ffji a;
    public final ffji b;

    public dbw(ffji ffjiVar, ffji ffjiVar2) {
        this.a = ffjiVar;
        this.b = ffjiVar2;
    }

    @Override // defpackage.dbv
    public final ffji a() {
        return this.b;
    }

    @Override // defpackage.dbv
    public final ffji b() {
        return this.a;
    }
}
