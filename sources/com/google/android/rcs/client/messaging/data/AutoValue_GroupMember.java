package com.google.android.rcs.client.messaging.data;

import defpackage.eifw;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_GroupMember extends GroupMember {
    private final String a;
    private final RcsDestinationId b;
    private final Optional c;
    private final boolean d;
    private final eifw e;

    public AutoValue_GroupMember(String str, RcsDestinationId rcsDestinationId, Optional optional, boolean z, eifw eifwVar) {
        this.a = str;
        this.b = rcsDestinationId;
        this.c = optional;
        this.d = z;
        this.e = eifwVar;
    }

    @Override // com.google.android.rcs.client.messaging.data.GroupMember
    public final eifw a() {
        return this.e;
    }

    @Override // com.google.android.rcs.client.messaging.data.GroupMember
    public final RcsDestinationId b() {
        return this.b;
    }

    @Override // com.google.android.rcs.client.messaging.data.GroupMember
    public final Optional c() {
        return this.c;
    }

    @Override // com.google.android.rcs.client.messaging.data.GroupMember
    public final String d() {
        return this.a;
    }

    @Override // com.google.android.rcs.client.messaging.data.GroupMember
    public final boolean e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GroupMember) {
            GroupMember groupMember = (GroupMember) obj;
            if (this.a.equals(groupMember.d()) && this.b.equals(groupMember.b()) && this.c.equals(groupMember.c()) && this.d == groupMember.e() && this.e.equals(groupMember.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e.hashCode();
    }
}
