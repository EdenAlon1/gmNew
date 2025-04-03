package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdqv {
    public static bvpo a(String str) {
        String[] strArr = ParticipantsTable.a;
        bvpp bvppVar = new bvpp();
        bvppVar.v(null);
        bvppVar.T(-2);
        bvppVar.S(-1);
        bvppVar.R(str);
        bvppVar.I(str);
        bvppVar.q(str);
        bvppVar.u(str);
        bvppVar.t(null);
        bvppVar.N(null);
        bvppVar.l(-1L);
        bvppVar.D(null);
        bvppVar.e(false);
        bvppVar.U(0);
        bvppVar.V(null);
        return bvppVar;
    }

    public static boolean b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
            if (d(bindData) && !bdtd.m(bindData)) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(ParticipantsTable.BindData bindData) {
        String W = bindData.W();
        cskc cskcVar = cpdg.a;
        return aoqw.h(W);
    }

    public static boolean d(ParticipantsTable.BindData bindData) {
        return bindData.o() == 1;
    }
}
