package defpackage;

import android.net.NetworkRequest;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class poj {
    public static final poj a = new poj(false, 15);
    public final qad b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final Set i;
    public final int j;

    public poj(poj pojVar) {
        pojVar.getClass();
        this.c = pojVar.c;
        this.d = pojVar.d;
        this.b = pojVar.b;
        this.j = pojVar.j;
        this.e = pojVar.e;
        this.f = pojVar.f;
        this.i = pojVar.i;
        this.g = pojVar.g;
        this.h = pojVar.h;
    }

    public final NetworkRequest a() {
        return (NetworkRequest) this.b.b;
    }

    public final boolean b() {
        return !this.i.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ffkj.e(getClass(), obj.getClass())) {
            return false;
        }
        poj pojVar = (poj) obj;
        if (this.c == pojVar.c && this.d == pojVar.d && this.e == pojVar.e && this.f == pojVar.f && this.g == pojVar.g && this.h == pojVar.h && ffkj.e(a(), pojVar.a()) && this.j == pojVar.j) {
            return ffkj.e(this.i, pojVar.i);
        }
        return false;
    }

    public final int hashCode() {
        long j = this.h;
        int i = this.j;
        Set set = this.i;
        long j2 = this.g;
        int hashCode = (((((((((((((i * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + set.hashCode();
        NetworkRequest a2 = a();
        return (hashCode * 31) + (a2 != null ? a2.hashCode() : 0);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + ((Object) ppu.a(this.j)) + ", requiresCharging=" + this.c + ", requiresDeviceIdle=" + this.d + ", requiresBatteryNotLow=" + this.e + ", requiresStorageNotLow=" + this.f + ", contentTriggerUpdateDelayMillis=" + this.g + ", contentTriggerMaxDelayMillis=" + this.h + ", contentUriTriggers=" + this.i + ", }";
    }

    public /* synthetic */ poj(boolean z, int i) {
        if ((i & 1) == 0) {
            throw null;
        }
        boolean z2 = z & ((i & 2) == 0);
        ffen ffenVar = ffen.a;
        this.b = new qad((byte[]) null);
        this.j = 1;
        this.c = z2;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = -1L;
        this.h = -1L;
        this.i = ffenVar;
    }

    public poj(qad qadVar, int i, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set set) {
        qadVar.getClass();
        if (i == 0) {
            throw null;
        }
        set.getClass();
        this.b = qadVar;
        this.j = i;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = j;
        this.h = j2;
        this.i = set;
    }
}
