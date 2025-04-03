package defpackage;

import android.net.Uri;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xft implements xfn {
    public final Uri a;
    public final emyg b;
    private final doxs c;
    private final xgv d;

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Iterable, java.util.Collection] */
    public xft(xho xhoVar, Uri uri, xgv xgvVar) {
        xhoVar.getClass();
        doxs doxsVar = xhoVar.a;
        emyg emygVar = xhoVar.b.d;
        this.c = doxsVar;
        this.a = uri;
        this.d = xgvVar;
        this.b = emygVar;
        if (!(doxsVar instanceof drli)) {
            if (uri != null) {
                throw new IllegalArgumentException("Provided selected URI for attachment without variations");
            }
        } else {
            if (uri == null) {
                throw new IllegalArgumentException("No selected URI provided for attachment with variations");
            }
            ?? c = ((drli) doxsVar).c();
            if (!c.isEmpty()) {
                Iterator it = c.iterator();
                while (it.hasNext()) {
                    if (ffkj.e(((drlh) it.next()).f(), this.a.toString())) {
                        return;
                    }
                }
            }
            throw new IllegalArgumentException("Selected URI for attachment with variations does not appear");
        }
    }

    @Override // defpackage.xfn
    public final doxs a() {
        return this.c;
    }

    @Override // defpackage.xfo
    public final xgv b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xft)) {
            return false;
        }
        xft xftVar = (xft) obj;
        return ffkj.e(this.c, xftVar.c) && ffkj.e(this.a, xftVar.a) && ffkj.e(this.d, xftVar.d) && ffkj.e(this.b, xftVar.b);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        Uri uri = this.a;
        int hashCode2 = (hashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        xgv xgvVar = this.d;
        int hashCode3 = (hashCode2 + (xgvVar == null ? 0 : xgvVar.hashCode())) * 31;
        emyg emygVar = this.b;
        return hashCode3 + (emygVar != null ? emygVar.hashCode() : 0);
    }

    public final String toString() {
        Uri uri = this.a;
        String d = uri != null ? cskw.d(uri) : null;
        return "QueuedAttachment(hugoAttachment=" + this.c + ", selectedUri=" + d + ", compressionInfo=" + this.d + ", draftLatencyStopwatch=" + this.b + ")";
    }
}
