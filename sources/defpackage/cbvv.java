package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbvv {
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final atbw f;
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/datamodel/tombstones/status/TombstoneStatusChecker");
    public static final enip a = enip.v(Integer.valueOf(BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED), 229, 204, 221, 231, Integer.valueOf(BasePaymentResult.ERROR_REQUEST_FAILED), 225, 226, 218, 220, 230, 243, 244, 245);

    public cbvv(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, atbw atbwVar) {
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = atbwVar;
    }

    public static String a(Context context) {
        return context.getResources().getString(R.string.this_chat_is_no_longer_encrypted_v2);
    }

    public static String b(Context context) {
        return context.getResources().getString(R.string.this_chat_is_encrypted_v2);
    }

    public static String c(Context context, boolean z) {
        return z ? context.getResources().getString(R.string.tombstone_show_link_previews) : context.getResources().getString(R.string.tombstone_show_link_previews_disabled);
    }

    public static boolean e(int i) {
        return i == 117 || i == 23;
    }

    public static boolean f(int i) {
        return i == 209 || i == 208;
    }

    public static boolean g(int i) {
        return i == 211 || i == 217 || i == 239 || i == 249 || i == 248 || i == 247 || i == 246 || i == 250 || i == 240 || i == 245;
    }

    public static boolean h(int i) {
        return i >= 200 && i <= 267;
    }

    private static boolean i(List list, ffbr ffbrVar) {
        return ((Boolean) ((cfup) ctjd.aF.get()).e()).booleanValue() && ((Optional) ((fbbb) ffbrVar).a).isPresent() && list.size() == 1 && ((bcyx) list.get(0)).c();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String d(java.util.List r17, int r18, boolean r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, android.content.Context r24) {
        /*
            Method dump skipped, instructions count: 1802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbvv.d(java.util.List, int, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, android.content.Context):java.lang.String");
    }
}
