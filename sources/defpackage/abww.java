package defpackage;

import android.os.Bundle;
import androidx.car.app.model.Alert;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abww implements abwj {
    static final cfva a = cfvl.e(cfvl.b, "donation_recent_collector_max_message_count", 50);
    static final cfva b = cfvl.e(cfvl.b, "donation_recent_collector_max_conversation_count", Alert.DURATION_SHOW_INDEFINITELY);
    static final cfva c = cfvl.e(cfvl.b, "donation_recent_collector_max_messages_per_conversation", 10);
    static final cfva d = cfvl.i(cfvl.b, "donation_recent_collector_include_sent_messages", false);
    static final cfva e = cfvl.i(cfvl.b, "donation_recent_collector_include_long_code_messages", true);
    static final cfva f = cfvl.i(cfvl.b, "donation_recent_collector_include_group_conversations", false);
    static final cfup g = cfvl.c(cfvl.b, "donation_recent_collector_edit_distance_threshold", eobe.a);
    public static final /* synthetic */ int k = 0;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    private final errl l;

    public abww(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, errl errlVar) {
        this.h = ffbrVar;
        this.i = ffbrVar2;
        this.j = ffbrVar3;
        this.l = errlVar;
    }

    @Override // defpackage.abwj
    public final elfl a(final Bundle bundle) {
        return elfo.g(new Callable() { // from class: abwu
            /* JADX WARN: Removed duplicated region for block: B:26:0x01a4 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:65:0x0149 A[SYNTHETIC] */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 690
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.abwu.call():java.lang.Object");
            }
        }, this.l);
    }
}
