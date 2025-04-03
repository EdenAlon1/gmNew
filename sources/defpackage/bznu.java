package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bznu {
    public static final cskc a = cskc.g("BugleDataModel", "AttachmentToBlobstoreUploader");
    public static final cfva b = cfvl.r(164486593, "enable_attachment_to_blobstore_uploader");
    public final ffbr c;
    public final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final errl g;

    public bznu(ffbr ffbrVar, ffbr ffbrVar2, errl errlVar, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.c = ffbrVar3;
        this.g = errlVar;
        this.d = ffbrVar4;
    }

    public static ArrayList b(List list, String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                for (MessagePartCoreData messagePartCoreData : ((bdou) it.next()).ab()) {
                    if (f(messagePartCoreData)) {
                        arrayList.add(messagePartCoreData);
                    }
                }
            }
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((bdou) it2.next()).ab().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        MessagePartCoreData messagePartCoreData2 = (MessagePartCoreData) it3.next();
                        if (TextUtils.equals(messagePartCoreData2.aa(), str) && f(messagePartCoreData2)) {
                            arrayList.add(messagePartCoreData2);
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private static boolean d(MessagePartCoreData messagePartCoreData) {
        return (TextUtils.isEmpty(messagePartCoreData.Q()) || messagePartCoreData.bc()) && !messagePartCoreData.aV();
    }

    private static boolean e(MessagePartCoreData messagePartCoreData) {
        return (TextUtils.isEmpty(messagePartCoreData.T()) || messagePartCoreData.bf()) && !messagePartCoreData.aW();
    }

    private static boolean f(MessagePartCoreData messagePartCoreData) {
        if (messagePartCoreData.t() == null) {
            return false;
        }
        if (d(messagePartCoreData)) {
            return true;
        }
        return messagePartCoreData.bo() && e(messagePartCoreData);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0158 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.elfl a(java.util.List r17, boolean r18, java.lang.String r19, defpackage.cgwn r20, j$.util.Optional r21) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bznu.a(java.util.List, boolean, java.lang.String, cgwn, j$.util.Optional):elfl");
    }

    public final void c(MessagePartCoreData messagePartCoreData, bwdi bwdiVar) {
        ekzz f = eleg.f("AttachmentToBlobstoreUploader#updatePartRowIfExists");
        try {
            ((bdpt) this.d.b()).f(messagePartCoreData.A(), messagePartCoreData.B(), messagePartCoreData.aa(), bwdiVar);
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
