package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azfl extends azfn {
    public static final azfl a = new azfl((azff) null, (azfm) null, (String) null, (eyee) null, (cknh) null, (Instant) null, 127);
    public final azff b;
    public final azfm c;
    public final String d;
    public final String e;
    public final eyee f;
    public final cknh g;
    public final Instant h;

    public azfl() {
        this((azff) null, (azfm) null, (String) null, (eyee) null, (cknh) null, (Instant) null, 127);
    }

    public static /* synthetic */ azfl a(azfl azflVar, azff azffVar, azfm azfmVar, String str, String str2, eyee eyeeVar, cknh cknhVar, Instant instant, int i) {
        if ((i & 1) != 0) {
            azffVar = azflVar.b;
        }
        azff azffVar2 = azffVar;
        if ((i & 2) != 0) {
            azfmVar = azflVar.c;
        }
        azfm azfmVar2 = azfmVar;
        if ((i & 4) != 0) {
            str = azflVar.d;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = azflVar.e;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            eyeeVar = azflVar.f;
        }
        eyee eyeeVar2 = eyeeVar;
        if ((i & 32) != 0) {
            cknhVar = azflVar.g;
        }
        cknh cknhVar2 = cknhVar;
        if ((i & 64) != 0) {
            instant = azflVar.h;
        }
        Instant instant2 = instant;
        azfmVar2.getClass();
        cknhVar2.getClass();
        instant2.getClass();
        return new azfl(azffVar2, azfmVar2, str3, str4, eyeeVar2, cknhVar2, instant2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azfl)) {
            return false;
        }
        azfl azflVar = (azfl) obj;
        return ffkj.e(this.b, azflVar.b) && this.c == azflVar.c && ffkj.e(this.d, azflVar.d) && ffkj.e(this.e, azflVar.e) && ffkj.e(this.f, azflVar.f) && ffkj.e(this.g, azflVar.g) && ffkj.e(this.h, azflVar.h);
    }

    public final int hashCode() {
        azff azffVar = this.b;
        int hashCode = ((azffVar == null ? 0 : azffVar.hashCode()) * 31) + this.c.hashCode();
        String str = this.d;
        int hashCode2 = ((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        eyee eyeeVar = this.f;
        return ((((hashCode3 + (eyeeVar != null ? eyeeVar.hashCode() : 0)) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "RcsGroup(rcsConferenceUri=" + this.b + ", groupState=" + this.c + ", name=" + this.d + ", iconUrl=" + this.e + ", routingToken=" + this.f + ", groupCapabilities=" + this.g + ", lastSyncTimestamp=" + this.h + ")";
    }

    public azfl(azff azffVar, azfm azfmVar, String str, String str2, eyee eyeeVar, cknh cknhVar, Instant instant) {
        azfmVar.getClass();
        cknhVar.getClass();
        instant.getClass();
        this.b = azffVar;
        this.c = azfmVar;
        this.d = str;
        this.e = str2;
        this.f = eyeeVar;
        this.g = cknhVar;
        this.h = instant;
    }

    public /* synthetic */ azfl(azff azffVar, azfm azfmVar, String str, eyee eyeeVar, cknh cknhVar, Instant instant, int i) {
        this(1 == (i & 1) ? null : azffVar, (i & 2) != 0 ? azfm.a : azfmVar, (i & 4) != 0 ? null : str, (String) null, (i & 16) != 0 ? null : eyeeVar, (i & 32) != 0 ? cknh.b() : cknhVar, (i & 64) != 0 ? Instant.EPOCH : instant);
    }
}
