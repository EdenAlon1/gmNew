package com.google.android.rcs.client.messaging;

import android.app.PendingIntent;
import defpackage.engw;
import defpackage.enkr;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_CreateGroupRequest extends CreateGroupRequest {
    private final PendingIntent a;
    private final String b;
    private final String c;
    private final engw d;
    private final Optional e;

    public AutoValue_CreateGroupRequest(PendingIntent pendingIntent, String str, String str2, engw engwVar, Optional optional) {
        this.a = pendingIntent;
        this.b = str;
        this.c = str2;
        this.d = engwVar;
        this.e = optional;
    }

    @Override // com.google.android.rcs.client.messaging.CreateGroupRequest
    public final PendingIntent a() {
        return this.a;
    }

    @Override // com.google.android.rcs.client.messaging.CreateGroupRequest
    public final engw b() {
        return this.d;
    }

    @Override // com.google.android.rcs.client.messaging.CreateGroupRequest
    public final Optional c() {
        return this.e;
    }

    @Override // com.google.android.rcs.client.messaging.CreateGroupRequest
    public final String d() {
        return this.b;
    }

    @Override // com.google.android.rcs.client.messaging.CreateGroupRequest
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CreateGroupRequest) {
            CreateGroupRequest createGroupRequest = (CreateGroupRequest) obj;
            if (this.a.equals(createGroupRequest.a()) && this.b.equals(createGroupRequest.d()) && this.c.equals(createGroupRequest.e()) && enkr.h(this.d, createGroupRequest.b()) && this.e.equals(createGroupRequest.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        Optional optional = this.e;
        engw engwVar = this.d;
        return "CreateGroupRequest{intent=" + this.a.toString() + ", id=" + this.b + ", subject=" + this.c + ", member=" + engwVar.toString() + ", opaqueData=" + String.valueOf(optional) + "}";
    }
}
