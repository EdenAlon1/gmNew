package defpackage;

import android.net.Uri;
import android.util.Size;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class ued extends GalleryContent {
    public final String a;
    public final Uri b;
    public final eohh c;
    public final Size d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final Uri h;
    public final Optional i;
    public final byza j;
    public final Uri k;
    public final String l;
    public final int m;

    public ued(String str, Uri uri, eohh eohhVar, Size size, long j, boolean z, boolean z2, Uri uri2, Optional optional, byza byzaVar, Uri uri3, String str2, int i) {
        if (str == null) {
            throw new NullPointerException("Null contentType");
        }
        this.a = str;
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.b = uri;
        if (eohhVar == null) {
            throw new NullPointerException("Null contentSource");
        }
        this.c = eohhVar;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.d = size;
        this.e = j;
        this.f = z;
        this.g = z2;
        this.h = uri2;
        if (optional == null) {
            throw new NullPointerException("Null duration");
        }
        this.i = optional;
        if (byzaVar == null) {
            throw new NullPointerException("Null mediaSendType");
        }
        this.j = byzaVar;
        this.k = uri3;
        this.l = str2;
        if (i == 0) {
            throw new NullPointerException("Null displayState");
        }
        this.m = i;
    }

    @Override // defpackage.appq
    public final long a() {
        return this.e;
    }

    @Override // defpackage.appj
    public final String b() {
        return this.a;
    }

    @Override // com.google.android.apps.messaging.conversation.draft.model.GalleryContent, defpackage.apmq
    public final Uri c() {
        return this.k;
    }

    @Override // com.google.android.apps.messaging.conversation.draft.model.GalleryContent, defpackage.appq
    public final Uri d() {
        return this.h;
    }

    @Override // defpackage.apmq
    public final Uri e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        Uri uri;
        Uri uri2;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof GalleryContent) {
            GalleryContent galleryContent = (GalleryContent) obj;
            if (this.a.equals(galleryContent.b()) && this.b.equals(galleryContent.e()) && this.c.equals(galleryContent.i()) && this.d.equals(galleryContent.f()) && this.e == galleryContent.a() && this.f == galleryContent.l() && this.g == galleryContent.m() && ((uri = this.h) != null ? uri.equals(galleryContent.d()) : galleryContent.d() == null) && this.i.equals(galleryContent.j()) && this.j.equals(galleryContent.h()) && ((uri2 = this.k) != null ? uri2.equals(galleryContent.c()) : galleryContent.c() == null) && ((str = this.l) != null ? str.equals(galleryContent.k()) : galleryContent.k() == null) && this.m == galleryContent.n()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.apqd
    public final Size f() {
        return this.d;
    }

    @Override // com.google.android.apps.messaging.conversation.draft.model.GalleryContent
    public final ufk g() {
        return new uec(this);
    }

    @Override // com.google.android.apps.messaging.conversation.draft.model.GalleryContent
    public final byza h() {
        return this.j;
    }

    public final int hashCode() {
        int hashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        Uri uri = this.h;
        int hashCode2 = uri == null ? 0 : uri.hashCode();
        long j = this.e;
        int hashCode3 = ((((((((((((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true == this.g ? 1231 : 1237)) * 1000003) ^ hashCode2) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        Uri uri2 = this.k;
        int hashCode4 = (hashCode3 ^ (uri2 == null ? 0 : uri2.hashCode())) * 1000003;
        String str = this.l;
        return ((hashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.m;
    }

    @Override // defpackage.ufd
    public final eohh i() {
        return this.c;
    }

    @Override // com.google.android.apps.messaging.conversation.draft.model.GalleryContent, defpackage.appq
    public final Optional j() {
        return this.i;
    }

    @Override // com.google.android.apps.messaging.conversation.draft.model.GalleryContent, defpackage.apqd
    public final String k() {
        return this.l;
    }

    @Override // defpackage.appq
    public final boolean l() {
        return this.f;
    }

    @Override // defpackage.appq
    public final boolean m() {
        return this.g;
    }

    @Override // com.google.android.apps.messaging.conversation.draft.model.GalleryContent, defpackage.appq
    public final int n() {
        return this.m;
    }

    public final String toString() {
        Uri uri = this.k;
        byza byzaVar = this.j;
        Optional optional = this.i;
        Uri uri2 = this.h;
        Size size = this.d;
        eohh eohhVar = this.c;
        return "GalleryContent{contentType=" + this.a + ", uri=" + this.b.toString() + ", contentSource=" + eohhVar.toString() + ", size=" + size.toString() + ", mediaModifiedTimestamp=" + this.e + ", isResizable=" + this.f + ", saveToExternalStorage=" + this.g + ", previewUri=" + String.valueOf(uri2) + ", duration=" + optional.toString() + ", mediaSendType=" + byzaVar.toString() + ", originalUri=" + String.valueOf(uri) + ", caption=" + this.l + ", displayState=" + appp.a(this.m) + "}";
    }
}
