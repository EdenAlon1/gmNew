package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class einj extends eiln {
    static final emwd a = new einl();
    static final emwd b = new eimh();
    static final emwd c = new eima();

    @Override // defpackage.eiln
    public final void b(clrz clrzVar, eick eickVar) {
        eydq eydqVar = clrzVar.c;
        if (eydqVar == null) {
            eydqVar = eydq.a;
        }
        eyee eyeeVar = eydqVar.c;
        if (eyeeVar == null) {
            throw new NullPointerException("Null opaqueData");
        }
        ((ehzk) eickVar).d = eyeeVar;
    }
}
