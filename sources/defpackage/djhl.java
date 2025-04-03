package defpackage;

import android.content.Context;
import com.google.android.rcs.client.messaging.CreateGroupRequest;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djhl {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;

    public djhl(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
        this.e = ffbrVar5;
    }

    public final djhk a(CreateGroupRequest createGroupRequest) {
        createGroupRequest.getClass();
        return new djhk(createGroupRequest, (Context) this.a.b(), (eima) this.b.b(), (eing) this.c.b(), this.d, (errl) this.e.b());
    }
}
