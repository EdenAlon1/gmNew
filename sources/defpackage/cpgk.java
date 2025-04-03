package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
class cpgk extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        avtb avtbVar = (avtb) obj;
        int ordinal = avtbVar.ordinal();
        if (ordinal == 0) {
            return esut.c;
        }
        if (ordinal == 1) {
            return esut.b;
        }
        if (ordinal == 2) {
            return esut.a;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(avtbVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        esut esutVar = (esut) obj;
        int ordinal = esutVar.ordinal();
        if (ordinal == 0) {
            return avtb.NOT_RCS;
        }
        if (ordinal == 1) {
            return avtb.OFFLINE;
        }
        if (ordinal == 2) {
            return avtb.ONLINE;
        }
        if (ordinal == 3) {
            return avtb.NOT_RCS;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(esutVar.toString()));
    }
}
