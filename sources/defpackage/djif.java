package defpackage;

import android.content.Context;
import com.google.android.rcs.client.messaging.RemoveUserFromGroupRequest;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djif {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;

    public djif(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
        this.e = ffbrVar5;
    }

    public final djie a(RemoveUserFromGroupRequest removeUserFromGroupRequest) {
        removeUserFromGroupRequest.getClass();
        return new djie(removeUserFromGroupRequest, (Context) this.a.b(), (eima) this.b.b(), (eing) this.c.b(), this.d, (errl) this.e.b());
    }
}
