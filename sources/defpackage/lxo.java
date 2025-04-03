package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lxo implements lwn {
    public long a;
    private final lwn b;

    public lxo(lwn lwnVar) {
        this.b = lwnVar;
        Map map = Collections.EMPTY_MAP;
    }

    @Override // defpackage.lpp
    public final int a(byte[] bArr, int i, int i2) {
        int a = this.b.a(bArr, i, i2);
        if (a != -1) {
            this.a += a;
        }
        return a;
    }

    @Override // defpackage.lwn
    public final long b(lwv lwvVar) {
        Uri uri = lwvVar.a;
        Map map = Collections.EMPTY_MAP;
        try {
            return this.b.b(lwvVar);
        } finally {
            c();
            e();
        }
    }

    @Override // defpackage.lwn
    public final Uri c() {
        return this.b.c();
    }

    @Override // defpackage.lwn
    public final void d() {
        this.b.d();
    }

    @Override // defpackage.lwn
    public final Map e() {
        return this.b.e();
    }

    @Override // defpackage.lwn
    public final void f(lxp lxpVar) {
        lti.f(lxpVar);
        this.b.f(lxpVar);
    }
}
