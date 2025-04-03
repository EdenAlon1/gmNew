package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class crxl implements Supplier {
    boolean a = false;
    eshx b = eshx.a;
    final /* synthetic */ crxn c;

    public crxl(crxn crxnVar) {
        this.c = crxnVar;
    }

    @Override // java.util.function.Supplier
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized eshx get() {
        if (!this.a) {
            eydq eydqVar = this.c.e.h;
            if (eydqVar == null) {
                eydqVar = eydq.a;
            }
            eyee eyeeVar = eydqVar.c;
            try {
                this.b = (eshx) this.c.b.a((esij) eyfy.parseFrom(esij.a, eyeeVar, eyfc.a()), eshx.a);
                this.a = true;
            } catch (cryh e) {
                csjb e2 = crxn.a.e();
                e2.I("Conversation FrequentlyChangedPart decryption succeeded. Original exception is logged below.");
                e2.A("cmsConversationId", this.c.e.c);
                e2.s(e);
                this.c.g = true;
                return (eshx) e.a;
            } catch (eygu e3) {
                csjb b = crxn.a.b();
                b.I("Failed to create FrequentlyChangedPart");
                b.A("cmsConversationId", this.c.e.c);
                b.s(e3);
                throw new crxi(e3);
            }
        }
        return this.b;
    }
}
