package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_GroupMember;
import com.google.android.rcs.client.messaging.data.GroupMember;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiej extends eifv {
    public Optional a = Optional.empty();
    private String b;
    private RcsDestinationId c;
    private boolean d;
    private eifw e;
    private byte f;

    @Override // defpackage.eifv
    public final GroupMember a() {
        String str;
        RcsDestinationId rcsDestinationId;
        eifw eifwVar;
        if (this.f == 1 && (str = this.b) != null && (rcsDestinationId = this.c) != null && (eifwVar = this.e) != null) {
            return new AutoValue_GroupMember(str, rcsDestinationId, this.a, this.d, eifwVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" displayName");
        }
        if (this.c == null) {
            sb.append(" id");
        }
        if (this.f == 0) {
            sb.append(" isOwnUser");
        }
        if (this.e == null) {
            sb.append(" status");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.eifv
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null displayName");
        }
        this.b = str;
    }

    @Override // defpackage.eifv
    public final void c(RcsDestinationId rcsDestinationId) {
        if (rcsDestinationId == null) {
            throw new NullPointerException("Null id");
        }
        this.c = rcsDestinationId;
    }

    @Override // defpackage.eifv
    public final void d(boolean z) {
        this.d = z;
        this.f = (byte) 1;
    }

    @Override // defpackage.eifv
    public final void e(RcsDestinationId rcsDestinationId) {
        this.a = Optional.of(rcsDestinationId);
    }

    @Override // defpackage.eifv
    public final void f(eifw eifwVar) {
        if (eifwVar == null) {
            throw new NullPointerException("Null status");
        }
        this.e = eifwVar;
    }
}
