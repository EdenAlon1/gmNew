package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajra implements ajqt {
    public final MessageIdType a;
    public final eyja b;
    public final ajqz c;
    public final ajqv d;
    public final ajqs e;

    public ajra(MessageIdType messageIdType, MessagesTable.BindData bindData, ParticipantsTable.BindData bindData2, List list, bton btonVar) {
        eyja d = eykm.d(bindData.w());
        d.getClass();
        ajqz ajqzVar = new ajqz(bindData2);
        if (list.isEmpty()) {
            throw new IllegalArgumentException("[PresentRepliedToMessage] partsData is empty");
        }
        if (list.size() > 1) {
            ensz enszVar = (ensz) ajqu.a.j();
            ensn ensnVar = ajro.a;
            enszVar.Y(ajro.c, messageIdType.toString());
            int size = list.size();
            ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((PartsTable.BindData) it.next()).H());
            }
            enszVar.w("[PresentRepliedToMessage] Replied-to message has %d parts with content types: %s", size, arrayList);
        }
        ajqv ajqvVar = new ajqv((PartsTable.BindData) list.get(0));
        ajqs ajqsVar = btonVar != null ? new ajqs(btonVar) : null;
        this.a = messageIdType;
        this.b = d;
        this.c = ajqzVar;
        this.d = ajqvVar;
        this.e = ajqsVar;
    }

    public final Uri a() {
        return this.d.b;
    }

    public final ajrw b() {
        return this.c.a();
    }

    public final String c() {
        return this.d.c;
    }

    public final String d() {
        return this.d.a;
    }
}
