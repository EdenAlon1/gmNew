package defpackage;

import j$.time.Instant;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjlt {
    public final cjkh a;
    public final byte[] b;
    public final int c;
    private final cjlk d;
    private final String e;
    private final String f;
    private final Instant g;
    private final cjli h;

    public cjlt(cjlk cjlkVar, cjkh cjkhVar, byte[] bArr, String str, String str2, Instant instant, cjli cjliVar, int i) {
        this.d = cjlkVar;
        this.a = cjkhVar;
        this.b = bArr;
        this.e = str;
        this.f = str2;
        this.g = instant;
        this.h = cjliVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjlt)) {
            return false;
        }
        cjlt cjltVar = (cjlt) obj;
        return ffkj.e(this.d, cjltVar.d) && this.a == cjltVar.a && ffkj.e(this.b, cjltVar.b) && ffkj.e(this.e, cjltVar.e) && ffkj.e(this.f, cjltVar.f) && ffkj.e(this.g, cjltVar.g) && this.h == cjltVar.h && this.c == cjltVar.c;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() * 31) + this.a.hashCode();
        byte[] bArr = this.b;
        int hashCode2 = ((hashCode * 31) + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        String str = this.e;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return ((((((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.c;
    }

    public final String toString() {
        return "PipelineWorkItem(workId=" + this.d + ", pipelineType=" + this.a + ", payload=" + Arrays.toString(this.b) + ", sequencingKey=" + this.e + ", clientSuppliedId=" + this.f + ", insertionTimestamp=" + this.g + ", executionState=" + this.h + ", executionAttemptCount=" + this.c + ")";
    }
}
