package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yje implements appw {
    private final String a;

    public yje(String str) {
        this.a = str;
        if (str.length() <= 0) {
            throw new IllegalStateException("Check failed.");
        }
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yje) && ffkj.e(this.a, ((yje) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Text(text=" + ((Object) cskw.c(this.a)) + ")";
    }
}
