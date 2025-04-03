package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpvr extends eyfq implements eyht {
    public cpvr() {
        super(cpvu.a);
    }

    public final void a(cpvt cpvtVar) {
        cpvt cpvtVar2;
        copyOnWrite();
        cpvu cpvuVar = (cpvu) this.instance;
        cpvu cpvuVar2 = cpvu.a;
        cpvtVar.getClass();
        cpvt cpvtVar3 = cpvuVar.c;
        if (cpvtVar3 != null && cpvtVar3 != (cpvtVar2 = cpvt.a)) {
            cpvs cpvsVar = (cpvs) cpvtVar2.createBuilder(cpvtVar3);
            cpvsVar.mergeFrom((cpvs) cpvtVar);
            cpvtVar = (cpvt) cpvsVar.buildPartial();
        }
        cpvuVar.c = cpvtVar;
        cpvuVar.b |= 1;
    }
}
