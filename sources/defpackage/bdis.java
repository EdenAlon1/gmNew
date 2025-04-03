package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.util.stream.Stream;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
@Deprecated
/* loaded from: classes7.dex */
public final class bdis {
    public static final cskc a = cskc.g("Bugle", "DraftMessageTypeConverter");
    public static final enru b = enru.c("com/google/android/apps/messaging/shared/datamodel/data/draft/DraftMessageTypeConverter");
    public final ckds c;
    public final cpbs d;
    public final aqgi e;
    public final ffbr f;
    public final ffbr g;

    public bdis(ckds ckdsVar, cpbs cpbsVar, aqgi aqgiVar, ffbr ffbrVar, ffbr ffbrVar2) {
        this.c = ckdsVar;
        this.d = cpbsVar;
        this.e = aqgiVar;
        this.f = ffbrVar;
        this.g = ffbrVar2;
    }

    public static bdin a(int i, bdio bdioVar) {
        HashSet hashSet = new HashSet();
        bdim bdimVar = (bdim) bdioVar;
        Stream A = ((bcvr) bdimVar.a).A();
        int i2 = engw.d;
        List list = (List) A.collect(endq.a);
        if (list.size() <= i) {
            return new bdir();
        }
        if (!bdimVar.c) {
            return new bdiq(4);
        }
        a.q("draft forced to change: dropping extra attachments.");
        while (i < list.size()) {
            hashSet.add((MessagePartCoreData) list.get(i));
            i++;
        }
        return new bdin(hashSet, 3);
    }

    public static bdin b(int i, bdio bdioVar) {
        HashSet hashSet = new HashSet();
        bdim bdimVar = (bdim) bdioVar;
        if (bdimVar.a.k() <= i) {
            return new bdir();
        }
        if (!bdimVar.c) {
            return new bdiq(4);
        }
        a.q("draft forced to change: dropping extra attachments.");
        bcyq bcyqVar = bdimVar.a;
        while (true) {
            List list = ((bcvr) bcyqVar).v;
            if (i >= list.size()) {
                return new bdin(hashSet, 3);
            }
            hashSet.add((MessagePartCoreData) list.get(i));
            i++;
        }
    }

    public static bdin c(bcyq bcyqVar, int i, boolean z) {
        return f(((bcvr) bcyqVar).l, i, z, false);
    }

    public static bdin d(bcyq bcyqVar, int i, boolean z) {
        return f(((bcvr) bcyqVar).m, i, z, true);
    }

    public static void e(eoyx eoyxVar, int i) {
        eozb eozbVar;
        if (i != 1) {
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            switch (i2) {
                case 0:
                    eozbVar = eozb.UNKNOWN_REASON;
                    break;
                case 1:
                    eozbVar = eozb.FAILED_SUB_HAS_NO_RCS;
                    break;
                case 2:
                    eozbVar = eozb.FAILED_MESSAGE_TOO_LONG;
                    break;
                case 3:
                    eozbVar = eozb.FAILED_ATTACHMENT_COUNT_EXCEEDED;
                    break;
                case 4:
                    eozbVar = eozb.FAILED_SUBJECT_TOO_LONG;
                    break;
                case 5:
                    eozbVar = eozb.FAILED_QUERY_RCS_MAX_SIZE;
                    break;
                case 6:
                    eozbVar = eozb.FAILED_DOES_NOT_SUPPORT_FT_OVER_HTTP;
                    break;
                default:
                    eozbVar = eozb.UNKNOWN_REASON;
                    break;
            }
            eoyxVar.copyOnWrite();
            eoze eozeVar = (eoze) eoyxVar.instance;
            eygj eygjVar = eoze.a;
            eozbVar.getClass();
            eygi eygiVar = eozeVar.e;
            if (!eygiVar.c()) {
                eozeVar.e = eyfy.mutableCopy(eygiVar);
            }
            eozeVar.e.h(eozbVar.i);
        }
    }

    private static bdin f(String str, int i, boolean z, boolean z2) {
        if (str == null || str.length() <= i) {
            return new bdir();
        }
        if (!z) {
            return new bdiq(true == z2 ? 5 : 3);
        }
        a.q("draft forced to change: truncated message.");
        return new bdin(str.substring(0, i), 3);
    }
}
