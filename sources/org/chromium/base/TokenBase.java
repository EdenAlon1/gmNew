package org.chromium.base;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class TokenBase {
    protected final long a;
    protected final long b;

    protected TokenBase(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    private final long getHighForSerialization() {
        return this.a;
    }

    private final long getLowForSerialization() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj.getClass() == getClass()) {
                TokenBase tokenBase = (TokenBase) obj;
                if (tokenBase.a == this.a && tokenBase.b == this.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.a;
        return i + ((int) ((j2 >>> 32) ^ j2));
    }
}
