package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cqty extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        cqur cqurVar = (cqur) obj;
        int ordinal = cqurVar.ordinal();
        if (ordinal == 0) {
            return eifj.FILE;
        }
        if (ordinal == 1) {
            return eifj.THUMBNAIL;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(cqurVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        eifj eifjVar = (eifj) obj;
        int ordinal = eifjVar.ordinal();
        if (ordinal == 0) {
            return cqur.FILE;
        }
        if (ordinal == 1) {
            return cqur.THUMBNAIL;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(eifjVar.toString()));
    }
}
