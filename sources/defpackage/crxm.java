package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crxm implements Supplier {
    boolean a = false;
    eshz b = eshz.a;
    final /* synthetic */ crxn c;

    public crxm(crxn crxnVar) {
        this.c = crxnVar;
    }

    @Override // java.util.function.Supplier
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized eshz get() {
        if (!this.a) {
            try {
                crxn crxnVar = this.c;
                this.b = crxnVar.c.a(crxnVar.e);
                this.a = true;
            } catch (cryh e) {
                csjb e2 = crxn.a.e();
                e2.I("Conversation RarelyChangedPart decryption succeeded. Original exception is logged below.");
                e2.A("cmsConversationId", this.c.e.c);
                e2.s(e);
                this.c.g = true;
                return (eshz) e.a;
            } catch (eygu e3) {
                csjb b = crxn.a.b();
                b.I("Failed to create RarelyChangedPart");
                b.A("cmsConversationId", this.c.e.c);
                b.s(e3);
                throw new crxj(e3);
            }
        }
        return this.b;
    }
}
