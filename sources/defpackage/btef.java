package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class btef extends dtrr {
    public long a;
    public MessageIdType b;
    public byyx c;
    public long d;
    public boolean e;
    public Duration f;

    public btef() {
        super(btfo.e());
        this.b = bdhb.a;
        this.e = false;
        this.f = bdgu.b(0L);
    }

    public final bted a() {
        btee bteeVar = new btee();
        bteeVar.aC(aB());
        bteeVar.a = this.a;
        bteeVar.b = this.b;
        bteeVar.c = this.c;
        bteeVar.d = this.d;
        bteeVar.e = this.e;
        bteeVar.f = this.f;
        bteeVar.cK = aC();
        return bteeVar;
    }

    public final void b(Duration duration) {
        int i = this.aB;
        if (i < 60710) {
            dtub.w("flagged_message_delay", i);
        }
        aE(5);
        this.f = duration;
    }

    public final void c(MessageIdType messageIdType) {
        aE(1);
        this.b = messageIdType;
    }

    public final void d(long j) {
        int i = this.aB;
        if (i < 39030) {
            dtub.w("flagged_message_timestamp", i);
        }
        aE(3);
        this.d = j;
    }

    public final void e(byyx byyxVar) {
        aE(2);
        this.c = byyxVar;
    }
}
