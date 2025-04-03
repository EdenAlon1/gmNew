package androidx.car.app.media.model;

import androidx.car.app.model.Header;
import defpackage.cfs;
import defpackage.cgp;
import defpackage.cjg;
import j$.util.Objects;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public class MediaPlaybackTemplate implements cjg {
    private final Header mHeader;

    private MediaPlaybackTemplate() {
        this.mHeader = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaPlaybackTemplate) {
            return Objects.equals(this.mHeader, ((MediaPlaybackTemplate) obj).mHeader);
        }
        return false;
    }

    public Header getHeader() {
        return this.mHeader;
    }

    public int hashCode() {
        return Objects.hash(this.mHeader);
    }

    public String toString() {
        return "MediaPlaybackTemplate";
    }

    MediaPlaybackTemplate(cgp cgpVar) {
        Header header = cgpVar.a;
        this.mHeader = null;
    }
}
