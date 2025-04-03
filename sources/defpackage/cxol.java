package defpackage;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxol extends cxoq {
    private final ViewGroup a;
    private final View b;
    private final int c;
    private final engw d;
    private final Uri e;

    public cxol(ViewGroup viewGroup, View view, int i, engw engwVar, Uri uri) {
        this.a = viewGroup;
        if (view == null) {
            throw new NullPointerException("Null descriptionView");
        }
        this.b = view;
        this.c = i;
        if (engwVar == null) {
            throw new NullPointerException("Null corners");
        }
        this.d = engwVar;
        this.e = uri;
    }

    @Override // defpackage.cxoq
    public final int a() {
        return this.c;
    }

    @Override // defpackage.cxoq
    public final Uri b() {
        return this.e;
    }

    @Override // defpackage.cxoq
    public final View c() {
        return this.b;
    }

    @Override // defpackage.cxoq
    public final ViewGroup d() {
        return this.a;
    }

    @Override // defpackage.cxoq
    public final engw e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cxoq) {
            cxoq cxoqVar = (cxoq) obj;
            if (this.a.equals(cxoqVar.d()) && this.b.equals(cxoqVar.c()) && this.c == cxoqVar.a() && enkr.h(this.d, cxoqVar.e()) && this.e.equals(cxoqVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        Uri uri = this.e;
        engw engwVar = this.d;
        View view = this.b;
        return "VideoAttachmentThumbnailClickedEvent{inlineView=" + this.a.toString() + ", descriptionView=" + view.toString() + ", cornerRadius=" + this.c + ", corners=" + engwVar.toString() + ", videoSource=" + uri.toString() + "}";
    }
}
