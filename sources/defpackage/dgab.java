package defpackage;

import android.os.Bundle;
import com.google.android.gms.constellation.IdTokenRequest;
import com.google.android.gms.constellation.VerifyPhoneNumberRequest;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgab {
    public String a;
    public IdTokenRequest b;
    public Bundle c;
    public List d;
    public int e;
    private boolean f;
    private List g;

    public final VerifyPhoneNumberRequest a() {
        if (this.a == null) {
            this.a = fdmd.a.get().a();
        }
        if (this.b == null) {
            this.b = new dfzw().a();
        }
        if (this.c == null) {
            this.c = Bundle.EMPTY;
        }
        if (this.d == null) {
            this.d = new ArrayList();
        }
        if (this.e != 1) {
            this.e = 0;
        }
        if (this.g == null) {
            this.g = new ArrayList();
        }
        return new VerifyPhoneNumberRequest(this.a, 0L, this.b, this.c, this.d, this.f, this.e, this.g);
    }

    public final void b() {
        this.f = true;
    }
}
