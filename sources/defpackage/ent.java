package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ent extends ffkk implements ffji {
    final /* synthetic */ List a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ent(List list) {
        super(1);
        this.a = list;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = this.a;
        iqj iqjVar = (iqj) obj;
        int size = list.size();
        int i = 0;
        while (i < size) {
            emu emuVar = (emu) list.get(i);
            if (emuVar.i == Integer.MIN_VALUE) {
                dwv.c("position() should be called first");
            }
            int size2 = emuVar.b.size();
            int i2 = 0;
            while (i2 < size2) {
                iqk iqkVar = (iqk) emuVar.b.get(i2);
                int[] iArr = emuVar.g;
                int i3 = i2 + i2;
                int i4 = iArr[i3];
                long j = iArr[i3 + 1];
                int i5 = i;
                long d = kaa.d((i4 << 32) | (j & 4294967295L), emuVar.c);
                if (emuVar.e) {
                    iqjVar.h(iqkVar, d, 0.0f, iqm.a);
                } else {
                    iqj.o(iqjVar, iqkVar, d);
                }
                i2++;
                i = i5;
            }
            i++;
        }
        return ffcu.a;
    }
}
