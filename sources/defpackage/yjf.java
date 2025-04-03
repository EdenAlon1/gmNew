package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yjf implements appz {
    private final String a;
    private final String b;
    private final boolean c;

    public yjf() {
        this(null, null, false);
    }

    @Override // defpackage.appw
    public final /* synthetic */ engw a() {
        int i = engw.d;
        return enou.a;
    }

    @Override // defpackage.appw, defpackage.appj
    public final /* synthetic */ String b() {
        return "text/plain";
    }

    @Override // defpackage.appw
    public final String c() {
        return this.a;
    }

    @Override // defpackage.appz
    public final String d() {
        return this.b;
    }

    @Override // defpackage.appz
    public final boolean e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yjf)) {
            return false;
        }
        yjf yjfVar = (yjf) obj;
        return ffkj.e(this.a, yjfVar.a) && ffkj.e(this.b, yjfVar.b) && this.c == yjfVar.c;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        return (((hashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.a;
        CharSequence c = str != null ? cskw.c(str) : null;
        String str2 = this.b;
        CharSequence c2 = str2 != null ? cskw.c(str2) : null;
        return "TextWithSubject(text=" + ((Object) c) + ", subject=" + ((Object) c2) + ", isUrgent=" + this.c + ")";
    }

    public yjf(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
        if (str != null && str.length() <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (str2 != null && str2.length() <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (str == null && str2 == null && !z) {
            throw new IllegalStateException("Check failed.");
        }
    }
}
