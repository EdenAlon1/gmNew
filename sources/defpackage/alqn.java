package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alqn extends alrj {
    public int c;
    private MessageCoreData d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private byte l;
    public Optional a = Optional.empty();
    private Optional j = Optional.empty();
    public Optional b = Optional.empty();
    private Optional k = Optional.empty();

    @Override // defpackage.alrj
    public final alrk a() {
        MessageCoreData messageCoreData;
        int i;
        if (this.l == 31 && (messageCoreData = this.d) != null && (i = this.c) != 0) {
            return new alqo(messageCoreData, this.e, this.f, this.g, this.h, this.a, i, this.i, this.j, this.b, this.k);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" messageSnapshot");
        }
        if ((this.l & 1) == 0) {
            sb.append(" subId");
        }
        if ((this.l & 2) == 0) {
            sb.append(" resultCode");
        }
        if ((this.l & 4) == 0) {
            sb.append(" httpStatusCode");
        }
        if ((this.l & 8) == 0) {
            sb.append(" errorCode");
        }
        if (this.c == 0) {
            sb.append(" mmsApi");
        }
        if ((this.l & 16) == 0) {
            sb.append(" lastConnectionFailureCauseCode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.alrj
    public final void b(int i) {
        this.h = i;
        this.l = (byte) (this.l | 8);
    }

    @Override // defpackage.alrj
    public final void c(eoov eoovVar) {
        this.j = Optional.of(eoovVar);
    }

    @Override // defpackage.alrj
    public final void d(int i) {
        this.g = i;
        this.l = (byte) (this.l | 4);
    }

    @Override // defpackage.alrj
    public final void e(int i) {
        this.i = i;
        this.l = (byte) (this.l | 16);
    }

    @Override // defpackage.alrj
    public final void f(MessageCoreData messageCoreData) {
        if (messageCoreData == null) {
            throw new NullPointerException("Null messageSnapshot");
        }
        this.d = messageCoreData;
    }

    @Override // defpackage.alrj
    public final void g(int i) {
        this.f = i;
        this.l = (byte) (this.l | 2);
    }

    @Override // defpackage.alrj
    public final void h(eopk eopkVar) {
        this.k = Optional.of(eopkVar);
    }

    @Override // defpackage.alrj
    public final void i(int i) {
        this.e = i;
        this.l = (byte) (this.l | 1);
    }
}
