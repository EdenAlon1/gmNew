package defpackage;

import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class csaz implements Supplier {
    boolean a = false;
    esiw b = esiw.a;
    final /* synthetic */ csbe c;

    public csaz(csbe csbeVar) {
        this.c = csbeVar;
    }

    @Override // java.util.function.Supplier
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized esiw get() {
        esiw esiwVar;
        if (!this.a) {
            try {
                csbe csbeVar = this.c;
                csbt csbtVar = csbeVar.e;
                Optional b = csbt.b(csbeVar.c, csbj.OBJECT_PAYLOAD_PART_ENCRYPTED_FREQ_CHANGED.d);
                if (b.isEmpty()) {
                    esiwVar = esiw.a;
                } else {
                    eydq eydqVar = ((etaq) b.get()).g;
                    if (eydqVar == null) {
                        eydqVar = eydq.a;
                    }
                    esiwVar = (esiw) csbtVar.a.a((esij) eyfy.parseFrom(esij.a, eydqVar.c), esiw.a);
                }
                this.b = esiwVar;
            } catch (cryh e) {
                csjb e2 = csbe.a.e();
                e2.I("EncryptedFrequentlyChangedMessageFields decryption succeeded. Original exception is logged below.");
                e2.A("object_cms_id", this.c.c.c);
                e2.s(e);
                this.c.f = true;
                this.b = (esiw) e.a;
            } catch (eygu e3) {
                csjb e4 = csbe.a.e();
                e4.I("Failed to create EncryptedFrequentlyChangedMessageFields.");
                e4.A("object_cms_id", this.c.c.c);
                e4.s(e3);
                throw new csax(e3);
            }
            this.a = true;
        }
        return this.b;
    }
}
