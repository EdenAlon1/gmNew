package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class csbc implements Supplier {
    boolean a = false;
    esjh b = esjh.a;
    final /* synthetic */ csbe c;

    public csbc(csbe csbeVar) {
        this.c = csbeVar;
    }

    @Override // java.util.function.Supplier
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized esjh get() {
        if (!this.a) {
            try {
                try {
                    csbe csbeVar = this.c;
                    this.b = csbeVar.e.a(csbeVar.c);
                } catch (eygu e) {
                    csjb e2 = csbe.a.e();
                    e2.I("Failed to create MessageModel.");
                    e2.A("object_cms_id", this.c.c.c);
                    e2.s(e);
                    throw new csay(e);
                }
            } catch (cryh e3) {
                csjb e4 = csbe.a.e();
                e4.I("MessageModel decryption succeeded. Original exception is logged below.");
                e4.A("object_cms_id", this.c.c.c);
                e4.s(e3);
                this.c.f = true;
                esjg esjgVar = (esjg) ((esjh) e3.a).toBuilder();
                String str = this.c.c.c;
                esjgVar.copyOnWrite();
                esjh esjhVar = (esjh) esjgVar.instance;
                str.getClass();
                esjhVar.d = str;
                this.b = (esjh) esjgVar.build();
            }
            this.a = true;
        }
        return this.b;
    }
}
