package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayvt {
    private final ffbr a;

    public ayvt(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.a = ffbrVar;
    }

    public final ConversationIdType a(ckjz ckjzVar) {
        if (((ckhr) ckjzVar).c) {
            return ((ckju) this.a.b()).a(ckjzVar);
        }
        throw new IllegalArgumentException("isRcsGroup must be true.");
    }
}
