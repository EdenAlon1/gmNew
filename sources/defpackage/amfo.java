package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amfo extends amik {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final ckte D;
    public final cfmh E;
    public final azcr F;
    public final boolean G;
    public final boolean H;
    public final ConversationId a;
    public final boolean b;
    public final byyt c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final int j;
    public final boolean k;
    public final ayhd l;
    public final int m;
    public final eoxn n;
    public final String o;
    public final String p;
    public final aqux q;
    public final Uri r;
    public final long s;
    public final String t;
    public final Instant u;
    public final cjcn v;
    public final ampp w;
    public final boolean x;
    public final amtc y;
    public final amny z;

    public amfo(ConversationId conversationId, boolean z, byyt byytVar, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, int i, boolean z7, ayhd ayhdVar, int i2, eoxn eoxnVar, String str2, String str3, aqux aquxVar, Uri uri, long j, String str4, Instant instant, cjcn cjcnVar, ampp amppVar, boolean z8, amtc amtcVar, amny amnyVar, boolean z9, boolean z10, boolean z11, ckte ckteVar, cfmh cfmhVar, azcr azcrVar, boolean z12, boolean z13) {
        this.a = conversationId;
        this.b = z;
        this.c = byytVar;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = str;
        this.j = i;
        this.k = z7;
        this.l = ayhdVar;
        this.m = i2;
        this.n = eoxnVar;
        this.o = str2;
        this.p = str3;
        this.q = aquxVar;
        this.r = uri;
        this.s = j;
        this.t = str4;
        this.u = instant;
        this.v = cjcnVar;
        this.w = amppVar;
        this.x = z8;
        this.y = amtcVar;
        this.z = amnyVar;
        this.A = z9;
        this.B = z10;
        this.C = z11;
        this.D = ckteVar;
        this.E = cfmhVar;
        this.F = azcrVar;
        this.G = z12;
        this.H = z13;
    }

    @Override // defpackage.amik, defpackage.amfx
    public final ayhd A() {
        return this.l;
    }

    @Override // defpackage.amik, defpackage.amfx
    public final azcr B() {
        return this.F;
    }

    @Override // defpackage.amik
    public final cjcn C() {
        return this.v;
    }

    @Override // defpackage.amik, defpackage.amfx
    public final ckte D() {
        return this.D;
    }

    @Override // defpackage.amik, defpackage.amfx
    public final eoxn E() {
        return this.n;
    }

    @Override // defpackage.amik, defpackage.amfx
    public final Instant F() {
        return this.u;
    }

    @Override // defpackage.amik, defpackage.amfx
    public final String G() {
        return this.t;
    }

    @Override // defpackage.amik, defpackage.amfx
    public final String H() {
        return this.o;
    }

    @Override // defpackage.amik, defpackage.amfx
    public final String I() {
        return this.p;
    }

    @Override // defpackage.amik, defpackage.amfx
    public final boolean J() {
        return this.k;
    }

    @Override // defpackage.amik, defpackage.amfx
    public final boolean K() {
        return this.x;
    }

    @Override // defpackage.amik, defpackage.alxj
    public final Uri a() {
        return this.r;
    }

    @Override // defpackage.alxj
    public final ConversationId c() {
        return this.a;
    }

    @Override // defpackage.amik, defpackage.alxj
    public final amny d() {
        return this.z;
    }

    @Override // defpackage.amik, defpackage.alxj
    public final ampp e() {
        return this.w;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        aqux aquxVar;
        Uri uri;
        String str4;
        Instant instant;
        ampp amppVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof amik) {
            amik amikVar = (amik) obj;
            if (this.a.equals(amikVar.c()) && this.b == amikVar.r() && this.c.equals(amikVar.g()) && this.d == amikVar.u() && this.e == amikVar.p() && this.f == amikVar.o() && this.g == amikVar.t() && this.h == amikVar.l() && ((str = this.i) != null ? str.equals(amikVar.i()) : amikVar.i() == null) && this.j == amikVar.v() && this.k == amikVar.J() && this.l.equals(amikVar.A()) && this.m == amikVar.w() && this.n.equals(amikVar.E()) && ((str2 = this.o) != null ? str2.equals(amikVar.H()) : amikVar.H() == null) && ((str3 = this.p) != null ? str3.equals(amikVar.I()) : amikVar.I() == null) && ((aquxVar = this.q) != null ? aquxVar.equals(amikVar.f()) : amikVar.f() == null) && ((uri = this.r) != null ? uri.equals(amikVar.a()) : amikVar.a() == null) && this.s == amikVar.x() && ((str4 = this.t) != null ? str4.equals(amikVar.G()) : amikVar.G() == null) && ((instant = this.u) != null ? instant.equals(amikVar.F()) : amikVar.F() == null) && this.v.equals(amikVar.C()) && ((amppVar = this.w) != null ? amppVar.equals(amikVar.e()) : amikVar.e() == null) && this.x == amikVar.K() && this.y.equals(amikVar.z()) && this.z.equals(amikVar.d()) && this.A == amikVar.k() && this.B == amikVar.n() && this.C == amikVar.m() && this.D.equals(amikVar.D()) && this.E.equals(amikVar.h()) && this.F.equals(amikVar.B()) && this.G == amikVar.q() && this.H == amikVar.s()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.amik, defpackage.alxj
    public final aqux f() {
        return this.q;
    }

    @Override // defpackage.alxj
    public final byyt g() {
        return this.c;
    }

    @Override // defpackage.amik, defpackage.alxj
    public final cfmh h() {
        return this.E;
    }

    public final int hashCode() {
        int hashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
        String str = this.i;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int i = true != this.d ? 1237 : 1231;
        int i2 = hashCode * 1000003;
        int i3 = true != this.e ? 1237 : 1231;
        int i4 = (i2 ^ i) * 1000003;
        int hashCode3 = (((((((((((((((((((i4 ^ i3) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ hashCode2) * 1000003) ^ this.j) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m) * 1000003) ^ this.n.hashCode()) * 1000003;
        String str2 = this.o;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.p;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        aqux aquxVar = this.q;
        int hashCode6 = (hashCode5 ^ (aquxVar == null ? 0 : aquxVar.hashCode())) * 1000003;
        Uri uri = this.r;
        int hashCode7 = uri == null ? 0 : uri.hashCode();
        long j = this.s;
        int i5 = (((hashCode6 ^ hashCode7) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        String str4 = this.t;
        int hashCode8 = (i5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        Instant instant = this.u;
        int hashCode9 = (((hashCode8 ^ (instant == null ? 0 : instant.hashCode())) * 1000003) ^ this.v.hashCode()) * 1000003;
        ampp amppVar = this.w;
        return ((((((((((((((((((((((hashCode9 ^ (amppVar != null ? amppVar.hashCode() : 0)) * 1000003) ^ (true != this.x ? 1237 : 1231)) * 1000003) ^ this.y.hashCode()) * 1000003) ^ this.z.hashCode()) * 1000003) ^ (true != this.A ? 1237 : 1231)) * 1000003) ^ (true != this.B ? 1237 : 1231)) * 1000003) ^ (true != this.C ? 1237 : 1231)) * 1000003) ^ this.D.hashCode()) * 1000003) ^ this.E.hashCode()) * 1000003) ^ this.F.hashCode()) * 1000003) ^ (true != this.G ? 1237 : 1231)) * 1000003) ^ (true == this.H ? 1231 : 1237);
    }

    @Override // defpackage.amik, defpackage.alxj
    public final String i() {
        return this.i;
    }

    @Override // defpackage.amik, defpackage.alxj
    public final boolean k() {
        return this.A;
    }

    @Override // defpackage.alxj
    public final boolean l() {
        return this.h;
    }

    @Override // defpackage.amik, defpackage.alxj
    public final boolean m() {
        return this.C;
    }

    @Override // defpackage.amik, defpackage.alxj
    public final boolean n() {
        return this.B;
    }

    @Override // defpackage.alxj
    public final boolean o() {
        return this.f;
    }

    @Override // defpackage.alxj
    public final boolean p() {
        return this.e;
    }

    @Override // defpackage.amik, defpackage.alxj
    public final boolean q() {
        return this.G;
    }

    @Override // defpackage.alxj
    public final boolean r() {
        return this.b;
    }

    @Override // defpackage.amik, defpackage.alxj
    public final boolean s() {
        return this.H;
    }

    @Override // defpackage.alxj
    public final boolean t() {
        return this.g;
    }

    @Override // defpackage.alxj
    public final boolean u() {
        return this.d;
    }

    @Override // defpackage.amik, defpackage.amfx
    public final int v() {
        return this.j;
    }

    @Override // defpackage.amik, defpackage.amfx
    public final int w() {
        return this.m;
    }

    @Override // defpackage.amik, defpackage.amfx
    public final long x() {
        return this.s;
    }

    @Override // defpackage.amik
    public final amij y() {
        return new amfn(this);
    }

    @Override // defpackage.amik, defpackage.amfx
    public final amtc z() {
        return this.y;
    }
}
