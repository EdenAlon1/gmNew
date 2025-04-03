package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpxr {
    private final ffbr a;
    private final fazb b;
    private final ffbr c;
    private final ffbr d;

    public cpxr(ffbr ffbrVar, fazb fazbVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.a = ffbrVar;
        this.b = fazbVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
    }

    public final void a(int i) {
        if (!((alwa) this.d.b()).b()) {
            ((alwa) this.d.b()).a();
            return;
        }
        epkq epkqVar = (epkq) epks.a.createBuilder();
        epkqVar.copyOnWrite();
        epks epksVar = (epks) epkqVar.instance;
        epksVar.c = i - 1;
        epksVar.b |= 1;
        boolean isPresent = ((Optional) this.b.b()).isPresent();
        epkqVar.copyOnWrite();
        epks epksVar2 = (epks) epkqVar.instance;
        epksVar2.b |= 4;
        epksVar2.d = isPresent;
        boolean e = ((ctvs) this.c.b()).e();
        epkqVar.copyOnWrite();
        epks epksVar3 = (epks) epkqVar.instance;
        epksVar3.b |= 8;
        epksVar3.e = e;
        boolean d = ((ctvs) this.c.b()).d();
        epkqVar.copyOnWrite();
        epks epksVar4 = (epks) epkqVar.instance;
        epksVar4.b |= 16;
        epksVar4.f = d;
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.TELEPHONY_DATABASE_EVENT;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        epks epksVar5 = (epks) epkqVar.build();
        epksVar5.getClass();
        eolvVar2.ai = epksVar5;
        eolvVar2.d |= 2;
        ((akxl) this.a.b()).j(eoluVar);
    }
}
