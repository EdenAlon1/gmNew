package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnbt {
    public final cnbf a;

    public cnbt(cnbf cnbfVar) {
        this.a = cnbfVar;
    }

    public final ConversationIdType a() {
        return bdgq.b(this.a.c);
    }

    public final MessageIdType b() {
        return bdhb.b(this.a.d);
    }

    public final cmrl c() {
        cmrl cmrlVar = this.a.e;
        return cmrlVar == null ? cmrl.a : cmrlVar;
    }

    public final cmrm d() {
        cmrm b = cmrm.b(this.a.g);
        return b == null ? cmrm.UNRECOGNIZED : b;
    }

    public final cmrs e() {
        cmrs cmrsVar = this.a.f;
        return cmrsVar == null ? cmrs.a : cmrsVar;
    }

    public final cmry f() {
        cmry cmryVar = this.a.h;
        return cmryVar == null ? cmry.a : cmryVar;
    }
}
