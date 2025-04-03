package com.google.android.rcs.client.messaging;

import defpackage.eica;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_GroupMember extends GroupMember {
    private final String a;
    private final eica b;
    private final Optional c;
    private final boolean d;

    public AutoValue_GroupMember(String str, eica eicaVar, Optional optional, boolean z) {
        this.a = str;
        this.b = eicaVar;
        this.c = optional;
        this.d = z;
    }

    @Override // com.google.android.rcs.client.messaging.GroupMember
    public final eica a() {
        return this.b;
    }

    @Override // com.google.android.rcs.client.messaging.GroupMember
    public final Optional b() {
        return this.c;
    }

    @Override // com.google.android.rcs.client.messaging.GroupMember
    public final String c() {
        return this.a;
    }

    @Override // com.google.android.rcs.client.messaging.GroupMember
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GroupMember) {
            GroupMember groupMember = (GroupMember) obj;
            if (this.a.equals(groupMember.c()) && this.b.equals(groupMember.a()) && this.c.equals(groupMember.b()) && this.d == groupMember.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }
}
