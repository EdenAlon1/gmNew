package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
enum eeaa implements eeop {
    INIT,
    ACTIVE,
    CLOSING,
    CLOSED,
    FAILED;

    public static final eeoo f;

    static {
        eeaa eeaaVar = INIT;
        eeaa eeaaVar2 = ACTIVE;
        eeaa eeaaVar3 = CLOSING;
        eeaa eeaaVar4 = CLOSED;
        eeaa eeaaVar5 = FAILED;
        eniq eniqVar = new eniq();
        eniqVar.n(eeaaVar, eeaaVar2, eeaaVar3);
        eniqVar.n(eeaaVar2, eeaaVar2, eeaaVar3);
        eniqVar.n(eeaaVar3, eeaaVar4);
        f = new eeoo(eeaaVar, eeaaVar5, eniqVar.a(), enoz.a);
    }
}
