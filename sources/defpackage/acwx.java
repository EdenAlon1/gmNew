package defpackage;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acwx implements ekoq {
    public static final cskc a = cskc.g("Bugle", "SatelliteNotificationActionsBroadcastReceiver");
    public final ffbr b;
    public final ffbr c;
    private final ffbr d;

    public acwx(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
    }

    private final elfl b(final String str, final aclr aclrVar, final String str2, final byte[] bArr, final int i) {
        return elfo.h(new erog() { // from class: acwt
            @Override // defpackage.erog
            public final ListenableFuture a() {
                acwx acwxVar = acwx.this;
                byte[] bArr2 = bArr;
                String str3 = str;
                try {
                    esol esolVar = (esol) eyfy.parseFrom(esol.a, bArr2, eyfc.a());
                    actj a2 = ((actk) acwxVar.b.b()).a();
                    a2.e();
                    a2.f = true;
                    acua acuaVar = acua.AGNOSTIC;
                    esni esniVar = (esni) esnk.a.createBuilder();
                    esmu esmuVar = (esmu) esmv.a.createBuilder();
                    esmuVar.copyOnWrite();
                    esmv esmvVar = (esmv) esmuVar.instance;
                    esolVar.getClass();
                    esmvVar.c = esolVar;
                    esmvVar.b |= 1;
                    esmuVar.copyOnWrite();
                    esmv esmvVar2 = (esmv) esmuVar.instance;
                    str3.getClass();
                    esmvVar2.d = str3;
                    esniVar.copyOnWrite();
                    esnk esnkVar = (esnk) esniVar.instance;
                    esmv esmvVar3 = (esmv) esmuVar.build();
                    esmvVar3.getClass();
                    esnkVar.c = esmvVar3;
                    esnkVar.b = 211;
                    return a2.b(acuaVar, (esnk) esniVar.build());
                } catch (eygu e) {
                    throw new acww(e);
                }
            }
        }, (Executor) this.d.b()).h(new emwl() { // from class: acwu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                esnn esnnVar = (esnn) obj;
                esmx esmxVar = esnnVar.b == 211 ? (esmx) esnnVar.c : esmx.a;
                if (esmxVar.equals(esmx.a) || !esmxVar.b) {
                    throw new acww();
                }
                return null;
            }
        }, (Executor) this.d.b()).e(Exception.class, new emwl() { // from class: acwv
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Exception exc = (Exception) obj;
                acxa acxaVar = (acxa) acwx.this.c.b();
                String str3 = str;
                if (str3 == null) {
                    throw new NullPointerException("Null replyText");
                }
                String str4 = str2;
                acxaVar.e(new acwl(i, str3, aclrVar, str4, eyee.x(bArr)));
                acwx.a.s("Could not send message reply. Showing failure notification.", exc);
                return null;
            }
        }, (Executor) this.d.b());
    }

    @Override // defpackage.ekoq
    public final ListenableFuture a(Intent intent) {
        String action = intent.getAction();
        if (emxe.c(action)) {
            return elfo.d(new IllegalArgumentException("Received intent with empty action"));
        }
        if (action.equals("com.google.android.apps.messaging.SATELLITE_MESSAGE_REPLY")) {
            a.p("Received message reply action");
            Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
            if (resultsFromIntent == null) {
                return elfo.d(new IllegalArgumentException("Intent contains no RemoteInput results"));
            }
            CharSequence charSequence = resultsFromIntent.getCharSequence("bugle_dittosatellite_reply_text");
            if (charSequence == null) {
                return elfo.d(new IllegalArgumentException("Intent contains no RemoteInput text"));
            }
            aclr aclrVar = new aclr(intent.getStringExtra("bugle_dittosatellite_reply_conversation_id"));
            if (aclrVar.b()) {
                return elfo.d(new IllegalArgumentException("Intent contains no REPLY_CONVERSATION_ID_KEY"));
            }
            String stringExtra = intent.getStringExtra("bugle_dittosatellite_reply_conversation_name");
            if (stringExtra == null) {
                return elfo.d(new IllegalArgumentException("Intent contains no REPLY_CONVERSATION_NAME_KEY"));
            }
            byte[] byteArrayExtra = intent.getByteArrayExtra("bugle_dittosatellite_conversation_proto");
            return byteArrayExtra == null ? elfo.d(new IllegalArgumentException("Intent contains no REPLY_CONVERSATION_PAYLOAD")) : b(charSequence.toString(), aclrVar, stringExtra, byteArrayExtra, 0);
        }
        if (!action.equals("com.google.android.apps.messaging.SATELLITE_RETRY_MESSAGE_REPLY")) {
            return elfo.d(new IllegalArgumentException(String.format("Received unknown action: %s", intent.getAction())));
        }
        a.p("Received message reply retry action");
        String stringExtra2 = intent.getStringExtra("bugle_dittosatellite_reply_text");
        if (stringExtra2 == null) {
            return elfo.d(new IllegalArgumentException("Intent contains no REPLY_TEXT_KEY"));
        }
        aclr aclrVar2 = new aclr(intent.getStringExtra("bugle_dittosatellite_reply_conversation_id"));
        if (aclrVar2.b()) {
            return elfo.d(new IllegalArgumentException("Intent contains no REPLY_CONVERSATION_ID_KEY"));
        }
        String stringExtra3 = intent.getStringExtra("bugle_dittosatellite_reply_conversation_name");
        if (stringExtra3 == null) {
            return elfo.d(new IllegalArgumentException("Intent contains no REPLY_CONVERSATION_NAME_KEY"));
        }
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("bugle_dittosatellite_conversation_proto");
        if (byteArrayExtra2 == null) {
            return elfo.d(new IllegalArgumentException("Intent contains no REPLY_CONVERSATION_PAYLOAD"));
        }
        int intExtra = intent.getIntExtra("bugle_dittosatellite_reply_retry_count", 0);
        return intExtra == 0 ? elfo.d(new IllegalArgumentException("Intent contains no RETRY_COUNT_KEY")) : b(stringExtra2, aclrVar2, stringExtra3, byteArrayExtra2, intExtra);
    }
}
