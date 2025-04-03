package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doip implements dokm {
    public final String a;
    public final Uri b;
    public final ffix c;
    private final boolean d = false;
    private final ffix e;

    public doip(String str, Uri uri, ffix ffixVar, ffix ffixVar2) {
        this.a = str;
        this.b = uri;
        this.c = ffixVar;
        this.e = ffixVar2;
    }

    public static /* synthetic */ doip b(doip doipVar, ffix ffixVar) {
        return new doip(doipVar.a, doipVar.b, ffixVar, doipVar.e);
    }

    @Override // defpackage.dokm
    public final ffix a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doip)) {
            return false;
        }
        doip doipVar = (doip) obj;
        if (!ffkj.e(this.a, doipVar.a) || !ffkj.e(this.b, doipVar.b) || !ffkj.e(this.c, doipVar.c)) {
            return false;
        }
        boolean z = doipVar.d;
        return ffkj.e(this.e, doipVar.e);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + 1237) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "StickerSuggestionUiData(contentDescription=" + this.a + ", uri=" + this.b + ", onClick=" + this.c + ", closeable=false, onClose=" + this.e + ")";
    }
}
