package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class bbfp {
    public static int a(int i) {
        csix.d(i, 31, 38);
        return i - 31;
    }

    public static int b(int i) {
        csix.d(i, 11, 18);
        return i - 11;
    }

    public static int c(MessageCoreData messageCoreData) {
        return messageCoreData.cK() ? messageCoreData.cy() ? 16 : 36 : messageCoreData.de() ? 15 : 35;
    }

    public static String d(int i) {
        switch (i) {
            case 0:
                return "sms_send";
            case 1:
                return "mms_send";
            case 2:
                return "mms_download";
            case 3:
                return "rcs_send";
            case 4:
                return "rcs_ft_upload";
            case 5:
                return "rcs_ft_download";
            case 6:
                return "cloud_sync_send";
            case 7:
                return "cloud_sync_attachment_download";
            default:
                csix.c(a.h(i, "ProcessPendingMessagesAction: unknown channel "));
                return "unknown";
        }
    }
}
