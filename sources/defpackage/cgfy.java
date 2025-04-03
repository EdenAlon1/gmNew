package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cgfy implements ffji {
    final /* synthetic */ Instant a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;

    public cgfy(int i, Instant instant, int i2) {
        this.b = i;
        this.a = instant;
        this.c = i2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        cgfk cgfkVar = (cgfk) obj;
        cgfkVar.copyOnWrite();
        cgft cgftVar = (cgft) cgfkVar.instance;
        cgft cgftVar2 = cgft.a;
        int i = this.b;
        if (i == 0) {
            throw null;
        }
        cgftVar.c = i - 1;
        cgftVar.b |= 1;
        eyja b = eykn.b(this.a);
        cgfkVar.copyOnWrite();
        cgft cgftVar3 = (cgft) cgfkVar.instance;
        cgftVar3.d = b;
        cgftVar3.b |= 2;
        int i2 = this.c;
        cgfkVar.copyOnWrite();
        cgft cgftVar4 = (cgft) cgfkVar.instance;
        if (i2 == 0) {
            throw null;
        }
        cgftVar4.e = i2 - 1;
        cgftVar4.b |= 4;
        return ffcu.a;
    }
}
