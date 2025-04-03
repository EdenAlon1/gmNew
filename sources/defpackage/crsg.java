package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
@Deprecated
/* loaded from: classes8.dex */
public final class crsg {
    public final ffbr a;

    public crsg(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    public static final ParticipantsTable.BindData a(List list) {
        ArrayList<ParticipantsTable.BindData> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
            if (bindData.r() == -2) {
                arrayList.add(bindData);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        for (ParticipantsTable.BindData bindData2 : arrayList) {
            if (bindData2.Y()) {
                arrayList2.add(bindData2);
            }
            if (bindData2.ab()) {
                cukz a = cuky.a(bindData2.n());
                if (a.c()) {
                    arrayList3.add(bindData2);
                } else if (a.d()) {
                    arrayList4.add(bindData2);
                }
            }
        }
        if (size == 1 && !arrayList2.isEmpty()) {
            return (ParticipantsTable.BindData) arrayList2.get(0);
        }
        if (!arrayList3.isEmpty()) {
            return (ParticipantsTable.BindData) arrayList3.get(0);
        }
        if (arrayList4.isEmpty()) {
            return null;
        }
        return (ParticipantsTable.BindData) arrayList4.get(0);
    }
}
