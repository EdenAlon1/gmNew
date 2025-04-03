package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cgga implements ffji {
    final /* synthetic */ Instant a;

    public cgga(Instant instant) {
        this.a = instant;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        cgfk cgfkVar = (cgfk) obj;
        cgfkVar.copyOnWrite();
        cgft cgftVar = (cgft) cgfkVar.instance;
        cgft cgftVar2 = cgft.a;
        cgftVar.b |= 128;
        cgftVar.j = true;
        eyja b = eykn.b(this.a);
        cgfkVar.copyOnWrite();
        cgft cgftVar3 = (cgft) cgfkVar.instance;
        cgftVar3.k = b;
        cgftVar3.b |= 256;
        return ffcu.a;
    }
}
