package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dvcx extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        evvi evviVar = (evvi) obj;
        eybz eybzVar = (eybz) eyce.a.createBuilder();
        if ((evviVar.b & 1) != 0) {
            emwd m = dvcs.a.m();
            evvf b = evvf.b(evviVar.c);
            if (b == null) {
                b = evvf.ORIENTATION_UNKNOWN;
            }
            eycb eycbVar = (eycb) m.fP(b);
            eybzVar.copyOnWrite();
            eyce eyceVar = (eyce) eybzVar.instance;
            eyceVar.c = eycbVar.d;
            eyceVar.b |= 1;
        }
        if ((evviVar.b & 2) != 0) {
            emwd m2 = dvcs.b.m();
            evvh b2 = evvh.b(evviVar.d);
            if (b2 == null) {
                b2 = evvh.THEME_UNKNOWN;
            }
            eycd eycdVar = (eycd) m2.fP(b2);
            eybzVar.copyOnWrite();
            eyce eyceVar2 = (eyce) eybzVar.instance;
            eyceVar2.d = eycdVar.d;
            eyceVar2.b |= 2;
        }
        return (eyce) eybzVar.build();
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        eyce eyceVar = (eyce) obj;
        evvd evvdVar = (evvd) evvi.a.createBuilder();
        if ((eyceVar.b & 1) != 0) {
            emwd emwdVar = dvcs.a;
            eycb b = eycb.b(eyceVar.c);
            if (b == null) {
                b = eycb.ORIENTATION_UNKNOWN;
            }
            evvf evvfVar = (evvf) emwdVar.fP(b);
            evvdVar.copyOnWrite();
            evvi evviVar = (evvi) evvdVar.instance;
            evviVar.c = evvfVar.d;
            evviVar.b |= 1;
        }
        if ((eyceVar.b & 2) != 0) {
            emwd emwdVar2 = dvcs.b;
            eycd b2 = eycd.b(eyceVar.d);
            if (b2 == null) {
                b2 = eycd.THEME_UNKNOWN;
            }
            evvh evvhVar = (evvh) emwdVar2.fP(b2);
            evvdVar.copyOnWrite();
            evvi evviVar2 = (evvi) evvdVar.instance;
            evviVar2.d = evvhVar.d;
            evviVar2.b |= 2;
        }
        return (evvi) evvdVar.build();
    }
}
