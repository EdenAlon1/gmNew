package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
class clka extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        clsn clsnVar = (clsn) obj;
        axac createBuilder = axad.a.createBuilder();
        if ((clsnVar.b & 1) != 0) {
            String str = clsnVar.c;
            createBuilder.copyOnWrite();
            axad axadVar = (axad) createBuilder.instance;
            str.getClass();
            axadVar.b |= 1;
            axadVar.c = str;
        }
        return createBuilder.build();
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        axad axadVar = (axad) obj;
        clsm clsmVar = (clsm) clsn.a.createBuilder();
        if ((axadVar.b & 1) != 0) {
            String str = axadVar.c;
            clsmVar.copyOnWrite();
            clsn clsnVar = (clsn) clsmVar.instance;
            str.getClass();
            clsnVar.b |= 1;
            clsnVar.c = str;
        }
        return (clsn) clsmVar.build();
    }
}
