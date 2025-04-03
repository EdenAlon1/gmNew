package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.devl;
import defpackage.dfwq;
import defpackage.dfxk;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CorpusStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CorpusStatus> CREATOR = new devl();
    final boolean a;
    final long b;
    final long c;
    final long d;
    final Bundle e;
    final String f;
    final String g;

    CorpusStatus() {
        this(false, 0L, 0L, 0L, null, null, null);
    }

    public final Map a() {
        HashMap hashMap = new HashMap();
        for (String str : this.e.keySet()) {
            int i = this.e.getInt(str, -1);
            if (i != -1) {
                hashMap.put(str, Integer.valueOf(i));
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CorpusStatus) {
            CorpusStatus corpusStatus = (CorpusStatus) obj;
            if (dfwq.a(Boolean.valueOf(this.a), Boolean.valueOf(corpusStatus.a)) && dfwq.a(Long.valueOf(this.b), Long.valueOf(corpusStatus.b)) && dfwq.a(Long.valueOf(this.c), Long.valueOf(corpusStatus.c)) && dfwq.a(Long.valueOf(this.d), Long.valueOf(corpusStatus.d)) && dfwq.a(a(), corpusStatus.a()) && dfwq.a(this.g, corpusStatus.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d), a(), this.g});
    }

    public final String toString() {
        return "CorpusStatus{found=" + this.a + ", contentIncarnation=" + this.g + ", lastIndexedSeqno=" + this.b + ", lastCommittedSeqno=" + this.c + ", committedNumDocuments=" + this.d + ", counters=" + this.e.toString() + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.d(parcel, 1, this.a);
        dfxk.j(parcel, 2, this.b);
        dfxk.j(parcel, 3, this.c);
        dfxk.j(parcel, 4, this.d);
        dfxk.p(parcel, 5, this.e);
        dfxk.m(parcel, 6, this.f, false);
        dfxk.m(parcel, 7, this.g, false);
        dfxk.c(parcel, a);
    }

    public CorpusStatus(boolean z, long j, long j2, long j3, Bundle bundle, String str, String str2) {
        this.a = z;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = bundle == null ? new Bundle() : bundle;
        this.f = str;
        this.g = str2;
    }
}
