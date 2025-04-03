package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cggc implements ffji {
    final /* synthetic */ Instant a;

    public cggc(Instant instant) {
        this.a = instant;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        cgfk cgfkVar = (cgfk) obj;
        cgfkVar.copyOnWrite();
        cgft cgftVar = (cgft) cgfkVar.instance;
        cgft cgftVar2 = cgft.a;
        cgftVar.b |= 512;
        cgftVar.l = true;
        eyja b = eykn.b(this.a);
        cgfkVar.copyOnWrite();
        cgft cgftVar3 = (cgft) cgfkVar.instance;
        cgftVar3.m = b;
        cgftVar3.b |= 1024;
        return ffcu.a;
    }
}
