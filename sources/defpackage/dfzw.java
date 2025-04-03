package defpackage;

import com.google.android.gms.constellation.IdTokenRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfzw {
    public String a;
    public String b;

    public final IdTokenRequest a() {
        if (this.a == null) {
            this.a = "";
        }
        if (this.b == null) {
            this.b = "";
        }
        return new IdTokenRequest(this.a, this.b);
    }
}
