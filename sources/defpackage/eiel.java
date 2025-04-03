package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_GroupRemoteCapabilities;
import com.google.android.rcs.client.messaging.data.GroupRemoteCapabilities;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiel extends eiga {
    private boolean a;
    private Optional b;
    private Optional c;
    private byte d;

    public eiel() {
        this.b = Optional.empty();
        this.c = Optional.empty();
    }

    @Override // defpackage.eiga
    public final GroupRemoteCapabilities a() {
        if (this.d == 1) {
            return new AutoValue_GroupRemoteCapabilities(this.a, this.b, this.c);
        }
        throw new IllegalStateException("Missing required properties: supportsSubjectManagement");
    }

    @Override // defpackage.eiga
    public final void b(Boolean bool) {
        this.c = Optional.of(bool);
    }

    @Override // defpackage.eiga
    public final void c(Boolean bool) {
        this.b = Optional.of(bool);
    }

    @Override // defpackage.eiga
    public final void d(boolean z) {
        this.a = z;
        this.d = (byte) 1;
    }

    public eiel(GroupRemoteCapabilities groupRemoteCapabilities) {
        this.b = Optional.empty();
        this.c = Optional.empty();
        AutoValue_GroupRemoteCapabilities autoValue_GroupRemoteCapabilities = (AutoValue_GroupRemoteCapabilities) groupRemoteCapabilities;
        this.a = autoValue_GroupRemoteCapabilities.a;
        this.b = autoValue_GroupRemoteCapabilities.b;
        this.c = autoValue_GroupRemoteCapabilities.c;
        this.d = (byte) 1;
    }
}
