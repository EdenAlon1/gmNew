package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqgn {
    public static boolean a(eokl eoklVar) {
        emxf.b(!Objects.equals(eoklVar, eokl.UNKNOWN_LATCH_REASON), "unknown fallback latch reason");
        return Objects.equals(eoklVar, eokl.DEBUG_MENU_COMMAND_FAIL_SEND) || Objects.equals(eoklVar, eokl.MANUAL_RETRY_FORCES_FALLBACK) || Objects.equals(eoklVar, eokl.DITTO_CHANNEL_RESEND);
    }
}
