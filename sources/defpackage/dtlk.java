package defpackage;

import j$.time.Duration;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtlk {
    public final Duration b;
    public final Map c;
    public final Map d;
    public final Map e;
    public final String a = "mediapipe_tasks_vision_jni";
    private final String f = "android_messages_catalog.binaryproto";
    private final int g = 10;

    public dtlk(Duration duration, Map map, Map map2, Map map3) {
        this.b = duration;
        this.c = map;
        this.d = map2;
        this.e = map3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtlk)) {
            return false;
        }
        dtlk dtlkVar = (dtlk) obj;
        if (!ffkj.e(this.a, dtlkVar.a) || !ffkj.e(this.f, dtlkVar.f) || !ffkj.e(this.b, dtlkVar.b)) {
            return false;
        }
        int i = dtlkVar.g;
        return ffkj.e(this.c, dtlkVar.c) && ffkj.e(this.d, dtlkVar.d) && ffkj.e(this.e, dtlkVar.e);
    }

    public final int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.f.hashCode()) * 31) + this.b.hashCode()) * 31) + 10) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "XenoConfiguration(nativeLibraryName=" + this.a + ", catalogAssetName=" + this.f + ", assetCacheTtl=" + this.b + ", assetCacheConcurrentDownloads=10, displayNameMap=" + this.c + ", iconMap=" + this.d + ", backgroundColorMap=" + this.e + ")";
    }
}
