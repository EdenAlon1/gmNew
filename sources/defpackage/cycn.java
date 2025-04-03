package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cycn extends cyby {
    private final bctw a;
    private final boolean b;
    private final boolean c;
    private final byte[] d;

    public cycn(bctw bctwVar, boolean z, boolean z2, byte[] bArr) {
        if (bctwVar == null) {
            throw new NullPointerException("Null getConversationParticipantData");
        }
        this.a = bctwVar;
        this.b = z;
        this.c = z2;
        this.d = bArr;
    }

    @Override // defpackage.cyby
    public final bctw a() {
        return this.a;
    }

    @Override // defpackage.cyby
    public final boolean b() {
        return this.c;
    }

    @Override // defpackage.cyby
    public final boolean c() {
        return this.b;
    }

    @Override // defpackage.cyby
    public final byte[] d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cyby) {
            cyby cybyVar = (cyby) obj;
            if (this.a.equals(cybyVar.a()) && this.b == cybyVar.c() && this.c == cybyVar.b()) {
                if (Arrays.equals(this.d, cybyVar instanceof cycn ? ((cycn) cybyVar).d : cybyVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237)) * 1000003) ^ Arrays.hashCode(this.d);
    }

    public final String toString() {
        byte[] bArr = this.d;
        return "AddContactLoadedData{getConversationParticipantData=" + this.a.toString() + ", isBannerEligible=" + this.b + ", isAddContactEligible=" + this.c + ", profilePictureBytes=" + Arrays.toString(bArr) + "}";
    }
}
