package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctin {
    public List a;
    public List b;
    public List c;
    public List d;
    public List e;
    public byte f;
    private fbqx g;

    public final ctje a() {
        return new ctje(this.a, this.b, this.c, this.d, this.e, this.g, (~this.f) & 63);
    }

    public final void b(fbqx fbqxVar) {
        if (fbqxVar == null) {
            throw new NullPointerException("Null rejectionReason");
        }
        this.g = fbqxVar;
        this.f = (byte) (this.f | 32);
    }
}
