package defpackage;

import com.google.research.xeno.effect.AssetDownloader;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class facq extends faew {
    public final String a;
    public final long b;
    public final AssetDownloader c;
    public final engw d;

    public facq(String str, long j, AssetDownloader assetDownloader, engw engwVar) {
        this.a = str;
        this.b = j;
        this.c = assetDownloader;
        this.d = engwVar;
    }

    @Override // defpackage.faew
    public final long a() {
        return this.b;
    }

    @Override // defpackage.faew
    public final engw b() {
        return this.d;
    }

    @Override // defpackage.faew
    public final AssetDownloader c() {
        return this.c;
    }

    @Override // defpackage.faew
    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof faew) {
            faew faewVar = (faew) obj;
            if (this.a.equals(faewVar.d()) && this.b == faewVar.a() && this.c.equals(faewVar.c()) && enkr.h(this.d, faewVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (((((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        engw engwVar = this.d;
        return "Config{remoteAssetCacheBasePath=" + this.a + ", remoteAssetCacheTtlDurationSeconds=" + this.b + ", assetDownloader=" + this.c.toString() + ", oldRemoteAssetCachePaths=" + engwVar.toString() + "}";
    }
}
