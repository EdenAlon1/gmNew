package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccps implements cctr {
    private static final entd a = entd.c("BugleCms");
    private final cctp c;

    public ccps(cctp cctpVar) {
        this.c = cctpVar;
    }

    @Override // defpackage.cctr
    public final List a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.c.a(1, becg.INSERT, ccue.a(17)).a());
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsObjectTriggers", "getCreateTriggersSqls", 57, "CmsObjectTriggers.java")).q("Creating trigger SQL for delete object");
        bech e = this.c.e(1, becg.DELETE, ccue.a(9), true);
        e.i = "cms_id";
        arrayList.add(e.a());
        bech a2 = this.c.a(1, becg.UPDATE, ccue.a(33));
        a2.d = enkr.c("conversation_id");
        a2.f = 1;
        arrayList.add(a2.a());
        bech a3 = this.c.a(1, becg.UPDATE, ccue.a(3));
        a3.a = "conv";
        a3.i = "conversation_id";
        a3.d = enkr.c("read");
        a3.f = 2;
        a3.b("NEW.read");
        a3.b("NEW.received_timestamp > (select cms_most_recent_read_message_timestamp_ms from conversations where NEW.conversation_id = conversations._id)");
        arrayList.add(a3.a());
        return arrayList;
    }

    @Override // defpackage.cctr
    public final List b() {
        List asList = Arrays.asList(becg.INSERT, becg.DELETE, becg.UPDATE);
        engr engrVar = new engr();
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            engrVar.h(this.c.c(1, (becg) it.next()));
        }
        ArrayList arrayList = new ArrayList(engrVar.g());
        arrayList.add(this.c.d(1, becg.UPDATE, "conv"));
        return arrayList;
    }
}
