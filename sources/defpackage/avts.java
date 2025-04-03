package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
class avts extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        axad axadVar = (axad) obj;
        fjax fjaxVar = (fjax) fjay.a.createBuilder();
        if ((axadVar.b & 1) != 0) {
            String str = axadVar.c;
            fjaxVar.copyOnWrite();
            fjay fjayVar = (fjay) fjaxVar.instance;
            str.getClass();
            fjayVar.b = str;
        }
        return (fjay) fjaxVar.build();
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        axac createBuilder = axad.a.createBuilder();
        String str = ((fjay) obj).b;
        createBuilder.copyOnWrite();
        axad axadVar = (axad) createBuilder.instance;
        str.getClass();
        axadVar.b |= 1;
        axadVar.c = str;
        return createBuilder.build();
    }
}
