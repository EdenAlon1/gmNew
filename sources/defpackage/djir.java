package defpackage;

import android.content.Context;
import com.google.android.rcs.client.messaging.UpdateGroupRequest;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djir {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;

    public djir(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
        this.e = ffbrVar5;
    }

    public final djiq a(UpdateGroupRequest updateGroupRequest) {
        updateGroupRequest.getClass();
        return new djiq(updateGroupRequest, (Context) this.a.b(), (eima) this.b.b(), (eing) this.c.b(), this.d, (errl) this.e.b());
    }
}
