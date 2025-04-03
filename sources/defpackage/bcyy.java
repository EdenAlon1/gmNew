package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcyy implements Comparable, bcyx {
    public final String a;
    public final String b;
    private final boolean c;
    private final Uri d;
    private final long e;

    public bcyy(long j, String str, boolean z, Uri uri, long j2) {
        this.a = String.valueOf(j);
        this.b = str;
        this.c = z;
        this.d = uri;
        this.e = j2;
    }

    public static Uri d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Uri.parse(str);
    }

    public static ParticipantColor e(ParticipantsTable.BindData bindData) {
        int k = bindData.k();
        int l = bindData.l();
        return l != 1 ? l != 2 ? new ParticipantColor(0, k, 0) : new ParticipantColor(2, -1, bindData.m()) : new ParticipantColor(1, k, 0);
    }

    public static String f(Resources resources, List list, String str) {
        return g(resources, list, str, false);
    }

    public static String g(Resources resources, List list, String str, boolean z) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bcyx bcyxVar = (bcyx) it.next();
            if (bcyxVar.b().equals(str)) {
                if (z) {
                    arrayList.add(0, resources.getString(R.string.tombstone_self_capitalized));
                } else {
                    arrayList.add(0, resources.getString(R.string.tombstone_self));
                }
            } else if (aswb.a()) {
                String a = bcyxVar.a();
                a.getClass();
                arrayList.add(cuxh.a(a));
            } else {
                String a2 = bcyxVar.a();
                a2.getClass();
                arrayList.add(cuxh.b(a2));
            }
        }
        return cuxt.c(resources, arrayList);
    }

    public static String h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    public static List i(bysc byscVar, ffbr ffbrVar, ffbr ffbrVar2) {
        crji crjiVar = (crji) ffbrVar.b();
        ArrayList arrayList = new ArrayList();
        String[] strArr = ParticipantsTable.a;
        for (ParticipantsTable.BindData bindData : (ParticipantsTable.BindData[]) byscVar.aG("participants", new ParticipantsTable.BindData[0])) {
            String Q = bindData.Q();
            if (Q == null) {
                Q = bindData.R();
            }
            if (Q == null) {
                Q = bindData.P();
            }
            Uri x = bindData.x();
            bindData.G();
            arrayList.add(new bcyy(Long.parseLong(bindData.S()), Q == null ? "" : Q, bindData.o() == 3, crjiVar.f(d(x == null ? "" : x.toString()), h(emxe.b(bindData.R())), ((aolr) ffbrVar2.b()).q(bindData), e(bindData)), byscVar.l()));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static boolean j(List list, String str) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                if (((bcyx) list.get(i)).b().equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.bcyx
    public final String a() {
        return this.b;
    }

    @Override // defpackage.bcyx
    public final String b() {
        return this.a;
    }

    @Override // defpackage.bcyx
    public final boolean c() {
        return this.c;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        bcyy bcyyVar = (bcyy) obj;
        int compare = Long.compare(this.e, bcyyVar.e);
        return compare != 0 ? compare : this.a.compareTo(bcyyVar.a);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof bcyy)) {
            return false;
        }
        bcyy bcyyVar = (bcyy) obj;
        return this.a.equals(bcyyVar.a) && (TextUtils.isEmpty(this.b) ? TextUtils.isEmpty(bcyyVar.b) : this.b.equals(bcyyVar.b)) && this.c == bcyyVar.c && this.d.equals(bcyyVar.d) && this.e == bcyyVar.e;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Boolean.valueOf(this.c), this.d, Long.valueOf(this.e));
    }

    public final String toString() {
        return "ParticipantId: " + this.a + ", displayName: " + this.b + ", isPenpalBot: " + this.c + ", avatarUri: " + String.valueOf(this.d) + ", timeStamp: " + this.e;
    }
}
