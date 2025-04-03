package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdve {
    private static final cskc a = cskc.g("Bugle", "AttachmentUtils");
    private final Context b;
    private final csuk c;
    private final csuu d;
    private final cpbs e;
    private final ctfj f;
    private int g = -1;
    private final ffbr h;
    private final ffbr i;
    private final ffbr j;

    public bdve(Context context, csuk csukVar, csuu csuuVar, cpbs cpbsVar, ctfj ctfjVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.b = context;
        this.c = csukVar;
        this.d = csuuVar;
        this.e = cpbsVar;
        this.f = ctfjVar;
        this.h = ffbrVar;
        this.i = ffbrVar2;
        this.j = ffbrVar3;
    }

    private final int e(int i) {
        int i2 = this.g;
        if (i2 != -1) {
            return i2;
        }
        int b = this.c.b(i);
        this.g = b;
        return b;
    }

    private static boolean f(MessagePartCoreData messagePartCoreData) {
        if (messagePartCoreData.aZ()) {
            return (((Boolean) cjja.a.e()).booleanValue() && messagePartCoreData.bm()) ? false : true;
        }
        return false;
    }

    public final long a(Context context, MessagePartCoreData messagePartCoreData, long j) {
        csix.l(context);
        csix.l(messagePartCoreData);
        boolean z = true;
        if (!le.f(messagePartCoreData.V()) && !le.A(messagePartCoreData.V())) {
            z = false;
        }
        csix.k(z);
        Uri t = messagePartCoreData.t();
        if (t == null) {
            return j;
        }
        ctee cteeVar = new ctee(context);
        try {
            try {
                cteeVar.c(t);
                j = cteeVar.d(j);
            } catch (IOException e) {
                csjb c = a.c();
                c.I("Error extracting duration from");
                c.I(t);
                c.s(e);
            }
            return j;
        } finally {
            cteeVar.b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r23, int r24, android.net.Uri r25, long r26) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdve.b(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, int, android.net.Uri, long):java.util.List");
    }

    final boolean c(MessagePartCoreData messagePartCoreData, long j, boolean z) {
        Uri t = messagePartCoreData.t();
        if (messagePartCoreData.bu()) {
            Uri t2 = messagePartCoreData.t();
            if (((Boolean) cbib.a.e()).booleanValue() && z && t2 != null && this.d.b(t2) > ((Long) cbib.e.e()).longValue()) {
                return true;
            }
            if (messagePartCoreData.w() != null && messagePartCoreData.p() > j) {
                return true;
            }
            if (t != null && this.d.b(t) > j) {
                return true;
            }
        }
        return false;
    }

    public final void d(MessageCoreData messageCoreData, Uri uri, long j, List list) {
        boolean z;
        Iterator it = list.iterator();
        boolean z2 = false;
        boolean z3 = false;
        loop0: while (true) {
            z = z3;
            while (it.hasNext()) {
                byzc J = ((MessagePartCoreData) it.next()).J();
                if (J.a()) {
                    if (J == byzc.TOO_LARGE) {
                        break;
                    } else {
                        z3 = true;
                    }
                }
            }
            z3 = true;
        }
        Iterator it2 = messageCoreData.ab().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (((MessagePartCoreData) it2.next()).w() != null) {
                z2 = true;
                break;
            }
        }
        ConversationIdType z4 = messageCoreData.z();
        if (!((Boolean) cjja.a.e()).booleanValue() || messageCoreData.Q() == null) {
            messageCoreData.cf(z4, uri, j);
        }
        if (!z3) {
            if (z2) {
                messageCoreData.bj(j);
            }
        } else if (z) {
            messageCoreData.bm(j);
        } else {
            messageCoreData.bc(j);
        }
    }
}
