package defpackage;

import android.net.Uri;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckaw extends ckbw {
    public int a;
    public int b;
    public Uri c;
    public eqxi d;
    public byte e;
    public int f;
    private byzl g;
    private int h;
    private Optional i;

    public ckaw() {
        this.i = Optional.empty();
    }

    @Override // defpackage.ckbw
    public final ckbx a() {
        if (this.e == 7 && this.g != null && this.f != 0) {
            return new ckax(this.a, this.b, this.g, this.c, this.h, this.d, this.f, this.i);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.e & 1) == 0) {
            sb.append(" status");
        }
        if ((this.e & 2) == 0) {
            sb.append(" rawStatus");
        }
        if (this.g == null) {
            sb.append(" xmsTransportType");
        }
        if ((this.e & 4) == 0) {
            sb.append(" resultCode");
        }
        if (this.f == 0) {
            sb.append(" mmsApi");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ckbw
    public final void b(int i) {
        this.h = i;
        this.e = (byte) (this.e | 4);
    }

    @Override // defpackage.ckbw
    public final void c(awyp awypVar) {
        this.i = Optional.of(awypVar);
    }

    @Override // defpackage.ckbw
    public final void d(byzl byzlVar) {
        if (byzlVar == null) {
            throw new NullPointerException("Null xmsTransportType");
        }
        this.g = byzlVar;
    }

    public ckaw(ckbx ckbxVar) {
        this.i = Optional.empty();
        ckax ckaxVar = (ckax) ckbxVar;
        this.a = ckaxVar.a;
        this.b = ckaxVar.b;
        this.g = ckaxVar.c;
        this.c = ckaxVar.d;
        this.h = ckaxVar.e;
        this.d = ckaxVar.f;
        this.f = ckaxVar.h;
        this.i = ckaxVar.g;
        this.e = (byte) 7;
    }
}
