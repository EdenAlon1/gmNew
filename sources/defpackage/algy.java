package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class algy implements ehxd {
    public final ffbr a;
    public akxl b;
    public final ffbr c;
    public final AtomicBoolean d = new AtomicBoolean(false);

    public algy(ffbr ffbrVar, ffbr ffbrVar2) {
        this.c = ffbrVar;
        this.a = ffbrVar2;
    }

    @Override // defpackage.ehxd
    public final void a(eyrs eyrsVar, int i) {
        int intValue;
        double d;
        eyrq eyrqVar = (eyrq) eyru.a.createBuilder();
        eyrqVar.copyOnWrite();
        eyru eyruVar = (eyru) eyrqVar.instance;
        eyruVar.c = eyrsVar.h;
        eyruVar.b |= 1;
        eyrqVar.copyOnWrite();
        eyru eyruVar2 = (eyru) eyrqVar.instance;
        eyruVar2.d = i - 1;
        eyruVar2.b |= 2;
        eyru eyruVar3 = (eyru) eyrqVar.build();
        if (this.d.get()) {
            eolu eoluVar = (eolu) eolv.a.createBuilder();
            eolt eoltVar = eolt.JIBE_SERVICE_CONNECTION;
            eoluVar.copyOnWrite();
            eolv eolvVar = (eolv) eoluVar.instance;
            eolvVar.j = eoltVar.dk;
            eolvVar.b |= 1;
            eoluVar.copyOnWrite();
            eolv eolvVar2 = (eolv) eoluVar.instance;
            eyruVar3.getClass();
            eolvVar2.aL = eyruVar3;
            eolvVar2.e |= 256;
            akxl akxlVar = this.b;
            eyrs b = eyrs.b(eyruVar3.c);
            if (b == null) {
                b = eyrs.UNKNOWN_SERVICE;
            }
            switch (b.ordinal()) {
                case 1:
                    intValue = ((Integer) dizo.a().a.a.a()).intValue();
                    d = intValue;
                    break;
                case 2:
                    intValue = ((Integer) dizo.a().a.b.a()).intValue();
                    d = intValue;
                    break;
                case 3:
                    intValue = ((Integer) dizo.a().a.c.a()).intValue();
                    d = intValue;
                    break;
                case 4:
                    intValue = ((Integer) dizo.a().a.d.a()).intValue();
                    d = intValue;
                    break;
                case 5:
                    intValue = ((Integer) dizo.a().a.e.a()).intValue();
                    d = intValue;
                    break;
                case 6:
                    intValue = ((Integer) dizo.a().a.f.a()).intValue();
                    d = intValue;
                    break;
                default:
                    d = eobe.a;
                    break;
            }
            akxlVar.p(eoluVar, d);
        }
    }
}
