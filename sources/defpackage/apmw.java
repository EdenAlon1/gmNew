package defpackage;

import android.net.Uri;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apmw extends apnp {
    private final String a;
    private final Uri b;
    private final dteh c;
    private final Duration d;
    private final apra e;
    private final apdv f;

    public apmw(String str, Uri uri, dteh dtehVar, Duration duration, apra apraVar, apdv apdvVar) {
        this.a = str;
        this.b = uri;
        this.c = dtehVar;
        this.d = duration;
        this.e = apraVar;
        this.f = apdvVar;
    }

    @Override // defpackage.apnp, defpackage.apmt
    public final apdv a() {
        return this.f;
    }

    @Override // defpackage.appj
    public final String b() {
        return this.a;
    }

    @Override // defpackage.apnp, defpackage.apmq
    public final Uri c() {
        return null;
    }

    @Override // defpackage.apmq
    public final Uri e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof apnp) {
            apnp apnpVar = (apnp) obj;
            if (this.a.equals(apnpVar.b()) && this.b.equals(apnpVar.e()) && this.c.equals(apnpVar.g()) && this.d.equals(apnpVar.h())) {
                apnpVar.c();
                apra apraVar = this.e;
                if (apraVar != null ? apraVar.equals(apnpVar.fk()) : apnpVar.fk() == null) {
                    apdv apdvVar = this.f;
                    if (apdvVar != null ? apdvVar.equals(apnpVar.a()) : apnpVar.a() == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.apnp, defpackage.apmq
    public final apra fk() {
        return this.e;
    }

    @Override // defpackage.apmt
    public final dteh g() {
        return this.c;
    }

    @Override // defpackage.apmt
    public final Duration h() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        apra apraVar = this.e;
        int hashCode2 = ((hashCode * (-721379959)) ^ (apraVar == null ? 0 : apraVar.hashCode())) * 1000003;
        apdv apdvVar = this.f;
        return hashCode2 ^ (apdvVar != null ? apdvVar.hashCode() : 0);
    }

    public final String toString() {
        apdv apdvVar = this.f;
        apra apraVar = this.e;
        Duration duration = this.d;
        dteh dtehVar = this.c;
        return "BugleAudioContent{contentType=" + this.a + ", uri=" + this.b.toString() + ", voiceMetadata=" + dtehVar.toString() + ", duration=" + duration.toString() + ", originalUri=null, progress=" + String.valueOf(apraVar) + ", voiceTranscription=" + String.valueOf(apdvVar) + "}";
    }
}
