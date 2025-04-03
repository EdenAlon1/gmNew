package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcqk extends bcxb {
    private short A;
    public MessageIdType a;
    public String b;
    public String c;
    public Uri d;
    public Uri e;
    public String f;
    public String g;
    public LocationInformation h;
    public String i;
    public String j;
    public String k;
    public dteh l;
    public awap m;
    public byyz n;
    private int o;
    private int p;
    private long q;
    private long r;
    private eohh s;
    private long t;
    private long u;
    private byza v;
    private int w;
    private boolean x;
    private boolean y;
    private byzh z;

    @Override // defpackage.bcxb
    public final bcxc a() {
        MessageIdType messageIdType;
        eohh eohhVar;
        byza byzaVar;
        byzh byzhVar;
        if (this.A == 511 && (messageIdType = this.a) != null && (eohhVar = this.s) != null && (byzaVar = this.v) != null && (byzhVar = this.z) != null) {
            return new bcql(messageIdType, this.b, this.c, this.d, this.e, this.o, this.p, this.q, this.r, eohhVar, this.f, this.g, this.t, this.h, this.i, this.j, this.k, this.l, this.u, byzaVar, this.w, this.x, this.y, this.m, this.n, byzhVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" messageId");
        }
        if ((this.A & 1) == 0) {
            sb.append(" width");
        }
        if ((this.A & 2) == 0) {
            sb.append(" height");
        }
        if ((this.A & 4) == 0) {
            sb.append(" duration");
        }
        if ((this.A & 8) == 0) {
            sb.append(" targetFileSize");
        }
        if (this.s == null) {
            sb.append(" source");
        }
        if ((this.A & 16) == 0) {
            sb.append(" mediaModifiedTimestamp");
        }
        if ((this.A & 32) == 0) {
            sb.append(" fileSizeBytes");
        }
        if (this.v == null) {
            sb.append(" mediaSendType");
        }
        if ((this.A & 64) == 0) {
            sb.append(" bundleIndex");
        }
        if ((this.A & 128) == 0) {
            sb.append(" preserveSize");
        }
        if ((this.A & 256) == 0) {
            sb.append(" saveToExternalStorage");
        }
        if (this.z == null) {
            sb.append(" richCardMediaDownloadFailureReason");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.bcxb
    public final eohh b() {
        eohh eohhVar = this.s;
        if (eohhVar != null) {
            return eohhVar;
        }
        throw new IllegalStateException("Property \"source\" has not been set");
    }

    @Override // defpackage.bcxb
    public final Optional c() {
        return (this.A & 128) == 0 ? Optional.empty() : Optional.of(Boolean.valueOf(this.x));
    }

    @Override // defpackage.bcxb
    public final Optional d() {
        return (this.A & 256) == 0 ? Optional.empty() : Optional.of(Boolean.valueOf(this.y));
    }

    @Override // defpackage.bcxb
    public final String e() {
        return this.c;
    }

    @Override // defpackage.bcxb
    public final void f(int i) {
        this.w = i;
        this.A = (short) (this.A | 64);
    }

    @Override // defpackage.bcxb
    public final void g(long j) {
        this.q = j;
        this.A = (short) (this.A | 4);
    }

    @Override // defpackage.bcxb
    public final void h(long j) {
        this.u = j;
        this.A = (short) (this.A | 32);
    }

    @Override // defpackage.bcxb
    public final void i(int i) {
        this.p = i;
        this.A = (short) (this.A | 2);
    }

    @Override // defpackage.bcxb
    public final void j(long j) {
        this.t = j;
        this.A = (short) (this.A | 16);
    }

    @Override // defpackage.bcxb
    public final void k(byza byzaVar) {
        if (byzaVar == null) {
            throw new NullPointerException("Null mediaSendType");
        }
        this.v = byzaVar;
    }

    @Override // defpackage.bcxb
    public final void l(boolean z) {
        this.x = z;
        this.A = (short) (this.A | 128);
    }

    @Override // defpackage.bcxb
    public final void m(byzh byzhVar) {
        if (byzhVar == null) {
            throw new NullPointerException("Null richCardMediaDownloadFailureReason");
        }
        this.z = byzhVar;
    }

    @Override // defpackage.bcxb
    public final void n(boolean z) {
        this.y = z;
        this.A = (short) (this.A | 256);
    }

    @Override // defpackage.bcxb
    public final void o(eohh eohhVar) {
        if (eohhVar == null) {
            throw new NullPointerException("Null source");
        }
        this.s = eohhVar;
    }

    @Override // defpackage.bcxb
    public final void p(long j) {
        this.r = j;
        this.A = (short) (this.A | 8);
    }

    @Override // defpackage.bcxb
    public final void q(int i) {
        this.o = i;
        this.A = (short) (this.A | 1);
    }
}
