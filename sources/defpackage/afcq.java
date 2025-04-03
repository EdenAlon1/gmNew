package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afcq extends agzg {
    public ConversationIdType a;
    private long b;
    private boolean c;
    private boolean d;
    private int e;
    private ctsx f;
    private byte g;

    public afcq() {
    }

    @Override // defpackage.agzg
    public final agzh a() {
        ConversationIdType conversationIdType;
        ctsx ctsxVar;
        if (this.g == 15 && (conversationIdType = this.a) != null && (ctsxVar = this.f) != null) {
            return new afcr(this.b, conversationIdType, this.c, this.d, this.e, ctsxVar);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.g & 1) == 0) {
            sb.append(" sortTimestamp");
        }
        if (this.a == null) {
            sb.append(" conversationId");
        }
        if ((this.g & 2) == 0) {
            sb.append(" conversationIsPinned");
        }
        if ((this.g & 4) == 0) {
            sb.append(" isWear");
        }
        if ((this.g & 8) == 0) {
            sb.append(" limit");
        }
        if (this.f == null) {
            sb.append(" nudgeSettingsData");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.agzg
    public final void b(boolean z) {
        this.c = z;
        this.g = (byte) (this.g | 2);
    }

    @Override // defpackage.agzg
    public final void c(boolean z) {
        this.d = z;
        this.g = (byte) (this.g | 4);
    }

    @Override // defpackage.agzg
    public final void d(int i) {
        this.e = i;
        this.g = (byte) (this.g | 8);
    }

    @Override // defpackage.agzg
    public final void e(ctsx ctsxVar) {
        if (ctsxVar == null) {
            throw new NullPointerException("Null nudgeSettingsData");
        }
        this.f = ctsxVar;
    }

    @Override // defpackage.agzg
    public final void f(long j) {
        this.b = j;
        this.g = (byte) (this.g | 1);
    }

    public afcq(agzh agzhVar) {
        afcr afcrVar = (afcr) agzhVar;
        this.b = afcrVar.a;
        this.a = afcrVar.b;
        this.c = afcrVar.c;
        this.d = afcrVar.d;
        this.e = afcrVar.e;
        this.f = afcrVar.f;
        this.g = (byte) 15;
    }
}
