package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dozj {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    private final boolean e;

    public dozj() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dozj)) {
            return false;
        }
        dozj dozjVar = (dozj) obj;
        boolean z = dozjVar.e;
        return this.a == dozjVar.a && this.b == dozjVar.b && this.c == dozjVar.c && this.d == dozjVar.d;
    }

    public final int hashCode() {
        int a = dozi.a(true);
        boolean z = this.d;
        boolean z2 = this.c;
        return (((((((a * 31) + dozi.a(this.a)) * 31) + dozi.a(this.b)) * 31) + dozi.a(z2)) * 31) + dozi.a(z);
    }

    public final String toString() {
        return "AttachmentResolverConfiguration(parseMediaMetadataWhenNoCursor=true, useUriStreamOpener=" + this.a + ", consumeInputStreamForSize=" + this.b + ", resolveAudioMetadata=" + this.c + ", useFullRangeAsFormatFallback=" + this.d + ")";
    }

    public dozj(boolean z, boolean z2, boolean z3, boolean z4) {
        this.e = true;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public /* synthetic */ dozj(byte[] bArr) {
        this(false, false, false, true);
    }
}
