package defpackage;

import j$.time.Instant;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpym {
    private final ffbr a;

    public cpym(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    public final void a(Instant instant, Instant instant2, Instant instant3, int i, int i2, eqqh eqqhVar, UUID uuid, UUID uuid2) {
        cpyl cpylVar = (cpyl) this.a.b();
        cpyo cpyoVar = (cpyo) cpyp.a.createBuilder();
        eyja d = eykm.d(instant.toEpochMilli());
        cpyoVar.copyOnWrite();
        cpyp cpypVar = (cpyp) cpyoVar.instance;
        d.getClass();
        cpypVar.c = d;
        cpypVar.b |= 1;
        eyja d2 = eykm.d(instant2.toEpochMilli());
        cpyoVar.copyOnWrite();
        cpyp cpypVar2 = (cpyp) cpyoVar.instance;
        d2.getClass();
        cpypVar2.d = d2;
        cpypVar2.b |= 2;
        eyja d3 = eykm.d(instant3.toEpochMilli());
        cpyoVar.copyOnWrite();
        cpyp cpypVar3 = (cpyp) cpyoVar.instance;
        d3.getClass();
        cpypVar3.e = d3;
        cpypVar3.b |= 4;
        cpyoVar.copyOnWrite();
        ((cpyp) cpyoVar.instance).f = i;
        cpyoVar.copyOnWrite();
        ((cpyp) cpyoVar.instance).g = i2;
        cpyoVar.copyOnWrite();
        ((cpyp) cpyoVar.instance).h = eqqhVar.M;
        eyee a = cpzf.a(uuid);
        cpyoVar.copyOnWrite();
        ((cpyp) cpyoVar.instance).i = a;
        eyee a2 = cpzf.a(uuid2);
        cpyoVar.copyOnWrite();
        ((cpyp) cpyoVar.instance).j = a2;
        ((cevh) cpylVar.a.b()).a(ceyr.g("forward_sync_batch", (cpyp) cpyoVar.build()));
    }
}
