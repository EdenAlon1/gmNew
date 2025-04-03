package defpackage;

import android.widget.photopicker.EmbeddedPhotoPickerProvider;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpzv implements dpzx {
    public final fgdj a;
    public final hho b;
    public final EmbeddedPhotoPickerProvider c;
    public final Executor d;
    public final ffji e;
    public final ffji f;
    public final ffji g;
    public final ffji h;
    private final ffxx i;

    public dpzv(ffxx ffxxVar, fgdj fgdjVar, hho hhoVar, EmbeddedPhotoPickerProvider embeddedPhotoPickerProvider, Executor executor, ffji ffjiVar, ffji ffjiVar2, ffji ffjiVar3, ffji ffjiVar4) {
        embeddedPhotoPickerProvider.getClass();
        this.i = ffxxVar;
        this.a = fgdjVar;
        this.b = hhoVar;
        this.c = embeddedPhotoPickerProvider;
        this.d = executor;
        this.e = ffjiVar;
        this.f = ffjiVar2;
        this.g = ffjiVar3;
        this.h = ffjiVar4;
    }

    @Override // defpackage.dpzx
    public final ffxx a() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpzv)) {
            return false;
        }
        dpzv dpzvVar = (dpzv) obj;
        return ffkj.e(this.i, dpzvVar.i) && ffkj.e(this.a, dpzvVar.a) && ffkj.e(this.b, dpzvVar.b) && ffkj.e(this.c, dpzvVar.c) && ffkj.e(this.d, dpzvVar.d) && ffkj.e(this.e, dpzvVar.e) && ffkj.e(this.f, dpzvVar.f) && ffkj.e(this.g, dpzvVar.g) && ffkj.e(this.h, dpzvVar.h);
    }

    public final int hashCode() {
        return (((((((((((((((this.i.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "Embedded(titleFlow=" + this.i + ", selectedMedia=" + this.a + ", isExpanded=" + this.b + ", photoPickerProvider=" + this.c + ", clientCallbackExecutor=" + this.d + ", onSelected=" + this.e + ", onUnselected=" + this.f + ", onError=" + this.g + ", surfaceViewCreator=" + this.h + ")";
    }
}
