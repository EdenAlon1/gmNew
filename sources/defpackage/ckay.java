package defpackage;

import android.os.Bundle;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckay extends ckeo {
    public bdhg a;
    public String b;
    public azhq c;
    public String d;
    public String e;
    public String f;
    public fayv g;
    public LocationInformation h;
    public awxk i;
    private String j;
    private awui k;
    private azcr l;
    private awui m;
    private boolean n;
    private long o;
    private long p;
    private long q;
    private int r;
    private boolean s;
    private int t;
    private Bundle u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private short z;

    @Override // defpackage.ckeo
    public final ckep a() {
        bdhg bdhgVar;
        String str;
        awui awuiVar;
        azcr azcrVar;
        awui awuiVar2;
        Bundle bundle;
        if (this.z == 2047 && (bdhgVar = this.a) != null && (str = this.j) != null && (awuiVar = this.k) != null && (azcrVar = this.l) != null && (awuiVar2 = this.m) != null && (bundle = this.u) != null) {
            return new ckaz(bdhgVar, str, awuiVar, azcrVar, awuiVar2, this.b, this.n, this.c, this.d, this.e, this.o, this.p, this.f, this.q, this.r, this.s, this.g, this.h, this.t, bundle, this.v, this.w, this.x, this.y, this.i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" rcsMessageId");
        }
        if (this.j == null) {
            sb.append(" remoteUserId");
        }
        if (this.k == null) {
            sb.append(" remoteChatEndpoint");
        }
        if (this.l == null) {
            sb.append(" senderDestinationToken");
        }
        if (this.m == null) {
            sb.append(" selfChatEndpoint");
        }
        if ((this.z & 1) == 0) {
            sb.append(" isGroup");
        }
        if ((this.z & 2) == 0) {
            sb.append(" sentTimestamp");
        }
        if ((this.z & 4) == 0) {
            sb.append(" receivedTimestamp");
        }
        if ((this.z & 8) == 0) {
            sb.append(" rcsSessionId");
        }
        if ((this.z & 16) == 0) {
            sb.append(" spamVerdict");
        }
        if ((this.z & 32) == 0) {
            sb.append(" isMarkedAsBot");
        }
        if ((this.z & 64) == 0) {
            sb.append(" messageStatus");
        }
        if (this.u == null) {
            sb.append(" additionalMessageDetails");
        }
        if ((this.z & 128) == 0) {
            sb.append(" isDeliveryReportRequested");
        }
        if ((this.z & 256) == 0) {
            sb.append(" isNegativeDeliveryReportRequested");
        }
        if ((this.z & 512) == 0) {
            sb.append(" isDisplayReportRequested");
        }
        if ((this.z & 1024) == 0) {
            sb.append(" shouldClearTypingIndicator");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ckeo
    public final void b(Bundle bundle) {
        if (bundle == null) {
            throw new NullPointerException("Null additionalMessageDetails");
        }
        this.u = bundle;
    }

    @Override // defpackage.ckeo
    public final void c(boolean z) {
        this.v = z;
        this.z = (short) (this.z | 128);
    }

    @Override // defpackage.ckeo
    public final void d(boolean z) {
        this.x = z;
        this.z = (short) (this.z | 512);
    }

    @Override // defpackage.ckeo
    public final void e(boolean z) {
        this.n = z;
        this.z = (short) (this.z | 1);
    }

    @Override // defpackage.ckeo
    public final void f(boolean z) {
        this.s = z;
        this.z = (short) (this.z | 32);
    }

    @Override // defpackage.ckeo
    public final void g(boolean z) {
        this.w = z;
        this.z = (short) (this.z | 256);
    }

    @Override // defpackage.ckeo
    public final void h(int i) {
        this.t = i;
        this.z = (short) (this.z | 64);
    }

    @Override // defpackage.ckeo
    public final void i() {
        this.q = -1L;
        this.z = (short) (this.z | 8);
    }

    @Override // defpackage.ckeo
    public final void j(long j) {
        this.p = j;
        this.z = (short) (this.z | 4);
    }

    @Override // defpackage.ckeo
    public final void k(awui awuiVar) {
        if (awuiVar == null) {
            throw new NullPointerException("Null remoteChatEndpoint");
        }
        this.k = awuiVar;
    }

    @Override // defpackage.ckeo
    public final void l(String str) {
        if (str == null) {
            throw new NullPointerException("Null remoteUserId");
        }
        this.j = str;
    }

    @Override // defpackage.ckeo
    public final void m(awui awuiVar) {
        if (awuiVar == null) {
            throw new NullPointerException("Null selfChatEndpoint");
        }
        this.m = awuiVar;
    }

    @Override // defpackage.ckeo
    public final void n(azcr azcrVar) {
        if (azcrVar == null) {
            throw new NullPointerException("Null senderDestinationToken");
        }
        this.l = azcrVar;
    }

    @Override // defpackage.ckeo
    public final void o(long j) {
        this.o = j;
        this.z = (short) (this.z | 2);
    }

    @Override // defpackage.ckeo
    public final void p(boolean z) {
        this.y = z;
        this.z = (short) (this.z | 1024);
    }

    @Override // defpackage.ckeo
    public final void q(int i) {
        this.r = i;
        this.z = (short) (this.z | 16);
    }
}
