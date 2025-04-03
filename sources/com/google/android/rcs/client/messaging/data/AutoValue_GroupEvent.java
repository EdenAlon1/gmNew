package com.google.android.rcs.client.messaging.data;

import defpackage.engw;
import defpackage.enkr;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_GroupEvent extends GroupEvent {
    private final engw a;

    public AutoValue_GroupEvent(engw engwVar) {
        this.a = engwVar;
    }

    @Override // com.google.android.rcs.client.messaging.data.GroupEvent
    public final engw a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GroupEvent) {
            return enkr.h(this.a, ((GroupEvent) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
