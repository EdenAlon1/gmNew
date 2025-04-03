package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccdw {
    private static final cskc a = cskc.g("BugleCms", "CmsBuilderDependencyQueue");

    public static final engw a(ccce ccceVar, List list) {
        int a2;
        int i;
        csjb a3 = a.a();
        a3.I("Missing dependencies for item");
        a3.A("itemId", ccceVar.e);
        int i2 = engw.d;
        engr engrVar = new engr();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            csgq csgqVar = (csgq) it.next();
            int b = csgqVar.b() - 1;
            a3.A(b != 0 ? b != 1 ? b != 3 ? b != 4 ? "MessageId" : "cms_encryption_key_index" : "backup_key_index" : "ConversationId" : "ParticipantId", csgqVar.a());
            int b2 = csgqVar.b() - 1;
            int i3 = b2 != 0 ? b2 != 1 ? (b2 == 3 || b2 == 4) ? 7 : 1 : 2 : 3;
            if (i3 == 7) {
                int b3 = csgqVar.b() - 1;
                if (b3 == 3) {
                    i = 2;
                } else {
                    if (b3 != 4) {
                        throw new UnsupportedOperationException("Cannot getKeyType() for non-key dependency");
                    }
                    i = 1;
                }
                emyl emylVar = ccjv.a;
                a2 = cclk.c(i);
            } else {
                a2 = ccue.a(17);
            }
            cccd cccdVar = (cccd) ccce.a.createBuilder();
            int i4 = ccceVar.c;
            cccdVar.copyOnWrite();
            ccce ccceVar2 = (ccce) cccdVar.instance;
            ccceVar2.b = 1 | ccceVar2.b;
            ccceVar2.c = i4;
            cccdVar.copyOnWrite();
            ccce ccceVar3 = (ccce) cccdVar.instance;
            ccceVar3.b = 2 | ccceVar3.b;
            ccceVar3.d = i3;
            String a4 = csgqVar.a();
            cccdVar.copyOnWrite();
            ccce ccceVar4 = (ccce) cccdVar.instance;
            ccceVar4.b = 4 | ccceVar4.b;
            ccceVar4.e = a4;
            cccdVar.copyOnWrite();
            ccce ccceVar5 = (ccce) cccdVar.instance;
            ccceVar5.b |= 8;
            ccceVar5.f = a2;
            boolean z = ccceVar.g;
            cccdVar.copyOnWrite();
            ccce ccceVar6 = (ccce) cccdVar.instance;
            ccceVar6.b |= 16;
            ccceVar6.g = z;
            engrVar.h((ccce) cccdVar.build());
            a3.I("added");
        }
        a3.r();
        return engrVar.g();
    }
}
