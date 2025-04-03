package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zsn implements zqy {
    public final dnsh a;
    public final dnoq b;
    public final alxr c;
    public final zsl d;
    public final zsm e;
    public final String f;
    private final boolean g;
    private final MessageId h;

    public zsn(dnsh dnshVar, dnoq dnoqVar, alxr alxrVar, zsl zslVar, boolean z, zsm zsmVar) {
        dnoqVar.getClass();
        alxrVar.getClass();
        this.a = dnshVar;
        this.b = dnoqVar;
        this.c = alxrVar;
        this.d = zslVar;
        this.g = z;
        this.e = zsmVar;
        String a = alxrVar.b().a();
        a.getClass();
        this.f = a;
        this.h = alxrVar.b();
        zsr.a(alxrVar);
    }

    public static /* synthetic */ zsn c(zsn zsnVar, dnsh dnshVar, dnoq dnoqVar, int i) {
        if ((i & 1) != 0) {
            dnshVar = zsnVar.a;
        }
        dnsh dnshVar2 = dnshVar;
        alxr alxrVar = zsnVar.c;
        zsl zslVar = zsnVar.d;
        boolean z = zsnVar.g;
        zsm zsmVar = zsnVar.e;
        dnshVar2.getClass();
        return new zsn(dnshVar2, dnoqVar, alxrVar, zslVar, z, zsmVar);
    }

    @Override // defpackage.zqy
    public final MessageId a() {
        return this.h;
    }

    @Override // defpackage.dnmw
    public final String b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsn)) {
            return false;
        }
        zsn zsnVar = (zsn) obj;
        return ffkj.e(this.a, zsnVar.a) && ffkj.e(this.b, zsnVar.b) && ffkj.e(this.c, zsnVar.c) && ffkj.e(this.d, zsnVar.d) && this.g == zsnVar.g && ffkj.e(this.e, zsnVar.e);
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        zsl zslVar = this.d;
        return (((((hashCode * 31) + (zslVar == null ? 0 : zslVar.hashCode())) * 31) + (true != this.g ? 1237 : 1231)) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "BugleMessageBubbleUiData(containerUiData=" + this.a + ", contentUiData=" + this.b + ", message=" + this.c + ", animateParameters=" + this.d + ", shouldShowTimestampHint=" + this.g + ", flags=" + this.e + ")";
    }

    public /* synthetic */ zsn(dnsh dnshVar, dnoq dnoqVar, alxr alxrVar, boolean z) {
        this(dnshVar, dnoqVar, alxrVar, null, z, new zsm(null));
    }
}
