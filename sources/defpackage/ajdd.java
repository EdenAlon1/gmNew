package defpackage;

import com.google.android.gms.auth.TokenData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajdd extends ajdf {
    private final TokenData a;

    public ajdd(TokenData tokenData) {
        this.a = tokenData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ajdd) && ffkj.e(this.a, ((ajdd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(tokenData=" + this.a + ")";
    }
}
