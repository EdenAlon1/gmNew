package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cscc implements Supplier {
    esij a = esij.a;
    boolean b = false;
    final /* synthetic */ csce c;

    public cscc(csce csceVar) {
        this.c = csceVar;
    }

    @Override // java.util.function.Supplier
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized esij get() {
        if (!this.b) {
            try {
                eydq eydqVar = this.c.b.e;
                if (eydqVar == null) {
                    eydqVar = eydq.a;
                }
                this.a = (esij) eyfy.parseFrom(esij.a, eydqVar.c);
                this.b = true;
            } catch (eygu e) {
                csce.a.o("Failed to create ParticipantModel\n", e);
                throw new cscd(e);
            }
        }
        return this.a;
    }
}
